package nl.onderlingverrekenen.model;

import javax.persistence.entity;
import javax.persistence.generatedvalue;
import javax.persistence.generationtype;
import javax.persistence.id;
import javax.xml.bind.annotation.xmlrootelement;

@XmlRootElement
@Entity
public class Rekening {
	
	private int id;
	private String rekeningNr;
	private Date aanmaakDatum;
	private Bank bank;
	
	public Rekening() {
		super();
	}
	
	public Rekening(int id, String rekeningNr, Bank bank) {
		super();
		this.id = id;
		this.rekeningNr = rekeningNr;
		this.bank = bank;
		//this.aanmaakDatum = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRekeningNr() {
		return rekeningNr;
	}
	
	public void setRekeningNr(String rekeningNr) {
		this.rekeningNr = rekeningNr;
	}

	public Date getAanmaakDatum() {
		return aanmaakDatum;
	}

	public void setAanmaakDatum(Date aanmaakDatum) {
		this.aanmaakDatum = aanmaakDatum;
	}
	
	public Bank getBank() {
		return bank;
	}
	
	public void setBank(Bank bank) {
		this.bank = bank;
	}
}
