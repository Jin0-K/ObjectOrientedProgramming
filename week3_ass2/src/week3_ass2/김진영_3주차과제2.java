package week3_ass2;
import java.util.Scanner;

public class 김진영_3주차과제2 {
	// (100, 100) and (200, 200)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] coor = new int[2][2];
		
		int trial = 0;
		while (trial++ < 3) {
			// Get the x and y coordinate from user
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.printf("Input the %c coordinate of point %d : ", j == 0? 'x' : 'y', i+1);
					coor[i][j] = scan.nextInt();
				}
			}
			
			System.out.printf("point1 : (%d, %d), point2 : (%d, %d)\n", coor[0][0], coor[0][1], coor[1][0], coor[1][1]);
			// Determine if the input points can make rectangle
			if (coor[0][0] == coor[1][0] || coor[0][1] == coor[1][1]) {
				System.out.println("It can't make rectangle");
				continue;
			}
			
			// Determine if two rectangles are overlapped
			/*
			 * THE CONDITION TO BE OVERLAPPED
			 * 
			 * 	If coor[0][0] is between 100 and 200
			 * 		If coor[0][1] is larger than 200
			 * 			coor[1][1] should be smaller than 200
			 * 		If coor[0][1] is smaller than 100
			 * 			coor[1][1] should be larger than 100
			 * 		Else
			 * 			If coor[1][0] and coor[1][1] is between 100 and 200
			 * 				INCLUDED
			 * 			Else
			 * 				OVERLAPPED
			 * 	If coor[0][1] is between 100 and 200
			 * 		If coor[0][0] is smaller than 100
			 * 			coor[1][0] should be larger than 100
			 * 		If coor[0][0] is larger than 200
			 * 			coor[1][0] should be smaller than 200
			 * 		Else
			 * 			already processed
			 * 	Else
			 * 		If coor[0][0] is smaller than 100
			 * 			If coor[0][1] is larger than 200
			 * 				If coor[1][0] > 200 and coor[1][1] < 100
			 * 					INCLUDE
			 * 				If coor[1][0] > 100 and coor[1][1] < 200
			 * 					OVERLAPPED
			 * 			Else (coor[0][1] is smaller than 100)
			 * 				If coor[1][0] > 200 and coor[1][1] > 200
			 * 					INCLUDE
			 * 				If coor[1][0] > 100 and coor[1][1] > 100
			 * 					OVERLAPPED
			 * 		Else
			 * 			If coor[0][1] is larger 200
			 * 				If coor[1][0] < 100 and coor[1][1] < 100
			 * 					INCLUDE
			 * 				If coor[1][0] < 200 and coor[1][1] < 200
			 * 					OVERLAPPED
			 * 			Else
			 * 				If coor[1][0] < 100 and coor[1][1] > 200
			 * 					INCLUDE
			 * 				If coor[1][0] < 200 and coor[1][1] > 100
			 * 					OVERLAPPED
			 */
			
			if (coor[0][0] >= 100 && coor[0][0] <= 200) {
				if (coor[0][1] > 200) {
					if (coor[1][1] < 200) {
						System.out.println("Two rectangles are OVERLAPPED");
						continue;
					}
					else {
						System.out.println("Two rectangles are NOT OVERLAPPED");
						continue;
					}
				}
				if (coor[0][1] < 100) {
					if (coor[1][1] > 100) {
						System.out.println("Two rectangles are OVERLAPPED");
						continue;
					}
					else {
						System.out.println("Two rectangles are NOT OVERLAPPED");
						continue;
					}
				}
				else {
					if ((coor[1][0] >= 100 && coor[1][0] <= 200) && (coor[1][1] >= 100 && coor[1][1] <= 200)) {
						System.out.println("It is INCLUDED");
						continue;
					}
					else {
						System.out.println("Two rectangles are OVERLAPPED");
						continue;
					}
					
				}
			}
			
			if (coor[0][1] >= 100 && coor[0][1] <= 200) {
				if (coor[0][0] < 100) {
					if (coor[1][0] > 100) {
						System.out.println("Two rectangles are OVERLAPPED");
						continue;
					}
					else {
						System.out.println("Two rectangles are NOT OVERLAPPED");
						continue;
					}
				}
				if (coor[0][0] > 200) {
					if (coor[1][0] < 200) {
						System.out.println("Two rectangles are OVERLAPPED");
						continue;
					}
					else {
						System.out.println("Two rectangles are NOT OVERLAPPED");
						continue;
					}
				}
			}
			
			else {
				if (coor[0][0] < 100) {
					if (coor[0][1] > 200) {
			 			if (coor[1][0] > 200 && coor[1][1] < 100) {
			 				System.out.println("It INCLUDES the rectangle");
							continue;
			 			}
			 			if (coor[1][0] > 100 && coor[1][1] < 200) {
			 				System.out.println("Two rectangles are OVERLAPPED");
							continue;
			 			}
					}
			 		else {
				 		if (coor[1][0] > 200 && coor[1][1] > 200) {
				 			System.out.println("It INCLUDES the rectangle");
							continue;
				 		}
				 		if (coor[1][0] > 100 && coor[1][1] > 100) {
				 			System.out.println("Two rectangles are OVERLAPPED");
							continue;
				 		}
			 		}
				}
				else {
					if (coor[0][1] > 200) {
						if (coor[1][0] < 100 && coor[1][1] < 100) {
							System.out.println("It INCLUDES the rectangle");
							continue;
						}
						if (coor[1][0] < 200 && coor[1][1] < 200) {
							System.out.println("Two rectangles are OVERLAPPED");
							continue;
						}
					}
					else {
				 		if (coor[1][0] < 100 && coor[1][1] > 200) {
				 			System.out.println("It INCLUDES the rectangle");
							continue;
				 		}
				 		if (coor[1][0] < 200 && coor[1][1] > 100) {
				 			System.out.println("Two rectangles are OVERLAPPED");
							continue;
				 		}
					}
				}
				System.out.println("Two rectangles are NOT OVERLAPPED");
			}
			System.out.println(" ");
		}
	}
}
