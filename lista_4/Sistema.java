class Sistema{
	Contas[] contas;
	public Sistema(){
		this.contas = new Contas[10];
	}

	public void criarContaXPTOBasic(int i){
        this.contas[i] = new ContaXPTOBasic(i); 
    }

    public void criarContaXPTOPlus(int i){
        this.contas[i] = new ContaXPTOPlus(i); 
    }

    public void criarContaXPTOExtreme(int i){
        this.contas[i] = new ContaXPTOExtreme(i); 
    }

	public float consultarSaldo(int i){
		return this.contas[i].consultarSaldo();//sobrecarga

	}

	public void creditar(int i, float valor){//Sobrecarga
        this.contas[i].creditar(valor);
    }

    public void debitar(int i, float valor){//Sobrecarga
        this.contas[i].debitar(valor);
    }
}


