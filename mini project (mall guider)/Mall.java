package mall2;
import java.util.*;
import java.io.*;

class n{
	float data;
	n next;
	n(float data){
		this.data=data;
		this.next=null;
	}
}
class Stack{
	n top=null;
	float data;
	void push( float data) {
		n new_node = new n(data);
		if(top==null) {
			top= new_node;
		}
		else{
		new_node.next=top;
		top=new_node;
		}
	}
	
float pop() {
	if(top==null) {
		return 0;
	}
	else {
		float k = top.data;
		top=top.next;
		return k;
	}
}
	
}





class node{
	int Id;
	
	String product;
	String address;
	int discount;
	String Special_offer;
	String shop_name;
	String Brand;
	node next;
	String info;
	
	node(int Id,String info,String shop_name,String Brand,String product,String address,int discount, String Special_offer ){
		this.Id=Id;
		this.shop_name=shop_name;
		this.Brand=Brand;
		this.info=info;
		this.product=product;
		this.address=address;
		this.discount=discount;
		this.Special_offer=Special_offer;
		this.next=null;
		}
}

class park{
	String Vehicle_no;
	park next;
	park(String Vehicle_no){
		this.Vehicle_no=Vehicle_no;
		this.next=null;
	}
	
}
class A{
	Scanner sc = new Scanner(System.in);
	String Vehicle_no;
	int k;
	park head;
	int size_two=0;
	int size_h=0;
	public void addvehicle() {
		 System.out.println("Enter  1 for two wheeler Enter 2 for 4 Wheeler");
		 k=sc.nextInt();
		 if(k==1) {
			 System.out.println("Enter your Vehicle_no");
			 Vehicle_no=sc.next();
			 park NEwnode= new park(Vehicle_no);
			 if (head==null) {
				 head =NEwnode ;
				 size_two=size_two+1;
				 System.out.println("You can park your vechile");
			 }
			 else {
			 if(size_two<30) {
				 NEwnode.next=head;
				 head=NEwnode;
				 size_two=size_two+1;
				 System.out.println(size_two);
				 System.out.println("you can park your vechile");
				 
				 
			 }
			 else {
				 System.out.println(" SORRY \n Parking is full");
			 }
				 
			 }
			 
			 
		 }
		 else {
			 System.out.println("Enter your Vehicle_no");
			 Vehicle_no=sc.next();
			 park NEWNode= new park(Vehicle_no);
			 if (head==null) {
				 head =NEWNode ;
				 size_h=size_h+1;
			 }
			 else {
			 if(size_h<3) {
				 NEWNode.next=head;
				 head=NEWNode;
				 size_h=size_h+1;
				 
			 }
			 else {
				 System.out.println("Parking is full");
			 }
				 
			 }
			 
			 
			 
			 
		 }
		 
	}
	
	public void takevehicle() {
		 System.out.println("Enter  1 for two wheeler Enter 2 for 4 Wheeler");
		 
		 k=sc.nextInt();
		 if(k==1) {
			 int flag=0;
			 System.out.println("Enter your vechile no");
			 String NO=sc.next();
			 park ptr=head;
			 park temp=ptr.next;
			 if(head==null) {
				 System.out.println("Parking is empty");
			 }
			 else {
			 if(NO.equals(head.Vehicle_no)) {
				 head=head.next;
				 size_two=size_two-1;
				 System.out.print("vechile present");
				 System.out.print( size_two);
				 
				 flag=1;
				 
			 }
			 else {
				 
					 while(!(NO.equals(temp.Vehicle_no))) {
						 ptr=temp;
						 temp=ptr.next;
						 if(temp.next==null) {
							 System.out.print("Entered vechile no is not found");
						 }
					 }
					 temp.next=ptr.next;
					 size_two=size_two-1;
					 System.out.print("vechile present");
					 System.out.print( size_two);
					 flag=1;
					 
					 
				 
			 }
		 }
			 
		
	}
		 else {
			 int flag=0;
			 System.out.println("Enter your vechile no");
			 String NO=sc.next();
			 park ptr=head;
			 park temp=ptr.next;
			 if(head==null) {
				 System.out.println("Parking is empty");
			 }
			 else {
			 if(NO.equals(head.Vehicle_no)) {
				 head=head.next;
				 size_h=size_h-1;
				 System.out.print("vechile present");
				 System.out.print( size_h);
				 
				 flag=1;
				 
			 }
			 else {
				 
					 while(!(NO.equals(temp.Vehicle_no))) {
						 ptr=temp;
						 temp=ptr.next;
						 if(temp.next==null) {
							 System.out.print("Entered vechile no is not found");
						 }
					 }
					 temp.next=ptr.next;
					 size_h=size_h-1;
					 System.out.print("vechile present");
					 System.out.print( size_h);
					 flag=1;
					 
					 
				 
			 }
		 }
		
		
		 }
	
}
}

