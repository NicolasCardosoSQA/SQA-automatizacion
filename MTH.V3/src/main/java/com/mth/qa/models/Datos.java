package com.mth.qa.models;

public class Datos {
	String fuente;
	String codigocorto;
	String numerosuscriptor;
	String mensajetexto;

	public Datos(String fuente, String codigocorto, String numerosuscriptor, String mensajetexto) {
		super();
		this.fuente = fuente;
		this.codigocorto = codigocorto;
		this.numerosuscriptor = numerosuscriptor;
		this.mensajetexto = mensajetexto;
	}

	public String getFuente() {
		return fuente;
	}

	public String getCodigocorto() {
		return codigocorto;
	}

	public String getNumerosuscriptor() {
		return numerosuscriptor;
	}

	public String getMensajetexto() {
		return mensajetexto;
	}

}
