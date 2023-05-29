package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager implements ConnectionParameters {

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(dbUrl, dbUser, dbPassword);
	}

	public static PreparedStatement getPreparedStatement(Connection connection, String sql) throws SQLException {
		return connection.prepareStatement(sql);

	}

	public static ResultSet getResultSet(Connection connection, String query) throws SQLException {
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(query);
		return rs;
	}

	public static ResultSet getRessultSetWithPreparedStatement(PreparedStatement ps) throws SQLException {
		return ps.executeQuery();
	}

	public static void closeConnection(Connection connection) throws SQLException {
		connection.close();
	};

}
