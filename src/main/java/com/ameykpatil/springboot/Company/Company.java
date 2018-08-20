package com.ameykpatil.springboot.Company;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by ameypatil on 08/08/18.
 */

@Entity
@Data
public class Company {
    @Id
    private int id;
    private String name;
    private String domain;
    private Date createdAt;
    private Date updatedAt;
    private String notes;

    public Company() {
    }

    public Company(int id, String name, String domain, Date createdAt, Date updatedAt, String notes) {
        this.id = id;
        this.name = name;
        this.domain = domain;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.notes = notes;
    }
}
