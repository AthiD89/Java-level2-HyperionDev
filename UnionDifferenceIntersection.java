import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class UnionDifferenceIntersection {

	public static void main(String[] args) {
		//Create two Priority Queues
		PriorityQueue <String> pq1 = new PriorityQueue<> (Arrays.asList(
				"Goerge", "Jim", "John", "Blake", "Keven", "Micheal"));
		
		PriorityQueue <String> pq2 = new PriorityQueue<> (Arrays.asList(
				"Goerge", "Katie", "Kevin", "Michelle", "Ryan"));
		
		//Display the two sets and union, difference and intersection
		System.out.println("Set 1 : " + pq1);
		System.out.println("Set 2 : " + pq2);
		System.out.println("Union : " + findUnion(pq1, pq2));
		System.out.println("Difference : " + findDifference(pq1, pq2));
		System.out.println("Intersection : " + findIntersection(pq1, pq2));
		
		
		//Initiate hashSet
		HashSet<String> hashSet = new HashSet<>();

	}
	//Calculating Union
	public static <E> PriorityQueue<E> findUnion(PriorityQueue<E> p1, PriorityQueue<E> p2) {
		PriorityQueue<E> union = new PriorityQueue<>(p1);
		union.addAll(p2);
		return union;
	}
	//Calculating difference
	public static <E> PriorityQueue<E> findDifference(PriorityQueue<E> p1, PriorityQueue<E> p2) {
		PriorityQueue<E> difference = new PriorityQueue<>(p1);
		difference.removeAll(p2);
		return difference;
	}
	//Calculating Intersection
		public static <E> PriorityQueue<E> findIntersection(PriorityQueue<E> p1, PriorityQueue<E> p2) {
			PriorityQueue<E> intersection = new PriorityQueue<>(p1);
			intersection.retainAll(p2);
			return intersection;
}
}
