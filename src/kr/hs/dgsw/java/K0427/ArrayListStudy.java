package kr.hs.dgsw.java.K0427;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudy {
	public void studyArrayList() {
		String[] array = new String[5];
		List<String> list = new ArrayList<String>();
		
		//값 넣기
		array[0] = "Korea";
		array[1] = "Germany";
		
		list.add("Korea");
		list.add("Germany");
		
		//값 불러오기
		String value1 = array[0];
		String value2 = array[1];
		
		value1 = list.get(0);
		value2 = list.get(1);
		
		
		//값 특정한 위치에 넣기
		list.add(1,"England");
		
		//삭제하기
		
		array[1] = null;
		list.remove(1);
	}
}
