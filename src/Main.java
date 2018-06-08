import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		Center center = new Center();
		Bank PKO = new Bank("PKO", center);
		center.addBank(PKO);
		Person adasko = new Person("Adam","Malysz");
		PKO.addPerson(adasko);
		Card debitCard = new Debit(adasko,PKO);
		
		
		}

}
