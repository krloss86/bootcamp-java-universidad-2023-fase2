	package ar.com.educacionit.universidad.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class CollectionMainSet2 {

	public static void main(String[] args) {

		String orden = "APELLIDO_ASC";
		
		Collection<Alumno> alumnos = new TreeSet<>(new AlumnoCursoAsc());//HashSet 
		
		Alumno a  = new Alumno("12345600", "lopez", "carlos", "php");
		Alumno b  = new Alumno("12345600", "lopez", "maite", "java");
		Alumno c  = new Alumno("12345599", "romero", "paula", "go");
		Alumno d  = new Alumno("12345602", "toconás", "kevin", "html");
		
		alumnos.add(a);
		alumnos.add(b);
		alumnos.add(c);
		alumnos.add(d);
		
		/*for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}*/
		
		//streams + lambdas
		alumnos.forEach(al -> System.out.println(al));//js
		
		//orden externo
		//Usando Comparator<T>
		System.out.println("---------------------------");
		alumnos = new ArrayList<>(alumnos);
		//ahora quiero reordenar 
		Collections.sort((List<Alumno>)alumnos, new ApellidoComparator(DireccionEnum.DESC));
		
		alumnos.forEach(al -> System.out.println(al));//js
	}

}