public class Mall {
	Scanner sc = new Scanner(System.in);
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	node head ;
	int Id;
	String shop_name;
	String product;
	String address;
	int discount;
	String Special_offer;
	String info;
	int size;
	
	String Brand;
	public void addshop(int Id,String info,String shop_name,String Brand,String product,String address,int discount, String Special_offer ) {
	node newNode = new node(Id ,info, shop_name,Brand,product,address,discount,Special_offer);
	if(head==null) {
		head=newNode;
	
		
	}
	else {
	newNode.next=head;
	head=newNode;
	}
	
	
	
	}
	public int number_of_shop() {
		node ptr= head;
		if(head==null) {
			System.out.println("mall is empty");
			return 0 ;
		}
		else
		{
			while(ptr!=null) {
				if(!(ptr.info).equals("Washroom")&&!(ptr.info).equals("Parking")) {
				size=size+1;}
				ptr=ptr.next;
			}
			System.out.println("number of Shop available in mall are :");
			return size;
		}
		
	}
public void display() {
	node ptr = head;
	while(ptr!=null) {
		System.out.println("*********************************************************************************************");
		System.out.println("Id\t\t\t\tinfo of destinaton\t\t\t\t\t\t\tName of shop\t\tName of Brand\t\t\t\t\t Products\t\t\t\t\t\t\t\t\tAddress\t\t\t\t\t\t\t\t\t\tDiscount\t\t\t\t\t\tSpecial_offer");
		System.out.println(ptr.Id +"\t\t\t\t"+ ptr.info+"\t\t\t\t\t\t\t\t"+ptr.shop_name+"\t\t\t\t"+ptr.Brand+"\t\t\t\t"+ptr.product+"\t\t\t\t\t\t\t\t\t"+ptr.address+"\t\t\t\t\t\t\t\t"+ptr.discount+"\t\t\t\t\t\t"+ptr.Special_offer );
		ptr=ptr.next;
	}
}

public void getinfobyfloor() {
	int m;
	 
	 String floor=null;
	 System.out.println("If you want number of shops in 1 st floor then type 1 ");
	 m=sc.nextInt();
	 switch(m) {
	 case 1:
		 floor="1st_floor";
		 System.out.println("Shops on 1st floor");
		 break;
	 case 2:
		 floor="2nd_floor";
		 System.out.println("Shops on 2nd floor");
		 break;
	 case 3:
		 floor="3rd_floor";
		 System.out.println("Shops on 3rd floor");
		 break;
	 case 4:
		 floor="4th_floor";
		 System.out.println("Shops on 4th floor");
		 break;
	 case 5:
		 floor="5th_floor";
		 System.out.println("Shops on 5th floor");
		  break;
	 default:
		 System.out.println("enter corrrect choise");
	 }
	 node ptr =head;
	 while(ptr!=null) {
			if(((ptr.address).substring(0, 9)).equals(floor)) {
				System.out.println("*********************************************************************************************");
				
				System.out.println("Id\t\t\t\tinfo of destinaton\t\t\t\t\t\t\tName of shop\t\tName of Brand\t\t\t\t\t Products\t\t\t\t\t\t\t\t\tAddress\t\t\t\t\t\t\t\t\t\tDiscount\t\t\t\t\t\tSpecial_offer");
				System.out.println(ptr.Id +"\t\t\t\t"+ ptr.info+"\t\t\t\t\t\t\t\t"+ptr.shop_name+"\t\t\t\t"+ptr.Brand+"\t\t\t\t"+ptr.product+"\t\t\t\t\t\t\t\t\t"+ptr.address+"\t\t\t\t\t\t\t\t"+ptr.discount+"\t\t\t\t\t\t"+ptr.Special_offer );
				
				
			}
			ptr=ptr.next;
		
	}
}



public void getMakeup() {
	node ptr =head;
	System.out.println("Shops of makeup");
	while(ptr!=null) {
		if((ptr.product).equals("Makeup_AND_Accessories")||(ptr.product).equals("Cloths_watch_Footware_Makeup_bags")) {
			System.out.println("*********************************************************************************************");
			
			System.out.println("Id\t\t\t\tinfo of destinaton\t\t\t\t\t\t\tName of shop\t\tName of Brand\t\t\t\t\t Products\t\t\t\t\t\t\t\t\tAddress\t\t\t\t\t\t\t\t\t\tDiscount\t\t\t\t\t\tSpecial_offer");
			System.out.println(ptr.Id +"\t\t\t\t"+ ptr.info+"\t\t\t\t\t\t\t\t"+ptr.shop_name+"\t\t\t\t"+ptr.Brand+"\t\t\t\t"+ptr.product+"\t\t\t\t\t\t\t\t\t"+ptr.address+"\t\t\t\t\t\t\t\t"+ptr.discount+"\t\t\t\t\t\t"+ptr.Special_offer );
			
			
			
		}
		ptr=ptr.next;
	
}
	
}
public void getCloths() {
	node ptr =head;
	System.out.println("Shops of cloths");
	while(ptr!=null) {
		if((ptr.product).equals("SportAccessories")||(ptr.product).equals("Cloths_watch_Footware_Makeup_bags")||(ptr.product).equals("Ethanicwear")||(ptr.product).equals("Cloths_Bag_Foootware")||(ptr.product).equals("Western_wear")||(ptr.product).equals("Cloths_Bag_Footware_Makeup")) {
			System.out.println("*********************************************************************************************");
			
			System.out.println("Id\t\t\t\tinfo of destinaton\t\t\t\t\t\t\tName of shop\t\tName of Brand\t\t\t\t\t Products\t\t\t\t\t\t\t\t\tAddress\t\t\t\t\t\t\t\t\t\tDiscount\t\t\t\t\t\tSpecial_offer");
			System.out.println(ptr.Id +"\t\t\t\t"+ ptr.info+"\t\t\t\t\t\t\t\t"+ptr.shop_name+"\t\t\t\t"+ptr.Brand+"\t\t\t\t"+ptr.product+"\t\t\t\t\t\t\t\t\t"+ptr.address+"\t\t\t\t\t\t\t\t"+ptr.discount+"\t\t\t\t\t\t"+ptr.Special_offer );
			
			
			
		}
		ptr=ptr.next;
	
}
	
}
public void getBag() {
	node ptr =head;
	System.out.println("Shops of Bags");
	while(ptr!=null) {
		if((ptr.product).equals("Cloths_watch_Footware_Makeup_bags")||(ptr.product).equals("Cloths_Bag_Foootware")||(ptr.product).equals("Cloths_Bag_Footware_Makeup")) {
			System.out.println("*********************************************************************************************");
			
			System.out.println("Id\t\t\t\tinfo of destinaton\t\t\t\t\t\t\tName of shop\t\tName of Brand\t\t\t\t\t Products\t\t\t\t\t\t\t\t\tAddress\t\t\t\t\t\t\t\t\t\tDiscount\t\t\t\t\t\tSpecial_offer");
			System.out.println(ptr.Id +"\t\t\t\t"+ ptr.info+"\t\t\t\t\t\t\t\t"+ptr.shop_name+"\t\t\t\t"+ptr.Brand+"\t\t\t\t"+ptr.product+"\t\t\t\t\t\t\t\t\t"+ptr.address+"\t\t\t\t\t\t\t\t"+ptr.discount+"\t\t\t\t\t\t"+ptr.Special_offer );
			
			
			
		}
		ptr=ptr.next;
	
}
	
}

public void getDiscount() {
	node ptr =head;
	int Discount;
	System.out.println("Enter discount you want");
	 Discount=sc.nextInt();
	 if(Discount>100||Discount<0) {
		 System.out.println("Discount is always lies between 0 to 100 so enter number between 1 to 100");
		 do {
		 System.out.println("Enter discount you want");
		 Discount=sc.nextInt();
		 }while(Discount>100);
	 }
	
	 else {
	System.out.println("Shops with"+Discount+"% or more than"+Discount+"%");
	while(ptr!=null) {
		if((ptr.discount)>=Discount) {
			System.out.println("*********************************************************************************************");
			
			System.out.println("Id\t\t\t\tinfo of destinaton\t\tName of shop\t\tName of Brand\t\t\t\t Products\t\t\t\t\tAddress\t\t\t\tDiscount\t\t\t\tSpecial_offer");
			System.out.println(ptr.Id +"\t\t\t\t"+ ptr.info+"\t\t\t\t"+ptr.shop_name+"\t\t\t\t"+ptr.Brand+"\t\t\t\t"+ptr.product+"\t\t\t\t\t\t"+ptr.address+"\t\t\t\t"+ptr.discount+"\t\t\t\t"+ptr.Special_offer );
			
			
		}
		ptr=ptr.next;
	
}
	 }
	
}
public void getfood() {
	node ptr =head;
	
		System.out.println("Hotels");
		while(ptr!=null) {
			if((ptr.info).equals("Food")) {
				System.out.println("*********************************************************************************************");
				
				System.out.println("Id\t\t\t\tinfo of destinaton\t\tName of shop\t\tName of Brand\t\t\t\t Products\t\t\t\t\tAddress\t\t\t\tDiscount\t\t\t\tSpecial_offer");
				System.out.println(ptr.Id +"\t\t\t\t"+ ptr.info+"\t\t\t\t"+ptr.shop_name+"\t\t\t\t"+ptr.Brand+"\t\t\t\t"+ptr.product+"\t\t\t\t\t\t"+ptr.address+"\t\t\t\t"+ptr.discount+"\t\t\t\t"+ptr.Special_offer );
				
				
			}
			ptr=ptr.next;
		
	}
		
		
	}
public void get_watch() {
	node ptr=head;
	System.out.println("Hotels");
	while(ptr!=null) {
		if((ptr.product).equals("Cloths_watch_Footware_Makeup_bags")||(ptr.product).equals("Watch")) {
			System.out.println("*********************************************************************************************");
			
			System.out.println("Id\t\t\t\tinfo of destinaton\t\tName of shop\t\tName of Brand\t\t\t\t Products\t\t\t\t\tAddress\t\t\t\tDiscount\t\t\t\tSpecial_offer");
			System.out.println(ptr.Id +"\t\t\t\t"+ ptr.info+"\t\t\t\t"+ptr.shop_name+"\t\t\t\t"+ptr.Brand+"\t\t\t\t"+ptr.product+"\t\t\t\t\t\t"+ptr.address+"\t\t\t\t"+ptr.discount+"\t\t\t\t"+ptr.Special_offer );
			
			
		}
		ptr=ptr.next;
	
}

	
}

public void get_facility() {
	node ptr = head;
	System.out.println("facility provided by mall");
	while(ptr!=null) {
		if((ptr.info).equals("Parking")||(ptr.info).equals("Washroom")) {
			System.out.println("*********************************************************************************************");
			
			System.out.println("Id\t\t\t\tinfo of destinaton\t\tAddress");
			System.out.println(ptr.Id +"\t\t\t\t"+ ptr.info+"\t\t\t\t"+ptr.address );
			
			
		}
		ptr=ptr.next;
	
}
	
}

