package com.altamira.qa.models;

public class Usuario {

	String usuario;
	String clave;

	public Usuario(String usuario, String clave) {
		super();
		this.usuario = usuario;
		this.clave = clave;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getClave() {
		return clave;
	}
}
