
class Seno extends ExpressionTrigo{
	public Seno(Expression expressionTrigo){
		super(expressionTrigo);
	}
	double calcular(){
		return Math.sin(Math.toRadians(expressionTrigo.calcular()));
	}
}