	public void sortinginc() {
		node current = head;
		node index=null;
		int Id1;
		
		String product1;
		String address1;
		int discount1;
		String Special_offer1;
		String shop_name1;
		String Brand1;
		
		String info1; 
		if(head==null) {
			return;
		}
		else {
			while(current!=null) {
				index=current.next;
				while(index!=null) {
					if(current.discount>index.discount) {
						discount1=current.discount;
						Id1=current.Id;
						product1=current.product;
						address1=current.address;
						Special_offer1=current.Special_offer;
						shop_name1=current.shop_name;
						Brand1=current.Brand;
						info1=current.info;
						
						current.discount=index.discount;
						current.Id=index.Id;
						current.product=index.product;
						current.address=index.address;
						current.Special_offer=index.Special_offer;
						current.shop_name=index.shop_name;
						current.Brand=index.Brand;
						current.info=index.info;
						
						index.discount=discount1;
						index.Id=Id1;
						index.product=product1;
						index.address=address1;
						index.Special_offer=Special_offer1;
						index.shop_name=shop_name1;
						index.Brand=Brand1;
						index.info=info1;
						
					}
					index=index.next;
						
					}
				current=current.next;
				}
			}
		}
	public void sortingdec() {
		node current = head;
		node index=null;
		int Id1;
		
		String product1;
		String address1;
		int discount1;
		String Special_offer1;
		String shop_name1;
		String Brand1;
		
		String info1; 
		if(head==null) {
			return;
		}
		else {
			while(current!=null) {
				index=current.next;
				while(index!=null) {
					if(current.discount<index.discount) {
						discount1=current.discount;
						Id1=current.Id;
						product1=current.product;
						address1=current.address;
						Special_offer1=current.Special_offer;
						shop_name1=current.shop_name;
						Brand1=current.Brand;
						info1=current.info;
						
						current.discount=index.discount;
						current.Id=index.Id;
						current.product=index.product;
						current.address=index.address;
						current.Special_offer=index.Special_offer;
						current.shop_name=index.shop_name;
						current.Brand=index.Brand;
						current.info=index.info;
						
						index.discount=discount1;
						index.Id=Id1;
						index.product=product1;
						index.address=address1;
						index.Special_offer=Special_offer1;
						index.shop_name=shop_name1;
						index.Brand=Brand1;
						index.info=info1;
						
					}
					index=index.next;
						
					}
				current=current.next;
				}
			}
		}
	public void displaysort() {
		node ptr=head;
		while(ptr!=null) {
			
			if(ptr.discount!=0) {
				System.out.println("Id\t\t\t\tinfo of destinaton\t\tName of shop\t\tName of Brand\t\t\t\t Products\t\t\t\t\tAddress\t\t\t\tDiscount\t\t\t\tSpecial_offer");
				System.out.println(ptr.Id +"\t\t\t\t"+ ptr.info+"\t\t\t\t"+ptr.shop_name+"\t\t\t\t"+ptr.Brand+"\t\t\t\t"+ptr.product+"\t\t\t\t\t\t"+ptr.address+"\t\t\t\t"+ptr.discount+"\t\t\t\t"+ptr.Special_offer );
				
			}
			ptr=ptr.next;
		}
	}
	
