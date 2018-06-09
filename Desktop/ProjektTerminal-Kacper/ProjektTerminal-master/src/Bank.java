import java.io.Serializable;
import java.util.*;
public class Bank implements Serializable {

	Bank() throws EmptyConstructorException
	{
		try {
			throw new EmptyConstructorException("Nie tworz pustych konstruktorow");
		}
		catch(EmptyConstructorException x){
			System.out.println(x.getMessage());
			
		}
	}
	Bank(String bankName,Center center) throws WrongArrayListSizeException, WrongArgumentException{
		
		try {	
		if(serialNumber>=9)
		{	
			throw new WrongArrayListSizeException("Lista bankow jest pelna");
			
		}
		if(bankName instanceof String==false) {
			throw new WrongArgumentException("Zly parametr w konstruktorze");
		}
		if(serialNumber<9 && serialNumber>0 && bankName instanceof String==true ) { 
			this.serialNumber=center.getBankSerialNumber();
			this.bankName=bankName;
		}
		}
		catch(WrongArrayListSizeException x){
			System.out.println(x.getMessage());
		
		}
		catch( WrongArgumentException x1) {
			System.out.println(x1.getMessage());
		}
		}
		
		
	
private int serialNumber;


private int cardNumber=1;


private String bankName;


private LinkedList<FirmAccount> firmAccountsList = new LinkedList<FirmAccount>();
private LinkedList<Person> personsList = new LinkedList<Person>();
private LinkedList<Card> cardList = new LinkedList<Card>();
private LinkedList<Integer> cardNumberList = new LinkedList<Integer>();

	
	
	public int getSerialNumber() {
	return serialNumber;
}
	public int getCardNumber() {
		return cardNumber;
	}
	

	public String getBankName() {
	return bankName;
}

	public List<Integer> getCardNumberList() {
	return cardNumberList;
}
	public List<Person> getPersons()
	{
		return personsList;
	}

	public List<FirmAccount> getFirmAccount()
	{
		return firmAccountsList;
	}
	
	public List<Card> getCards()
	{
		return cardList;
	}
//trzeba pomyslec jak rozwiazac sprawe numerow kart w kilku bankach i sprawdziæ czy osoba istnieje
	public void addPersonsCard(Card card) {
		
		cardList.add(card);
		cardNumber++;
		}
		

	
	
	public void addPerson(Person person) {
		personsList.add(person);
	}

	public void addFirmAccount(FirmAccount firmAccount) {
		firmAccountsList.add(firmAccount);
		cardNumber++;
		}
	
	public void deletePerson(Person person) throws  AlreadyDeletedException {
		try {
		if(person!=null) {
			personsList.remove(person);
			person=null;
		}
		else {
			throw new  AlreadyDeletedException("Osoba zostala juz usunieta");
		}
		}
		catch( AlreadyDeletedException x) {
			System.out.println(x.getMessage());
		}
	}
	public void deletePersonCard(Card card) throws AlreadyDeletedException {
		try {
		if(card!=null) {
		cardList.remove(card);
		card=null;
		}
		else {
			throw new AlreadyDeletedException("Karta zostala juz usunieta");
		}
		}
		catch(AlreadyDeletedException x){
			System.out.println(x.getMessage());
		}
	}
	
	public void deleteFirmAccount(FirmAccount firmAccount) throws AlreadyDeletedException {
		try {
		if(firmAccount!=null) {	
		firmAccountsList.remove(firmAccount);
		firmAccount=null;
		}
		else {
			throw new AlreadyDeletedException("Karta zostala juz usunieta");
		}
		}
		catch(AlreadyDeletedException x) {
			System.out.println(x.getMessage());
		}
		}
	

		

	
	//podobnie klasa confirmAutorization
	public LogData confirmAutorization(Card card,FirmAccount firmAccount,double amount) throws WrongArgumentException
	{
		if(card.pay(amount, firmAccount)==true)
		{
			LogData logDate = new LogData(firmAccount.getFirm(), card, amount, 1);
			return logDate;
		}
		else
		{
			LogData logDate = new LogData(firmAccount.getFirm(), card, amount, 0);
			 return logDate;
		}
		
		
	}

		
}
