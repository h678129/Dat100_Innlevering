package no.hvl.dat100;
import java.util.*;
public class O1 {
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int a = input.nextInt();
	
	if(a<=190349) {
		System.out.println("Trenger ikke å betale skatt!!!");
	}
	if(a<=267899&&a>190349) {
		System.out.println("Du betaler " + Math.round(a*0.017)+ " kr i skatt");
	}
	if(a<=643799&&a>267899) {
		System.out.println("Du betaler " + Math.round(a*0.04)+ " kr i skatt");
	}
	if(a<=969199&&a>643799) {
		System.out.println("Du betaler " + Math.round(a*0.134)+ " kr i skatt");
	}
	if(a<=1999999&&a>969199) {
		System.out.println("Du betaler " + Math.round(a*0.0164)+ " kr i skatt");
	}
	if(a>=2000000) {
		System.out.println("Du betaler " + Math.round(a*0.0174)+ " kr i skatt");
	}
	input.close();
	}
}
