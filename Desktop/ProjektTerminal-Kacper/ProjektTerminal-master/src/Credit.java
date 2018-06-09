import java.io.Serializable;

public class Credit extends Card  implements  Serializable{
	Credit(Person person, Bank bank) throws WrongArgumentException
	{
		super(person,bank);
	}
	Credit() throws EmptyConstructorException{super();}
private double limit = -500.00;
}
