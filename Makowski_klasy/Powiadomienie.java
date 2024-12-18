package Sklep;


/**
 * @author haloj
 * @version 1.0
 * @created 06-gru-2024 21:54:17
 */
public class Powiadomienie {

	protected Date dataOdczytania;
	protected Date dataWyslania;
	private String ID;
	protected String ID_adresata;
	protected String ID_odbiorcy;
	protected boolean odebrane;
	private String tresc;
	private boolean ukryte;
	public MenedzerPowiadomien m_MenedzerPowiadomien;

	public Powiadomienie(){

	}

	public void finalize() throws Throwable {

	}
	public boolean czyUkryte(){
		return false;
	}

	/**
	 * 
	 * @param nowaTresc
	 */
	public void edytujPowiadomienie(String nowaTresc){

	}

	public String otrzymajTresc(){
		return "";
	}

	public void ukryj(){

	}

	/**
	 * 
	 * @param czas
	 */
	public void zaznaczOdczytanie(Date czas){

	}
}//end Powiadomienie