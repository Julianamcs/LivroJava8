/*
 * [Demonstra a coer��o*/
public class CastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double x = 10.0, y = 3.0;
		byte b;
		int i;
		char ch;
		
		i = (int) (x/y);//converte double em inteiro
		System.out.println("Integer outcome of x / y: " + i);
		
		i = 100;
		b = (byte) i; //n�o h� perca de informa��es
		System.out.println("Value of b: " + b);
		
		i = 257;
		b = (byte) i; //h� perca de informa��es
		System.out.println("Value of b: " + b);
		
		b = 88;
		ch = (char) b;//coer��o entre tipos incompat�veis 
		System.out.println("ch: " + ch);
	}

}
