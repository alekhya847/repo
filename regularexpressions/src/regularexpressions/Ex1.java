package regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

	public static boolean RegEx(String pattern,String content) {
	//create a pattern object
		Pattern p=Pattern.compile(pattern);
//now create matcher object
		Matcher m=p.matcher(content);
		if(m.matches())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
public static void main(String[] args) {
	boolean res=RegEx("[a-zA-z0-9]{5,10}","qaplanet1");
	System.out.println(res);
	RegEx("k$","alekhya");
	System.out.println(res);
	RegEx("[a-zA-Z]{5,25}","abcde");
	System.out.println(res);
	RegEx("^[q/Q][a-zA-Z]{3,23}[t/T]$","QBCDT");
	System.out.println(res);
	RegEx("^[0-9]","0123456789");
	System.out.println(res);
	RegEx("[^0][0-9]","1234567890");
	System.out.println(res);
	RegEx("[7/8/9][0-9]","7098642123");
	
	System.out.println(res);
	RegEx("^[a-zA-Z][a-zA-Z0-9\\.\\_]*@[a-zA-Z0-9]+[\\.][a-zA-Z]$","sr@qapalnet.in");
	System.out.println(res);
}
}
