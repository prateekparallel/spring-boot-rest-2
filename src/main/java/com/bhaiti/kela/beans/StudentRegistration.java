package com.bhaiti.kela.beans;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {
	
	private List<Student> studentRecords;
	
	private static StudentRegistration stdregd = null;
	
	private StudentRegistration(){
		studentRecords = new ArrayList<Student>();
	}
	
	public static StudentRegistration getInstance() {
		
		if(stdregd == null) {
			stdregd = new StudentRegistration();
			return stdregd;
		}
		else {
			return stdregd;
		}
	}
	
	public void add(Student std) {
		studentRecords.add(std);
	}
	
	private void Remove(String registrationNumber) {
		
	}
	
	public String upDateStudent(Student std) {
		
		for(int i=0; i<studentRecords.size(); i++)
        {
            Student stdn = studentRecords.get(i);
            if(stdn.getRegistrationNumber() == std.getRegistrationNumber()) {
            	studentRecords.set(i, std);//update the new record
            	return "Update successful";
            }
        }
		
		return "Update un-successful";
		
	}
	
	public String deleteStudent(String registrationNumber) {
		
		for(int i=0; i<studentRecords.size(); i++)
        {
            Student stdn = studentRecords.get(i);
            if(stdn.getRegistrationNumber() == registrationNumber) {
            	studentRecords.remove(i);//update the new record
            	return "Delete successful";
            }
        }
		
		return "Delete un-successful";
		
	}

	public List<Student> getStudentRecords() {
		return studentRecords;
	}

}
