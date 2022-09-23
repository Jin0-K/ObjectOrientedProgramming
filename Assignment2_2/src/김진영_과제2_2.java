import java.util.Scanner;

class Grade {
	int[] subject = new int[3];
	
	Grade(int s0, int s1, int s2) {
		this.subject[0] = s0;
		this.subject[1] = s1;
		this.subject[2] = s2;
	}
	
	int average() {
		return (int)(this.subject[0] + this.subject[1] + this.subject[2]) / 3;
	}
}

public class ������_����2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("����, ����, ���� ������ 3���� ���� �Է� >> ");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());
		
		scanner.close();
	}

}
