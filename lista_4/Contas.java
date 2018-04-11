public abstract class Contas{
	float saldo;
	int id;
	public Contas(int id){
		this.id = id;
		this.saldo = 0; //coerção básica
	}

	float consultarSaldo(){
		return this.saldo;
	}

	abstract float creditar(float valor);
	abstract float debitar(float valor);
}

