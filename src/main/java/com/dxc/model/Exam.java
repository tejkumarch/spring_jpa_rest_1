package com.dxc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Exam {

@Id
String examid;
String name;
public Exam() {
	super();
	// TODO Auto-generated constructor stub
}
public Exam(String examid, String name) {
	super();
	this.examid = examid;
	this.name = name;
}
public String getExamid() {
	return examid;
}
public void setExamid(String examid) {
	this.examid = examid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Exam [examid=" + examid + ", name=" + name + "]";
}


}
