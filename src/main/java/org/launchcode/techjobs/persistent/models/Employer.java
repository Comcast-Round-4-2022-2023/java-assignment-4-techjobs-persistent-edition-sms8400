package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

//    @Id
//    @GeneratedValue
//    private int id;


    @NotBlank(message="Location is required")
    @Size(min = 5, max = 75, message="Location must be 5 to 75 characters in length")
    private String location;

    public Employer(){

    }
    @OneToMany
    @NotNull
    @JoinColumn (name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJob() {
        return jobs;
    }

    public void setJob(List<Job> job) {
        this.jobs = job;
    }
}