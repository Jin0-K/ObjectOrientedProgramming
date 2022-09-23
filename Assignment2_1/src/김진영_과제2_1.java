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
		System.out.println(this.brand + "에서 만든 " + this.year + "년형 " + this.inch + "인치 TV");	
	}
}

public class 김진영_과제2_1 {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
