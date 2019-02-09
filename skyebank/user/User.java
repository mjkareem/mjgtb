/*
	model user profile for skye bank
	copyright
	Java class
	07-02-2019
*/

	// package skyebank.user;
	public class User{
		
		private String fullName;
		private String email;
		private String mobileNumber;
		private String homeAddress;
		private String dateOfBirth;
		private GenderType gender = GenderType.MALE;
		private UserStatus status = UserStatus.ALIVE;
		
		public void setFullName(String fName){
			this.fullName = fName;
		}
		
		public String getFullName(){
			return this.fullName;
		}
		
		public void setGender (GenderType gen) {
			this.gender = gen;
		}
		public GenderType getGender (){
			return this.gender;
		}
		
		@Override
		public String toString (){
			return "Fullname: "+this.fullName+ " , GenderType:"+this.gender; // This method overrides the default Superclass declaration in psvm
		}
		
		public static void main(String [] args){
			User mj = new User ();
			mj.setGender(GenderType.OTHERS);
			System.out.println (mj.getGender());
			}
	}