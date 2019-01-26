package com.itcrowd;

public class Osoba {

	private Integer id;
	private String imie;
	private String nazwisko;
	private String telefon;
	private String mail;
	public Integer getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Osoba [id=" + id + ", imie=" + imie + ", nazwisko=" + nazwisko + ", telefon=" + telefon + ", mail="
				+ mail + "]";
	}
	public Osoba(Integer id, String imie, String nazwisko, String telefon, String mail) {
		super();
		this.id = id;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.telefon = telefon;
		this.mail = mail;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
}
