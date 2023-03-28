package com.stddb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDbImpl implements StudentDataBase{
	Scanner sc=new Scanner(System.in);

	@Override
	public void saveStudentData() {
		System.out.println("Enter the Student Id");
		int Id=sc.nextInt();
		
		System.out.println("Enter the Student Name");
		String Name=sc.next();
		
		
		System.out.println("Enter the Student Age");
		int Age=sc.nextInt();
		
		System.out.println("Enter the Student Marks");
		int Marks=sc.nextInt();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			PreparedStatement preparestatement=connection.prepareStatement("insert into studentdbs values(?,?,?,?)");
			preparestatement.setInt(1,Id);
			preparestatement.setString(2,Name);
			preparestatement.setInt(3,Age);
			preparestatement.setInt(4, Marks);
			preparestatement.execute();
			connection.close();
			System.out.println("Data Svaed");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteStudentData() {
		System.out.println("Enter the Student Details to dete the Date");
		int Id=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			PreparedStatement preparestatement=connection.prepareStatement("delete from studentdbs where uid=?");
			preparestatement.setInt(1,Id);
			
			preparestatement.execute();
			connection.close();
			System.out.println("Data Svaed");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateStudentData() {
		
	}

	@Override
	public void getStudentData() {
		
	}

	@Override
	public void getStudentDataByMarks() {
		
	}

	@Override
	public void getAllStudentData() {
		
	}

}
