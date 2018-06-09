import java.io.Serializable;

public class Shop extends Firm implements  Serializable {
	Shop(String name) throws WrongArgumentException
	{
		super(name);
	}
	Shop() throws EmptyConstructorException{super();}

}
