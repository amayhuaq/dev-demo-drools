package com.ejemplo.negocio;

public class Cliente {
	private String nombre;
	private boolean registrado;
	
	public Cliente(String nombre, boolean registrado) {
		this.setNombre(nombre);
		this.setRegistrado(registrado);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean esRegistrado() {
		return registrado;
	}

	public void setRegistrado(boolean registrado) {
		this.registrado = registrado;
	}	
}
