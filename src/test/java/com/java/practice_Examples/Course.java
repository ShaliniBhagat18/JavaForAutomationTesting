package com.java.practice_Examples;

public class Course {
	
	/*
	 * Design a Course class:
	 * 1. Instance variables : courceName, enrolledStudents
	 * 2. Static variables : maxCapacity, the maximum number of students for any course.
	 * 
	 * 3. Instance Methods: enrollStudent(String studentName), unenrollStudent(String studentName)
	 * 4. Static method : setMaxCapacity(int Capacity), to set the maximum capacity for course
	 * 
	 */
	
	 static int maxCapacity = 100;
	    String courseName;
	    int enrollments;

	    String[] enrolledStudents;

	    Course(String courseName) {
	        this.courseName = courseName;
	        this.enrollments = 0;
	        this.enrolledStudents = new String[maxCapacity];
	    }

	    static void setMaxCapacity(int maxCapacity) {
	        Course.maxCapacity = maxCapacity;
	    }

	    void enrollStudent(String studentName) {
	        enrolledStudents[enrollments] = studentName;
	        enrollments++;
	    }

	    void unenrollStudent(String studentName) {
	        System.out.println("Student removed");
	        enrollments--;
	    }

	}
