/*
 * demosntra o escopo de bloco*/
public class EscopoBloco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x; //conhecida pelo codigo dentro de main()
		
		x = 10;
		if(x == 10) {//inicia novo escopo
			int y = 20; //conhecida apaneas pelo bloco
					
			//tanto x quanto y s�o conhecidas aqui
					System.out.println("x and y: " + x + "" + y);
					x = y * 2;
		}
		//y =100 // erro! Y n�o � conhecida aqui
		
		//x ainda � conhecida aqui
		System.out.println("x is " + x);
	}

}
