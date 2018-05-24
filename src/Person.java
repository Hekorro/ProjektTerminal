import java.util.*;
public class Person {

	Person(){}
	Person(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	private String firstName,lastName;
	private LinkedList<Bank> bankList = new LinkedList<Bank>();
	private LinkedList<Card> cardList = new LinkedList<Card>();
	
	public List<Card> getPersonCards()
	{
		return cardList;
	}
	public List<Bank> getPersonBanks()
	{
		return bankList;
	}
	
}
