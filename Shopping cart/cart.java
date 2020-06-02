
import java.util.*;
class Shopping { 
	int total=0,t=0;
	public int addproduct, addquantity;
	public int id[] = new int[5];
	                                          ArrayList<Prod> productlist=new ArrayList<Prod>();
	                                          ArrayList<Integer> quantity=new ArrayList<Integer>();
	public void addProduct() {
           int id[] = new int[5];
			id[0] = 1;
			id[1] = 2;
			id[2] = 3;
			id[3] = 4;
			id[4] = 5;
			            String products[] = new String[5];
			            products[0] = "Kurkre\t";
			            products[1] = "Lays\t";
			            products[2] = "Dairy Milk";
			            products[3] = "Oreo\t";
			            products[4] = "Ice Cream";
			                                           int [] price = {2,2,2,2,2};			   
	System.out.print("Product Id: ");
	Scanner scanner = new Scanner(System.in);
	addproduct = scanner.nextInt();
	System.out.print("Quantity: ");
	addquantity = scanner.nextInt();
	quantity.add(addquantity);
	System.out.println("\nYour Procuct: "+products[(addproduct - 1)]+"\n"+"Quantity: "+addquantity+ " added succesfully.\n");
    Prod product = new Prod(addproduct,addquantity,products[(addproduct - 1)]);
	productlist.add(product);
	total = total + ( price[(addproduct - 1)] * addquantity);
	}	
	public void show() {
		
		if(productlist.isEmpty()){
			System.out.println("Your cart is empty.");
		}
		
		else {
			Iterator itr=productlist.iterator();
		    System.out.println("PId\tName\t\t  Quantity");
		    
		for(int j=1,i=0; i<productlist.size() && j<=productlist.size(); i++,j++) {
			Prod st=(Prod)itr.next();
            System.out.println(+j +"\t"+st.name+"\t\t"+st.quantity);
		}
		}
		System.out.println("\nTotal: "+total);
	}
	public void remove() {
		if(productlist.isEmpty()) {
			System.out.println("Your cart is empty.");
		}	
		else {
			int r;
			System.out.print("Enter productId: ");
			Scanner rem = new Scanner(System.in);
			r = rem.nextInt();																	
			productlist.remove(r-1);
			int qunt = quantity.get(r-1);
			t =  (qunt * 2);
		 	total = total - t;
			quantity.remove(r-1);
	 		//rem.close();
		}		
	}
}
class Prod
{
	int productid;
    int quantity; 
    String name;
    Prod(int productid,int quantity, String name){  
        this.productid=productid;    
        this.quantity=quantity;
        this.name=name;
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
			System.out.println("##########################################");
			while(choice>minsequenceno && choice <maxsequenceno) {			
			System.out.println("\nPress 1 for list of products.");
			System.out.println("Press 2 to add products.");
			System.out.println("Press 3 to remove products.");
			System.out.println("Press 4 to view cart.\n");
			System.out.print("Enter choice: ");
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

