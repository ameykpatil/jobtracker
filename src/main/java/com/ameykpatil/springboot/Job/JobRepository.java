package com.ameykpatil.springboot.Job;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by ameypatil on 16/08/18.
 */

public interface JobRepository extends CrudRepository<Job, String> {

}
