class Song{
	String title;
	String artist;
	int year;
	String country;
	
	Song(){
		this.title = "Untitled";
		this.artist = "Unknown";
		this.year = 0;
		this.country = "Unknown";
	}
	Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	void show() {
		System.out.println(this.year + "�� " + this.country + "������ " + this.artist + "��(��) �θ� " + this.title);
	}
}
public class ������_����2_3 {

	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", 1978, "������");
		song.show();
	}

}
