package no.hvl.dat100.jplab11.oppgave4;


import java.io.PrintWriter;


import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		try {
			PrintWriter writer = new PrintWriter(mappe + filnavn);
			
			writer.println(samling.toString());
			
			writer.close();
			
			}catch(Exception e) {
			
				return false;
		}
			return true;
		}
}
