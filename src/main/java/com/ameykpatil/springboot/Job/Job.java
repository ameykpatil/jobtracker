package com.ameykpatil.springboot.Job;

import com.ameykpatil.springboot.Company.Company;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by ameypatil on 08/08/18.
 */

@Entity
@Data
public class Job {
    @Id
    private int id;
    private String position;
    private String city;
    private String country;
    private Status status;
    private Level level;
    private Date createdAt;
    private Date appliedAt;
    private String notes;
    @ManyToOne (cascade = CascadeType.ALL)
    private Company company;

    public Job() {
    }

    public Job(int id, String position, String city, String country, Date createdAt, Date appliedAt, String notes) {
        this.id = id;
        this.position = position;
        this.city = city;
        this.country = country;
        this.createdAt = createdAt;
        this.appliedAt = appliedAt;
        this.notes = notes;
    }
}
