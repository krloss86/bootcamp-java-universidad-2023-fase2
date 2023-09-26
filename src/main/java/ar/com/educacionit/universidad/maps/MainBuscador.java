package ar.com.educacionit.universidad.maps;

import java.util.Collection;

import ar.com.educacionit.universidad.maps.ordenables.ComparadorBuilder;
import ar.com.educacionit.universidad.oop.ecommerce.Resultado;

public class MainBuscador {

	public static void main(String[] args) {

		//REQUEST DESDE EL FRONT
		String orden = "MAS_VENDIDOS";
		String claveBuscadaPorElUsuario = "iron man";
		int cantidadXPaginas = 20;
		
		Buscador buscador = new Buscador(
			ComparadorBuilder.getComparador(orden)
		);
		
		buscador.setClave(claveBuscadaPorElUsuario);
		buscador.setCantidadXPagina(cantidadXPaginas); 
		buscador.buscar();
		
		buscador.ordenar();
	
		System.out.println("Hemos Encontrado "+ buscador.getCantidad()+ " Resultados Para '"+buscador.getClave()+"'");
		//recorro los resultados
		
		Collection<Resultado> res = buscador.obtenerResultados();
		for (Resultado resultado : res) {
			System.out.println(resultado);
		}
	}
}
