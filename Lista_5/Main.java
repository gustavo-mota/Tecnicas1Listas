class Main{
	public static void main(String[] args) {
		Expression op1, op2,op3, op4;
		op1 = new Valor(-5);
		op2 = new Valor(7);
		op3 = new Dividir(op1,op2);
		op4 = new Seno(op1);
		
		System.out.println("Valor op1: "+op1.calcular()+"Valor op2: "+op2.calcular()+"Valor op3: "+op3.calcular()+"Valor op4: "+op4.calcular());
	}
}