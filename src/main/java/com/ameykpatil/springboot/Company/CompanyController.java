package com.ameykpatil.springboot.Company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ameypatil on 08/08/18.
 */

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping("/companies")
    public List<Company> getCompanies() {
        return companyService.getCompanies();
    }

    @RequestMapping("/companies/{id}")
    public Company getCompany(@PathVariable String id) {
        return companyService.getCompany(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/companies")
    public Company addCompany(@RequestBody Company company) {
        return companyService.addCompany(company);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/companies/{id}")
    public Company updateCompany(@PathVariable String id, @RequestBody Company company) {
        return companyService.updateCompany(id, company);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/companies/{id}")
    public void deleteCompany(@PathVariable String id) {
        companyService.deleteCompany(id);
    }
}
