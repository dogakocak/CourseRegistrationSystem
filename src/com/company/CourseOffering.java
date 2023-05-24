package com.company;

public class CourseOffering {
    private Course course;
    private String classRoom;
    private String instructor;
    private Semester semester;
    private float Price;

    public CourseOffering(Course course, String classRoom, String instructor, Semester semester, float price) {
        this.course = course;
        this.classRoom = classRoom;
        this.instructor = instructor;
        this.semester = semester;
        Price = price;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }
}
