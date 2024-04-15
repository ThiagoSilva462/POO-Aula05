package view;

import model.Conta;
import model.SaldoInsuficienteException;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(1000);
        conta.setLimite(500);

        try {
            conta.saca(1500); 
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo disponível após tentativa de saque: " + conta.getSaldo());
    }
}
