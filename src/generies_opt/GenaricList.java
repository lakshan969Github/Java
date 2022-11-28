package generies_opt;

public class GenaricList <T, V>{

	private T value;
	private V[] myArr;
	
	void assignArr(V [] val) {
		this.myArr = val; 
	}
	
	
	public void displayArr() {
		for(int x = 0; x < myArr.length; x++) {
			System.out.println("Array value: " + myArr[x]);
		}
	}
	
	public GenaricList(T value) {
		super();
		this.value = value;
	}	
	
	public T display() {
		return value;
	}
}
