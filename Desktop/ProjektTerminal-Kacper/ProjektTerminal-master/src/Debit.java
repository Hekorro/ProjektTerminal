import java.io.Serializable;

public class Debit extends Card implements Serializable {
	Debit(Person person, Bank bank) throws WrongArgumentException
	{
	super(person,bank);
	}
	Debit() throws EmptyConstructorException{
		super();
	}
	private double limit=0.0;
}
