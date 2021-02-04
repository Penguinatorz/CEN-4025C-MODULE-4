import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Random;

public class mTest {
/**
 * Jancarlo Sevilla 
 * 
 * @param args
 */
	public static void main(String[] args) {

		arrayList();
		linkedList();
		hashTable();
		
		
	}

	/**
	 * hashtable method adding in 2000000 random int of 0-100 and removing them after
	 */
	private static void hashTable() {
		Hashtable<Integer, Integer> hashTable = new Hashtable<Integer, Integer>();
		Random randomInt = new Random();
		for (int i = 0; i < 2000000; i++)
		{
			hashTable.put(i, randomInt.nextInt(100));
		}
		for(int i = 0; i < 2000000; i++)
		{
			hashTable.remove(i);
		}
	}
	/**
	 * linkedList adding in 2000000 random int that are between 0-100 and removing them after
	 */
	private static void linkedList() {
		LinkedList<Integer> linkList = new LinkedList<Integer>();
		Random randomInt = new Random();
		for (int i = 0; i < 2000000; i++)
		{
			linkList.add(randomInt.nextInt(100));
		}
		for(int i = 0; i < 2000000; i++)
		{
			linkList.remove(0);
		}
		
	}
	/**
	 * arrayList adding in 2000000 random int that are between 0-100 and removing them after
	 */
	private static void arrayList() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Random randomInt = new Random();
		for (int i = 0; i < 2000000; i++)
		{
			arrayList.add(randomInt.nextInt(100));
		}
		for(int i = 0; i < 2000000; i++)
		{
			arrayList.remove(0);
		}
	}
}