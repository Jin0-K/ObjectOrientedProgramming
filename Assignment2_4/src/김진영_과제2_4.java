class Rectangle {
	int x, y, width, height;
	
	Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	int square() {
		return width*height;
	}
	
	void show() {
		System.out.printf("(%d, %d)���� ũ�Ⱑ %dx%d�� �簢��\n", this.x, this.y, this.width, this.height);
	}
}

public class ������_����2_4 {
	public static void main(String args[]) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s�� ������ " + s.square());
	}
}
