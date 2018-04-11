class Sistema{
	Contas[] contas;
	public Sistema(){
		this.contas = new Contas[10];
		//contas[0] = new ContaXPTOBasic();
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

	public float consultarSaldo(int i){ //pq public
		return this.contas[i].consultarSaldo();//esta conta, indice i, ao consultarSaldo que mexe com as contas

	}

	public void creditar(int i, float valor){//Sobrecarga, pois em conta há o método creditar recebendo apenas o valor
        this.contas[i].creditar(valor);
    }

    public void debitar(int i, float valor){//Sobrecarga, pois em conta há o método debitar recebendo apenas o valor
        this.contas[i].debitar(valor);
    }
}


