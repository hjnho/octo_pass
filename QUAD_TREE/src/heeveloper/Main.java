package heeveloper;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Hello");
		System.out.println(list);
		list.add("Java");
		System.out.println(list);
		list.add("World");
		System.out.println(list);
		list.add(2, "Programing"); list.set(1, "C");
		System.out.println(list);
		// 데이터 추출
		String str = list.get(2); // 데이터 제거
		str = list.remove(2); // 데이터 전체 제거
		list.clear();
		// 데이터 유무
		boolean b = list.isEmpty();
	}
}
