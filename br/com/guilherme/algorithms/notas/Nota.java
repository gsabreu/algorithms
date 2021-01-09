package br.com.guilherme.algorithms.notas;

public class Nota {

    private String aluno;
    private double valor;

    public Nota(String aluno, double valor) {
	super();
	this.aluno = aluno;
	this.valor = valor;
    }

    public String getAluno() {
	return aluno;
    }

    public void setAluno(String aluno) {
	this.aluno = aluno;
    }

    public double getValor() {
	return valor;
    }

    public void setValor(double valor) {
	this.valor = valor;
    }

}
