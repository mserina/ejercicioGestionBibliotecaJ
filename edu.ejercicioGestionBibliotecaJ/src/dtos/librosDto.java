package dtos;

public class librosDto {

	 //Cotroladores 
	 
	 String titulo;
	 String subtitulo;
	 String autor;
	 String ISBN;
	 int numeroEdicion;
	 String editorial;
	 int stock;

	 //Getters Setters
	
	 long id;
	 public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubtitulo() {
		return subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNumeroEdicion() {
		return numeroEdicion;
	}

	public void setNumeroEdicion(int numeroEdicion) {
		this.numeroEdicion = numeroEdicion;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}


	 //Controladores
	 public librosDto(long id, String  titulo, String  subtitulo, String  autor, String  iSBN, int numeroEdicion, String  editorial, int stock)
	 {
	     this.id = id;
	     this.titulo = titulo;
	     this.subtitulo = subtitulo;
	     this.autor = autor;
	     this.ISBN = iSBN;
	     this.numeroEdicion = numeroEdicion;
	     this.editorial = editorial;
	     this.stock = stock;
	 }

	 public librosDto()
	 {

	 }



	 //toString 
	 
}
