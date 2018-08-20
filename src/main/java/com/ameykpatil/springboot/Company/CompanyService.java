package com.ameykpatil.springboot.Company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ameypatil on 08/08/18.
 */

@Service
public class CompanyService {

    @Autowired
    public CompanyRepository companyRepository;

    public List<Company> getCompanies() {
        List<Company> companies = new ArrayList<>();
        companyRepository.findAll().forEach(companies::add);
        return companies;
        // new Company(1,"Backend Engineer", "London", "UK", new Date(), new Date(), "Yet to apply")

    }

    public Company getCompany(String id) {
        Company company = companyRepository.findOne(id);
        return company;
    }

    public Company addCompany(Company company) {
        Company savedCompany = companyRepository.save(company);
        return savedCompany;
    }

    public Company updateCompany(String id, Company company) {
        Company updatedCompany = companyRepository.save(company);
        return updatedCompany;
    }

    public void deleteCompany(String id) {
        companyRepository.delete(id);
    }
}
