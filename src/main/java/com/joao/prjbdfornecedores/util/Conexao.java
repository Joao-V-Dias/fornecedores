package com.joao.prjbdfornecedores.util;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    Dotenv dotenv = Dotenv.load();

    final private String driver = "com.mysql.cj.jdbc.Driver";
    final private String url = dotenv.get("DB_URL");
    final private String usuario = dotenv.get("DB_USER");
    final private String senha = dotenv.get("DB_PASS");

    public Connection conectar() {
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }
}
