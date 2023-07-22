package com.jsp.student_crud_with_prepared.service;

import com.jsp.student_crud_with_prepared.dao.StudentDao;
import com.jsp.student_crud_with_prepared.dto.Student;

public class StudentService {

	StudentDao studentDao =new StudentDao();
	
	public Student insertStudentService(Student student) {
		System.out.println("insertService method started!!!");
		
		if(student.getStudentId()<=9999) {
			Student student2=studentDao.insertStudent(student);
			System.out.println("insertService method ended!!");
			return student2;
		}else {
			System.err.println("please pass your id with 4 digit or less than it");
		}
		return null;
	}
	/*
	 * update student service data methods
	 */
	public int updateStudentNameService(int id,Sting name)
	return studentDao.updateStudentName(id, name)
}
