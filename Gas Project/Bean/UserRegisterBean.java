package Bean;

public class UserRegisterBean {
	private String Name;
	private String password;
	private String CPassword;
	private String DId;
	private Integer UId;
	private String Address;
	private String Email;
	
	private String Phone;  

	public String getusername() {
		return Name;
	}

	public void setusername(String User_Name) {
		this.Name = User_Name;

	}

	public String getuserPassword() {
		return password;
	}

	public void setuserPassword(String User_Password) {
		this.password = User_Password;
	}
	public String getuserconfirmPassword() {
		return CPassword ;
	}
	public void setuserConfirmPassword(String User_Confirm_Password) {
		this.CPassword =User_Confirm_Password ;
	}
	public String getdistId() {
		return DId;
	}

	public void setdistId(String Dist_Id) {
		this.DId = Dist_Id;
	}

	public Integer getuserId() {
		return UId;

	}

	public void setuserId(Integer User_Id) {
 this.UId =User_Id;
	}
	public String getuserAddress() {
		return Address;
	}
	public void setuserAddress(String User_Address) {
		this.Address = User_Address;
		
	}
	public String getuserEmail() {
		return Email;
	}
	public void setuserEmail(String User_Email) {
		this.Email = User_Email;
	}
	public String getuserPhone() {
		return Phone;
	}
	public void setuserPhone(String User_phone) {
		this.Phone =User_phone;
	}


}
