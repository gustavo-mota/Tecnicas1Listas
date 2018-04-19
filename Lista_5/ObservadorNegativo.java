public class ObservadorNegativo{
	public static void update(Double arg){
		if(arg == 0){
			System.out.println("Deu Zero");
		}else if(arg < 0 ){
			System.out.println("Deu Negativo"+arg);

		}
	}
}