package Week3;

public class Degree extends Qualification {

	private string degreeName;
	private int degreeId;
	private double GPA;

	public string getDegreeName() {
		return this.degreeName;
	}

	public void setDegreeName(string degreeName) {
		this.degreeName = degreeName;
	}

	public int getDegreeId() {
		return this.degreeId;
	}

	public void setDegreeId(int degreeId) {
		this.degreeId = degreeId;
	}

	public double getGPA() {
		return this.GPA;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

}