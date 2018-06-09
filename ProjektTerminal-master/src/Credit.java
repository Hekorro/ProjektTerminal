import java.io.Serializable;

public class Credit extends Card  implements  Serializable{
	Credit(Person person, Bank bank)
	{
		super(person,bank);
	}
	Credit(){super();}
private double limit = -500.00;
}
