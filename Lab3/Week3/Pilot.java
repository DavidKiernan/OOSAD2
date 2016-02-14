package Week3;

public class Pilot extends Professional {

	private string licenceType;
	private int licenceNumber;
	private string expiryDate;

	public string getLicenceType() {
		return this.licenceType;
	}

	public void setLicenceType(string licenceType) {
		this.licenceType = licenceType;
	}

	public int getLicenceNumber() {
		return this.licenceNumber;
	}

	public void setLicenceNumber(int licenceNumber) {
		this.licenceNumber = licenceNumber;
	}

	public string getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(string expiryDate) {
		this.expiryDate = expiryDate;
	}

}