package com.example.jobportal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JobController {

    private List<Job> jobList = new ArrayList<>();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("jobs", jobList);
        return "index";
    }

    @PostMapping("/submitJob")
    public String submitJob(@RequestParam("jobTitle") String title,
                            @RequestParam("company") String company,
                            @RequestParam("location") String location,
                            Model model) {
        Job newJob = new Job(title, company, location);
        jobList.add(newJob);
        model.addAttribute("jobs", jobList);
        return "index";
    }
}
