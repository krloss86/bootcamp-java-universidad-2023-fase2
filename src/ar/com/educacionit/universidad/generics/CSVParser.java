package ar.com.educacionit.universidad.generics;

public class CSVParser implements IParser<String> {

	private Alumno alumno;
	
	public CSVParser(Alumno alumno) {
		this.alumno = alumno;
	}
	
	@Override
	public String parse() {
		return alumno.getDni() + ";"+alumno.getApellido() + ";" + alumno.getNombre() + ";" + alumno.getCurso(); 
	}
	
}
