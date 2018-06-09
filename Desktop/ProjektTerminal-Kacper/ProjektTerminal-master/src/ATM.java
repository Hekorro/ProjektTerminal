import java.io.Serializable;

public class ATM extends Card implements  Serializable   {
	ATM(Person person, Bank bank) throws WrongArgumentException
	{
		super(person,bank);
	}
	ATM() throws EmptyConstructorException{super();}

}
