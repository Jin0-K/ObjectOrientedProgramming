import java.util.Random;
import java.util.Scanner;
// toString method : return String type value when the object is called

class Die {
	private final int max = 6; 
	private final int min = 1;
	
	int roll() {
		Random rand = new Random();
		return rand.nextInt(max) + min;
	}
	int get_sum(int v1, int v2) {
		return v1 + v2;
	}
}

class Player {
	private String name;
	int d1, d2, sum;
	private int winning;
	
	public Player() {
		this.name = "Unknown";
	}
	public Player(String name) {
		this.name = name;
	}
	
	// Return the name of the player
	String Get_name() {
		return name;
	}
	// Return the sum of d1 and d2
	int Get_sum() {
		sum = d1 + d2;
		return sum;
	}
	// When the player has won
	void Won() {
		this.winning += 1;
	}
	// Return the number of wins
	int Win_num() {
		return winning;
	}
}


public class diceGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String yes = "y";
		Die die = new Die();
		int player_num;
		
		while (true) {
			// Get the number of the game player
			System.out.println("���� �������� ���� �Է��ϼ���.");
			player_num = scan.nextInt();
			if (player_num <= 1) {
				System.out.println("������ ���� ���� ������ ������ �� �����ϴ�.");
				System.out.println("������ ���� �÷� ������ �����Ͻðڽ��ϱ�? (y/n)");
				String answer = scan.next();
				if (answer.equals(yes)) {
					continue;
				}
			}
			if (player_num > 6) {
				System.out.println("������ ���� ���� ������ ������ �� �����ϴ�.");
				System.out.println("������ ���� �ٿ� ������ �����Ͻðڽ��ϱ�? (y/n)");
				String answer = scan.next();
				if (answer.equals(yes)) {
					continue;
				}
			}
			break;
		}
		Player player[] = new Player[player_num];
		
		// Get the name of the players
		System.out.println("���� �������� �̸��� ���ʷ� �Է��ϼ���.");
		scan.nextLine();
		for (int i = 0; i < player_num; i++) {
			System.out.println(i+1 + "��° ������ �̸� �Է�:");
			String name = scan.nextLine();
			player[i] = new Player(name);
		}
			
		// Game start
		int round = 0;
		while (true) {
			round++;
			
			// Roll a die
			for (int i = 0; i < player_num; i++) {
				System.out.println(player[i].Get_name() + " �����Դϴ�. �ֻ����� �������� 1�� �Է��Ͻʽÿ�");
				while (scan.nextInt() != 1);
				System.out.print(player[i].Get_name());
				player[i].d1 = die.roll();
				player[i].d2 = die.roll();
				System.out.printf(": ù��° �ֻ��� %d   �ι�° �ֻ��� %d   �� �ֻ����� �� : ", player[i].d1, player[i].d2);
				System.out.println(player[i].Get_sum() + "\n");
			}
			System.out.println("");
			
			// Pick the winner
			int max = 0;
			for (int i = 0; i < player_num; i++) {
				if (max < player[i].sum) {
					max = player[i].sum;
				}
			}
			System.out.printf("�̹� ������ ���ڴ� ");
			for (int i = 0; i < player_num; i++) {
				if (player[i].sum == max) {
					player[i].Won();
					System.out.print(player[i].Get_name());
					System.out.printf("  ");
				}
			}
			System.out.println(" �Դϴ�.");
			
			// Ask if the game will be continued
			System.out.println("������ ��� �Ͻðڽ��ϱ�? (y/n)");
			if (! scan.next().equals(yes)) {
				break;
			}
		}
		// End game
		System.out.println("������ �����մϴ�.");
		scan.close();
		
		// Print result of the game
		System.out.println("\n��ü " + round + "���� ��\n");
		for (int i = 0; i < player_num; i++) {
			System.out.print(player[i].Get_name());
			System.out.printf(" %d��\t", player[i].Win_num());
			if ((i + 1) % 3 == 0) {
				System.out.println("");
			}
		}
		System.out.println("�Ͽ����ϴ�.");
	}

}
