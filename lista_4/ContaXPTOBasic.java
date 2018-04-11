public class ContaXPTOBasic extends Contas{
	String tipo;
	ContaXPTOBasic(int id){
		super(id);
		this.tipo = "Basic";
	}

	public String toString(){
		return "\nTipo: Basic\nSaldo: R" + saldo + "\n Id: "+ id;
	}
	@Override
	public float creditar(float valor){
		this.saldo += valor;
		return saldo; //???
	}
	@Override
	public float debitar(float valor){
		this.saldo -= valor;
		return saldo;
	}
}