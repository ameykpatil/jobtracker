package com.ameykpatil.springboot.Job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ameypatil on 08/08/18.
 */

@RestController
public class JobController {

    @Autowired
    private JobService jobService;

    @RequestMapping("/ping")
    public String ping() {
        return "pong";
    }

    @RequestMapping("/jobs")
    public List<Job> getJobs() {
        return jobService.getJobs();
    }

    @RequestMapping("/jobs/{id}")
    public Job getJob(@PathVariable String id) {
        return jobService.getJob(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/jobs")
    public Job addJob(@RequestBody Job job) {
        return jobService.addJob(job);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/jobs/{id}")
    public Job updateJob(@PathVariable String id, @RequestBody Job job) {
        return jobService.updateJob(id, job);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/jobs/{id}")
    public void deleteJob(@PathVariable String id) {
        jobService.deleteJob(id);
    }
}
