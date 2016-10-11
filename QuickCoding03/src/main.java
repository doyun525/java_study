import java.util.Scanner;

class a extends Exception{

}
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		try{
		a=Integer.parseInt(sc.nextLine());
		b=Integer.parseInt(sc.nextLine());
		if(a>999 || b>999) throw new a();
		c=a/b;
		}
		catch(ArithmeticException e){
			System.out.println("0으로 나눔 "+ e.getMessage());
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("숫자가 아님 "+ e.getMessage());
		}
		catch(a e){
			System.out.println("3자리를 초과하는 숫자 "+ e.getMessage());
		}
	}

}
