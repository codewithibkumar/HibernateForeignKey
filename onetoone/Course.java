package com.hibernate.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Course {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int courseId;
 public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
@Column(name="courseName" , length = 50)
 private String courseName;
public Course(int courseId, String courseName) {
	super();
	this.courseId = courseId;
	this.courseName = courseName;
}
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Course [courseId=" + courseId + ", courseName=" + courseName + "]";
}
 
}
