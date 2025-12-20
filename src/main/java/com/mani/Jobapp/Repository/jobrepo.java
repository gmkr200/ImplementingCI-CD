package com.mani.Jobapp.Repository;

import com.mani.Jobapp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class jobrepo {

        List<JobPost> list = new ArrayList<>(Arrays.asList(
                new JobPost(1,"java developer","Must have 1 year of experience",4 ,List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
                new JobPost(2,"sql developer","Must have 2 year of experience",5 ,List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
                new JobPost(3,"oracle developer","Must have 3 year of experience",5 ,List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
                new JobPost(4,"setup developer","Must have 3 year of experience",7 ,List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
                new JobPost(5,"python developer","Must have 4 year of experience",4 ,List.of("Core Java", "J2EE", "Spring Boot", "Hibernate"))
        ));
    public List<JobPost> getAllJobs() {
        return list;
    }

    public void addJob(JobPost jobpost){
        list.add(jobpost);
        System.out.println(list);
    }


}
