package com.project.jobapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.jobapp.Service.JobService;
import com.project.jobapp.model.JobPost;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping("posts")
    // @ResponseBody 
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }
    @GetMapping("post/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId) {
        return service.getJob(postId);
    }

    @PostMapping("posts")
    public void addJob(@RequestBody JobPost jobPost) {
        service.addJob(jobPost);
    }

    @PutMapping("posts")
    public JobPost update(@RequestBody JobPost jobpost)
    {
        service.updatejob(jobpost);
        return service.getJob(jobpost.getPostId());
    }

    @DeleteMapping("post/{postID}")
    public String delteJob(@PathVariable("postID") int postID) {
        service.delete(postID);
        return "deleted successfully";
    }

}
