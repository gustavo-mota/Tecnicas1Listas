
class Seno extends ExpressionTrigo{
	public Seno(Expression expressionTrigo){
		super(expressionTrigo);
	}
	double calcular(){
		double valor = Math.sin(Math.toRadians(expressionTrigo.calcular()));
		ObservadorPositivo.update(valor);
		ObservadorNegativo.update(valor);
		return valor;
	}
}