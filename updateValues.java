import java.util.*;
import java.net.*;
import java.io.*;

public class updateValues {
	//1 = Bitcoin
	//2 = Doge
	//3 = MillionDoge
	public static String updateVal(String coin, String oldVal) throws IOException {
		//Variable
		String coinVal="0";
		if (coin.equals("1")){
			try {
				coinVal = getBTC.currentVal();
			}
			catch (Exception e) {
				System.out.println("Sorry, could not update " + coin + "\nAPI down? Using old Value");
				coinVal = oldVal;
				}
				
			}
		else if (coin.equals("2")){
			try {
				
				coinVal = getDoge.currentVal();
			}
			catch (Exception e) {
				try {
					coinVal = getDogeRedundant.currentVal();
				}
				catch (Exception f) {
					System.out.println("Sorry, could not update " + coin + "\nAPI down? Using old Value");
					coinVal = oldVal;
				}
				
				
			}
		}
		
		else if (coin.equals("3")){
			try {
				coinVal = getDoge.milVal();
			}
			catch (Exception e) {
				try {
					coinVal = getDogeRedundant.milVal();
				}
				catch (Exception f) {
					System.out.println("Sorry, could not update " + coin + "\nAPI down? Using old Value");
					coinVal = oldVal;
				}
				
				
			}
		}
		return coinVal;
		
		}
	}


