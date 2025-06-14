package com.joao.prjbdfornecedores.regrasDeNegocio;

import com.joao.prjbdfornecedores.objetos.Fornecedor;

import java.util.List;

public class Fornecedor_RN {
    public void mostrarFornecedores(List<Fornecedor> fornecedores) {
        for (Fornecedor fornecedor : fornecedores) {
            System.out.println("ID: " + fornecedor.getId_fornecedor());
            System.out.println("Nome: " + fornecedor.getNome());
            System.out.println("CNPJ: " + fornecedor.getCnpj());
            System.out.println("\n\n");
        }
    }
}
