package controller;

public class Exercicio1 {
    public Exercicio1(){
        super();
    }

    public void exUM(int[] vet){
        double tempoInicial = System.nanoTime();
        for (int i = 0; i < 1000; i++){
            vet[i] = 0;
        }
        double tempoFinal = System.nanoTime();
        double tempoTotal = tempoFinal - tempoInicial;
        tempoTotal = tempoTotal / Math.pow(10,9);
        System.out.println("Tempo gasto com 1000 posições: " + tempoTotal + "s");
    }
}
