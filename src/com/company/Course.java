package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {
    private String courseId;
    private String courseName;
    private String description;
    private final List<Course> prerequisites;

    public Course(String courseId, String courseName, Course... prerequisites) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.prerequisites = new ArrayList<Course>();
        this.prerequisites.addAll(Arrays.asList(prerequisites));
    }

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.prerequisites = null;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
