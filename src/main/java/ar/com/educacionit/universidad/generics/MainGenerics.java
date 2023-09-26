package ar.com.educacionit.universidad.generics;

public class MainGenerics {

	/*
	 * La idea es convertir en base a un parametro
	 * un vector de datos.
	 * 
	*/
	public static void main(String[] args) {

		String tipoQueVieneDelFrontend = "CSV";
		
		//crear un alumno 
		Alumno alumno = new Alumno("12456789", "perez", "juan", "java1");
		
		//cremos el parse
		IParser<String> parser = new CSVParser(alumno);
		
		//parseo
		String dato = parser.parse();
		
		//muestro
		System.out.println(dato);
	}
}