  public void getaddress()throws IOException {
	  String shop;
	  int flag=0;
	  System.out.print("Enter shop name");
	  shop=br.readLine();
	  node ptr =head;
	  while(ptr!=null) {
		  if (shop.equalsIgnoreCase(ptr.shop_name)) {
			  System.out.println("address of shop is");
			  System.out.println(ptr.address);
			  flag=1;
		  }
		  ptr=ptr.next;
	  }
	  if(flag==0) {
		  System.out.println(shop+" is not present in mall");
	  }
	  
	  
  }
 public int getshoponfloor(){
	 int m;
	 int s=0;
	 String floor=null;
	 System.out.println("If you want number of shops in 1 st floor then type 1 ");
	 m=sc.nextInt();
	 switch(m) {
	 case 1:
		 floor="1st_floor";
		 break;
	 case 2:
		 floor="2nd_floor";
		 break;
	 case 3:
		 floor="3rd_floor";
		 break;
	 case 4:
		 floor="4th_floor";
		 break;
	 case 5:
		 floor="5th_floor";
		 break;
		 
	 default:
		 System.out.println("enter corrrect choise");
	 }
	 node ptr =head;
		System.out.println("Shops on"+m+" floor");
		while(ptr!=null) {
			if(((ptr.address).substring(0, 9)).equals (floor)&&!(ptr.info).equals("Washroom")) {
				if(ptr==head) {
					s=0;
					break;
				}
				else {
					s=s+1;
				}
			}
			ptr=ptr.next;
		
	}
		return s;
	 
 }
 public void adminsection() throws IOException{
	 System.out.println("Enter user id");
	 String id=sc.next();
	 System.out.println("Enter password");
	 int password=sc.nextInt();
	  String ID = "#45rtyfg";
	 int PASS=1265478;
	 int c;
	 int shid;
	 
	 int o;
	 int i;
	// BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	 if(id.equals(ID )&&password==PASS) {
		 System.out.println("Enter change that you want 1 or delete any information 2");
		 c=sc.nextInt();
		 if(c==1) {
			 int k;
			 System.out.println("Enter 1 for changing products Enter 2 for changing discount Enter 3 for changing special offer");
			 k=sc.nextInt();
			 
			 switch(k) {
			 case 1:
				 System.out.print("Enter the id of shop ");
				 shid=sc.nextInt();
				 node temp=head;
				 while(temp!=null) {
					 if(shid==temp.Id) {
						 System.out.println("Enter the changed products");
						 String PRODUCTS=br.readLine();
						 temp.product=PRODUCTS;
						 System.out.println("Id\t\t\t\tinfo of destinaton\t\t\t\t\t\t\tName of shop\t\tName of Brand\t\t\t\t\t Products\t\t\t\t\t\t\t\t\tAddress\t\t\t\t\t\t\t\t\t\tDiscount\t\t\t\t\t\tSpecial_offer");
							System.out.println(temp.Id +"\t\t\t\t"+ temp.info+"\t\t\t\t\t\t\t\t"+temp.shop_name+"\t\t\t\t"+temp.Brand+"\t\t\t\t"+temp.product+"\t\t\t\t\t\t\t\t\t"+temp.address+"\t\t\t\t\t\t\t\t"+temp.discount+"\t\t\t\t\t\t"+temp.Special_offer );
						 break;
					 }
					 temp=temp.next;
				 }
				 break;
				 
			 case 2:
				 System.out.print("Enter the id of shop ");
				 shid=sc.nextInt();
				 node ptr=head;
				 while(ptr!=null) {
					 if(shid==ptr.Id) {
						 System.out.println("Enter the discount you want to change");
						 int d=sc.nextInt();
						 ptr.discount=d;
						 System.out.println("Id\t\t\t\tinfo of destinaton\t\t\t\t\t\t\tName of shop\t\tName of Brand\t\t\t\t\t Products\t\t\t\t\t\t\t\t\tAddress\t\t\t\t\t\t\t\t\t\tDiscount\t\t\t\t\t\tSpecial_offer");
							System.out.println(ptr.Id +"\t\t\t\t"+ ptr.info+"\t\t\t\t\t\t\t\t"+ptr.shop_name+"\t\t\t\t"+ptr.Brand+"\t\t\t\t"+ptr.product+"\t\t\t\t\t\t\t\t\t"+ptr.address+"\t\t\t\t\t\t\t\t"+ptr.discount+"\t\t\t\t\t\t"+ptr.Special_offer );
						 
						 break;
					 }
					 ptr=ptr.next;
				 }
				 break;
			 case 3:
				 System.out.print("Enter the id of shop ");
				 shid=sc.nextInt();
				 node j=head;
				 while(j!=null) {
					 if(shid==j.Id) {
						 System.out.println("Enter the changed special offer");
						 String special=br.readLine();
						 j.Special_offer=special;
						 System.out.println("Id\t\t\t\tinfo of destinaton\t\t\t\t\t\t\tName of shop\t\tName of Brand\t\t\t\t\t Products\t\t\t\t\t\t\t\t\tAddress\t\t\t\t\t\t\t\t\t\tDiscount\t\t\t\t\t\tSpecial_offer");
							System.out.println(j.Id +"\t\t\t\t"+ j.info+"\t\t\t\t\t\t\t\t"+j.shop_name+"\t\t\t\t"+j.Brand+"\t\t\t\t"+j.product+"\t\t\t\t\t\t\t\t\t"+j.address+"\t\t\t\t\t\t\t\t"+j.discount+"\t\t\t\t\t\t"+j.Special_offer );
						 
						 break;
					 }
					 j=j.next;
				 }
				 break;
				 
				 } 
			
				 
			 }
			 
		 
		 if(c==2) {
			 do {
			 System.out.print("Enter the shop id whose information you want to delete");
			 shid=sc.nextInt();
			 node ptr=head;
			 node temp=ptr.next;
			 if(head.Id==shid) {
				 head=head.next;
			 }
			 else {
			 while(temp.Id!=shid) {
				 ptr=temp;
				 temp=ptr.next;
			 }
			 temp.next=ptr.next;
			 
			 } 
			 System.out.print("Press 1 if you want continue &press any other for quite");
			 i=sc.nextInt();
		 }while(i==1);
		 } 
	 }
	 else {
		 System.out.print("Enter correct ID and password");
		 
	 }
	 
	
	 
 }

 
 public void vegetableshop() {
	 int k=0;
	 float total=0;
	 float n=1;
	 int weight;
     float rate;
     int T=1;
     float j=0;
     int M=1;
     
     int l;

	 Stack stack=new Stack();
	 if(k==1) {
		 System.out.println("vegetable is closed");
		 System.out.print("Opening time 8 am");
		 System.out.print("Closing time 10 pm");
	 }
	 {
		 System.out.println("Enter your 10 digit mobile no");
		 char array []= new char[10]; 
				 for(int J=0;J<10;J++){
					 System.out.print("Enter your"+(J+1)+"st/th digit Of your mobile no");
					 array[J]=sc.next().charAt(0);
					 
				 
		 }
	     
         System.out.println("Fresh vegitables are available");
         System.out.print("Welcome to shop");
         System.out.println("names \t\t\t price of 1 kg");
         System.out.println("Tomato\t\t40");
         System.out.println("Bringle\t\t60");
         System.out.println("orange\t\t80");
         System.out.println("potato\t\t60");
         System.out.println("onion\t\t100");
        
         
         
         System.out.println("type number of different vegetable you want to buy");
         l=sc.nextInt();
         for(int i=0;i<l;i++) {
                       System.out.println("vegetable that you want to buy");
                       String veg = sc.next();
                       System.out.println("Enter weight of vegetable in gram");
                       n=sc.nextFloat()/1000;
                       int flag=0;
                       if(veg.equalsIgnoreCase("Tomato")) {
                                     flag=1;
                                     
                        }
                       else if(veg.equalsIgnoreCase("Bringle")){
                    	   flag=2;
                    	   
                    	   
                       }
                       else if(veg.equalsIgnoreCase("orange")) {
                    	   flag=3;
                    	   
                       }
                       else if(veg.equalsIgnoreCase("potato"))
                       {
                    	  flag=4; 
                       }
                       else if(veg.equalsIgnoreCase("onion")) {
                    	   flag=5;
                       }
                       else {
                    	   System.out.print("invalid name");
                    	   System.out.print("Are you want to continue if yes then type 1 if no the type 2" );
                    	   M=sc.nextInt();
                    	   if(M==1) {
                    	   
                    	   System.out.println("vegetable that you want to buy");
                           String vegtable = sc.next();
                           veg=vegtable;
                           System.out.println("Enter weight of vegetable in gram");
                           n=sc.nextInt()/1000;
                           if(veg.equalsIgnoreCase("Tomato")) {
                               flag=1;
                               
                  }
                 else if(veg.equalsIgnoreCase("Bringle")){
              	   flag=2;
              	   
              	   
                 }
                 else if(veg.equalsIgnoreCase("orange")) {
              	   flag=3;
              	   
                 }
                 else if(veg.equalsIgnoreCase("potato"))
                 {
              	  flag=4; 
                 }
                 else if(veg.equalsIgnoreCase("onion")) {
              	   flag=5;
                 }
                       }
                    	   else {
                    		   flag=6;
                    	   }
                       }
                    	   
                       switch(flag) {
                       case 1:
                                     T=40;
                                     rate=n*T;
                                     stack.push(rate);
                                     System.out.print("Tomato  is added in you basket");
                                     break;
                       
                       case 2:
                    	             T=60;
                    	             rate=n*T;
                    	             stack.push(rate);
                    	             System.out.print("Bringle is added in you basket");
                    	             break;
                       case 3:
                    	             T=80;
                    	             rate=n*T;
                    	             stack.push(rate);
                    	             System.out.print("Orange is added in you basket");
                    	             break;
                       case 4:
                    	             T=60;
                    	             rate=n*T;
                    	             stack.push(rate);
                    	             System.out.print("Potato is added in you basket");
                    	             break;
                       case 5:
                    	             T=100;
                    	             rate=n*T;
                    	             stack.push(rate);
                    	             System.out.print("Onion is added in you basket");
                    	             break;
                       case 6:
                    	             T=0;
                    	             rate=n*T;
                    	             stack.push(rate);
                    	             System.out.print("vegetable is not added in you basket");
                    	             break;
                    	             
                       default:
      		    		 System.out.println("enter corrrect choise");
                        }
                       
         }
                       
            
         
          
          for(int i=0;i<l;i++) {
        	   j=stack.pop();
        	   System.out.println(j);
        	   
                                     total=total+j;
                                     
                                     
                                     
                       }
          if(total!=0) {
        	  System.out.print("Go to counter tell your mobile number and collect vegetable");
         System.out.print(total);
         System.out.println("visit again");
          }
          else {
        	  System.out.println("Your total amount payable is");
        	  System.out.println(total);
        	  
        	  System.out.print("You did'n bought anything");
        	  
          }

	 }
 }
	public static void main(String[] args)throws IOException {
		Mall m1 = new Mall();
		A p1 = new A();
		Scanner sc = new Scanner (System.in);
		m1.addshop(0, "Parking","=====", "====", "=====", "Underground", 0, "---");
		m1.addshop(31,"Washroom","====","====","====","Undergroung near  Enterance and exit", 0, "====");
		m1.addshop(1,"Makeup_shop","Nykaa fashion Store" , "Nykaa", "Makeup_AND_Accessories", "1st_floor_rightside_1stshop",70 ,"FREE membership_onshoopingof5000");
		m1.addshop(2,"Sport_shop","Reebok", "Reebok","SportAccessories","1st_floor_rigtside_2ndshop",25,"Buy3get50%off");
		m1.addshop(3,"Goggles_shop","John Jacobs","John Jacobs","Googles","1st_floor_rightside_3rdshop",10,"1000off_15000shopping");
		m1.addshop(4,"Cloths_shop","Biba", "Biba", "Ethanicwear","1st_floor_rightside_4thshop",30,"500off_on5000shopping");
		m1.addshop(5,"Perfume_shop", "Parcos","Parcos","Perfume","1st_floor_rightside_5thshop",50,"Buy2get1free");
		m1.addshop(6,"Make_shop","Lakme","Lakme","Makeup_AND_Accessories","1st_floor_middle" ,30,"Free_GIFT_on_everyshopping");
		m1.addshop(7,"Cloths_shop","Forever 21","Forever","Cloths_Bag_Foootware","1st_floor_leftside_1stshop",50,"======");
		m1.addshop(8,"Washroom","====","======","=======","1st_floor_leftside_nearForever 21", 0,"====");
		m1.addshop(9,"Many_in_one_shop","LifeStyle","Biba_Ginger_Aurelia_Fastrack","Cloths_watch_Footware_Makeup_bags","2nd_floor_middle_infrontside",70,"======");
		m1.addshop(10,"Cloths_shop","Van Heusen","Van Heusen","Cloths_Bag_Footware","2nd_floor_leftside_1stshop",50,"=========");
		m1.addshop(11,"Cloths_shop","H &M","H&M","Cloths_Bag_Footware","2nd_floor_rightside_1stshop" ,15,"=======");
		m1.addshop(12,"Cloths_shop","Pantaloons","Pantaloons_Honey_Anne","Cloths_Bag_Footware","2nd_floor_rightside_2ndshop" ,30,"Buy3get50%off");
		m1.addshop(13,"Cloths_shop","Aurelia","Aurelia","Ethanicwear","2nd_floor_leftside_2ndshop",50,"Buy3get70%off");
		m1.addshop(14,"Cloths_shop","ZARA","ZARA","Western_wear","2nd_floor_leftside_3ndshop",10,"Buy 2get30%off");
		m1.addshop(15, "Washroom","====","====","====","2nd_floor_leftside_adjacent_of_ZARA", 0,"====");
		m1.addshop(16,"Watch_shop","#Time#","Titan_Fastrack_Timex","Watch","2nd_floor_rightside_3rdshop", 25,"Exiciting gift on shopping of 1000");
		m1.addshop(17,"Cloths_shop","Westside","Biba_Westside","Cloths_Bag_Footware_Makeup","2nd_floor_rightside_3rdshop",40,"Buy5get5free");
		m1.addshop(18,"Food","Burger King","Burger king","Burger_Colddrink_Icecream","3rd_floor_FoodCourt",0,"Any veg Burger at50Rs");
		m1.addshop(19,"Food","Dominos","Dominos","pizza_Colddrink_Icecream","3rd_floor_FoodCourt",5,"Buy6pizzaget2free");
		m1.addshop(20,"Food","KFC","KFC","pizza_Colddrink_Icecream","3rd_floor_FoodCourt",20,"200offonorderabove2000");
		m1.addshop(21,"Food","Maharaja Bhoj","Maharaja Bhoj","Indian_food","3rd_floor_nearFoodCourt", 0,"10%off on Axis bank card payment");
		m1.addshop(22,"Drinks","Cocktails","Cocktails","coctails","3rd_floor_infrontFoodCourt", 0,"Buy3get20%off" );
		m1.addshop(23,"Washroom","====","====","=====","3rd_floor_nearFoodCourt", 0,"=====");
		m1.addshop(24, "Kids_Cloths_shop", "FirstCry", "FirstCry", "Kids cloths and baby products", "4th_floor_rightside_1stshop", 10, "Buy2get1free");
		m1.addshop(25, "Kids_shop", "Joybells", "Joybells", "Toys_AND_Garments_AND_Footwear_AND Accessories", "4th_floor_leftside__1stshop", 30, "Buy1get1free");
		m1.addshop(26, "toys_shop", "Hamleys", "Hamleys", "Toy Shop ", "4th_floor_leftside_3rdshop", 40, "20%off on HDFC bank card payment");
		m1.addshop(27,"Playstation","Playstation","======", "=======","4th_floor_rightside_2ndshop", 0,"30%off for girls");
		m1.addshop(28,"Washroom","====","====","====","4th_floor_rightside_adjacent_of_Playstation", 0,"====");
		m1.addshop(29,"Multiplexer","PVR","=====","====", "5th_floor", 0,"========");
		m1.addshop(30,"Washroom","====","====","====","5th_floor_adjacent_of_PVR" , 0,"====");
		m1.addshop(32,"vegetable shop","Bhakalo","Bhakalo","Vegatable and fruits","3rd_floor_nearBurgerking",10,"====");
		
		
		System.out.println("============================================= WELCOME IN  ABCD  MALL=========================================");
		System.out.println("hello  ");
		int k;
		do {
		int ch;
	    System.out.println("If you admin press 1 If your are customer then press 2");
	    ch=sc.nextInt();
		
		switch(ch) {
		
		case 1:
			m1.adminsection();
			break;
		case 2:
			System.out.println("If you want number of shops then press 1 \nIf want information of all shop present in mall presss 2\n If you want infomation floorwise press 3\n If you want information floorwise press 4\n press  5 for discount\n press 6 for facilities\n press 7 for buying vegetable\n press 8 for address\n press9 for printing in increasing discount\n press 10 for decreasing discount\n press 11 for parking \n press 12 for taking vechile ");
		    int c=sc.nextInt();
		    switch(c) {
		    case 1:
		    	System.out.println(m1.number_of_shop());
		    	break;
		    case 2:
		    	m1.display();
		    	break;
		    case 3:
		    	m1.getinfobyfloor();
		    	break;
		    case 4:
		    	System.out.println("press 1 for cloths press 2 for watch press 3 for bag press 4 for food press 5 for makeup");
		    	int a = sc.nextInt();
		    	int h=0;
		    	do {
		    	switch(a) {
		    	case 1:
		    		m1.getCloths();
		    		break;
		    		
		    	case 2:
		    		m1.get_watch();
		    		break;
		    	case 3:
		    		m1.getBag();
		    		break;
		    	case 4:
		    		m1.getfood();
		    		break;
		    	case 5:
		    		m1.getMakeup();
		    		break;
		    	 default:
		    		 System.out.println("enter corrrect choise");
		    	}
		    	System.out.println("press 1 for continue press two for 0 for quite");
		    	h=sc.nextInt();
		    	}while(h==1);
		    	break;
		    case 5:
		    	m1.getDiscount();
		    	break;
		    case 6:
		    	m1.get_facility();
		    	break;
		    case 7:
		    	m1.vegetableshop();
		    	break;
		    case 8:
		    	m1.getaddress();
		    	break;
		    case 9:
		    	m1.sortinginc();
		    	m1.displaysort();
		        break;
		    case 10:
		    	m1.sortingdec();
		    	m1.displaysort();
		    	break;
		    case 11:
		    	p1.addvehicle();
		    	break;
		    case 12:
		    	p1.takevehicle();
		    	break;
		    default:
	    		 System.out.println("enter corrrect choise");
		    	
		    	
		    }
		    
		 default:
    		 System.out.println("enter corrrect choise");
		
			
		}
			
		
		
System.out.println("If you want to continue press 1");
k=sc.nextInt();
	}while(k==1);

}
}
