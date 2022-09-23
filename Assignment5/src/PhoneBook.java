import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;


class Contact {
	private String name;
	private String address;
	private String phone_num;
	
	public Contact(String name, String address, String phone_num) {
		this.name = name;
		this.address = address;
		this.phone_num = phone_num;
	}
	public Contact(String name, String phone_num) {
		this.name = name;
		this.address = "";
		this.phone_num = phone_num;
	}
	
	String Get_name() {
		return name;
	}
	String Get_address() {
		return address;
	}
	String Get_phone_num() {
		return phone_num;
	}
	
}

class Manager {
	HashMap<String, Contact> hash_map = new HashMap<String, Contact>();
	Scanner scan = new Scanner(System.in);
	
	public Manager(Scanner scan) {
		this.scan = scan;
	}
	
	// Insert an entity to hash_map
	void Insert() {
		String name; String address; String phone_num;
		System.out.print("Name>> ");
		name = scan.next();
		System.out.print("Address>> ");
		address = scan.next();
		System.out.print("Phone Number>> ");
		phone_num = scan.next();
		
		hash_map.put(name, new Contact(name, address, phone_num));
		
		System.out.println("Successfully Inserted");
	}
	// Delete an entity from hash_map
	void Delete() {
		System.out.print("Name>> ");
		String name = scan.next();
		if (hash_map.containsKey(name)) {
			hash_map.remove(name);
			System.out.println("Successfully Deleted '" + name + "'");
		}
		else {
			System.out.println("'" + name + "' does not exist");
		}
	}
	// Search from hash_map with input name
	void Search() {
		System.out.print("Name>> ");
		String name = scan.next();
		if (hash_map.containsKey(name)) {
			Contact info = hash_map.get(name);
			System.out.println(info.Get_name() + " " + info.Get_address() + " " + info.Get_phone_num());
		}
		else {
			System.out.println("'" + name + "' does not exist");
		}
	}
	// Print every entities in hash_map
	void PrintAll() {
		Set<String> keys = hash_map.keySet();
		Iterator<String> i = keys.iterator();
		Contact entity;
		while (i.hasNext()) {
			entity = hash_map.get(i.next());
			
			System.out.println(entity.Get_name() + " " + entity.Get_address() + " " + entity.Get_phone_num());
		}
	}
}

public class PhoneBook {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		Manager manager = new Manager(Scan);
		
		System.out.println("--------------------------------------------------");
		System.out.println("전화번호 관리 프로그램을 시작합니다. 파일로 저장하지 않습니다.");
		System.out.println("--------------------------------------------------");
		
		int option; //The option of what the user will do
		while(true) {
			System.out.print("\n삽입:0  삭제:1  찾기:2  전체보기:3  종료:4 >> ");
			option = Scan.nextInt();
			
			switch(option) {
			case 0:
				manager.Insert();
				break;
			case 1:
				manager.Delete();
				break;
			case 2:
				manager.Search();
				break;
			case 3:
				manager.PrintAll();
				break;
			default:
				System.out.println("Error:Wrong Input");
				break;
			}
			if (option == 4) {
				break;
			}
		}
		System.out.println("\n프로그램을 종료합니다...");
	}

}
