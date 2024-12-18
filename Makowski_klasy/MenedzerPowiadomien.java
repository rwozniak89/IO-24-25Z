package Sklep;

import Serwis.Serwis;

/**
 * @author haloj
 * @version 1.0
 * @created 06-gru-2024 21:54:07
 */
public class MenedzerPowiadomien {

	private String[] logi;
	private Date ostatniaAktualizacja;
	private Powiadomienie[] powiadomienia;
	public Serwis m_Serwis;

	public MenedzerPowiadomien(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param id_adresata
	 * @param id_odbiorcy
	 */
	public boolean dodajPowiadomienie(int id_adresata, int id_odbiorcy){
		return false;
	}

	/**
	 * 
	 * @param id
	 * @param nowaTresc
	 */
	public boolean edytujPowiadomienie(int id, String nowaTresc){
		return false;
	}

	/**
	 * 
	 * @param idOdbiorcy
	 * @param idAdresata
	 */
	public boolean pobierzKonwersacje(int idOdbiorcy, int idAdresata){
		return false;
	}

	/**
	 * 
	 * @param id
	 */
	public boolean usunPowiadomienie(int id){
		return false;
	}
}//end MenedzerPowiadomien