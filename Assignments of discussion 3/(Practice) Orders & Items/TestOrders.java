package QA;
import java.util.ArrayList; 

public class TestOrders{ 
	
    public static void main(String[] args){ 
    	
    	//create items
    	Item item1 = new Item();
    	Item item2 = new Item();
    	Item item3 = new Item();
    	Item item4 = new Item();
    	
    	//naming items
    	item1.name = "mocha";
    	item2.name = "latte";
    	item3.name = "drip coffee";
    	item4.name = "cappuccino";
    	
    	//pricing items
    	item1.price = 10;
    	item2.price = 20;
    	item3.price = 30;
    	item4.price = 40;
    	
    	//create orders
    	Order order1 = new Order();
    	Order order2 = new Order();
    	Order order3 = new Order();
    	Order order4 = new Order();
    	
    	//naming orders
    	order1.name="Cindhuri";
    	order2.name="Jimmy";
    	order3.name="Noah";
    	order4.name="Sam";
    	
    	//set quantity
    	order1.quant=0;
    	order2.quant=0;
    	order3.quant=0;
    	order4.quant=0;
    	
    	//Print the order1
    	System.out.println("Details of first order: "+ order1 );
    	
    	//////////////////////Predict what will happen if you print 'order1.total'.
    	//////////////////////will be zero
    	
    	//Add item1 to order2's
    	order2.items.add(item1);
    	order2.total = order2.total + (item1.price)*(order2.quant+1) ;
    	System.out.println("Total of order2 : "+ order2.total );
    	
    	//Noah ordered a cappuccino
    	if (order3.name == "Noah") {
    		order3.items.add(item4);
        	order3.total = order3.total + (item4.price)*(order3.quant+1);
        	System.out.println("Details of order3 : "+ "Name: " + order3.name + " and total is : " + order3.total );
    	}
    	
    	
    	//Sam added a latte
    	if (order4.name == "Sam") {
    		order4.items.add(item2);
        	order4.total = order4.total + (item2.price)*(order4.quant+1);
        	System.out.println("Details of order4 : "+ "Name: " + order4.name + " and total is : " + order4.total );
    	}
        
    	
    	//Cindhuri’s order is now ready
    	if (order1.name == "Cindhuri") {
    	order1.ready = true;
    	System.out.println("Details of order1 : "+ "Name: " + order1.name + " and order status is : " + order1.ready );
    	}
    	
    	//Sam ordered more drinks - 2 lattes
    	if (order4.name == "Sam") {
    		order4.items.add(item2);
        	order4.total = order4.total + (item2.price)*(order4.quant+2);
        	System.out.println("Details of order4 : "+ "Name: " + order4.name + " and total is : " + order4.total );
    	}

    	//Jimmy’s order is now ready
    	if (order2.name == "Jimmy") {
    	order2.ready = true;
    	System.out.println("Details of order2 : "+ "Name: " + order2.name + " and order status is : " + order2.ready );
    	}
    	

        
    } 
    
}