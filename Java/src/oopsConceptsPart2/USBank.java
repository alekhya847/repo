package oopsConceptsPart2;

public interface USBank {
	//variables are static in nature in interface
	int min_bal=1000;
	
	
	//methods are non-static in nature in interface
	public void credit();
	
	public void debit();
	
	public void transfermoney();
}
