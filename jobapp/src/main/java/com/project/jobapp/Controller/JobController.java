package com.project.jobapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.jobapp.Service.JobService;
import com.project.jobapp.model.JobPost;

@Controller
public class JobController {

    @Autowired
    private JobService service;


    @GetMapping({"/", "home"})
    public String home() {
        return "home";
    }


    @GetMapping("addjob")
    public String addJob() {
        return "addjob";
    }


    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        service.addJob(jobPost);
        return "success";

    }

    @GetMapping("viewalljobs")
    public String viewJobs(Model m) {
        List<JobPost> jobs = service.getAllJobs();
        m.addAttribute("jobPosts", jobs);

        return "viewalljobs";
    }

}
