package dtos;

import java.time.LocalDate;

public class prestamoDto {

	//Cotroladores 
	long idPrestamo;
	long idCliente;
	long idLibro;
	LocalDate fechaPrestamo;
	LocalDate fechaEntrega;
	String estadoPrestamo;


	//Getters Setters
	public long getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(long idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public long getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(long idLibro) {
		this.idLibro = idLibro;
	}

	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getEstadoPrestamo() {
		return estadoPrestamo;
	}

	public void setEstadoPrestamo(String estadoPrestamo) {
		this.estadoPrestamo = estadoPrestamo;
	}

	public clienteDto getClientes() {
		return clientes;
	}

	public void setClientes(clienteDto clientes) {
		this.clientes = clientes;
	}

	public librosDto getLibros() {
		return libros;
	}

	public void setLibros(librosDto libros) {
		this.libros = libros;
	}

	//Controladores
	clienteDto clientes = new clienteDto();
	librosDto libros = new librosDto(); 

	public prestamoDto(long idPrestamo, long idCliente, long idLibro)
	{
	    this.idPrestamo = idPrestamo;
	    this.idCliente = idCliente;
	    this.idLibro = idLibro;
	    this.fechaPrestamo = LocalDate.now().plusDays(1);
	    this.fechaEntrega = fechaPrestamo.plusDays(7);
	    this.estadoPrestamo = estadoPrestamo;
	}

	public prestamoDto() {
	}
	
	/**
	 * ToString
	 */
	@Override
	public String toString() {
		return  "idPrestamo: " + idPrestamo + ", idCliente: " + idCliente + ", idLibro: " + idLibro
				+ ", fechaPrestamo: " + fechaPrestamo + ", fechaEntrega: " + fechaEntrega + ", estadoPrestamo: "
				+ estadoPrestamo + ", clientes: " + clientes + ", libros: " + libros;
	}
}
