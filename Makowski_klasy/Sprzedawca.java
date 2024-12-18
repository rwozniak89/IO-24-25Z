package Sklep;


/**
 * @author haloj
 * @version 1.0
 * @created 06-gru-2024 21:54:24
 */
public class Sprzedawca extends U¿ytkownik {

	private boolean czyFirma;
	private String KRS;
	private String NIP;
	private boolean op³acaVAT;

	public Sprzedawca(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public boolean czyOplacaVAT(){
		return false;
	}

	public boolean czyToFirma(){
		return false;
	}

	/**
	 * 
	 * @param oplacaVAT
	 */
	public void zaktualizujPodleganieVAT(boolean oplacaVAT){

	}

	/**
	 * 
	 * @param nowyNIP
	 */
	public void zmienNIP(int nowyNIP){

	}
}//end Sprzedawca