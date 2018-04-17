class Dividir extends Conta{
	Dividir(Expression esquerda, Expression direita){
		this.esquerda = esquerda;
		this.direita = direita;
	}
	double calcular(){
		if(direita.calcular() != 0)
			return esquerda.calcular() / direita.calcular();
		return 0;
	}
}