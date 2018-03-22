/*
Nome: Franklyn Seabra Rogério Bezerra
Matricula: 397847   Curso: Ciências da computação, UFC
*/
class Conjunto{

	int tamanho;
	int[] array;

	Conjunto(int t){
		this.tamanho = t;
		array = new int[t];
	}

	public Conjunto getTamanho(){
		return this.tamanho;
	}

	public Conjunto getElemento(int indice){
		return this.array[indice];
	}

	public void adicionar(int e){ //elemento
		if (elementoPertence(e)){
			return;
		}
		int k = 0;
		for (int i = 0; i < this.tamanho; i++){
			if (this.array[i] != -1)
				k++;
		}
		if(k == this.tamanho){
			System.out.println("Conjunto cheio!");
		}else{
			this.array[k] = e;	
		}
		
	}

	public boolean elementoPertence(int e){
		for (int i = 0; i < this.tamanho; i++){
			if (array[i] == e)
				return true;
		}
		return false;
	}

	public boolean conjuntoPertence(Conjunto c){
		int teste = 0;
		for (int i = 0; i < c.tamanho; i++) {
			for (int j = 0; j < this.tamanho; j++) {
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
		for (int i = 0; i < A.tamanho ;i++){
			for (int j = 0; j<this.tamanho; j++){
				if(A.array[i] == this.array[j]){
					vetorAux[i] = A.array[i];
					++nRepetidos;
				}
			}
		}
		Conjunto intersec  = new Conjunto(this.tamanho - nRepetidos);
		for (int i = 0; i<intersec.tamanho; ) {
			intersec.adicionar(vetorAux[i]);
		}
		return intersec;
	}

	//ainda não terminado
	public Conjunto diference(Conjunto A){
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
				dif.adicionar(this.array[i]);
			}
		}
		return dif;
	}

}

