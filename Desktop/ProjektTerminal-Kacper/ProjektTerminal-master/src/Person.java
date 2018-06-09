import java.io.Serializable;
import java.util.*;
public class Person implements  Serializable{

	Person() throws EmptyConstructorException
	{
		try {
			throw new EmptyConstructorException("Nie tworz pustych konstruktorow");
		}
		catch(EmptyConstructorException x) {
			System.out.println(x.getMessage());
		}
	}
	Person(String firstName,String lastName) throws WrongArgumentException{
		try {
			if(firstName instanceof String==true && lastName instanceof String==true)
			{
			this.firstName=firstName;
			this.lastName=lastName;
			}
			else throw new WrongArgumentException("Zly argument/argumenty");
		}
		catch(WrongArgumentException f) {
			System.out.println(f.getMessage());
		}
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
