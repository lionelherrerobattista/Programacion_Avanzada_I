package Calculadora;


public interface ICalcular {
	
	public Double sumar(Number a, Number b);
	public Double restar(Number a, Number b);
	public Double multiplicar(Number a, Number b);
	public Double dividir(Number a, Number b) throws DivisionPorCeroException;
	
}
