package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank
    @Size(min = 5, max = 500)
    private String description;

    @ManyToMany(mappedBy = "skills")
    @NotNull
    private List<Job> jobs = new ArrayList<>();
    @ManyToMany(mappedBy = "jobs")
    private List<Skill> skill = new ArrayList<>();

    public Skill(){

    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}