package stdMain.com.student;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentsDao_Service {
	
	public boolean addStudent(Students st) {
		
		boolean flag = false;
		try {
			//jdbc code
			Connection cn = ConnectionProvider.create();
			String query = "insert into Students(stdName, roll_no, phone_no, city, age) values(?,?,?,?,?)";
			
			//preparedstatement use
			PreparedStatement ptst = cn.prepareStatement(query);
			
			//now adding the values of eac field by setter methods and passing to object of PreparedStatement class
			ptst.setString(1, st.getStdName());
			ptst.setString(2, st.getRoll_no());
			ptst.setString(3, st.getPhone_no());
			ptst.setString(4, st.getCity());
			ptst.setInt(5, st.getAge());
			
			//execute
			ptst.executeUpdate();
			flag = true; 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	public void showAllStudets() {
		// TODO Auto-generated method stub
		try {
		Connection cn  = ConnectionProvider.create();
		String query = "select * from students";
		
		Statement stmt = cn.createStatement();
		ResultSet set = stmt.executeQuery(query);
		//now using while loop to print all the available rows using resultset
		while(set.next()) {
		
		//we can either give the column name or also the column index or no
		int id = set.getInt("id");
		String name = set.getString("stdName");
		String roll = set.getString("roll_No");
		String phoneno = set.getString("phone_no");
		String city = set.getString("city");
		int age = set.getInt("age");
		
		//now lets display these attributes values
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Roll no : " + roll);
		System.out.println("Phone no : " + phoneno);
		System.out.println("City : " + city);
		System.out.println("Age : " + age);
		System.out.println("******************************");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public Boolean deleteStudent(int userid) {
		// TODO Auto-generated method stub
		
		boolean flag = false;
		try {
			//jdbc code
			Connection cn = ConnectionProvider.create();
			String query = "delete from students where id=?";
			
			//preparedstatement use
			PreparedStatement ptst = cn.prepareStatement(query);
			//set the value of parameter
			ptst.setInt(1, userid);
			//execute
			ptst.executeUpdate();
			flag = true; 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	public Boolean updateStudent(int userid) {
		// TODO Auto-generated method stub
		
		Boolean flag = false;
		try {
		Connection cn = ConnectionProvider.create();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//taking new inputs from user
		System.out.print("Enter the new name");
		String name = br.readLine(); 
		System.out.print("Enter new roll no : ");
		String roll = br.readLine();
		System.out.print("Enter new phone no : ");
		String phone = br.readLine();
		System.out.print("Enter new city : ");
		String city = br.readLine();
		System.out.print("Enter new age : ");
		int age = Integer.parseInt(br.readLine());
		
		String query = "update Students SET stdName=?, roll_no=?, phone_no=?, city=?, age=? where id=?";
		//preparing statement
		PreparedStatement ptst = cn.prepareStatement(query);
		
		//setting up values
		ptst.setString(1, name);
		ptst.setString(2, roll);
		ptst.setString(3, phone);
		ptst.setString(4, city);
		ptst.setInt(5, age);
		ptst.setInt(6, userid);
		
		//executing the query
		ptst.executeUpdate();
		flag = true;
		}catch(Exception e) {
			e.getStackTrace();
		}
		return flag;
	}

}
