package controladores;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.bibliotecaDto;
import dtos.clienteDto;
import dtos.librosDto;
import dtos.prestamoDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperacionImplementacion;
import servicios.OperacionInterfaz;

public class inicio {

	static public String nombreLog = "C:\\Users\\Usuario\\Desktop\\ARCHIVOS\\archivoLog.txt";
	static public String nombreFicheroBiblioteca = "C:\\Users\\Usuario\\Desktop\\ARCHIVOS\\archivoFicheroBiblioteca.txt";
	static public String nombreFicheroClientes = "C:\\Users\\Usuario\\Desktop\\ARCHIVOS\\archivoFicheroClientes.txt";
	static public String nombreFicheroLibros = "C:\\Users\\Usuario\\Desktop\\ARCHIVOS\\archivoFicheroLibros.txt";
	static public String nombreFicheroPrestamo = "C:\\Users\\Usuario\\Desktop\\ARCHIVOS\\archivoFicheroPrestamo.txt";
	static public FileWriter escribir;
	static public FileReader leer;
	static public String contenidoBiblioteca;
	static public String contenidoClientes;
	static public String contenidoLibros;
	static public String contenidoPrestamo;

	
	static public List<bibliotecaDto> bibliotecasLista = new ArrayList<bibliotecaDto>();
	static public List<prestamoDto> prestamoLista = new ArrayList<prestamoDto>();
	static public List<clienteDto> clientesLista = new ArrayList<clienteDto>();
	static public List<librosDto> librosLista = new ArrayList<librosDto>();
	static public Scanner sc = new Scanner (System.in);
	
	
	
	static public void main(String[] args)
	{
	   
	    boolean cerrarMenu = false;
	    int opcionRespuesta;
	    MenuInterfaz menu = new MenuImplementacion();
	    OperacionInterfaz op = new OperacionImplementacion();
	    while(!cerrarMenu) 
	    {
	        opcionRespuesta = menu.opcionYMostrarMenu();

	        try
	        {
	        
	            switch (opcionRespuesta)
	            {
	                case 0:
	                	escribir = new FileWriter(nombreLog, true);
	                	escribir.write("Cerrando Menu" + "\n");
	                    escribir.close();
	                	cerrarMenu=true;
	                    break;
	                case 1:
	                	escribir = new FileWriter(nombreLog, true);
	                	escribir.write("El usuario da de alta una biblioteca" + "\n");
	                    escribir.close();
	                     op.darAltaBiblioteca();	
	                    break;
	                case 2:
	                	escribir = new FileWriter(nombreLog, true);
	                	escribir.write("El usuario da de alta un cliente"  + "\n");
	                    escribir.close();
	                    op.darAltaCliente();
	                    break;
	                case 3:
	                	escribir = new FileWriter(nombreLog, true);
	                	escribir.write("El usuario da de alta un libro"  + "\n");
	                    escribir.close();
	                    op.darAltaLibro();   
	                    break;
	                case 4:
	                	escribir = new FileWriter(nombreLog, true);
	                	escribir.write("Ve los clientes"  + "\n");
	                    escribir.close();
	                    op.verClientes();    
	                    break;
	                case 5:
	                	escribir = new FileWriter(nombreLog, true);
	                	escribir.write("Guardando datos de las bibliotecas"  + "\n");
	                    escribir.close();
	                    op.guardarDatos();
	                    break;
	                case 6:
	                	escribir = new FileWriter(nombreLog, true);
	                	escribir.write("El usuario da de alta un prestamo"  + "\n");
	                    escribir.close();
	                    op.darAltaPrestamo();
	                    break;
	            }
	        }
	        catch(Exception e)
	        {
	            System.out.println(e.getMessage());
	        }
	    }

	}
}
