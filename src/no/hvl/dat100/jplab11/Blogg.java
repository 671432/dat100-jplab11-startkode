package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable
	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		
		innleggtabell = new Innlegg[20];
		nesteledig = 0;
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(int lengde) {
		
		innleggtabell = new Innlegg[lengde];
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public int getAntall() {
		
		return nesteledig;
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public Innlegg[] getSamling() {
		
		return innleggtabell;
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		//loop copied from student: 585004
		boolean funnet = false;
		int pos = 0;
		while (pos < nesteledig && !funnet) {
			if (innleggtabell[pos].erLik(innlegg)) {
				funnet = true;
			}else {
				pos++;
			}
		}
		
		if (funnet) {
			return pos;
		}else {
			return -1;
		}
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {
		
		if(finnInnlegg(innlegg) >= 0) {
			return true;
		}else {
		return false;
		}
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		
		/* 
		copied from student: 585004 
		I assume "null" is pre-defined, 
		thus it returns "true" 
		if there is exactly "0" elements left, but not sure. 
		*/
		for ( int i = 0; i < innleggtabell.length; i++ ) {
			if ( innleggtabell[i] == null ) {
				return true;
			}
		}
		return false;
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {

		if (!finnes(innlegg) && ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;

		}
		return false;
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
		
		String innlegg = nesteledig + "\n";

		for (int i = 0; i < innleggtabell.length; i++) {
			innlegg += innleggtabell[i];
		}
		return innlegg;
		//throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}