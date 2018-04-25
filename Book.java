public class Book {


    public int ISBN ;
    public String author ;
    public String title ;
    public String genre ;
    
    public String generateReference() 
    {
    	
        char x1 = author.charAt(0);
        char x2 = author.charAt(1);
        char c1 = genre.charAt(0);
        char c2 = genre.charAt(1);
        
        
        return   ( x1+""+x2+"-"+c1+"" +c2 ) ;
        
    }
    
    public boolean verifyISBN (int ISBN){
        int l4 = ISBN %10 ;
        ISBN = ISBN /10 ;
        int l3 = ISBN %10 ;
        ISBN = ISBN /10 ;
        int l2 = ISBN %10 ;
        ISBN = ISBN /10 ;
        int l1 = ISBN %10 ;
        
        
        
        
        return (((l1 * 3) + (l2 * 2) + (l3 * 1 ))%4)==l4 ;
    }
    
    public String toString() {
        String v1 = ("Title:  "+title);
        String v2 = ("\nAuthor:  "+author);
        String v3 = ("\nISBN "+ISBN);
       
        String v4 = ("- Reference Code : "+generateReference());
        String v5 = ("\nGenre: "+genre);
        
        String v6 = ("\nThe refernce is:"+generateReference());
        return ( v1+v2+v3+v4+v5+v6 ); 	
    }
    
    
    
    
}
