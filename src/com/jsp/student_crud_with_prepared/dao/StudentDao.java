package com.jsp.student_crud_with_prepared.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.student_crud_with_prepared.connection.StudentConnection;
import com.jsp.student_crud_with_prepared.dto.Student;

public class StudentDao {
	
	Connection connection = StudentConnection.getStudentConnection();
	
	/**
	 * insert method for student
	 */
	
	public Student insertStudent (Student student) {


		String insertQuery = "insert into student values(?,?,?,?)";
		
		try {
		PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
		
		preparedStatement.setInt(1, student.getStudentId());
		preparedStatement.setString(2, student.getStudentName());
		preparedStatement.setString(3, student.getStudentEmail());
		preparedStatement.setLong(4, student.getStudentPhone());
		
		preparedStatement.execute();
		
		return student;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		/**
		 * //jdbc code
		 */
		return null;
		
	}/*method insert ended */
	
	/*
	 * update student data methods
	 */
	public int updateStudentName(int id, String name) {
		String updateStudentNameQuery = "update student set name=? where id=?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateStudentNameQuery);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return 0;
	}




public void displayStudentQuery()  {
	String displayStudentQuery = "SELECT * FROM student";
	
	PreparedStatement preparedStatement = 
}