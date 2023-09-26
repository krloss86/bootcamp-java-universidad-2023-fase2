	package ar.com.educacionit.universidad.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {

	public static void main(String[] args) {

		Collection<Alumno> alumnos = new ArrayList<>();//¡??? 
		
		//agregar datos
		alumnos.add(new Alumno("12345678", "apellido", "nombre", "curso"));//0
		alumnos.add(new Alumno("12345679", "apellido", "nombre", "curso"));//1
		alumnos.add(new Alumno("12345680", "apellido", "nombre", "curso"));//2
		
		//size
		System.out.println("tamaño:" + alumnos.size());
		
		//tiene elementos?
		System.out.println("vacio?" + alumnos.isEmpty());
		
		//lipiar todos
		/*
		alumnos.clear();
		
		System.out.println("tamaño:" + alumnos.size());
		
		//tiene elementos?
		System.out.println("vacio?" + alumnos.isEmpty());
		*/
		
		//eliminar elementos MAL
		/*for(var alumno : alumnos) {
			if(alumno.getDni().equals("12345679") || alumno.getDni().equals("12345680")) {
				alumnos.remove(alumno);
			}
		}		
		for(var alumno : alumnos) {
			alumnos.remove(alumno);
		}
		*/
		
		//usar el iterator
		Iterator<Alumno> itAlumno = alumnos.iterator();
		
		while(itAlumno.hasNext()) {
			var alumno = itAlumno.next();
			if(alumno.getDni().equals("12345679") || alumno.getDni().equals("12345680")) {
				itAlumno.remove();
				System.out.println("se elimino " + alumno);
			}
		}
		
	}

}
