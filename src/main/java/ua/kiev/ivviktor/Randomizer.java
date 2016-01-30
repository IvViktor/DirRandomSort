package ua.kiev.ivviktor;

import java.util.Random;
import java.util.Set;
import java.util.LinkedHashSet;

public class Randomizer{
	private Set<Integer> indexSet;
	private Random rand;
	
	public Randomizer(){
		indexSet=new LinkedHashSet<>();
		rand=new Random();
	}

	public Set<Integer> getUniqRandomsSet(int setSize){
		while(indexSet.size()!=setSize){
			indexSet.add(rand.nextInt(setSize));
		}
		return indexSet;
	}
}
