package oopsConceptsPart2;

public class TestMethodInterface {

	public static void main(String[] args) {
		
		ICICIBank obj=new ICICIBank();
		
		obj.credit();
		
		obj.debit();
		
		obj.transfermoney();
		
		obj.education_loan();

		System.out.println(USBank.min_bal);
		
		obj.carloan();
		
		obj.mutualfund();
//dynamic polymorphism:child class object can be referred by parent interface reference variable
		
		USBank b=new ICICIBank();
	// we can define only overridden methods of interface	
		b.credit();
		b.debit();
		b.transfermoney();
		
		BrazilBank bb=new ICICIBank();
		
		bb.carloan();
		bb.mutualfund();
		
	
	}

}
