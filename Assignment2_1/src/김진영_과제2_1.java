class TV {
	String brand;
	int year;
	int inch;
	
	// Initialize
	TV(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	void show() {
		System.out.println(this.brand + "���� ���� " + this.year + "���� " + this.inch + "��ġ TV");	
	}
}

public class ������_����2_1 {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
