package servicios;

import java.io.FileWriter;
import java.io.IOException;

import controladores.inicio;
import dtos.bibliotecaDto;
import dtos.clienteDto;
import dtos.librosDto;
import dtos.prestamoDto;
import utilidades.idGenerator;

public class OperacionImplementacion implements OperacionInterfaz{

	 idGenerator idGenerator2 = new idGenerator();
	 public inicio i;
	 
	  public void darAltaBiblioteca()
	  {
	      System.out.println("Inserte el nombre de la biblioteca");
	      String nombre = i.sc.next();
	      System.out.println("Inserte el direccion de la biblioteca");
	      String direccion = i.sc.next();
	      long id = idGenerator2.idGeneratorB();

	     try{
	    	  bibliotecaDto bibliotecaNueva = new bibliotecaDto(id, nombre, direccion);
		      i.contenidoBiblioteca += bibliotecaNueva.toString() + "\n";
		      i.bibliotecasLista.add(bibliotecaNueva);
	     }
	     catch(Exception e) {
	    	 throw e;
	     }

	      
	  }

	  
	  public void darAltaCliente()
	  {
	      System.out.println("Inserte el id de la biblioteca donde quiere dar de alta al cliente");
	      long idBiblioteca = i.sc.nextLong();
	      System.out.println("Inserte el nombre del cliente");
	      String nombre = i.sc.next();
	      System.out.println("Inserte apellido del cliente");
	      String apellido = i.sc.next();
	      System.out.println("Inserte fecha de nacimiento");
	      String fechaNacimiento = i.sc.next();
	      /*
	      StringdniCompleto = pedirDNI(bibliotecas, idBiblioteca);
	      */
	      System.out.println("Inserte DNI");
	      String dniCompleto = i.sc.next();
	      System.out.println("Inserte un Correo electronico");
	      String correo = i.sc.next();

	      long id = 0;
	      
	      id= idGenerator2.idGeneratorC();
	      
	      try {

		      clienteDto clienteNuevo = new clienteDto(id, nombre, apellido, fechaNacimiento, dniCompleto, correo);
		      i.contenidoClientes = clienteNuevo.toString() + "\n";
		      i.clientesLista.add(clienteNuevo);
	      }
	      catch(Exception e) {
	    	  throw e;
	      }
	  }

	  public void verClientes()
	  {
	      System.out.println("Inserte la biblioteca");
	      long idBiblioteca = i.sc.nextLong();
	      for(clienteDto cliente : i.clientesLista)
	      {
	         
	    	  System.out.print(cliente + "\t");
	          
	      }

	  }
	  
	  public void darAltaLibro() 
	  {
	      System.out.println("Inserte el id de la biblioteca donde quiere dar de alta el libro");
	      long idBiblioteca = i.sc.nextLong();

	      long id = 0;
	     
	      id = idGenerator2.idGeneratorL();
	      
	      System.out.println("Inserta el titulo del libro");
	      String titulo = i.sc.next();
	      System.out.println("Insertar subtitulo del libro");
	      String subtitulo = i.sc.next();
	      System.out.println("Insertar autor del libro");
	      String autor = i.sc.next();
	      System.out.println("Inserte el ISBN");
	      String ISBN = i.sc.next();
	      System.out.println("Inserte el numero de la edicion");
	      int numeroEdicion = i.sc.nextInt();
	      System.out.println("Inserte la editorial");
	      String editorial = i.sc.next();
	      System.out.println("Inserte stocks");
	      int stock = i.sc.nextInt();

	    try {
	    	  librosDto libroNuevo = new librosDto( id,  titulo,  subtitulo,  autor, ISBN,  numeroEdicion,  editorial,  stock);
		      i.contenidoLibros = libroNuevo.toString() + "\n";
		     i.librosLista.add(libroNuevo);
	    }
	    catch(Exception e) {
	    	throw e;
	    }

	  }
	  
	  public void darAltaPrestamo()
	  {
		  
		  long idPrestamo = idGenerator2.idGeneratorP();
		  System.out.println("Inserte el id del cliente");
		  long idCliente = i.sc.nextLong();
		  System.out.println("Inserte el id del libro");
		  long idLibro = i.sc.nextLong();
		  
		  try {
			  prestamoDto prestamoNuevo = new prestamoDto(idPrestamo,idLibro,idCliente); 
			  i.contenidoPrestamo = prestamoNuevo.toString() + "\n";
			  i.prestamoLista.add(prestamoNuevo);
			  for(librosDto libro : i.librosLista) {
				 if(idLibro == libro.getId()) {
					 libro.setStock(-1);
				 }
			  }
		  }
		  catch(Exception e) {
			  throw e;
		  }
	  }
	  
	  
	  
	  public void guardarDatos() 
	  {
		  try {
				i.escribir = new FileWriter(i.nombreFicheroBiblioteca);
				i.escribir.write(i.contenidoBiblioteca);
				i.escribir.close();
				
				i.escribir = new FileWriter(i.nombreFicheroLibros);
				i.escribir.write(i.contenidoLibros);
				i.escribir.close();
				
				i.escribir = new FileWriter(i.nombreFicheroLibros);
				i.escribir.write(i.contenidoLibros);
				i.escribir.close();

		  }
		  catch(IOException io) {
			  System.out.println(io.getMessage());
		  }

	  }
}
