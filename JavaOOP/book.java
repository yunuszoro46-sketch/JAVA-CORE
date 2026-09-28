package library;

public class book {
	 public String title,author;
      double price;
      
      public book(String title , String author , double price){
    	  this.title = title;
    	  this.author= author;
    	  this.price=price;
      }
      
      public String toString() {
    	  return "title: "+this.title+"author: "+this.author+"-$Price:"+this.price; 
      }
}
