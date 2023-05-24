package com.company;

import java.sql.Date;
import java.util.*;

public class Main {

    static HashMap<String, Course> courses;
    static HashMap<String, CourseOffering> courseOfferings;
    static List<Student> students;

    public static void main(String[] args) {
        createCourses();
        createOfferings();
        createStudents();

        for(Student st : students){
            System.out.println(st);
        }

    }

    public static void createCourses(){
        Course cs101 = new Course("CS101","Introduction to Computer Science");
        Course cs201 = new Course("CS201","CS201");
        Course cs301 = new Course("CS301","Operating Systems ",cs101,cs201);
        Course cs431 = new Course("CS431","Machine Learning",cs101,cs301);
        Course math101 = new Course("MATH101", "Calculus I");
        Course math221 = new Course("MATH221", "Linear Algebra", math101);

        courses = new HashMap<String, Course>();
        courses.put(cs101.getCourseId(),cs101);
        courses.put(cs201.getCourseId(),cs201);
        courses.put(cs301.getCourseId(),cs301);
        courses.put(cs431.getCourseId(),cs431);
        courses.put(math101.getCourseId(),math101);
        courses.put(math221.getCourseId(),math221);
    }

    public static void createOfferings(){
        courseOfferings = new HashMap<String, CourseOffering>();
        Semester spr2020 = new Semester("SPR2020","01/03,2020","01/05/2020");
        Semester spr2021 = new Semester("SPR2021","01/03,2021","01/05/2021");
        Semester fall2022 = new Semester("FALL2022","01/09,2022","01/11/2022");
        Semester fall2023 = new Semester("FALL2023","01/09,2023","01/11/2023");

        courseOfferings.put(courses.get("CS101").getCourseId() + "_" + spr2020.getSemesterId(),
                new CourseOffering(courses.get("CS101"), "Lecture Hall A", "Prof. David Pate",spr2020,150));
        courseOfferings.put(courses.get("CS301").getCourseId() + "_" + spr2021.getSemesterId(),
                new CourseOffering(courses.get("CS301"), "Room 211", "Dr. Jennifer Kim",spr2021,200));
        courseOfferings.put(courses.get("CS431").getCourseId()+ "_" + spr2021.getSemesterId(),
                new CourseOffering(courses.get("CS431"), "Room 401", "Prof. James Smith ",spr2021,250));
        courseOfferings.put(courses.get("CS101").getCourseId()+ "_" + fall2022.getSemesterId(),
                new CourseOffering(courses.get("CS101"), "Lecture Hall B", "Prof. David Patel",fall2022,200));
        courseOfferings.put(courses.get("MATH101").getCourseId() + "_" + fall2022.getSemesterId(),
                new CourseOffering(courses.get("MATH101"), "Lecture Hall A", "Dr. Rachel Lee",fall2022,300));
        courseOfferings.put(courses.get("MATH221").getCourseId() + "_" + fall2023.getSemesterId(),
                new CourseOffering(courses.get("MATH221"), "Room 201", "Dr. Jennifer Kim",fall2023,350));

    }

    public static void createStudents(){
        students = new ArrayList<Student>();
        Student emilyDavis = new Student("1001","Emily Davis",
                courseOfferings.get("CS101_SPR2020"),
                courseOfferings.get("CS431_SPR2021"),
                courseOfferings.get("MATH101_FALL2022")
        );

        Student oliviaKim = new Student("1002","Olivia Kim",
                courseOfferings.get("CS301_SPR2021")
        );

        Student ethanWong = new Student("1003", "Ethan Wong",
                courseOfferings.get("CS101_SPR2020"),
                courseOfferings.get("CS101_FALL2022"),
                courseOfferings.get("MATH101_FALL2022"),
                courseOfferings.get("MATH221_FALL2023")
        );

        Student avaSingh = new Student("1004", "Ava Singh",
                courseOfferings.get("CS101_SPR2020"),
                courseOfferings.get("CS301_SPR2021"),
                courseOfferings.get("CS431_SPR2021")
        );

        Student williamChen = new Student("1005", "William Chen",
                courseOfferings.get("MATH101_FALL2022"),
                courseOfferings.get("MATH221_FALL2023")
        );

        Student alexanderKim = new Student("1006", "Alexander Kim",
                courseOfferings.get("CS101_SPR2020"),
                courseOfferings.get("CS301_SPR2021"),
                courseOfferings.get("CS431_SPR2021"),
                courseOfferings.get("CS101_FALL2022"),
                courseOfferings.get("MATH101_FALL2022"),
                courseOfferings.get("MATH221_FALL2023")
        );

        students.addAll(Arrays.asList(emilyDavis, oliviaKim, ethanWong, avaSingh, williamChen, alexanderKim));

    }
}
