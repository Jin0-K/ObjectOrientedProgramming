class Poodle {
	private String breed = "poodle";
	String name;
	char gender;
	public int age;
	public String fav_toy = "None";
	
	Poodle() {
	}
	
	Poodle(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	
	void printDog() {
		System.out.println(this.name + " is " + this.breed + " who is " + this.age + " " + (this.gender == 'M'? "male":"female"));
		if (this.fav_toy != "None")
			System.out.println("And his/her favorite toy is " + this.fav_toy);
		else
			System.out.println("And he/she doesn't have favorite toy yet");
	}
}
public class Week5_2nd_class {

	public static void main(String[] args) {
		Poodle [] dogs = new Poodle[3];
		
		dogs[0] = new Poodle("Joe", 'M');
		dogs[1] = new Poodle("Salgu", 'F');
		dogs[2] = new Poodle();
		dogs[2].name = "Boris";
		dogs[2].gender = 'M';
		dogs[2].age = 6;
		dogs[0].age = dogs[2].age / 3;
		dogs[1].age = dogs[0].age + dogs[2].age + 5;
		dogs[2].fav_toy = "Teddy bear";
		// dogs[0].breed = "Schnauzer";  -> Error; "The field Poodle.breed is not visible"
		
		for (int i = 0; i < dogs.length; i++) {
			dogs[i].printDog();
		}
	}

}
