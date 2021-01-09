package br.com.guilherme.algorithms.salario;
public class MenorEMaiorSalario {

    public static void main(String[] args) {

	Salario[] salarios = { new Salario("Fernando", 3200.00), new Salario("Alfredo", 6000.00),
		new Salario("Flávio", 5000.00), new Salario("Marcela", 2200.00) };
	
	int menorSalario = getMenorSalario(salarios);
	int maiorSalario = getMaiorSalario(salarios);
	
	System.out.println("O menor sálario é do/da " + salarios[menorSalario].getName() + ", no valor de " + salarios[menorSalario].getSalario());
	System.out.println("O maior sálario é do/da " + salarios[maiorSalario].getName() + ", no valor de " + salarios[maiorSalario].getSalario());
    }

    private static int getMenorSalario(Salario[] salarios) {
	int menorSalario = 0;

	for (int atual = 0; atual < salarios.length; atual++) {
	    if (salarios[atual].getSalario() < salarios[menorSalario].getSalario()) {
		menorSalario = atual;
	    }
	}
	return menorSalario;
    }
    
    private static int getMaiorSalario(Salario[] salarios) {
	int maiorSalario = 0;

	for (int atual = 0; atual < salarios.length; atual++) {
	    if (salarios[atual].getSalario() > salarios[maiorSalario].getSalario()) {
		maiorSalario = atual;
	    }
	}
	return maiorSalario;
    }

}