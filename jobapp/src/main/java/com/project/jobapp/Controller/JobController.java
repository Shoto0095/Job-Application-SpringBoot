package com.project.jobapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.jobapp.Service.JobService;
import com.project.jobapp.model.JobPost;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping("posts")
    @ResponseBody
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

}
