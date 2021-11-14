package no.hvl.dat100.jplab11.oppgave4;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		try {
			BufferedWriter fil = new BufferedWriter(new FileWriter(
					"\\Users\\Saciid\\OneDrive - Oslo Kommune Utdanningsetaten\\Skrivebord\\filnew.txt"));
			fil.write("S \n");
			fil.write("\n");
			fil.close();

		} catch (Exception e) {
			System.out.println("fil feila");

		}
	}
}
