import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TASK_LOGIC_COLLECTION {
	public static void main(String args[])
	{
		Set<Integer> evennumbers=new LinkedHashSet<>();
		evennumbers.add(2);
		evennumbers.add(4);
		evennumbers.add(6);
		evennumbers.add(8);
		
		List<Integer> list= Arrays.asList(6,8,10,12);
		evennumbers.addAll(list);
		System.out.println("final set: "+evennumbers);
		//convert to list
		List<Integer>Sortedlist=new ArrayList<>(evennumbers);
		
		Collections.sort(Sortedlist);
		System.out.println("SortedList: "+Sortedlist);
				
}
}