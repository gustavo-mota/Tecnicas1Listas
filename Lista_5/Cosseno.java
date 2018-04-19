
class Cosseno extends ExpressionTrigo{
	public Cosseno(Expression expressionTrigo){
		super(expressionTrigo);
	}
	double calcular(){
		double valor = Math.cos(Math.toRadians(expressionTrigo.calcular()));
		ObservadorPositivo.update(valor);
		ObservadorNegativo.update(valor);
		return valor;
	}
}