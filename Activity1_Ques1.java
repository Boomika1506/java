package com.vinay;

import java.util.Scanner;

class Employee{
	String name ;
	String address ;
	String mobile ;
	
	Scanner sc = new Scanner(System.in);
	public String getName() {
		return name;
	}
	public void setName() {
		System.out.println("Enter the name:");
		String tmp = sc.nextLine();
		name = tmp;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress() {
		System.out.println("Enter Address:");
		String tmp = sc.nextLine();
		address = tmp;
	}
	public String getMobile() {
		String tmp = mobile;
		long mob= Long.parseLong(mobile);
		if(mob<0)
			return "invalid output";
		return tmp;
	}
	public void setMobile() {
		System.out.println("Enter Mobile:");
		String tmp = sc.nextLine();
		mobile = tmp;
	}
	
	
	
}
public class Activity1_Ques1 {
	public static void main(String[] args) {
		Employee e= new Employee();
		e.setName();
		e.setAddress();
		e.setMobile();
		System.out.println("Employee Details");
		System.out.print("Name:"); System.out.println(e.getName());
		System.out.print("Address:");System.out.println(e.getAddress());
		System.out.print("Mobile:");System.out.println(e.getMobile());
		
	}

}
