package br.comIFCTI3.bo;

public class Calculo {
	
	private double saldo;
	private double total;
	private double resultotal;
	
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void Calcular() {
		this.total = this.saldo / 100;
		this.total += this.saldo;
		
		System.out.println("O saldo de " + this.saldo + " reais com o reajuste de 1% vai para "+ this.total + " reais");
	}


	

}
