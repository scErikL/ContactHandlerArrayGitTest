package contactApp;

public class Contact {

	private String fullName;
	private String adress;
	private String mail;
	private String telenr;
	
	public Contact (String fName, String adress, String mail, String tfn){
		this.fullName = fName;
		this.adress = adress;
		this.mail = mail;
		this.telenr = tfn;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTelenr() {
		return telenr;
	}
	public void setTelenr(String telenr) {
		this.telenr = telenr;
	}

	
}

