public class ContaXPTOExtreme extends Contas{
	String tipo;
	ContaXPTOExtreme(int id){ //Inclusão
		super(id);
		this.tipo = "Extreme";
	}

	public String toString(){
		return "\nTipo: Extreme\nSaldo: R" + saldo + "\n Id: "+ id;
	}
	@Override
	public float creditar(float valor){
		this.saldo += (valor*2)/100 +valor;
		return saldo;
	}
	@Override
	public float debitar(float valor){
		this.saldo -= (valor*98)/100;
		return saldo;
	}
}
