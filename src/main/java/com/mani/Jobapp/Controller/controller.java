package com.mani.Jobapp.Controller;

import com.mani.Jobapp.model.JobPost;
import com.mani.Jobapp.service.jobservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class controller {
    @Autowired
    private jobservice service;
    @GetMapping({"/","home"})
    public String home(){
return "home";
    }
    @GetMapping({"addjob"})
    public String addjob(){
        return "addjob";
    }
    @GetMapping("viewalljobs")
    public String viewalljobs(Model m){
        List<JobPost> jobs = service.getAlljobs();
        m.addAttribute("jobPosts",jobs);
        return "veiwalljobs";
    }
    @PostMapping("handleForm")
    public String handleForm(JobPost jobpost, Model model){
        service.addjob(jobpost);
        model.addAttribute("jobpost", jobpost);

        return "success";
    }

}
