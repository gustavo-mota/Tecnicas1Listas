class Multiplicar extends Conta{
	Multiplicar(Expression esquerda, Expression direita){
		this.esquerda = esquerda;
		this.direita = direita;
	}
	double calcular(){
		double valor = esquerda.calcular() * direita.calcular();
		ObservadorPositivo.update(valor);
		ObservadorNegativo.update(valor);
		return valor;
	}
}