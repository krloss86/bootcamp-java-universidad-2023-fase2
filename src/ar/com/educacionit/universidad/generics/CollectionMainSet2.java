	package ar.com.educacionit.universidad.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionMainSet2 {

	public static void main(String[] args) {

		Collection<Alumno> alumnos = new TreeSet<>();
		
		Alumno a  = new Alumno("12345678", "apellido", "nombre", "curso");
		Alumno b  = new Alumno("12345679", "apellido", "nombre", "curso");
		
		alumnos.add(a);
		alumnos.add(b);
		
		System.out.println(alumnos);
		
	}

}
