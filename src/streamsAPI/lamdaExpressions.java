package streamsAPI;

import java.util.List;
import java.util.stream.Collectors;

public class lamdaExpressions {

	public static void main(String[] args) {

		List<Integer> list = List.of(1,9,8,7,5,6,4,3,2,90,89,56,102);
		
		List<Integer> distinctList = list.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(distinctList);
		
		for(int num :list) {
			
			if(!distinctList.contains(num)) {
				distinctList.add(num);
			}
		}
		System.out.println(distinctList);
	}

}
