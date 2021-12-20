package com.mario.bloque3rubrica5.connection;

import com.mario.bloque3rubrica5.connection.AbstractConnection;


public class H2Connection extends AbstractConnection {

	@Override
	public String getDriver() {
		return "org.h2.Driver";
	}

	@Override
	public String getUser() {
		return "sa";
	}

	@Override
	public String getPass() {
		return "";
	}
}