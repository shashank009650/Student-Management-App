package connect;

public class StudentClass {

	private String StudentName;
	private int StudentID;
	private String StudentCity;
	private String StudentPhone;

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getStudentID() {
		return StudentID;
	}

	public void setStudentID(int studentID) {
		StudentID = studentID;
	}

	public String getStudentCity() {
		return StudentCity;
	}

	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}

	public String getStudentPhone() {
		return StudentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		StudentPhone = studentPhone;
	}

	public StudentClass(String studentName, int studentID, String studentCity, String studentPhone) {
		super();
		StudentName = studentName;
		StudentID = studentID;
		StudentCity = studentCity;
		StudentPhone = studentPhone;
	}

	public StudentClass(String studentName, String studentPhone, String studentCity) {
		super();
		StudentName = studentName;
		StudentPhone = studentPhone;
		StudentCity = studentCity;
	}

	public StudentClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StudentClass [StudentName=" + StudentName + ", StudentID=" + StudentID + ", StudentCity=" + StudentCity
				+ ", StudentPhone=" + StudentPhone + "]";
	}

}
