/*Gustavo Antonio Sousa P.M 399611 
Feito com Franklyn Seabra: O Main foi feito por mim, e acrescestado edições dele
tal como o Conjuntojava foi feito por ele e acrescentado edições por mim
*/
class Main{
	public static void main(String args[]){
		int k = 5,l = 0;
		/*Criação iniciada*/
		Conjunto conj1 = new Conjunto(11);
		Conjunto conj2 = new Conjunto(6);
		Conjunto conj3 = new Conjunto(6);
		Conjunto conj4 = new Conjunto(11);

		/*Criação completada*/
		/*Inserção iniciada*/		
		for(int i = 0;i<10;i++){ 
			conj1.adicionar(i);
		}
		for(int z = 0;z<12;z+=2){
			conj2.adicionar(z);
		}
		for(int y = 1;y<10;y+=2){
			conj3.adicionar(y);
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
		for(int m = 0;m<10;m++){
			if(!(conj1.elementoPertence(uniao.array[m]))){ 
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
		for(int n = 0;n<(inter.getTamanho());n++){ //suspeito
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
		Conjunto diferenca = conj1.diference(conj2); //falta teste de erro
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