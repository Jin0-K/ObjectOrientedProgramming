import java.util.Vector;

public class GencericVector {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(); //int�� ���Ұ�
		
		Vector<String> stringVector;
		stringVector = new Vector<String>();
		
		Vector<Integer> vect = new Vector<Integer>(5); // �ʱ� �뷮�� 5�� ���� ����
		
		v.add(Integer.valueOf(5));
		v.add(Integer.valueOf(4));
		v.add(Integer.valueOf(-1));
		/*
		 * Same as
		 * v.add(5);
		 * v.add(4);
		 * v.add(-1);
		 * (�ڵ� �ڽ�) 
		 */
		v.add(null);
		v.add(2, 100); //2��° ��ġ�� 100 ����
		
		Integer obj = v.get(1); //v�� 1��° ��ü�� ��
		int i = obj.intValue(); //obj�� �ִ� ������ �˾Ƴ�
		int j = v.get(1); // �ڵ� ��ڽ�
		
		System.out.println(obj + " " +  i + " " + j);
		
		int len = v.size();
		int cap = v.capacity();
		
		System.out.println(len + " " + cap);
		
		v.remove(len-1); //v�� len-1 ��ġ�� �ִ� element ����
		
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
