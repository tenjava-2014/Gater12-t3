package com.tenjava.entries.Gater12.t3.misc;

import java.util.Random;

public class Misc {
	private Misc(){};
	
	public static int randomNumber(int i){
		Random rGen = new Random();
		return rGen.nextInt(i) + 1;
	}
}
