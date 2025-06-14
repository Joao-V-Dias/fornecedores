package com.joao.prjbdfornecedores.classes_bd;

import com.joao.prjbdfornecedores.objetos.Fornecedor;
import com.joao.prjbdfornecedores.util.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Fornecedor_BD {
    Connection conn;

    public Fornecedor_BD() {
        conn = new Conexao().conectar();
    }

    public Fornecedor salvar(Fornecedor f) {
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO fornecedor (nome, cnpj) values (?, ?)", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getCnpj());
            stmt.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return f;
    }

    public List<Fornecedor> getFornecedores() {
        List<Fornecedor> lstF = new ArrayList<>();
        ResultSet rs;
        try {
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM fornecedor");
            rs = ppStmt.executeQuery();
            while (rs.next()) {
                lstF.add(getFornecedor(rs));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lstF;
    }

    public Fornecedor getFornecedor(ResultSet rs) throws SQLException {
        Fornecedor f = new Fornecedor();

        f.setId_fornecedor(rs.getInt("id"));
        f.setNome(rs.getString("nome"));
        f.setCnpj(rs.getString("cnpj"));

        return f;
    }
}