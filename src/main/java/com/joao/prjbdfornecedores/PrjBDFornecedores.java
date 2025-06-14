package com.joao.prjbdfornecedores;

import com.joao.prjbdfornecedores.classes_bd.Fornecedor_BD;
import com.joao.prjbdfornecedores.objetos.Fornecedor;
import com.joao.prjbdfornecedores.regrasDeNegocio.Fornecedor_RN;

public class PrjBDFornecedores {

    public static void main(String[] args) {
        Fornecedor f = new Fornecedor();
        f.setNome("Teste");
        f.setCnpj("1234567812345");

        Fornecedor_BD f_BD = new Fornecedor_BD();
        f_BD.salvar(f);

        Fornecedor_RN f_RN = new Fornecedor_RN();
        f_RN.mostrarFornecedores(f_BD.getFornecedores());
    }
}
