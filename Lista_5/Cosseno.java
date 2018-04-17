
class Cosseno extends ExpressionTrigo{
	public Cosseno(Expression expressionTrigo){
		super(expressionTrigo);
	}
	double calcular(){
		return Math.cos(Math.toRadians(expressionTrigo.calcular()));
	}
}