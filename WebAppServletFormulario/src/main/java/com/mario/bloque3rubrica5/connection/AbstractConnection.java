package com.mario.bloque3rubrica5.connection;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public abstract class AbstractConnection {

	public abstract String getDriver();
	public abstract String getUser();
	public abstract String getPass();

	public Connection open(String jdbcUrl) {
		Connection conn = null;
		try {
			Class.forName(getDriver());
			conn = DriverManager.getConnection(jdbcUrl, getUser(), getPass());
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return conn;
	}

	public void close(Connection conn) {
		if (null != conn) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}

	}

	public void close(Statement statement) {
		if (statement != null) {
			try {
				((Connection) statement).close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void close(PreparedStatement prepareStatement) {
		if (prepareStatement != null) {
			try {
				prepareStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}

	public void close(ResultSet resultSet) {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}
}