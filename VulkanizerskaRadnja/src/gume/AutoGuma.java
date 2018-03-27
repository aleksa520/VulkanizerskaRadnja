package gume;

/**
 * Klasa koja predstavlja gume
 * 
 * @author Aleksa Pavlovic
 * @version 1.1
 */
public class AutoGuma {
	/**
	 * Marka i model gume
	 */
	private String markaModel = null;
	/**
	 * Precnik gume
	 */
	private int precnik = 0;
	/**
	 * Sirina gume
	 */
	private int sirina = 0;
	/**
	 * Visina gume
	 */
	private int visina = 0;

	/**
	 * Vraca marku i model gume
	 * 
	 * @return String marke i modela gume
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Postavlja marku i model gume
	 * 
	 * @param markaModel
	 *            String marke i modela gume
	 * @throws java.lang.RuntimeException
	 *             ako je unet String marke gume koji je
	 *             <ul>
	 *             <li>null
	 *             <li>ima manje od 3 karaktera
	 *             </ul>
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Vraca precnik gume
	 * 
	 * @return precnik gume kao integer
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Postavalja precnik gume
	 * 
	 * @param precnik
	 *            Vrednost precnika u cm
	 * @throws java.lang.RuntimeExpcetion
	 *             ako je unet precnik
	 *             <ul>
	 *             <li>manji od 13
	 *             <li>veci od 20
	 *             </ul>
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Vraca sirinu gume
	 * 
	 * @return sirinu gume kao integer
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Postavlja sirinu gume
	 * 
	 * @param sirina
	 *            Sirina gume u cm
	 * @throws java.lang.RuntimeExpcetion
	 *             ako je uneta sirina gume
	 *             <ul>
	 *             <li>manja od 135
	 *             <li>veca od 355
	 *             </ul>
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Vraca visinu gume
	 * 
	 * @return visinu gume kao integer
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Postavlja visinu gume
	 * 
	 * @param visina
	 *            Visina gume u cm
	 * @throws java.lang.RuntimeException
	 *             ako je visina gume
	 *             <ul>
	 *             <li>manja od 25
	 *             <li>veca od 95
	 *             </ul>
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * Vraca podatke o gumi
	 * 
	 * @return String sa podacima o gumi
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Proverava da li su gume iste
	 * 
	 * @return vraca boolean vrednost u zavisnosti od toga da li su gume iste onda
	 *         true ako nisu onda vraca false
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}