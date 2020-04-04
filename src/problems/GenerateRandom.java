package problems;

import java.util.Random;

public class GenerateRandom {

	public static void main(String[] args) {
		GenerateRandom obj1 = new GenerateRandom();
		obj1.using_Random_Class();
		
        System.out.println("Random doubles: " + Math.random()); 

	}

	public void using_Random_Class() {
		Random rand = new Random();
		int rand_int1 = rand.nextInt(10000);
		System.out.println(rand_int1);
	}
}
