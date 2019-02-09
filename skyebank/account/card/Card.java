/*
	Card details for various users
	copyright 2019
	Mujahid Abdulkareem
	mujahidakande@gmail.com
	09-02-2019
*/

// package skyebank.account
public class Card {
	
	private String cardName;
	private int cardNumber;
	private String expiryDate;
	private int cvcNumber;
	private CardType typeOfCard = CardType.MASTERCARD; // Constant to specify if it is mastercard, visaCard or verveCard

	// setters and getters method for each of the instanceVariable as methods
		
		//settersAndGetters for cardName
	public void setCardName (String cName){
		this.cardName = cName;
	}
	public String getCardName (){
		return this.cardName;
	}
		//settersAndGetters for cardNumber
	public void setCardNumber (int cNumber){
		this.cardNumber = cNumber;
	}
	public int getCardNumber (){
		return this.cardNumber;
	}	
		//settersAndGetters for cardType
	public void setTypeOfCard (CardType cType){
		this.typeOfCard = cType;
	}
	public CardType getTypeOfCard (){
		return this.typeOfCard;
	}
	
	public static void main (String args[]){
		Card cardManager = new Card();
		cardManager.setCardName ("Olabisi Omolayo Janet");
		cardManager.setTypeOfCard (CardType.MASTERCARD);
		//cardManager.setCardNumber (cardManager.);
		System.out.println (cardManager.getCardName());
		System.out.println (cardManager.getTypeOfCard());
		System.out.println (cardManager.getCardNumber());
	}
	
}