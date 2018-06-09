import java.io.Serializable;
import java.util.*;

import javax.sound.midi.Soundbank;
public class LogData implements  Serializable {
	
	LogData(Firm firm, Card card, double amount, int x){
		this.firm=firm.getFirmName();
		this.ownerFirstName=card.getPerson().getFirstName();
		this.ownerLastName=card.getPerson().getLastName();
		this.bank=card.getBank().getBankName();
		this.amount=amount;
		Date date = new Date();
		this.date= date;
		this.cardNumber=card.getCardNumber();
		if (x==1)
		{
			result="zautoryzowano";
		}
		else 
		{
			result="odrzucono";
		}
	}	
	
	LogData(String firm, String bank, int cardNumber, String ownerFirstName, String ownerLastName, double amount)
			{
				this.firm=firm;
				this.bank=bank;
				this.cardNumber=cardNumber;
				this.ownerFirstName=ownerFirstName;
				this.ownerLastName=ownerLastName;
				this.amount=amount;
				Date date = new Date();
				this.date= date;
			}
	
	


	private String firm;
	private String bank;
	private int cardNumber;
	private String ownerFirstName;
	private String ownerLastName;
	private double amount;
	private Date date;
	private String result;

public String getFirm()
{
	return firm;
}
public String getBank()
{
	return bank;
}
public int getCardNumber()
{
	return cardNumber;
}
public String getOwnerFirstName()
{
	return ownerFirstName;
}
public String getOwnerLastName()
{
	return ownerLastName;
}
public double getAmount()
{
	return amount;
}
public Date getDate()
{
	return date;
}
public String getResult()
{
	return result;
}

public String toString() 
{
	return firm+" "+bank+" "+cardNumber+" "+ownerFirstName+" "+ownerLastName+" "+amount+" "+date+" "+ result;
}


}
