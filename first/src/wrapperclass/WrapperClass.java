package wrapperclass;

public class WrapperClass {

	public static void main(String[] args) {
	
		// auto boxing example
        int a = 10;  
        Integer A = a;
        System.out.println("Autoboxing int to Integer: " + A);
        
        double d = 10.55;
        Double D = d; 
        System.out.println("Autoboxing double to Double: " + D);
        
        char c = 'X';
        Character C = c;   
        System.out.println("Autoboxing char to Character: " + C);



        // Auto unboxing 
        Integer b = 10;  
        int B = b;  
        System.out.println("Auto unboxing Integer to int: " + B);

        
        Double e = 20.29;
        double E = e;
        System.out.println("Auto unboxing Double to double: " + E);

        
        Character f = 'Y';
        char ch = f;  
        System.out.println("Auto unboxing Character to char: " + ch);
	}

}
