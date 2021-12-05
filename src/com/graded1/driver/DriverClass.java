package com.graded1.driver;

import com.graded1.SuperDepartmentmain.AdminDepartment;
import com.graded1.SuperDepartmentmain.HrDepartment;
import com.graded1.SuperDepartmentmain.TechDepartment;


public class DriverClass {

	public static void main(String[] args) {
		AdminDepartment adminobject=new AdminDepartment();
		HrDepartment hrobjet = new HrDepartment();
		TechDepartment techobject = new TechDepartment();
		
		
		System.out.println("Welcome to Admin Department");
		System.out.println(adminobject.getTodaysWork());
		System.out.println(adminobject.getWorkDeadline());
		System.out.println(adminobject.isTodayAHoliday());
		
		System.out.println();
		
		System.out.println("Welcome to HR Department");
		System.out.println(hrobjet.doActivity());
		System.out.println(hrobjet.getTodaysWork());
		System.out.println(hrobjet.getWorkDeadline());
		System.out.println(hrobjet.isTodayAHoliday());

		System.out.println();
		
		System.out.println("Welcome to Tech Department");
		System.out.println(techobject.getTodaysWork());
		System.out.println(techobject.getWorkDeadline());
		System.out.println(techobject.getTechStackInformation());
		System.out.println(techobject.isTodayAHoliday());
	}

}
