class Sistema{
	float saldo;
	Sistema[] contas = new Sistema[3]; // exclusivo desta superclasse
	String tipo;
	int id;
	float consultarSaldo(int i){
		return contas[i].saldo;
	}
	void creditar(int i,float valor){
		this.contas[i].saldo += valor;
	}
	void debitar(int i,float valor){
		this.contas[i].saldo -= valor;
	}
}

class basic extends Sistema{
	void criarContaXPTOBasic(int i){
		this.contas[i].id = i;
		this.contas[i].saldo = 0;
		this.contas[i].tipo = "Basic";
	}
}

class plus extends Sistema{
	void criarContaXPTOPlus(int i){
		this.contas[i].id = i;
		this.contas[i].saldo = 0;
		this.contas[i].tipo = "plus";
	}

	void creditar(int i,float valor){
		this.contas[i].saldo += ((valor*(0.5))/100)+valor;
	}
}


class extreme extends Sistema{
	void criarContaXPTOExtreme(int i){
		this.contas[i].id = i;
		this.contas[i].saldo = 0;
		this.contas[i].tipo = "Extreme";
	}

	void creditar(int i,float valor){
		this.contas[i].saldo += ((valor*(0.2))/100)+valor;
	}
	void debitar(int i,float valor){
		this.contas[i].saldo -= ((valor*(0.2))/100)-valor;
	}

}