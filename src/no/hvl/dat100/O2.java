package no.hvl.dat100;
import java.util.*; // Biblotek hentet for å  benytte Scanner
public class O2 {
	// Program for å regne ut karateren din, basert på resultat mellom 0 - 100 poeng.
	// 
	// 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		for(int i = 1; i<=10; i++) {
		int a = input.nextInt();	
		if(a>=90&&a<=100) {
			System.out.println("A");
		}
		if(a>=80&&a<=89) {
			System.out.println("B");
		}
		if(a>=60&&a<=79) {
			System.out.println("C");
		}
		if(a>=50&&a<=59) {
			System.out.println("D");
		}
		if(a>=40&&a<=49) {
			System.out.println("E");
		}
		if(a>=0&&a<39) {
			System.out.println("F");
		}
		else {
			if(a<0||a>100) {
				System.out.println("Ugyldig input, venligst tast inn på nytt.");
				i = i-1; //Reset av input
			}
			}
		}
		input.close();
	}
	}
