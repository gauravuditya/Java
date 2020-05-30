
public class Products {
	
	public void ListOfProduct()
	{
	  int id[] = new int[5];
		id[0] = 1;
		id[1] = 2;
		id[2] = 3;
		id[3] = 4;
		id[4] = 5;
		           String arr[] = new String[5];
		            arr[0] = "Kurkre      ";
		            arr[1] = "Lays        ";
		            arr[2] = "Dairy Milk  ";
		            arr[3] = "Oreo        ";
		            arr[4] = "Ice Cream   ";
		                                          int price[] = new int[5];
  				                                   price[0] = 2;
		                                           price[1] = 2;
		                                           price[2] = 2;
		                                           price[3] = 2;
		                                           price[4] = 2;		                            		                                           
		                                           
			System.out.println("PId      Products      Price(RS)");
				for(int i=0; i<5; i++)   //Loop of product id, products, price.
				{
					System.out.println(id[i]+"."+"       "+arr[i]+"    " +price[i]);
				}	
	}
}

