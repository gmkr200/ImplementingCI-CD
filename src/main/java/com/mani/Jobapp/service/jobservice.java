package com.mani.Jobapp.service;

import com.mani.Jobapp.Repository.jobrepo;
import com.mani.Jobapp.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class jobservice {
    @Autowired
    private jobrepo repo;

    public void addjob(JobPost jobpost){
        repo.addJob(jobpost);
    }
    public List<JobPost> getAlljobs(){
        return repo.getAllJobs();
    }

}
