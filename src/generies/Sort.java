package generies;

public class Sort <T extends Number>{
		
	T t[];
	
	public void add(T val[]) {
		this.t = val;
	}
	
	public T[] get() {
		return t;
	}
	
}
