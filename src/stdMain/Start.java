package stdMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import stdMain.com.student.Students;
import stdMain.com.student.StudentsDao_Service;


public class Start {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub

		StudentsDao_Service stdao = new StudentsDao_Service();
		System.out.println("Welcome to my Application..");
		Scanner sc = new Scanner(System.in);
		//let's create menu section
		
		while(true) {
			System.out.println("PRESS 1 to Add new Student");
			System.out.println("PRESS 2 to view details of student");
			System.out.println("PRESS 3 to update details of the Student");
			System.out.println("PRESS 4 to delete Student");
			System.out.println("PRESS 5 to Exit..");
			System.out.println("--------------------");
			System.out.print("Enter your choice : ");
			short ch = sc.nextShort();
			if(ch == 1){
				//add a student
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.print("Ebter name of the student: ");
				String name = br.readLine();
				
				System.out.print("enter roll no: ");
				String roll = br.readLine();
				
				System.out.print("enter ph no: ");
				String ph = br.readLine();
				
				System.out.print("enter student city: ");
				String city = br.readLine();
				
				System.out.print("enter age of the student: ");
				int age = Integer.parseInt(br.readLine());
				
				Students st = new Students(name, roll, ph, city, age);
				boolean ans = stdao.addStudent(st);
				if(ans) {
					System.out.println("Student added succesfully..");
				}
				else {
				System.out.println("Something went wrong , pls try again...");
				}
				System.out.println("---------------------------------");
			}
			else if(ch == 2){
				//read details about student
				stdao.showAllStudets();
			}
			else if (ch == 3){
				//update details
				System.out.print("Enter the usedid to update : ");
				int userid = sc.nextInt();
				Boolean result = stdao.updateStudent(userid);
				if(result) {
					System.out.println("Student with id " + userid + " updated successfully..");
				}else {
					System.out.println("Something went wrong...");
				}
				System.out.println("---------------------------------");
			}
			else if (ch == 4){
				System.out.print("Enter the id of the student to delete: ");
				int userid = sc.nextInt();
				Boolean result  = stdao.deleteStudent(userid);
				if(result) {
					System.out.println("userid " + userid + " successfully deleted");
				}else {
					System.out.println("Something went worng or userid entered is not present..");
				}
				System.out.println("---------------------------------");
			}
			else if(ch == 5){
				//prgram termination 
				break;
			}
			else{
				System.out.println("--Invalid input--");
				
			}
			
			System.out.println("Thanks for using the Applicatin...");
			System.out.println("--------------------------------------------------");
		}
	}

}
