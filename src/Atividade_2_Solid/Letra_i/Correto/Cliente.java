package Atividade_2_Solid.Letra_i.Correto;

import Atividade_2_Solid.Letra_i.Correto.Interfaces.Compravel;

public class Cliente implements Compravel{ // Importando a interface correspondente ao tipo de usuario

    @Override
    public void comprar() {
        System.out.println("Cliente comprando produto...");
    }

    @Override
    public void pagar() {
        System.out.println("Cliente pagando pedido...");
    }
}