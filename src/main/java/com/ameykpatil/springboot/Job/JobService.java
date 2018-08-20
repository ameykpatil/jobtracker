package com.ameykpatil.springboot.Job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by ameypatil on 08/08/18.
 */

@Service
public class JobService {

    @Autowired
    public JobRepository jobRepository;

    public List<Job> getJobs() {
        List<Job> jobs = new ArrayList<>();
        jobRepository.findAll().forEach(jobs::add);
        return jobs;
        // new Company(1,"Backend Engineer", "London", "UK", new Date(), new Date(), "Yet to apply")

    }

    public Job getJob(String id) {
        Job job = jobRepository.findOne(id);
        return job;
    }

    public Job addJob(Job job) {
        Job savedJob = jobRepository.save(job);
        return savedJob;
    }

    public Job updateJob(String id, Job job) {
        Job updatedJob = jobRepository.save(job);
        return updatedJob;
    }

    public void deleteJob(String id) {
        jobRepository.delete(id);
    }
}
