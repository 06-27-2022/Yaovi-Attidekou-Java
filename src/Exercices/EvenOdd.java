package Exercices;
import java.util.ArrayList;
public class EvenOdd {


	
	
	static void printEvenOrOdd(int num){
		
		if(num%2 == 0) {
			System.out.println("Even");
		}
		if(num%2 == 1) {
			System.out.println("Odd");
		}
		
	
}
	
	
    public static void main(String[] args) {
    ArrayList<Integer>	list = new ArrayList<>();
    list.add(12);
    list.add(45);
    list.add(95);
    list.add(56);
    list.add(23);
    for(int num:list) {
    	printEvenOrOdd(num);
    }
}
	
}