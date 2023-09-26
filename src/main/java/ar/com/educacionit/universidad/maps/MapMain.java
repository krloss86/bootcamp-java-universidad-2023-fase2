package ar.com.educacionit.universidad.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {

		Map<String, Integer> mapDias = new HashMap<>();//HashMap<>();
		
		//cagarar valores en un mapa
		mapDias.put("lunes", 1);
		mapDias.put("martes", 2);
		mapDias.put("miercoles", 3);
		mapDias.put("jueves", 4);
		mapDias.put("viernes", 5);
		mapDias.put("sabado", 6);
		mapDias.put("domingo", 7);
		
		//mostrar mapa
		System.out.println(mapDias);
		
		//vacio?
		boolean empty = mapDias.isEmpty();
		System.out.println("empty?" + empty);//falso

		//si contiene algo?
		System.out.println("lunes?" + mapDias.containsKey("lunes"));//falso
		System.out.println("1?" + mapDias.containsValue(1));//falso
		
		//quitar elementos
		int value = mapDias.remove("miercoles");
		System.out.println("values deleted:" + value);
		
		mapDias.remove("jueves", 4);
		
		System.out.println(mapDias);
		
		//otengo las claves Set<K>
		Set<String> keys = mapDias.keySet();
		System.out.println(keys);
		
		//obtener los valores Collection<V>
		Collection<Integer> values = mapDias.values();
		System.out.println(values);
		
		//vaciar un mapa!
		//mapDias.clear();
		
		//System.out.println(mapDias);
		
		//obtener un solo valor del mapa
		Integer valor = mapDias.get("viernes");
		System.out.println("Valor:" + valor);
		
		//recorrer el mapa por sus key
	
		for (String aKey : keys) {
			Integer aValue = mapDias.get(aKey);
			System.out.println(aKey + "-"+ aValue);
		}
		
		//recorrer de a pares! Entry
		Set<Entry<String, Integer>> entries = mapDias.entrySet();
		for (Entry<String, Integer> aEntry : entries) {
			System.out.println(aEntry.getKey() + "-" +  aEntry.getValue());
		}
	}

}
