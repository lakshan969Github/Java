package customexceptions;

public class Demo {

	//method01
	/**
	public static void main(String[] args) throws CustomException {
		
		validate(3);
		

	}
	
	public static void validate(int age) throws CustomException{
		if(age < 0) {
			throw new CustomException("Somthing went wrong!");
		}else {
			System.out.println("pass");
		}
	}
	**/
	
	//method02
	public static void main(String[] args){
		
		validate(-1);
		

	}
	
	public static void validate(int age){
		
		try {
			if(age < 0) {
				throw new CustomException("Invalid age");
			}
			}catch(CustomException e) {
				e.printStackTrace();
			}finally {
				System.out.println("finally");
			}
		}
		
	}
	


