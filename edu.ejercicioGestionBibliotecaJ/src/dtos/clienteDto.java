package dtos;

import java.time.LocalDate;

public class clienteDto {
	//Cotroladores 
	

	String nombre;
	String apellidos;
	String fechaDeNacimiento;
	String DNI;
	String correoElectrónico;
	LocalDate fechaInicioSuspensión;
	LocalDate fechaFinSuspensión;



	//Getters Setters
	long id;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getCorreoElectrónico() {
		return correoElectrónico;
	}

	public void setCorreoElectrónico(String correoElectrónico) {
		this.correoElectrónico = correoElectrónico;
	}

	public LocalDate getFechaInicioSuspensión() {
		return fechaInicioSuspensión;
	}

	public void setFechaInicioSuspensión(LocalDate fechaInicioSuspensión) {
		this.fechaInicioSuspensión = fechaInicioSuspensión;
	}

	public LocalDate getFechaFinSuspensión() {
		return fechaFinSuspensión;
	}

	public void setFechaFinSuspensión(LocalDate fechaFinSuspensión) {
		this.fechaFinSuspensión = fechaFinSuspensión;
	}


	//Controladores
	public clienteDto(long id, String nombre, String apellidos, String fechaDeNacimiento, String DNI, String correoElectrónico)
	{
	    prestamoDto prestamo = new prestamoDto();
	    this.id = id;
	    this.nombre = nombre;
	    this.apellidos = apellidos;
	    this.fechaDeNacimiento = fechaDeNacimiento;
	    this.DNI = DNI;
	    this.correoElectrónico = correoElectrónico;
	    this.fechaInicioSuspensión = prestamo.fechaEntrega.plusDays(1);
	    this.fechaFinSuspensión = fechaInicioSuspensión.plusDays(id);
	}

	public clienteDto()
	{
	}
}
