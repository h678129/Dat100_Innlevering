package no.hvl.dat100;

// Program for å regne ut hvor mye skatt du må betale
// Oppgi din inntekt

import java.util.Scanner;
public class O3 {
	    public static void main(String[] args) {
	    	
	    	Scanner input = new Scanner(System.in);
	    	int n = input.nextInt();
	    	int gange = 1;
	    	if(n<1) {
	    		System.out.println("Ulovelig input");
	    	}
	    	else {
	    		while(n>1) {
	    			gange*=n;
	    			n = n-1;
	    	}
	    		System.out.println(gange);
	    		input.close();
	    	}
	    }
}
