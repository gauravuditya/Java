
public class Products {
	
	public void ListOfProduct() {
	  int id[] = new int[5];
		id[0] = 1;
		id[1] = 2;
		id[2] = 3;
		id[3] = 4;
		id[4] = 5;
		           String arr[] = new String[5];
		            arr[0] = "Kurkre \t";
		            arr[1] = "Lays \t\t";
		            arr[2] = "Dairy Milk \t";
		            arr[3] = "Oreo \t\t";
		            arr[4] = "Ice Cream \t";
		                                          int price[] = {2,2,2,2,2};  				                                   		                            		                                      
		                                           
			System.out.println("PId      Products      Price(RS)");
				for(int i=0; i<5; i++) {  //Loop of product id, products, price.
					System.out.println(id[i]+"."+"       "+arr[i]+"    " +price[i]);
				}	
	}
}

