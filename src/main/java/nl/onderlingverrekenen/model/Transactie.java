package nl.onderlingverrekenen.model;

import javax.persistence.entity;
import javax.persistence.generatedvalue;
import javax.persistence.generationtype;
import javax.persistence.id;
import javax.xml.bind.annotation.xmlrootelement;

@XmlRootElement
@Entity
public class Transactie {

	private int id;
	private String omschrijving;
	private Rekening vanRekening;
	private Rekening naarRekening;
	private Date datum;

	public Transactie() {
		super();
	}
	
	public Transactie(int id, String omschrijving, Rekening vanRekening, Rekening naarRekening, Date datum) {
		super();
		this.id = id;
		this.omschrijving = omschrijving;
		this.vanRekening = vanRekening;
		this.naarRekening = naarRekening;
		this.datum = datum;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getOmschrijving() {
		return omschrijving;
	}
	
	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}
	
	public Rekening getVanRekening() {
		return vanRekening;
	}
	
	public void setVanRekening(Rekening vanRekening) {
		this.vanRekening = vanRekening;
	}

	public Rekening getNaarRekening() {
		return naarRekening;
	}

	public void setNaarRekening(Rekening naarRekening) {
		this.naarRekening = naarRekening;
	}

	public Date getDatum() {
		return datum;
	}
	
	public void setDatum(Date datum) {
		this.datum = datum;
	}
}
