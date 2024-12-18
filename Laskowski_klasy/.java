package Serwis;


/**
 * @author haloj
 * @version 1.0
 * @created 06-gru-2024 21:51:32
 */
public class MenedzerWiadomosci {

	private String[] logi;
	private Date ostatniaAktualizacja;
	private Reklama[] reklamy;
	public Serwis m_Serwis;

	public MenedzerWiadomosci(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param wiadomosc
	 */
	public void dodajWiadomosc(Wiadomosc wiadomosc){

	}

	/**
	 * 
	 * @param id_odbiorcy
	 * @param id_adresata
	 */
	public Wiadomosc[] pobierzRozmowe(int id_odbiorcy, int id_adresata){
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public Wiadomosc pobierzWiadomosc(int id){
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public Wiadomosc usunWiadomosc(int id){
		return null;
	}
}//end MenedzerWiadomosci

/**
 * @author haloj
 * @version 1.0
 * @created 06-gru-2024 21:51:32
 */
public class ModelDocument1 {

	public ModelDocument1(){

	}

	public void finalize() throws Throwable {

	}
}//end ModelDocument1

/**
 * @author haloj
 * @version 1.0
 * @created 06-gru-2024 21:51:32
 */
public class Reklama {

	private Data dataUmowy;
	private int ID;
	private String imgSource;
	private int kwotaKontraktu;
	private String trescKontraktu;
	public W³aœciciel m_W³aœciciel;
	public MenedzerReklam m_MenedzerReklam;

	public Reklama(){

	}

	public void finalize() throws Throwable {

	}
	public String podajDateUmowy(){
		return "";
	}

	public int podajKwoteKontraktu(){
		return 0;
	}

	public String podajTrescKontraktu(){
		return "";
	}

	/**
	 * 
	 * @param nowyLink
	 */
	public void zmienObraz(String nowyLink){

	}
}//end Reklama

/**
 * @author haloj
 * @version 1.0
 * @created 06-gru-2024 21:51:32
 */
public class Serwis {

	private String hasloAdmin;
	private Produkt[] produkty;
	private Uzytkownik[] uzytkownicy;

	public Serwis(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param nowyUzytkownik
	 */
	public void dodajUzytkownika(Uzytkownik nowyUzytkownik){

	}

	public void edytujDane(){

	}

	/**
	 * 
	 * @param id
	 */
	public void usunUzytkownika(int id){

	}

	/**
	 * 
	 * @param kwerenda
	 */
	public void wyszukajProdukt(Query kwerenda){

	}
}//end Serwis

/**
 * @author haloj
 * @version 1.0
 * @created 06-gru-2024 21:51:32
 */
public class WalidatorTreœci {

	private String API_key;
	private String regulamin;
	private String url;
	private String zapytanie;
	public Serwis m_Serwis;
	public MenedzerWiadomosci m_MenedzerWiadomosci;

	public WalidatorTreœci(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param nowyRegulamin
	 */
	public void aktualizujRegulamin(String nowyRegulamin){

	}

	/**
	 * 
	 * @param nowyAPIKey
	 */
	public void zmienKlucz(String nowyAPIKey){

	}

	/**
	 * 
	 * @param nowyURL
	 */
	public void zmienURL(String nowyURL){

	}

	/**
	 * 
	 * @param tresc
	 */
	public void zweryfikuj(String tresc){

	}
}//end WalidatorTreœci