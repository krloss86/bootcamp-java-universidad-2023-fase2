package ar.com.educacionit.universidad.maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ar.com.educacionit.universidad.oop.ecommerce.Libro;
import ar.com.educacionit.universidad.oop.ecommerce.Musica;
import ar.com.educacionit.universidad.oop.ecommerce.Pelicula;
import ar.com.educacionit.universidad.oop.ecommerce.Resultado;

public class Buscador {

	private String clave;
	private Collection<Resultado> resultados;
	private Comparator<Resultado> orden;
	private int cantidadXPagina;
	
	public Buscador(Comparator<Resultado> orden) {
		this.resultados = new ArrayList<>();
		this.clave = "";
		this.setOrden(orden);//ComparadorBuilder.getComparador(ComparadorEnum.MAS_VENDIDOS));
		this.cantidadXPagina = 20;
	}
	
	public void buscar() {
		//guard
		if(claveVacia()) {//f5
			System.out.println("no ingreso clave de busqueda");
			return;
		}
			
		Resultado res1 = new Libro("MARVEL STUDIOS EL DICCION...", "https:bla.com.ar/img1.jpg", 13973.25f, "BRAY, ADAM", "123456789",199,"sinopsis 123");
		Resultado res2 = new Musica("NUNCA CORRI SIEMPRE COBRE", "https:bla.com.ar/img2.jpg", 6999, "OYOLA, LEONARDO A.", "sello discografico", new String[] {"tema1","tema2"});
		Resultado res3 = new Pelicula("MARVEL: GUIA DE PERSONAJES I R", "https:bla.com.ar/img3.jpg", 9490, "CATAPULTA, LOS EDITORES DE","WARNER","BLUE RAY");
		
		this.agregarResultado(res1);
		this.agregarResultado(res2);
		this.agregarResultado(res3);
	}
	
	public void setCantidadXPagina(int cantidadXPagina) {
		this.cantidadXPagina = cantidadXPagina;
	}

	public void ordenar() {
		Collections.sort((List<Resultado>)this.resultados,this.orden);
	}
	
	public void setOrden(Comparator<Resultado> orden) {
		this.orden = orden;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getClave() {
		return this.clave;
	}
	
	private boolean claveVacia() {
		return "".equals(this.clave.trim());//ctrl+shift+i|f6
	}
	
	public void agregarResultado(Resultado res) {
		this.resultados.add(res);
	}
	
	public Collection<Resultado> obtenerResultados() {
		return this.resultados;
	}
	
	public int getCantidad() {
		return this.resultados.size();
	}
}
