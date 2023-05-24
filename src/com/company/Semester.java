package com.company;

import java.sql.Date;
import java.util.Calendar;

public class Semester {
    private String semesterId;
    private String startDate;
    private String endDate;

    public Semester(String semesterId, String startDate, String endDate) {
        this.semesterId = semesterId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(String semesterId) {
        this.semesterId = semesterId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
