package Exercicio2;

public class Aviao {

	
	private String nomeCompanhiaAerea;
    private int numeroDoVoo;
    private boolean statusVoo;

    public Aviao (String nomeC, int numV, boolean statusV) {
        nomeCompanhiaAerea = nomeC;
        numeroDoVoo = numV;
        statusVoo = statusV;
    }

    public String mostrarDados () {
        String informacoes = "Nome da Companhia �erea: "+nomeCompanhiaAerea+" | N�mero do Voo: "+numeroDoVoo;
        return informacoes;
    } 

    public String verificarStatusVoo () {

        String verificacao;
        if (statusVoo == true) {
            verificacao = "O avi�o j� decolou.";
        }

        else {
            verificacao = "O avi�o n�o decolou.";
        }

        return verificacao;
    }
}
	
	

