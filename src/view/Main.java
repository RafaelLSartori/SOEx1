package view;

import controller.Exercicio1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Exercicio1 m = new Exercicio1();
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));
        int[] vet = new int[tamanho];
        m.exUM(vet, tamanho);
    }
}