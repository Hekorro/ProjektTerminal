import java.io.Serializable;
import java.util.*;
public class Person implements  Serializable{

	Person(){}
	Person(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	private String firstName,lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}

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
