package com.vinay;

import java.util.Scanner;

class Innings{
	String teamname;
	String inningsname;
	int runs;
	
	Scanner sc= new Scanner(System.in);
	
	public void getTeamname()
	{
		System.out.println("Enter the team name:");
		teamname = sc.nextLine();
	}
	public void getInningsname()
	{
		System.out.println("Enter Session:");
		inningsname=sc.nextLine();
	}
	public void getRuns()
	{
		System.out.println("Enter runs:");
		runs=sc.nextInt();
	}
	
	public String returnInnings()
	{
		return inningsname;
	}
	public void displayInningsDetailsFirst() {
		
			System.out.print("Name:"); 
			System.out.println(teamname);
			System.out.print("Scored:");
			System.out.println(runs);
			System.out.println("Needed " + (runs+1) + " to win");
		}
		public void displayInningsDetailsSecond() {
			
			{
				System.out.print("Name:"); 
				System.out.println(teamname);
				System.out.print("Scored:");
				System.out.println(runs);
				System.out.println("Match Ended.");
			}
		
	}
}
public class Activity1_Qust2 {
	
	public static void main(String[] args) {
		Innings one = new Innings();
		Innings two = new Innings();
		one.getTeamname();
		one.getInningsname();
		one.getRuns();
		String pari= one.returnInnings();
		
		if(pari.equals("First")) {
			one.displayInningsDetailsFirst();
			two.getTeamname();
			two.getInningsname();
			two.getRuns();
			two.displayInningsDetailsSecond();
		}
		if(pari.equals("Second"))
			one.displayInningsDetailsSecond();
		
	}

}
