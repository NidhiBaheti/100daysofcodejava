package codes;

public class constructorchainQ9 {
	constructorchainQ9(){
		System.out.println("This is the first sentence");
	}
	constructorchainQ9(int order){
		this("order",2);
		System.out.println("This is the third sentence");
	}
	constructorchainQ9(String s,int order)
	{
		this();
		System.out.println("This is the second sentence");
	}
	void display() 
	{
		System.out.println("This is the fourth sentence");
	}
	
	public static void main(String[] args) 
    {  
		constructorchainQ9 obj = new constructorchainQ9(1);  
		obj.display(); 
    }
}


