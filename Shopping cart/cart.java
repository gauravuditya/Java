
import java.util.*;
class Shopping {  
	int total=0,t=0;
	int j,i;               // loop to print value.
	ArrayList<Integer> a = new ArrayList<Integer>();   //Product quantity
	ArrayList<Integer> b = new ArrayList<Integer>();   //Product ID
	ArrayList<String> c = new ArrayList<String>();   //Product Name
	public int addproduct, addquantity;
	public int id[] = new int[5];

	public void addProduct() {
           int id[] = new int[5];
			id[0] = 1;
			id[1] = 2;
			id[2] = 3;
			id[3] = 4;
			id[4] = 5;
			            String arr[] = new String[5];
			             arr[0] = "Kurkre";
			             arr[1] = "Lays";
			             arr[2] = "Dairy Milk";
			             arr[3] = "Oreo";
			             arr[4] = "Ice Cream";
			                                           int [] price = {2,2,2,2,2};
			                
		System.out.print("ProductID: ");
		Scanner scanner = new Scanner(System.in);
			
		addproduct = scanner.nextInt();
		System.out.print("Quantity: ");
		addquantity = scanner.nextInt();
			 		
		System.out.println( "Your Procuct: "+arr[(addproduct - 1)]+ " Quantity: "+addquantity+ " added succesfully.");
		a.add(addquantity);
		b.add(addproduct);
		c.add(arr[(addproduct - 1)]);
		total = total + ( price[(addproduct - 1)] * addquantity);
		//scanner.close();					
	}
	public void show() {
		
		if(b.isEmpty()){
			System.out.println("Your cart is empty.");
		}
		
		else {
		    System.out.println("PId\tName\t\tQuantity");
		    
		for(j=1,i=0; i<b.size() && j<=b.size(); i++,j++) {
			System.out.print( +j  +"\t"+ c.get(i)+"\t\t"+ a.get(i) +"\n");	
		}
		    System.out.println("\nTotal: "+total);
		}
	}
	public void remove() {
		
		if(b.isEmpty()) {
			System.out.println("Your cart is empty.");
		}
		
		else {
			int r;
			System.out.print("Enter productId: ");
			Scanner rem = new Scanner(System.in);
			r = rem.nextInt();
			b.remove(r-1);
			a.remove(r-1);
			c.remove(r-1);	
	        t = t + (addquantity * 2);    //(addquantity * price[(addproduct - 1)])
	 		total = t;
	 		//rem.close();
		}
	}
}
public class Cart {
	public static void main(String[] args) {
		int choice=1;
		int minsequenceno=0;
		int maxsequenceno=5;
		Shopping s1 = new Shopping();                                 //Object of Shopping class (s1).
			System.out.println("\t\tGaurav");
			System.out.println("\t    Shopping Cart");
			System.out.println("##########################################\n");
			while(choice>minsequenceno && choice <maxsequenceno) {			
			System.out.println("Press 1 for list of products.");
			System.out.println("Press 2 to add products.");
			System.out.println("Press 3 to remove products.");
			System.out.println("Press 4 to view cart.\n");
			System.out.print("Enter Your choice: ");
			Scanner scan = new Scanner(System.in);
				choice = scan.nextInt();
				System.out.println();
				     switch(choice) {
				     case 1:
				    	 Products obj = new Products();
				    	 obj.ListOfProduct();
				    	 break;
				     case 2:
				    	 s1.addProduct();
				    	 break;
				     case 3:
				    	 s1.remove();
				    	 break;
				     case 4:
				    	 s1.show();
				    	 break;
				     }	
	}
}
}

