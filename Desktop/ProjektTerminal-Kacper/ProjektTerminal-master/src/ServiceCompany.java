import java.io.Serializable;

public class ServiceCompany extends Firm implements  Serializable{
	ServiceCompany(String name) throws WrongArgumentException
	{
			super(name);
	}
	ServiceCompany() throws EmptyConstructorException{super();}

}
