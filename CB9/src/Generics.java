import java.util.ArrayList;
import java.util.LinkedList;

public class Generics {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<>();
		
		al.add("hello");
		al.add("welcome");
		
		
		 
		LinkedList<String> ll=new LinkedList<>();		//generic of type string
		
		ll.add("To");
		ll.add("Learn");
		ll.add("Programming");
		
		al.addAll(ll);					//Adding linked list objects to array list
		
		System.out.println(ll);
		System.out.println(al);
		
		for(String s1:al)							//iterating using for Each loop
		{
			System.out.println(s1);
		}
		
		for(String s:ll)							//iterating using for Each loop
		{
			System.out.println(s);
		}
		
		
	}

}
