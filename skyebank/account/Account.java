/*
	Account creation for various users
	copyright 2019
	Mujahid Abdulkareem
	mujahidakande@gmail.com
	February 2019
*/

	// package skyebank.account
	
	public class Account{
		
		//declaring instanceVariable as attributes
		private String accountName;
		private int accountNumber;
		private String nameOfNextOfKin;
		private int phoneOfNextOfKin;
		private ActType accountType = ActType.CURRENT;  // to specify if it is Savings, Current, Joint, Domiciliary, or Dormant
		
		// setters and getters method for each of the instanceVariable as methods
		
		//settersAndGetters for accountName
		public void setAccountName (String actName){
			this.accountName = actName;
		}
		public String getAccountName (){
			return this.accountName;
		}
		
		//settersAndGetters for accountNumber
		public void setAccountNumber(int actNumber){
			this.accountNumber = actNumber;
		}
		public int getAccountNumber(){
			return this.accountNumber;
		}
		
		//settersAndGetters for nameOfNextOfKin
		public void setNameOfNextOfKin (String nameOfNOK){
			this.nameOfNextOfKin = nameOfNOK;
		}
		public String getNameOfNextOfKin (){
			return this.nameOfNextOfKin;
		}
		
		//settersAndGetters for phoneOfNextOfKin
		public void setPhoneOfNextOfKin (int phoneOfNOK){
			this.phoneOfNextOfKin = phoneOfNOK;
		}
		public int getPhoneOfNextOfKin (){
			return this.phoneOfNextOfKin;
		}
		
		//settersAndGetters for accountType
		public void setAccountType (ActType acc) {
			this.accountType = acc;
		}
		public ActType getAccountType (){
			return this.accountType;
		}
		
		//psvm method to get output
		public static void main (String args[]){
			Account account_manager = new Account();
		
		//psvm method to set output
			account_manager.setAccountName ("Mujahid Abdulkareem Akande");
			System.out.println (account_manager.getAccountName());
		
			account_manager.setAccountType (ActType.SAVING);
			System.out.println (account_manager.getAccountType());			
			
		}
	}