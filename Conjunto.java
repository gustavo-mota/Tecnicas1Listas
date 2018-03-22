/*
Franklyn Seabra Rogério Bezerra 397847
Este foi feito inicialmente por ele e recebeu acréscimos meus ;)
*/
class Conjunto{
	int ultimo = 0; //indice do atual ultimo elemento do conjunto
	int tamanho;//tamanho do conjunto
	int[] array;

	Conjunto(int t){
		this.tamanho = t;
		array = new int[t];
	}

	public int getTamanho(){
		return this.tamanho;
	}

	public int getElemento(int indice){
		return this.array[indice];   
	}

	public void adicionar(int e){ //elemento
		if (!elementoPertence(e)){   
			if (this.tamanho == this.ultimo +1) {
				//System.out.println("Conjunto Cheio!");
			}else{
				this.array[this.ultimo] = e;
				this.ultimo++;
			}
		}else{
			//System.out.println("Elemento pertence ao conjunto!");
		}
		
		
	}

	public boolean elementoPertence(int e){
		for (int i = 0; i < this.ultimo; i++){
			if (array[i] == e)
				return true;
		}
		return false;
	}

	public boolean conjuntoPertence(Conjunto c){
		int teste = 0;
		for (int i = 0; i < c.ultimo; i++) {
			for (int j = 0; j < this.ultimo; j++) {
				if (c.array[i] == this.array[j]) {
					teste = 1;
				}
			}
			if (teste == 0) {
					return false;
			}
			teste = 0;
		}
		return true;
	}
	public Conjunto uniao(Conjunto A){
		Conjunto union  = new Conjunto(this.tamanho + A.tamanho);
		for (int i = 0; i < A.tamanho; i++) {
			union.adicionar(A.array[i]);
		}
		for (int j = 0; j < this.tamanho; j++) {
			union.adicionar(this.array[j]);
		}
		return union;
	}

	public Conjunto interseccao(Conjunto A){
		int[] vetorAux = new int[this.tamanho];
		int nRepetidos = 0;
		for (int i = 0; i < A.ultimo ;i++){
			for (int j = 0; j<this.ultimo; j++){
				if(A.array[i] == this.array[j]){
					vetorAux[i] = A.array[i];
					++nRepetidos;
				}
			}
		}
		Conjunto intersec  = new Conjunto(nRepetidos);
		for (int i = 0; i<intersec.tamanho;i++ ) {
			intersec.adicionar(vetorAux[i]);
		}
		return intersec;
	}

	//ainda não terminado
	public Conjunto diference(Conjunto A){
		for(int a = 0;a<A.tamanho;a++){
			System.out.println(A.array[a]);
		}

		for(int b = 0;b<this.tamanho;b++){
			System.out.println(this.array[b]);
		}

		Conjunto intersec = this.interseccao(A);

		Conjunto dif = new Conjunto(this.tamanho - intersec.tamanho);
		boolean teste;
		for (int i=0; i<this.tamanho; i++) {
			teste = false;
			for (int j=0; j<intersec.tamanho; j++) {
				if(this.array[i] == intersec.array[j]){
					teste = true;
				}
			}
			if(!teste){
				System.out.println("elemento diferente:"+this.array[i]+"\n");
				dif.adicionar(this.array[i]);
			}
		}
		return dif;
	}

}