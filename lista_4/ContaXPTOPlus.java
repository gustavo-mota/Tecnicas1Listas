public class ContaXPTOPlus extends Contas{
	String tipo;
	ContaXPTOPlus(int id){ //Inclusão
		super(id);
		this.tipo = "Plus";
	}

	public String toString(){
		return "\nTipo:" + tipo + "\nSaldo: R" + saldo + "\n Id: "+ id;
	}
	@Override
	public float creditar(float valor){
		this.saldo += (valor*5)/100 +valor;
		return saldo;
	}
	@Override
	public float debitar(float valor){
		this.saldo -= valor;
		return saldo;
	}
}
