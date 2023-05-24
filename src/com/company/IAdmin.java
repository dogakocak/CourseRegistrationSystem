package com.company;

import java.util.HashMap;

public interface IAdmin {
    void addCourse(Course course, HashMap<String, Course> courseList);
    void updateCourse(Course source, Course target, HashMap<String, Course> courseList);
    void addOffer(CourseOffering courseOff, Semester semester, HashMap<String, CourseOffering> courseOffering);
    void updateOffer(CourseOffering source, CourseOffering target, HashMap<String, CourseOffering> courseOffering);
}
