package com.dxc.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	int studentid;
	String name;
	Date dob;
	String email;
	String mobile;
	
		public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

		public Student(int studentid, String name, String strdob, String email, String mobile) throws ParseException {
			super();
			this.studentid = studentid;
			this.name = name;
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			dob=sdf.parse(strdob);
			this.email = email;
			this.mobile = mobile;
		}

		
		
		public int getStudentid() {
			return studentid;
		}

		public void setStudentid(int studentid) {
			this.studentid = studentid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		@Override
		public String toString() {
			String strdob=new SimpleDateFormat("dd-MM-yyyy").format(dob);
			return "Student [id=" + studentid + ", name=" + name + ", dob=" + strdob + ", email=" + email + ", mobile=" + mobile
					+ "]";
		}
}
