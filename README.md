# Introduction
***

Program created for capturing User details, Account details and Card details
All edits, issues and updates are logged here. 

***

# Updated readme file for my bank modelling.

# Skye Bank modelling via POJO and JavaBeans

* User Full Name variable was created
* Account.java class was created
* Card.java class was created
* Constant *enum* files for Account.java and Card.java was created
 
 
 * Note Some errors with my Card.java and CrdType.java class. The error is in using the enum dataType to call cardType
 
 Somewhere here:
```  //settersAndGetters for cardType
		public void setCardType (crdType cType){
			this.cardType = cType;
		}
		public crdType getCardType (){
			return this.cardType;
		}
```
and here:
``` 
  public enum crdType {
		MASTERCARD,
		VISACARD,
		VERVECARD;
		
	}
```	

# Edit: 
Errors have been corrected.
 
***
# CHANGES
***

* Unneccessary files removed
* *.class* files removed from repo
* Empty Spaces removed
* **Card class and CardType class was re-written from scratch**
* [All repos to be merged into a single repo] (https://github.com/mjkareem/mjgtb "Mujahid repo")

Thank you.

© Copyright
Mujahid Abdulkareem
mujahidakande@gmail.com
09 February, 2019
