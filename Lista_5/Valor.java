class Valor extends Expression{
	double valor;
	Valor(double valor){
		this.valor = valor;
	}

	double calcular(){
		return valor;
	}
}