import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    int m_price = sc.nextInt();
	    
	    Samsung sam = new Samsung();
	    
	    System.out.println("You are using the "+str+" and its price is "+m_price);
	    sam.SamsungMember();
	    sam.create_Contact("9158218910", "Vipul");
	    sam.SendMessage("9158218910", "Vipul", "Hey! All good?");
	    
	    
	    Apple ap = new Apple();
	    ap.IOS_Store();
	    ap.calling("9158218910", "Niraj");

        sc.close();
	}
}