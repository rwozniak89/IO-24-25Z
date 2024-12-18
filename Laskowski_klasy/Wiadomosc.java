package Serwis;


/**
 * @author haloj
 * @version 1.0
 * @created 06-gru-2024 21:51:32
 */
public class Wiadomosc {

	public boolean czyOkolnik;
	private int ID;
	private int ID_adresata;
	private int ID_obiorcy;
	private boolean odebrano;
	private String tresc;
	public MenedzerWiadomosci m_MenedzerWiadomosci;

	public Wiadomosc(){

	}

	public void finalize() throws Throwable {

	}
	public void odznaczOdczytanie(){

	}

	public int otrzymajIDOdbiorcy(){
		return 0;
	}

	public String otrzymajTresc(){
		return "";
	}

	/**
	 * 
	 * @param nowaTresc
	 */
	public void zmienTresc(String nowaTresc){

	}
}//end Wiadomosc