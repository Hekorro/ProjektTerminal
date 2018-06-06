
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Center center = new Center();
		Bank pko = new Bank("BANK PKO");
		Person person = new Person("Adam", "Spadam");	
		pko.addPerson(person);
		pko.addPersonsCard(person, center);
		}

}
