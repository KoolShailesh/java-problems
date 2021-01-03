package core.java8.probems;

public class NumberFormatting {
	
	public static void main(String[] args) {
		int number =1;
		System.out.println(String.format("%3s", number).replace(' ', '0'));
		
		 String replace = String.format("%1$3s", number).replace(' ', '0');
		 System.out.println(replace);
	}

}
