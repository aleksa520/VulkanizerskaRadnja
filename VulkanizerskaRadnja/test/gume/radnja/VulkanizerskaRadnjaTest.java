package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {

	VulkanizerskaRadnja v;

	@Before
	public void setUp() throws Exception {
		v = new VulkanizerskaRadnja();
	}

	@After
	public void tearDown() throws Exception {
		v = null;
	}

	@Test(expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		v.dodajGumu(null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajGumuVecPostoji() {
		AutoGuma a = new AutoGuma();
		a.setMarkaModel("Pirelli");
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(50);
		v.dodajGumu(a);

		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Pirelli");
		a2.setPrecnik(15);
		a2.setSirina(200);
		a2.setVisina(50);
		v.dodajGumu(a2);
	}

	@Test
	public void testDodajGumu() {
		AutoGuma a = new AutoGuma();
		a.setMarkaModel("Pirelli");
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(50);
		v.dodajGumu(a);

		assertTrue(v.daLiPostoji(a));
	}

	@Test
	public void testPronadjiGumuNull() {
		assertNull(v.pronadjiGumu(null));
	}

	@Test
	public void testPronadjiGumuJedna() {
		AutoGuma a = new AutoGuma();
		a.setMarkaModel("Pirelli");
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(50);
		v.dodajGumu(a);

		LinkedList<AutoGuma> gume1 = new LinkedList<AutoGuma>();
		gume1.add(a);
		assertEquals(gume1, v.pronadjiGumu("Pirelli"));
	}

	@Test
	public void testPronadjiGumuVise() {
		LinkedList<AutoGuma> gume1 = new LinkedList<AutoGuma>();

		AutoGuma a = new AutoGuma();
		a.setMarkaModel("Pirelli");
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(50);
		v.dodajGumu(a);
		gume1.add(a);

		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Pirelli");
		a2.setPrecnik(16);
		a2.setSirina(199);
		a2.setVisina(51);
		v.dodajGumu(a2);
		gume1.add(a2);

		assertEquals(gume1, v.pronadjiGumu("Pirelli"));
	}

	@Test
	public void testPronadjiGumuPrazna() {
		LinkedList<AutoGuma> gume1 = new LinkedList<AutoGuma>();
		AutoGuma a = new AutoGuma();
		a.setMarkaModel("Pirelli");
		a.setPrecnik(15); 
		a.setSirina(200);
		a.setVisina(50);
		v.dodajGumu(a);
		assertEquals(gume1, v.pronadjiGumu("Pierlli"));
	}
}