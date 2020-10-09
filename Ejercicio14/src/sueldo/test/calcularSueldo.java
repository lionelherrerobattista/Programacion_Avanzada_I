package sueldo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import sueldo.Empleado;
import sueldo.ICalculoSueldo;
import sueldo.tipoCobro;
import sueldo.Factory;

public class calcularSueldo {
	
	public void sueldoOk() {
		List<Empleado> listaEmpleado = new ArrayList<Empleado>();
		
		Empleado e1 = new Empleado("Juan", "Gonzalez", "2011345345", "activo", 20000, 50, tipoCobro.mensual);
		Empleado e2 = new Empleado("José", "Pérez", "2011345345", "activo", 200, 50, tipoCobro.porHora);
		Empleado e3 = new Empleado("María", "López", "2011345345", "activo", 35000, 5, tipoCobro.mensual);
		Empleado e4 = new Empleado("Gabriel", "Fernandez", "2011345345", "activo", 50, 20, tipoCobro.porHora);
		Empleado e5 = new Empleado("Juana", "Gonzalez", "2011345345", "activo", 100, 80, tipoCobro.porHora);
		
		
		listaEmpleado.add(e1);
		listaEmpleado.add(e2);
		listaEmpleado.add(e3);
		listaEmpleado.add(e4);
		listaEmpleado.add(e5);
		
		
		//Factory
		for(Empleado e: listaEmpleado) {
			ICalculoSueldo calculo = Factory.obtenerCobro(e.getTipoCobro());
			//Resultado
			System.out.println("Empleado:" + e.getApellido()+ " Sueldo " + 
					e.getTipoCobro() + ":" + calculo.calcular(e));
		}	
	}
	
	

}
