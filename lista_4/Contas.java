public abstract class Contas{ //abstract
	float saldo;
	int id;
	public Contas(int id){
		this.id = id;
		this.saldo = 0;
	}

	float consultarSaldo(){
		return this.saldo;
	}

	abstract float creditar(float valor);
	abstract float debitar(float valor);
}

