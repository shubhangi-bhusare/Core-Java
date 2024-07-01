package exception_handling;

public class Test1 {

	public static void main(String[] args) {
		try {
			String[] names = { "abc", "xyz", "def" };
			System.out.println(names[20]);
			int a = 10;
			int b = 4;
			System.out.println("div " + (a / b));//ArithmeticException when divide by 0
			System.out.println("int val " + Integer.parseInt("1234")); //if give string then it will cause NumberFormatException
			String s=null;
			System.out.println(s.length());//It will cause NullpointerException
			System.out.println("end of try....");
		}
//			catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(1);
//		}
//		 catch (ArithmeticException | NullPointerException e) {
//			System.out.println(2);
//		}
		catch (Exception e) {
			System.out.println("in catch-all");
			System.out.println(e.getMessage());
			System.out.println();
			System.out.println(e);
			System.out.println();
			e.printStackTrace();
		}
		System.out.println("main continues.....");

	}

}
