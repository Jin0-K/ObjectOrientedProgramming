import java.util.Vector;

public class GencericVector {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(); //int는 사용불가
		
		Vector<String> stringVector;
		stringVector = new Vector<String>();
		
		Vector<Integer> vect = new Vector<Integer>(5); // 초기 용량이 5인 벡터 생성
		
		v.add(Integer.valueOf(5));
		v.add(Integer.valueOf(4));
		v.add(Integer.valueOf(-1));
		/*
		 * Same as
		 * v.add(5);
		 * v.add(4);
		 * v.add(-1);
		 * (자동 박싱) 
		 */
		v.add(null);
		v.add(2, 100); //2번째 위치에 100 삽입
		
		Integer obj = v.get(1); //v의 1번째 객체를 얻어냄
		int i = obj.intValue(); //obj에 있는 정수를 알아냄
		int j = v.get(1); // 자동 언박싱
		
		System.out.println(obj + " " +  i + " " + j);
		
		int len = v.size();
		int cap = v.capacity();
		
		System.out.println(len + " " + cap);
		
		v.remove(len-1); //v의 len-1 위치에 있는 element 삭제
		
		Integer m = Integer.valueOf(100);
		v.add(m);
		
		for (int count=0; count < len; count++) {
			System.out.print(v.get(count));
			System.out.print(" ");
		}
		System.out.println("");
		
		v.removeAllElements();
	}
}
