package ar.com.educacionit.universidad.generics;

import java.util.Comparator;

public class AlumnoCursoAsc implements Comparator<Alumno>{

	public int compare(Alumno o1, Alumno o2) {
		return o1.getCurso().compareTo(o2.getCurso());
	}

}
