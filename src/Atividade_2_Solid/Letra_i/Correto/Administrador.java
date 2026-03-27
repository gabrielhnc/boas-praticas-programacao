package Atividade_2_Solid.Letra_i.Correto;

import Atividade_2_Solid.Letra_i.Correto.Interfaces.GerenciavelEstoque;
import Atividade_2_Solid.Letra_i.Correto.Interfaces.RelatorioVenda;

public class Administrador implements GerenciavelEstoque, RelatorioVenda {

    @Override
    public void gerenciarEstoque() {
        System.out.println("Admin gerenciando estoque");
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Admin gerando relatórios");
    }
}