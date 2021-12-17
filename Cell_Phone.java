public class Cell_Phone
{
     String name;
     long price;
    
    void calling(String ph_no, String name)
    {
        System.out.println("calling to: "+ name + "\n"+ ph_no);
    }
    
    void SendMessage(String ph_no, String name, String msg)  
    {  
        System.out.println("Receiptant name: "+name + "\nReceiptant ph_no:" + ph_no);
        System.out.println(msg);  
    }
    
    void playMusic(String song)
    {
        System.out.println("Song playing: "+song);
    }
    
    void create_Contact(String ph_no, String name)
    {
        System.out.println("Contact saved as:\t" + name +" \t"+ ph_no);
    }
}
