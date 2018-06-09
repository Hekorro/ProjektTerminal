import java.io.Serializable;

public class TransportCompany extends Firm implements  Serializable {
	TransportCompany(String name) throws WrongArgumentException
	{
		super(name);
	}
	TransportCompany() throws EmptyConstructorException{super();}

}
