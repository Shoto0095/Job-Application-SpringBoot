package com.project.jobapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.jobapp.model.JobPost;
import com.project.jobapp.repo.JobRepo;

@Service
public class JobService {
    @Autowired
    private  JobRepo repo;



    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);

    }


    //method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();


    }

    public JobPost getJob(int postId) {
        return repo.getJob(postId);
    }

    public void updatejob(JobPost jobpost) {
         repo.updateJob(jobpost);
    }

    public void delete(int postID) {
        repo.deleteJob(postID);
    }


}
