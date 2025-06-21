package stdMain.com.student;

public class Students {
	private int id;
	private String stdName;
	private String roll_no;
	private String phone_no;
	private String city;
	private int age;
	
	
	public Students(int id, String stdName, String roll_no, String phone_no, String city, int age) {
		super();
		this.id = id;
		this.stdName = stdName;
		this.roll_no = roll_no;
		this.phone_no = phone_no;
		this.city = city;
		this.age = age;
	}


	public Students(String stdName, String roll_no, String phone_no, String city, int age) {
		super();
		this.stdName = stdName;
		this.roll_no = roll_no;
		this.phone_no = phone_no;
		this.city = city;
		this.age = age;
	}


	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStdName() {
		return stdName;
	}


	public void setStdName(String stdName) {
		this.stdName = stdName;
	}


	public String getRoll_no() {
		return roll_no;
	}


	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}


	public String getPhone_no() {
		return phone_no;
	}


	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "students [id=" + id + ", stdName=" + stdName + ", roll_no=" + roll_no + ", phone_no=" + phone_no
				+ ", city=" + city + ", age=" + age + "]";
	}
	
	
	
	

}
