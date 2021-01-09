package br.com.guilherme.algorithms.salario;
public class Salario {

    private String name;
    private double salario;

    public Salario(String name, double salario) {
	super();
	this.name = name;
	this.salario = salario;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public double getSalario() {
	return salario;
    }

    public void setSalario(double salario) {
	this.salario = salario;
    }

}
