package com.mth.qa.models;

public class Usuario {

	String usuario;
	String clave;
	String numero;

	public Usuario(String usuario, String clave, String numero) {
		super();
		this.usuario = usuario;
		this.clave = clave;
		this.numero = numero;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getClave() {
		return clave;
	}

	public String getNumero() {
		return numero;
	}

}
