package Sklep;


/**
 * @author haloj
 * @version 1.0
 * @created 06-gru-2024 21:54:04
 */
public class Klient extends U¿ytkownik {

	private int cvc;
	private Zamowienie[] historiaZakupow;
	private String nrKarty;
	public Produkt m_Produkt;
	public Zamówienie m_Zamówienie;
	public Zwrot m_Zwrot;

	public Klient(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param zamowienie
	 */
	public void dodajZakupDoHistorii(Zamowienie zamowienie){

	}

	public void usunDaneKarty(){

	}

	/**
	 * 
	 * @param nowyCVC
	 */
	public void zmienNrCVC(int nowyCVC){

	}

	/**
	 * 
	 * @param nowyNrKarty
	 */
	public void zmienNrKarty(String nowyNrKarty){

	}
}//end Klient