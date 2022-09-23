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
		System.out.println(this.year + "년 " + this.country + "국적의 " + this.artist + "이(가) 부른 " + this.title);
	}
}
public class 김진영_과제2_3 {

	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		song.show();
	}

}
