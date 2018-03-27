package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AutoGumaTest {

	AutoGuma a;

	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelPrazanString() {
		a.setMarkaModel("");
	}

	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("Pirelli");
		assertEquals("Pirelli", a.getMarkaModel());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManje() {
		a.setPrecnik(12);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVise() {
		a.setPrecnik(23);
	}

	@Test
	public void testSetPrecnik() {
		a.setPrecnik(20);
		assertEquals(20, a.getPrecnik());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaManje() {
		a.setSirina(134);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaVece() {
		a.setSirina(356);
	}

	@Test
	public void testSetSirina() {
		a.setSirina(300);
		assertEquals(300, a.getSirina());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaManje() {
		a.setVisina(24);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaVece() {
		a.setVisina(96);
	}

	@Test
	public void testSetVisina() {
		a.setVisina(50);
		assertEquals(50, a.getVisina());
	}

	@Test
	public void testToString() {
		a.setMarkaModel("Pirelli");
		a.setPrecnik(20);
		a.setSirina(150);
		a.setVisina(50);
		assertEquals("AutoGuma [markaModel=Pirelli, precnik=20, sirina=150, visina=50]", a.toString());
	}

	@Test
	public void testEqualsObjectTrue() {
		a.setMarkaModel("Pirelli");
		a.setPrecnik(20);
		a.setSirina(150);
		a.setVisina(50);

		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Pirelli");
		a2.setPrecnik(20);
		a2.setSirina(150);
		a2.setVisina(50);

		assertTrue(a.equals(a2));
	}

	@Test
	public void testEqualsObjectFalse() {
		a.setMarkaModel("Pirelli");
		a.setPrecnik(20);
		a.setSirina(150);
		a.setVisina(50);

		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Pirelli");
		a2.setPrecnik(20);
		a2.setSirina(150);
		a2.setVisina(51);

		assertFalse(a.equals(a2));
	}
}