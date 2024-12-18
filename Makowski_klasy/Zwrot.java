package Sklep;


/**
 * @author haloj
 * @version 1.0
 * @created 06-gru-2024 21:55:18
 */
public class Zwrot {

	private String Data;
	private int ID;
	private String powod;
	public Sprzedawca m_Sprzedawca;
	public Produkt m_Produkt;

	public Zwrot(){

	}

	public void finalize() throws Throwable {

	}
}//end Zwrot