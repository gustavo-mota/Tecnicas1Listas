import java.util.Observable;

public class ObservadorPositivo  extends Observer{
	public void update(Observable arg0, Object arg1){
		String acao = String.valueOf(arg1);
		if(acao.equals("Positivo")){
			System.out.println("Deu Positivo");
		}
	}
}