package Assignment6_12_2019;

import java.util.HashMap;
import java.util.Map;

public class Task_2 {

	public static void main(String[] args) {
		Map<String, ClassA> obj = new HashMap<>();
		obj.put("met", new ClassA("a","b","c","d","e"));
		obj.put("game", new ClassA("A","B","C","D","E"));
		obj.put("general", new ClassA("1","2","3","4","5"));
		obj.put("peel", new ClassA("i","ii","iii","iv","v"));
		obj.put("heal", new ClassA("I","II","III","IV","V"));
		obj.put("commq", new ClassA("p","q","r","s","t"));
		System.out.println(check(obj, "q"));
	}

	public static String check(Map<String, ClassA> map, String item) {

		for (String key : map.keySet()) {
			ClassA ans=map.get(key);
			if(ans.contains(item)) {
				return key;
			}
			
		}

		return null;
	}

}
