package dtos;

public class bibliotecaDto {

	 //Cotroladores 
	 long id;
	 String nombreBiblioteca;
	 String direccion;
	 
	 
	 //Getters Setters
	 	public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNombreBiblioteca() {
			return nombreBiblioteca;
		}

		public void setNombreBiblioteca(String nombreBiblioteca) {
			this.nombreBiblioteca = nombreBiblioteca;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
	 

	 //Controladores
	 public bibliotecaDto(long id, String nombreBiblioteca, String direccion)
	 {
	     this.id = id;
	     this.nombreBiblioteca = nombreBiblioteca;
	     this.direccion = direccion;
	 }

	 public bibliotecaDto()
	 {
		 
	 }
}
