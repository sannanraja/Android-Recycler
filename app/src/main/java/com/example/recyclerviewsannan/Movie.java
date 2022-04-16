package com.example.recyclerviewsannan;

public class Movie {
    public Movie(String teamname, String teamlocation, String teamdate) {
        this.teamname = teamname;
        this.teamlocation = teamlocation;
        this.teamdate = teamdate;
    }

    private String teamname,teamlocation,teamdate;


    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getTeamlocation() {
        return teamlocation;
    }

    public void setTeamlocation(String teamlocation) {
        this.teamlocation = teamlocation;
    }

    public String getTeamdate() {
        return teamdate;
    }

    public void setTeamdate(String teamdate) {
        this.teamdate = teamdate;
    }
}
