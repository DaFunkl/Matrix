package wassabi;

import java.util.concurrent.ThreadLocalRandom;

import javax.activation.UnsupportedDataTypeException;

public class Main {
	public static void main(String[] args) {
//		Mat a  = new Mat(new int[]{1,0,2});
//		System.out.println(a.toString());
//		System.out.println(a.identity(3));
//				
		Mat a = randoMat(2, 2, 0, 5);
		System.out.println(a);
		a=a.inv();
		System.out.println(a);
		a=a.inv();
		System.out.println(a);
		
	}

	public static Mat randoMat(int x, int y, int min, int max) {
		Mat a = new Mat(y,x);
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				a.mat[i][j] = (int) (ThreadLocalRandom.current().nextInt(min, max + 1));
			}
		}
		return a;
	}

	public static void testBench() throws UnsupportedDataTypeException {
		Mat a;
		Mat b;
		a = new Mat(100, 100);
		b = new Mat(100, 100);

		double at = 0;
		double bt = 0;
		double ct = 0;
		double dt = 0;
		double et = 0;

		for (int k = 0; k < 1000; k++) {

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 50; j++) {
					a.mat[i][j] = (int) (Math.random() - 0.5 * Integer.MAX_VALUE);
					b.mat[i][j] = (int) (Math.random() - 0.5 * Integer.MAX_VALUE);
				}
			}
			/*
			 * long nanoTime0 = System.nanoTime(); //a.multA(b); long nanoTimeA
			 * = System.nanoTime(); //a.multB(b); long nanoTimeB =
			 * System.nanoTime(); //a.multC(b); long nanoTimeC =
			 * System.nanoTime(); a.multD(b); long nanoTimeD =
			 * System.nanoTime(); a.multE(b); long nanoTimeE =
			 * System.nanoTime(); at = (nanoTimeA - nanoTime0)/1000.0; bt =
			 * (nanoTimeB - nanoTimeA)/1000.0; ct = (nanoTimeC -
			 * nanoTimeB)/1000.0; dt = (nanoTimeD - nanoTimeC)/1000.0; et =
			 * (nanoTimeE - nanoTimeD)/1000.0;
			 */
		}

		System.out.println(at);
		System.out.println(bt);
		System.out.println(ct);
		System.out.println(dt);
		System.out.println(et);
	}
}
