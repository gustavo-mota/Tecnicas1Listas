/*Gustavo Antonio Sousa P.M 399611 
Feito com Franklyn Seabra: O Main foi feito por mim, e acrescestado edições dele
tal como o Conjuntojava foi feito por ele e acrescentado edições por mim
*/
class Main{
	public static void main(String args[]){
		int k = 5,l = 0;
		/*Criação iniciada*/
		Conjunto conj1 = new Conjunto(10);
		Conjunto conj2 = new Conjunto(5);
		Conjunto conj3 = new Conjunto(5);
		Conjunto conj4 = new Conjunto(10);
		/*Criação completada*/
		/*Inserção iniciada*/
		for(int i = 0;i<11;i++){ 
			if(i<10){ conj1.adicionar(i); } //Conjunto 1:Dez primeiros naturais
			if(i<9 && i/2==0){ conj2.adicionar(i); } //Conjunto 2:Cinco primeiros pares
			if(i<10 && i/2!=0){ conj3.adicionar(i); } //Conunto 3: CInco primeiros ímpares
		}
		for(int j = 1;j<11;j++){
			if(j<4){ conj4.adicionar(j); } // Conjunto 4:Dez primeiros primos
			else{
				if(l == 0){
					conj4.adicionar(k);
					k += 2;
					l += 1;
				}else{
					conj4.adicionar(k);
					k += 4;
					l -= 1;
				}
			}
		}
		/*inserção completada*/
		/*Teste iniciado*/
		/*Teste A iniciado*/
		if(conj4.conjuntoPertence(conj4)){
			System.out.println("Sim");
		}else{
			System.out.println("Nao");
		}
		/*Teste A completado*/
		/*Teste B iniciado*/
		int teste1 = 0, teste2 = 0, teste3 = 0,teste4 =0;

		if(conj1.conjuntoPertence(conj2)){ //pertinencia conjunto 2
			teste1 = 1;
			System.out.println("O conjunto 2 eh pertinente no conjunto 1");
		}else{
			System.out.println("O conjunto 2 nao eh pertinente no conjunto 1");
		}

		if(conj1.conjuntoPertence(conj3)){ //pertinencia conjutno 3
			teste2 = 1;
			System.out.println("O conjunto 3 eh pertinente no conjunto 1");
		}else{
			System.out.println("O conjunto 3 nao eh pertinente no conjunto 1");
		}

		if(conj1.conjuntoPertence(conj4)){ //pertinencia conjunto 4
			teste3 = 1;
			System.out.println("O conjunto 4 eh pertinente no conjunto 1");
		}else{ 
			System.out.println("O conjunto 4 nao eh pertinente no conjunto 1");
		}

		if(teste1 == 1 && teste2 == 1 && teste3 == 1){ //pertinencia final
			System.out.println("Todos estao pertinentes");
		}else{
			System.out.println("Nem todos estao pertinentes");
		}
		/*Teste B completado*/
		/*Teste C iniciado*/
		Conjunto uniao = conj2.uniao(conj3);
		int igual = 1;
		for(int k = 0;k<10;k++){
			if(!conj1.elementoPertence(uniao[k])){ //duvida
				System.out.println("Nao eh igual");
				igual = 0;
			}
			break;
		}
		if(igual == 1){ System.out.println("Iguais"); }
		/*Teste C completado*/
		/*Teste D iniciado*/
		Conjunto inter = conj1.interseccao(conj2);
		boolean vazio = true;
		for(int l = 0;l<(inter.getTamanho());l++){
			if( (inter.getElemento(l)) != -1 ){
				vazio = false;
			}
		}
		if(vazio){
			System.out.println("Interseccao vazia");
		}else{
			System.out.println("Interseccao nao vazia");
		}
		/*Teste D completado*/
		/*Teste E iniciado*/
		Conjunto diferenca = conj1.diferenca(conj2); //falta teste de erro
		for(int m = 0;m<(conj1.getTamanho() - conj2.getTamanho()); m++){
			System.out.println("Elemento "+ m + "eh" + diferenca.getElemento(m));
		}
		/*Teste E completado*/
		/*Teste completado*/
	}
}
/*maneiras do C: Instanciar um conjunto união e 
o retorno da função ser o proprio*/
/*
1 2 3 5 7 11 13 17 19 23
 1 1 1 2 4  2  4  2  4
 */
