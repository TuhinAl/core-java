package generics;

import java.util.List;

public class Box<T> {
	
	T t;
	
	public T getT() {
		return this.t;
	}

	public Box() {
	}

	
	public static void main(String[] args) {
		Box<String> boxString = new Box<>();
		Box<Integer> boxInteger = new Box<>();
		Box<Shape> box = new Box<>();
		Box<List<Shape>> box2 = new Box<>();
		
		//raw type
		Box rawType = new Box();
		rawType = boxString;
		boxInteger = rawType;
		
	}
	

}
