package utilidades;

import java.util.List;

import controladores.inicio;
import dtos.bibliotecaDto;
import dtos.clienteDto;
import dtos.librosDto;

public class idGenerator {

	 public inicio i;

	 public long idGeneratorP()
	 {
	     long nuevoId;
	     int tamañoLista = i.bibliotecasLista.size();

	     if (tamañoLista > 0)
	     {
	         nuevoId = i.bibliotecasLista.get(i.bibliotecasLista.size() - 1).getId() + 1;
	     }
	     else
	     {
	         nuevoId = 1;
	     }

	     return nuevoId;
	 }

	 public long idGeneratorC()
	 {
		 long nuevoId;
	     int tamañoLista = i.clientesLista.size();

	     if (tamañoLista > 0)
	     {
	         nuevoId = i.clientesLista.get(i.clientesLista.size() - 1).getId() + 1;
	     }
	     else
	     {
	         nuevoId = 1;
	     }

	     return nuevoId;
	 }
	 

	 public long idGeneratorL()
	 {
	     long nuevoId;
	     int tamañoLista = i.librosLista.size();

	     if (tamañoLista > 0)
	     {
	    	 nuevoId = i.librosLista.get(i.librosLista.size() - 1).getId() + 1;
	     }
	     else
	     {
	         nuevoId = 1;
	     }

	     return nuevoId;
	 }

	 public long idGeneratorB()
	 {
		 long nuevoId;
	     int tamañoLista = i.bibliotecasLista.size();

	     if (tamañoLista > 0)
	     {
	         nuevoId = i.bibliotecasLista.get(i.bibliotecasLista.size() - 1).getId() + 1;
	     }
	     else
	     {
	         nuevoId = 1;
	     }

	     return nuevoId;
	 }
}
