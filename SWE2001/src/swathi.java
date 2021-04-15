import java.util.*;

class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList<String> names = new LinkedList<>();
    names.add("swathi");
    names.add("usha");
    names.add("durga");
    System.out.println("LinkedList: " + names);
    names.add(1, "venky");
    System.out.println("Updated LinkedList: " + names);
	}

}
