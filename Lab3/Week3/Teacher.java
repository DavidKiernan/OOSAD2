package Week3;

public class Teacher extends Professional {

	protected string department;
	private string college;
	private int ID;

	public string getDepartment() {
		return this.department;
	}

	public void setDepartment(string department) {
		this.department = department;
	}

	public string getCollege() {
		return this.college;
	}

	public void setCollege(string college) {
		this.college = college;
	}

	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

}