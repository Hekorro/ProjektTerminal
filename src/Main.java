import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		Center center = new Center();
		System.out.println("Podaj nazwe banku");
		String name=scanner.nextLine();
		Bank bank = new Bank(name,center);
		center.addBank(bank);
		System.out.println("Dodaj osobe");
		name=scanner.nextLine();
		String name2=scanner.nextLine();
		Person person=new Person(name,name2);
		bank.addPerson(person);
		bank.addPersonsCard(person, center);
		
		}

}
