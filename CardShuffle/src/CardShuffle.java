import java.util.*;
public class CardShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		mylist.add(1);
		mylist.add(2);
		mylist.add(3);
		mylist.add(4);
		mylist.add(5);
		mylist.add(6);
		mylist.add(7);
		mylist.add(8);
		System.out.println("Original List : " +mylist);
		Collections.shuffle(mylist);
		System.out.println("Shuffled : " +mylist);
		
		

	}

}
