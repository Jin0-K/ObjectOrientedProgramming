package week3_ass1;
import java.util.Scanner;

public class 김진영_3주차과제1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int side[] = new int[3];
		
		int trial = 0;
		while (trial++ < 3) {
			// Get the length of the three sides of triangle from user
			for (int i = 0; i < 3; i++) {
				System.out.printf("Enter the length of side %d: ", i+1);
				side[i] = scan.nextInt();
			}
			
			// Find the longest side and place it on side[0]
			int longest = 0;
			for (int i = 1; i < 3; i++) {
				if (side[longest] < side[i]) {
					longest = i;
				}
			}
			if (longest != 0) {
				int temp = side[longest];
				side[longest] = side[0];
				side[0] = temp;
			}
			
			// Determine if it can be a triangle
			if (side[0] >= side[1] + side[2]) {
				System.out.println("It can't be a triangle");
				continue;
			}
			
			// Determine the angle
			if (side[0]*side[0] == side[1]*side[1] + side[2]*side[2]) {
				System.out.println("직각삼각형");

			}
			else {
				if (side[0] == side[1] || side[0] == side[2] || side[1] == side[2]) {
					System.out.println("이등변삼각형");
				}
				else if (side[0] == side[1] && side[0] == side[2]) {
					System.out.println("정삼각형");
				}
				else {
					System.out.println("일반삼각형");
				}
				
			}
		}

	}

}
