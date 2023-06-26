import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
public class SreamAPIUsingDescending {
public static void main(String[]args) {
	List<Integer> list=new ArrayList<>(Arrays.asList(11,33,22,55,44,99,77));
	List sortedList=list.stream().sorted().collect(Collectors.toList());
	System.out.println("Before Sorting List:"+list);
	System.out.println("After Sorting List:"+sortedList);
	List sortedList2=list.stream().sorted(comparator.reverseorder()).collect(Collectors.toList());
	System.out.println("Descending order sorting:"+sortedList2);
	
}
}
