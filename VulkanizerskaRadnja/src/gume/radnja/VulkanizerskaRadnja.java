package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;

/**
 * 
 * @author Aleksa Pavlovic
 * @version 1.0
 *
 */
public class VulkanizerskaRadnja {
	/**
	 * Predstavlja listu guma vulkanizarske radnje
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Metoda koja dodaje novu gumu na pocetak liste
	 * 
	 * @param AutoGuma
	 *            objekat klase AutoGuma
	 * 
	 * @throws java.lang.NullPointerException
	 *             kada je unet objekat null
	 * 
	 * @throws java.lang.RuntimeExpcetion
	 *             kada uneti objekat vec postoji u listi
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.add(a);
	}

	/**
	 * Metoda koja vraca listu sa svim gumama date marke i modela
	 * 
	 * @param markaModel
	 *            Marka i model gume koja se pretrazuje
	 * @return Lista sa gumama iste marke i modela
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}

	/**
	 * Proverava da li se guma nalazi u listi
	 * 
	 * @param AutoGuma
	 *            Objekat klase AutoGuma
	 * @return true ako se nalazi i false ako se ne nalazi
	 * 
	 */
	public boolean daLiPostoji(AutoGuma a) {
		return gume.contains(a);
	}
}