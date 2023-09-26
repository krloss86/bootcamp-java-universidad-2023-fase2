package ar.com.educacionit.universidad.interfaces.kpis;

public class PorAtendidos implements IKpi {

	@Override
	public Result execute(Turno[] turnos) {
		
		Atendidos atendidos = new Atendidos();
		Result res =  atendidos.execute(turnos);
		
		//?? Math.ceil / floor / round
		
		return new Result("% Atendidos", res.getValue() * 100 / turnos.length);
	}
}
