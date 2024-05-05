package servicios;

import java.io.Console;

import controladores.inicio;

public class MenuImplementacion implements MenuInterfaz
{
	public inicio in;
	 public int opcionYMostrarMenu()
	 {
		 
		
	     int opcionSeleccionada;
	     System.out.println(" ");
	     System.out.println("0[] CERRAR MENU");
	     System.out.println("1[] DAR ALTA BIBLIOTECA");
	     System.out.println("2[] DAR ALTA CLIENTE");
	     System.out.println("3[] DAR ALTA LIBRO");
	     System.out.println("4[] VER CLIENTES");
	     System.out.println("5[] GUARDAR");
	     System.out.println("4[] DAR ALTA PRESTAMO");
	     System.out.println(" ");

	     
	     opcionSeleccionada = in.sc.nextInt();

	     return opcionSeleccionada;
	 }

}
