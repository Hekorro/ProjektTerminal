
public class Debit extends Card {
	Debit(Person person, Bank bank)
	{
	super(person,bank);
	}
	Debit(){
		super();
	}
	private double limit=0.0;
}
