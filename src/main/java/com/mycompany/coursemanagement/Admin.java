/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coursemanagement;


import java.time.LocalTime;
import java.util.*;

public class Admin extends User {
    // Static lists to hold all instances of teachers, students, courses, and notices
    public static List<Teacher> teachers = new ArrayList<>();
    private static List<Student> students = new ArrayList<>();
    private static List<Course> courses = new ArrayList<>();
    private static List<Notice> notices = new ArrayList<>();

    // Constructor
    public Admin(String name, String email, String password) {
        super(name, email, password);
    }

   // Add a new student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Add a new course
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Add a new teacher
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // Delete a course
    public void deleteCourse(Course course) {
        courses.remove(course);
    }

    // Set the teacher of a course
    public void setTeacherOfCourse(Course course, Teacher teacher) {
        course.setTeacher(teacher); // Assuming Course class has a setTeacher method
        teacher.getCourses().add(course); // Add course to teacher's list
    }

    // Set the courses of a teacher
    public void setCoursesOfTeacher(Teacher teacher, Course course) {
        teacher.getCourses().add(course);
    }

    // Set the courses of a student
    public void setCoursesOfStudent(Student student, Course course) {
        student.enrollCourse(course);
    }

    // Set the name of a course
    public void setNameOfCourse(Course course, String name) {
        course.setCourseName(name);
    }

    // Set students for a course
    public void setStudentsOfCourse(Course course, Student student) {
        course.enrollStudent(student); // Assuming Course class has an enrollStudent method
    }

    // Set the price of a course
    public void setPriceOfCourse(Course course, double price) {
        course.setPrice(price); // Assuming Course class has a setPrice method
    }

    // Set the time period of a course
    public void setTimePeriod(Course course, LocalTime timePeriod) {
        course.setTimePeriod(timePeriod); // Assuming Course class has a setTimePeriod method
    }

    // Set a notice for a course
    public void setNoticeOfCourse(Course course, Notice notice) {
        course.addNotice(notice); // Assuming Course class has an addNotice method
    }

    // Add a new notice
    public void addNotice(Notice notice, Course course) {
        notices.add(notice);
        course.addNotice(notice);
    }

    // Set the title of a notice
    public void setTitleOfNotice(Notice notice, String title) {
        notice.setTitle(title); // Assuming Notice class has a setTitle method
    }

    // Set the content of a notice
    public void setContentOfNotice(Notice notice, String content) {
        notice.setContent(content); // Assuming Notice class has a setContent method
    }

    // Set the course name of a notice
    public void setCourseNameOfNotice(Notice notice, String courseName) {
        notice.setCourseName(courseName); // Assuming Notice class has a setCourseName method
    }

    // Set the date of a notice
    public void setDateOfNotice(Notice notice, Date date) {
        notice.setDate(date); // Assuming Notice class has a setDate method
    }

    // View all teachers
    public static void viewAllTeachers() {
        System.out.println("List of Teachers:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getName());
        }
    }

    // View all students
    public static void viewAllStudents() {
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    // View all courses
    public static void viewAllCourses() {
        System.out.println("List of Courses:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    // View all notices
    public static void viewAllNotices() {
        System.out.println("List of Notices:");
        for (Notice notice : notices) {
            System.out.println(notice.getTitle());
        }
    }
}
