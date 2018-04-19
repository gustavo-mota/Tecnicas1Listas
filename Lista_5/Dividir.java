class Dividir extends Conta{
	Dividir(Expression esquerda, Expression direita){
		this.esquerda = esquerda;
		this.direita = direita;
	}
	double calcular(){
		double valor = 0;
		if(direita.calcular() != 0)
			valor = esquerda.calcular() / direita.calcular();
		ObservadorPositivo.update(valor);
		ObservadorNegativo.update(valor);
		return valor;
	}
}