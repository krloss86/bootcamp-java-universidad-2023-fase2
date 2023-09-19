package ar.com.educacionit.universidad.generics;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{

	private String dni;
	private String apellido;
	private String nombre;
	private String curso;
	
	public Alumno(String dni, String apellido, String nombre, String curso) {
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.curso = curso;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, curso, dni, nombre);
	}

	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		if (!( obj instanceof Alumno)) {
			return false;
		}
		
		//igualdad a nivel de negocio
		if(!this.getDni().equals(((Alumno)obj).getDni())) {
			return false;
		}
		
		if(this == obj) {
			return true;
		}
		
		return true;
	}
	
	
}
