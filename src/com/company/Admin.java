package com.company;

import java.util.HashMap;

public class Admin implements IAdmin{
    private String adminId;
    private String adminName;

    @Override
    public void addCourse(Course course, HashMap<String, Course> courseList) {
        courseList.put(course.getCourseId(),course);
    }

    @Override
    public void updateCourse(Course source, Course target, HashMap<String, Course> courseList) {
        courseList.put(target.getCourseId(),source);
    }

    @Override
    public void addOffer(CourseOffering courseOff, Semester semester, HashMap<String, CourseOffering> courseOffering) {
        courseOffering.put(courseOff.getCourse().getCourseId() + "_"+semester.getSemesterId(), courseOff);
    }

    @Override
    public void updateOffer(CourseOffering source, CourseOffering target, HashMap<String, CourseOffering> courseOffering) {
        courseOffering.put(target.getCourse().getCourseId() + "_"+target.getSemester().getSemesterId(), source);
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }


}
