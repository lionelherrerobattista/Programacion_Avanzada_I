package Calculadora;

public class Calculadora implements ICalcular{

	@Override
	public Double sumar(Number a, Number b) {
		Double resultado = a.doubleValue() + b.doubleValue();
		return resultado;
	}

	@Override
	public Double restar(Number a, Number b) {
		Double resultado = a.doubleValue() - b.doubleValue();
		return resultado;
	}

	@Override
	public Double multiplicar(Number a, Number b) {
		Double resultado = a.doubleValue() * b.doubleValue();
		return resultado;
	}

	@Override
	public Double dividir(Number a, Number b) throws DivisionPorCeroException {
		Double resultado;
		
		if(b.doubleValue() == 0) {
			throw new DivisionPorCeroException();
		} else {
			resultado = a.doubleValue() / b.doubleValue();
			return resultado;	
		}
	}

}
