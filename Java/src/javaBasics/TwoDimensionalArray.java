package javaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		String x[][]=new String[3][4];
		
		System.out.println(x.length);
		System.out.println(x[2].length);
		
		
		x[0][0]="a";
		x[0][1]="b";
		x[0][2]="c";
		x[0][3]="d";

		x[1][0]="a1";
		x[1][1]="b1";
		x[1][2]="c1";
		x[1][3]="d1";
		
		x[2][0]="a2";
		x[2][1]="b2";
		x[2][2]="c2";
		x[2][3]="d2";
		
		
		for(int row=0;row<x.length;row++){
			for(int col=0;col<x[2].length;col++){
				System.out.println(x[row][col]);
			}
		}
	}

}
