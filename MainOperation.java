package com.stddb;

import java.util.Scanner;

public class MainOperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentDataBase sdb=new StudentDbImpl();
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");

		System.out.println("1.SaveStudentData\n2.DeleteStudentData\n3.updateStudentData\n4.getStudentData\n5.GetStudentDataByMarks\n6.getAllStudentData\n7.Exit");

		while(true) {
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				sdb.saveStudentData();
				
				break;
				
			case 2:
				sdb.deleteStudentData();
				
				break;
				
			case 3:
				sdb.updateStudentData();
				
				break;
				
			case 4:
				sdb.getStudentData();
				break;
				
			case 5:
				sdb.getStudentDataByMarks();
				
				break;
				
			case 6:
				sdb.getAllStudentData();
				
				break;
				
			default:
				System.out.println("Invallid Choice Thank You Visit Again");

			}
		}
	}
}
