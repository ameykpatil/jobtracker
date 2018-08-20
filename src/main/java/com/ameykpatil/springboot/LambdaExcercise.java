package com.ameykpatil.springboot;

import com.ameykpatil.springboot.Company.Company;

import java.util.*;

/**
 * Created by ameypatil on 17/08/18.
 */
public class LambdaExcercise {

    public void act(Action action, List<Company> companies) {
        action.act(companies);
    }

    public static void main(String args[]) {

        List<Company> companyList = Arrays.asList(
                new Company(1, "Germin8", "Social Media", new Date(), new Date(), "Past Company"),
                new Company(2, "Crowdfire", "Social Media", new Date(), new Date(), "Current Company"),
                new Company(2, "Trusting Social", "Fintech", new Date(), new Date(), "Current Company")
        );

        Comparator<Company> comparator = (Company company1, Company company2) -> {
            return company1.getName().compareTo(company2.getName());
        };

        Action sortLambda = (List<Company> companies) -> {
            Collections.sort(companies, comparator);
            return;
        };

        Action printDomain = (List<Company> companies) -> {
            companies.stream().forEach((company) -> System.out.println("2 - " + company.getDomain()));
        };

        Action printNameC = (List<Company> companies) -> {
            companies.stream().filter((company) -> company.getName().startsWith("C")).forEach((company) -> System.out.println("3 - " + company.getName()));
        };

        LambdaExcercise l = new LambdaExcercise();
        l.act(sortLambda, companyList);

        for(Company company : companyList) {
            System.out.println(company.getName());
        }

        l.act(printDomain, companyList);

        l.act(printNameC, companyList);

    }

    @FunctionalInterface
    public interface Action {
        public void act(List<Company> companyList);
    }
}
