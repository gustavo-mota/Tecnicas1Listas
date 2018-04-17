class Multiplicar extends Conta{
	Multiplicar(Expression esquerda, Expression direita){
		this.esquerda = esquerda;
		this.direita = direita;
	}
	double calcular(){
		return esquerda.calcular() * direita.calcular();
	}
}