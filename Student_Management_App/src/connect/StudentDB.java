package connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class StudentDB {

	public static boolean insertStudentToDb(StudentClass sc) {
		boolean flag = false;
		// jdbc code
		try {
			Connection con = ConnectionGenerator.CreateConnection();
			String q = "Insert into Students(StudentName, StudentPhone, StudentCity) values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(q);

			// set the values of paameter
			ps.setString(1, sc.getStudentName());
			ps.setString(2, sc.getStudentPhone());
			ps.setString(3, sc.getStudentCity());

			// execute
			ps.executeUpdate();
			flag = true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return flag;
	}

	public static boolean deleteStudent(int userId) {
		boolean flag = false;
		// jdbc code
		try {
			Connection con = ConnectionGenerator.CreateConnection();
			String q = "delete from students where StudentId=?";
			PreparedStatement ps = con.prepareStatement(q);

			// set the values of paameter
			ps.setInt(1, userId);

			// execute
			ps.executeUpdate();
			flag = true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return flag;

	}

	public static void showAllStudents() {
		boolean flag = false;
		// jdbc code
		try {
			Connection con = ConnectionGenerator.CreateConnection();
			String q = "select * from students;";
			Statement s = con.createStatement();

			ResultSet rs=s.executeQuery(q);
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String phone=rs.getString(3);
				String city=rs.getString("StudentCity");
				
				System.out.println("ID: "+ id);
				System.out.println("Name: "+ name);
				System.out.println("Phone: "+ phone);
				System.out.println("City: "+ city);
				System.out.println("#######################################");
				
				
			}
			flag = true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
