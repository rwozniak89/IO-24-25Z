package Sklep;


/**
 * @author haloj
 * @version 1.0
 * @created 06-gru-2024 21:55:15
 */
public class Zam�wienie {

	public String adresWysylki;
	private String data;
	private String ID;
	private float[] liczbySztuk;
	public boolean oplacono;
	private Produkt[] produkty;
	public String sposobOplacenia;

	public Zam�wienie(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param nowyProdukt
	 */
	public void dodajProdukt(Produkt nowyProdukt){

	}

	public float obliczLacznyKoszt(){
		return null;
	}

	public float otrzymajKwote(){
		return null;
	}

	public Produkt[] wypiszZamowienie(){
		return null;
	}
}//end Zam�wienie