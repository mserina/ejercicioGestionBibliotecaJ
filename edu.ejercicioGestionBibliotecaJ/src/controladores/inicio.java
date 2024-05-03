package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.bibliotecaDto;

public class inicio {

	static public void Main(String[] args)
	{
	    List<bibliotecaDto> bibliotecas = new ArrayList<bibliotecaDto>();
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
	                    cerrarMenu=true;
	                    break;
	                case 1:
	                     op.darAltaBiblioteca(bibliotecas);
	                    break;
	                case 2:
	                    op.darAltaCliente(bibliotecas);
	                    break;
	                case 3:
	                    op.darAltaLibro(bibliotecas);   
	                    break;
	                case 4:
	                    op.verClientes(bibliotecas);    
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
