package no.hvl.dat100.jplab11.oppgave3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TooManyListenersException;

import javax.management.loading.PrivateClassLoader;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.Bilde;

public class Blogg {

	private Innlegg[] samling;
	private int nesteLedige;

	public Blogg() {
		samling=new Innlegg [20];
		nesteLedige= 0;
	}

	public Blogg(int lengde) {
		samling = new Innlegg[lengde];
		nesteLedige= 0;

	}

	public int getAntall() {
		return nesteLedige;
	}

	public Innlegg[] getSamling() {
		return samling;
	}

	public int finnInnlegg(Innlegg innlegg) {
		
		int funnet =-1;
		for (int i = 0; i < nesteLedige; i++)
			if (samling[i].erLik(innlegg)) {
				funnet= i;
			}
		return funnet;

	}

	public boolean finnes(Innlegg innlegg) {

		return finnInnlegg(innlegg)>=0;

	}

	public boolean ledigPlass() {
		return nesteLedige < samling.length;
	}

	public boolean leggTil(Innlegg innlegg) {
		boolean lagtil = false;
		if (!finnes(innlegg) && ledigPlass()) {
			samling[nesteLedige] = innlegg;
			nesteLedige++;
			lagtil = true;
		}

		return lagtil;

	}

	@Override

	public String toString() {
		String str = "" + (nesteLedige) + "\n";
		for (int i = 0; i < nesteLedige; i++) {
			str += samling[i].toString();
		}
		return str;
	}

	// valgfrie oppgaver nedenfor
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

	}

	public boolean slett(Innlegg innlegg) {

	}

	public int[] search(String keyword) {

	}
	

	
}