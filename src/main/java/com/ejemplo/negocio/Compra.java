package com.ejemplo.negocio;

public class Compra {
	private Cliente cliente;
	private double importe;
	private double descuento;
	
	public Compra(Cliente cliente, double importe) {
		this.setCliente(cliente);
		this.setImporte(importe);
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
