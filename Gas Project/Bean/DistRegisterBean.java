package Bean;

public class DistRegisterBean {
	private String DId;
		private String dName;
		private String dpassword;
		private String dCPassword;
		private String dAddress;
		private String dPhone;  
		private String dEmail;
		

		public String getdistId() {
			return DId;
		}
		public void setdistId(String Dist_Id) {
			this.DId = Dist_Id;
		}
		public String getdistname() {
			return dName;
		}
		public void setdistname(String Dist_Name) {
			this.dName = Dist_Name;

		}

		public String getdistPassword() {
			return dpassword;
		}

		public void setdistPassword(String Dist_password) {
			this.dpassword = Dist_password;
		}
		public String getdistconfirmPassword() {
			return dCPassword ;
		}
		public void setdistConfirmPassword(String Dist_Confirm_Password) {
			this.dCPassword =Dist_Confirm_Password ;
		}
		
		
		public String getdistAddress() {
			return dAddress;
		}
		public void setdistAddress(String Dist_Address) {
			this.dAddress = Dist_Address;
			
		}
		public String getdistPhone() {
			return dPhone;
		}
		public void setdistPhone(String Dist_phone) {
			this.dPhone =Dist_phone;
		}

		public String getdistEmail() {
			return dEmail;
		}
		public void setdistEmail(String Dist_Email) {
			this.dEmail = Dist_Email;
		}
		

	}
