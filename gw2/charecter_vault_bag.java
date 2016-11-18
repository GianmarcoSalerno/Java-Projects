package gw2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
//create bag and random
//make the setters
//
public class charecter_vault_bag implements Iterable<charecter_input> {
	//first create what ever it is that you will be stashing stuff in
	//so lets initialize it
	private ArrayList<charecter_input> bag;
	private Random rand;
	
	//now i suppose these are the setters
	public void RandomBag() {initVars(0);}
	public void RandomBag(int seed) {initVars(seed);}
	
	//now lets make the seed
	public void initVars(int seed){
	bag = new ArrayList<charecter_input>();
	if (seed == 0)
		rand = new Random();
	else rand = new Random(seed);
	}
	
	//now we check the size
	public int size(){
		return bag.size();
	}
	
	//now we check if it is empty
	public boolean isEmpty(){
		return this.size() == 0;
	}
	
	//now we make a method to add an element
	public void addElement(charecter_input element){
		bag.add(element);
	}
	
	//now we make a random pick
	public charecter_input randomPick(){
		int idx = rand.nextInt(size());
		charecter_input element = bag.get(idx);
		return element;
	}
	
	public charecter_input getChar(Object object){
		int i =0;
		while (i<size()){
			if(object.equals(bag.get(i)))
				return bag.get(1);
			i++;
		}
		return null;
	}
	
	@Override
	public Iterator<charecter_input> iterator() {
		Iterator<charecter_input> it = bag.iterator();
		// TODO Auto-generated method stub
		return it;
	}
	
	@Override
	public boolean equals(Object object){
		
		if (!(object instanceof charecter_input)){
			return false;
		}
		
		charecter_input that = (charecter_input) object;
		
		for(charecter_input obj : bag){
			if(obj.getCharecter_name().equals(that.getCharecter_name()))
				return false;
		}
		return true;	
	}
	
	

}
