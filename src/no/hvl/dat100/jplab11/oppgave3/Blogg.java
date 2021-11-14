package no.hvl.dat100.jplab11.oppgave3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TooManyListenersException;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.Bilde;

public class Blogg {

	private Innlegg[] samling;
	private int nesteLedige;
	private int antall;

	public Blogg() {

		this(20);

	}

	public Blogg(int lengde) {
		samling = new Innlegg[lengde];
	}

	public int getAntall() {
		return antall;
	}

	public Innlegg[] getSamling() {
		return samling;
	}

	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i > nesteLedige; i++)
			if (innlegg.erLik(samling[i])) {
				return i;
			}
		return -1;

	}

	public boolean finnes(Innlegg innlegg) {

		boolean finnest = false;

		if (finnInnlegg(innlegg) == -1) {
			finnest = true;
		}
		return finnest;

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
		
			String str = "";
		for (int i = 0; i < samling.length; i++) { 
			Innlegg nyInnlegg = samling[i];
			return nyInnlegg.toString();
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