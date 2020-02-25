package oopsConceptsPart2;

public class ICICIBank implements USBank,BrazilBank{//we are achieving multiple inheritance

	
	//these 3 methods are overridden methods from 
	public void credit(){
		System.out.println("usbank credit");
		
	}
	
	public void debit(){
		System.out.println("usbank debit");
	}
	
	public void transfermoney(){
		System.out.println("usbank transfermoney");
	}

	//icici bank own method
	public void education_loan(){
		System.out.println("icici education_loan");
	}
	
	//brazil bank own method
	public void carloan(){
		System.out.println("brazil bank car loan");
	}
	
	public void mutualfund(){
		System.out.println("brazil bank mutual fund");
	}
}
