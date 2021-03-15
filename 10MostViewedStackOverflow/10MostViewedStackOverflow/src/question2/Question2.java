package question2;

import java.util.stream.IntStream;

/**
 * "How do I declare and initialize an array in Java?"
 * 
 * @author Armin Kerscher
 */
public class Question2 {


	public static void main(String[] args) {
		
		// Creation:
		int[] intArray1 = new int[5];
		Integer[] intArray1_2 = new Integer[5];
		int[] intArray2 = new int[]{1, 2, 3};
		int[] intArray3 = {1, 2, 3};

		int[][] intArray4 = new int[2][2];
		Integer[][] intArray4_2 = new Integer[2][2];
		int[][] intArray5 = new int[][]{{1, 2}, {3, 4}};
		int[][] intArray5_2 = new int[][]{{1}, {1, 2}, {1, 2, 3}};
		int[][] intArray6 = {{1, 2}, {3, 4}};
		int[][][] intArray6_2 = {{{0}}, {{1}, {1, 2}, {1, 2, 3}}};
		
		// Different notations:
		int[] notationAsUsual = {1};
		int notationAlsoFine[] = {1};
		
		
		// Editing:
		int number = 0;
		for (int i = 0; i < intArray4.length; i++) {
			for (int j = 0; j < intArray4[i].length; j++) {
				intArray4[i][j] = number;
				number += 10;
			}
		}
		
		// Reading:
		for (int i = 0; i < intArray4.length; i++) {
			for (int j = 0; j < intArray4[i].length; j++) {
				System.out.println(String.format("intArray4[%d][%d]: %d", i, j, intArray4[i][j]));
			}
		}
		// Output:
		// intArray4[0][0]: 0
		// intArray4[0][1]: 10
		// intArray4[1][0]: 20
		// intArray4[1][1]: 30
		
		
		// Creation via Stream (since Java 8):
		int[] intArray7 = IntStream.range(1, 5).toArray();
		for (int i = 0; i < intArray7.length; i++) {
			System.out.println(String.format("intArray7[%d]: %d", i, intArray7[i]));
		}
		// Output:
		// intArray7[0]: 1
		// intArray7[1]: 2
		// intArray7[2]: 3
		// intArray7[3]: 4
		
		// Different sizes within the same dimension
		for (int i = 0; i < intArray5_2.length; i++) {
			System.out.println(String.format("intArray5_2[%d].length: %d", i, intArray5_2[i].length));
		}
		// Output:
		// intArray5_2[0].length: 1
		// intArray5_2[1].length: 2
		// intArray5_2[2].length: 3
	}
}
