package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student implements IStudent{
    private String studentId;
    private String studenName;
    private List<CourseOffering> courses;
    private List<Payment> payments;
    private List<Schedule> schedule;
    private List<Course> waitListedCourses;
    private String emailAddress;

    public Student(String studentId, String studenName, CourseOffering... courses) {
        this.studentId = studentId;
        this.studenName = studenName;
        this.courses = new ArrayList<CourseOffering>();
        this.courses.addAll(Arrays.asList(courses));
        this.emailAddress = studentId + "@uni.edu.tr";
    }


    @Override
    public void enrollInCourse(CourseOffering course) {
        courses.add(course);
    }

    @Override
    public void dropCourse(CourseOffering course) {
        if (courses != null) courses.remove(course);
    }

    @Override
    public void makePayment(Payment... payment) {
        payments.addAll(Arrays.asList(payment));
        // There should be implement with Payment API
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudenName() {
        return studenName;
    }

    public void setStudenName(String studenName) {
        this.studenName = studenName;
    }

    public List<CourseOffering> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseOffering> courses) {
        this.courses = courses;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public List<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Schedule> schedule) {
        this.schedule = schedule;
    }

    public List<Course> getWaitListedCourses() {
        return waitListedCourses;
    }

    public void setWaitListedCourses(List<Course> waitListedCourses) {
        this.waitListedCourses = waitListedCourses;
    }

    @Override
    public String toString(){
        StringBuilder enrolledCourses= new StringBuilder();
        float totalMoney = 0;
        for (CourseOffering cs : courses){
            enrolledCourses.append(cs.getCourse().getCourseName() + "\n");
            totalMoney += cs.getPrice();
        }

        return studenName + " - " + emailAddress + "\n"
                + enrolledCourses
                + "Total courses enrolled: " + courses.size() + "\n"
                + "Total money paid: " + totalMoney + "\n";
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
