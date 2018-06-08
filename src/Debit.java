import java.io.Serializable;

public class Debit extends Card implements Serializable {
	Debit(Person person, Bank bank)
	{
	super(person,bank);
	}
	Debit(){
		super();
	}
	private double limit=0.0;
}
