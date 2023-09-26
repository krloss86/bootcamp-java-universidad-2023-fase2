package ar.com.educacionit.universidad.oop.polimorfismo;

public class MainPostres {

	public static void main(String[] args) {
		
		Flan f = new Flan();
		Geletina g = new Geletina();
		
		//aca casi se da el polimorfismo
		f.temblar();
		g.temblar();
		
	}

}
