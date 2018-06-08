import java.io.Serializable;

public class ATM extends Card implements  Serializable   {
	ATM(Person person, Bank bank)
	{
		super(person,bank);
	}
	ATM(){super();}

}
