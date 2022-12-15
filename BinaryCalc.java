/*
 * Written by dhruv dattani
 */
import java.util.Scanner;


public class BinaryCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bn1, bn2, a, b, c, d, w, x, y, z;
		int a1, b1, c1, d1, combo1, combo2, wombocombo, w1, x1, y1, z1, e1, e2, e3, e4, f1, f2, f3, f4;
		//had to use parseInt because I had to separate each number from the number above as a character first.
		//Then I would be able to convert each substring to an integer using parseInt
		//I did use the mod operator when converting decimal number back to binary
		//but to separate the values in the number saved as a string and then multiply by 2^x (depending on the order) I had to use parseint
		//again I did not use parseInt to directly change my binary number to integer only used it to separate characters to change to integers
		//so i could do the operations on each number separate

		System.out.println("HI please enter a 4 bit binary number.");
			Scanner keyboard = new Scanner(System.in);
			bn1 = keyboard.nextLine();
			a = bn1.substring(0,1);
				a1 = Integer.parseInt(a);
			b = bn1.substring(1,2);
				b1 = Integer.parseInt(b);
			c = bn1.substring(2,3);
				c1 = Integer.parseInt(c);
			d = bn1.substring(3,4);
				d1 = Integer.parseInt(d);
		combo1 = (a1*8) + (b1*4) + (c1*2) + (d1*1);
		System.out.println(" Please enter another 4 bit binary number.");
			Scanner keyboard1 = new Scanner(System.in);
			bn2 = keyboard1.nextLine();
			w = bn2.substring(0,1);
				w1 = Integer.parseInt(w);
			x = bn2.substring(1,2);
				x1 = Integer.parseInt(x);
			y = bn2.substring(2,3);
				y1 = Integer.parseInt(y);
			z = bn2.substring(3,4);
				z1 = Integer.parseInt(z);
		combo2 = (w1*8) + (x1*4) + (y1*2) + (z1*1);
		
		wombocombo = combo1 + combo2;
		f1 = wombocombo%2;
		e1 = wombocombo/2;
		f2 = e1%2;
		e2 = e1/2;
		f3 = e2%2;
		e3 = e2/2;
		f4 = e3%2;
		
		System.out.println("Your first number is "+combo1+"");
		System.out.println("Your second number is "+combo2+"");
		System.out.println("added together is "+wombocombo+"");
		System.out.println("Which is "+f1+""+f2+""+f3+""+f4+" in binary");
				
		
		
		
		
		
	
	}
		
		
		

	}
		
		