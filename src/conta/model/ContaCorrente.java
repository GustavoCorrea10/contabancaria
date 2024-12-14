package conta.model;

public class ContaCorrente extends Conta { // extends => herança/herda
	// Atributos = variaveis

	private float limite;

	/*
	 * 3 modificadores de acesso Private - celular pessoal protected -telefone
	 * residencial publico - orelhão(todo mundo pode usar) default -
	 */

	// metodo especial - metodo construtor
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);// invoca o metodo construtor Conta
		this.limite = limite;

	}

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = 5000.0f;
		// this => classe conta
		// Conta.numero = atributo
		// numero = 6
		// this.numero = 6;
	}

	// Metodos de Acesso
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	//polimorfimos de sobescrita
	public void visualizar() {
		super.visualizar();// chamando o metodo visualizar da classe conta
		System.out.println("Limite de crédito: "+ this.limite);
	}

}
