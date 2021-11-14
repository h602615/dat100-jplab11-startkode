package no.hvl.dat100.jplab11.oppgave1;


public abstract class Innlegg {

//	id (heltall), bruker (tekststreng), dato (tekststreng), og antall likes (heltall). 

//	public static int teller = 0;
	private int id = 0;
	private String bruker;
	private String dato;
	private int likes;

	public Innlegg() {
	
	}
	public Innlegg(int id, String bruker, String dato,int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;

	}
	public Innlegg(int id, String bruker, String dato) {

		this(id, bruker,dato,0);

	}

	

	public String getBruker() {

		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;

	}

	public String getDato() {

		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;

	}

	public int getId() {
		return id;

	}

	public int getLikes() {

		return likes;

	}

	public void doLike() {
		this.likes++;

	}

	public boolean erLik(Innlegg innlegg) {

				return this.id == innlegg.id;
//
//		if (this == innlegg) {
//			return true;
//		}
//		if (innlegg == null || getClass() != innlegg.getClass()) {
//			return false;
//		}
//
//		Innlegg other = (Innlegg) innlegg;
//		return Objects.equals(id, other.id);

	}

	
	

	
	public String toString() {

		return id + "\n"+ bruker + "\n" + dato + "\n" + likes + "\n";


	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	
}
