package com.company;

public interface IStudent {
    void enrollInCourse(CourseOffering course);
    void dropCourse(CourseOffering course);
    void makePayment(Payment... payment);

}
