package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//To store similar datatypes invalues in array variable
		
		int i[]=new int[3];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		
		for(int j=0;j<i.length;j++){
		System.out.println(i[j]);	
		}
		
		double d[]=new double[3];
		d[0]=50.33;
		d[1]=60.45;
		d[2]=70.23;
		
		for(int k=0;k<d.length;k++){
			System.out.println(d[k]);
		}
		
		String s[]=new String[2];
		s[0]="alekhya";
		s[1]="anvesh";
		
		for(int y=0;y<s.length;y++){
			System.out.println(s[y]);
		}
		
		
		Object obj[]=new Object[5];
		obj[0]="alekhya";
		obj[1]=24;
		obj[2]='p';
		obj[3]=12.33;
		obj[4]="warangal";
		
		for(int z=0;z<obj.length;z++){
			System.out.println(obj[z]);
		}
		
		
	}
}