package cau_1;

import java.util.Scanner;

/**
 * this class is
 * 
 * @author AnhSon
 */
public class PtBac2 {
	public static void main(String args[]) {
		double a, b, c;

		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Nhap a");
			a = in.nextDouble();
			System.out.println("Nhap b");
			b = in.nextDouble();
			System.out.println("Nhap c");
			c = in.nextDouble();
		}
		
		if (a == 0) {
			System.out.println("a phai khac 0 ");
		} else {
			double delta = b * b - 4 * a * c;

			if (delta < 0)
				System.out.println("Pt vo nghiem");

			if (delta > 0)
				System.out.println("Pt co 2 nghiem " + (-b + Math.sqrt(delta)) / (2 * a) + " "
						+ (-b - Math.sqrt(delta)) / (2 * a));
			else
				System.out.println("Pt co 1 nghiem" + -b / (2 * a));
		}
	}
}
