package ru.il;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	private static ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
	private static Random r = new Random();

	
	public static void main(String[] args) {
		for(int i = 0; i < 300; i++) {
			String v = ((char)(r.nextInt(26) + 'a')) + "" + ((char)(r.nextInt(26) + 'a'));
			mobiles.add(new Mobile(r.nextInt(99), v));
		}
		for(Mobile m: mobiles) {
			System.out.println(m.getNumber() + " " + m.getName());
		}
		
	}

}


