/*
 * os efeitos colatarais poder ser importantes*/
public class SideEffects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		
		/*aqui i � incrementada mesmo que a instru��o if seja falsa*/
		if(false & (++i < 100))
			System.out.println(" this won�t be displayed");
		    System.out.println(" if statement executed: " + i); //exibe 1
		    
		/*nesse caso aqui i n�o � incrementada porque o operador de curto-circuito ignora o incremento*/
			if(false && (++i < 100))
				System.out.println(" this won�t be displayed");
			    System.out.println(" if statement executed: " + i); //contonua exibindo 1
			       
	}

}
