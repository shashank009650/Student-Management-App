package project1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import connect.StudentClass;
import connect.StudentDB;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Management System!");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("PRESS 1 to ADD Student");
			System.out.println("PRESS 2 to DELETE Student");
			System.out.println("PRESS 3 to DISPLAY Student");
			System.out.println("PRESS 4 to Exit");

			int c;
			c = Integer.parseInt(br.readLine());

			if (c == 1) {
				// ADD Student
				System.out.println("Enter Student's Name:");
				String name = br.readLine();

				System.out.println("Enter Student's Phone:");
				String phone = br.readLine();

				System.out.println("Enter Student's City");
				String city = br.readLine();

				// studentclass object

				StudentClass sc = new StudentClass(name, phone, city);
				boolean res = StudentDB.insertStudentToDb(sc);

				if (res) {
					System.out.println("Student is addes successfully;");
				} else {
					System.out.println("Something went wrong please try again");
				}
//				System.out.println(sc);

			} else if (c == 2) {
				// Delete Student
				System.out.println("Enter Student's ID");
				int userId = Integer.parseInt(br.readLine());
				boolean res = StudentDB.deleteStudent(userId);
				if (res) {
					System.out.println("Deleted..........");
				} else {
					System.out.println("Something went wrong please try again");
				}
			} else if (c == 3) {
				// Display
				StudentDB.showAllStudents();
			} else if (c == 4) {
				// Exit
				break;
			} else {
				// Again
				continue;
			}

		}
		System.out.println("Thank You, Have a nice day!");

	}

}
