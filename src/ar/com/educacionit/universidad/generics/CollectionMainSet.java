	package ar.com.educacionit.universidad.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionMainSet {

	public static void main(String[] args) {

		Collection<Integer> alumnos = new ArrayList<>();
		
		alumnos.add(10);
		alumnos.add(10);
		alumnos.add(20);
		alumnos.add(30);
		alumnos.add(30);
		
		System.out.println(alumnos);
		
		//filtrar haciendo asi:
		alumnos = new HashSet<>(alumnos);
		
		System.out.println(alumnos);
	}

}
