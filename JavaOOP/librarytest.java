package mypack;
import java.awt.print.Book;
import java.util.ArrayList;
import library.book;
public class librarytest {
      public static void main(String[] args) {
    	 
    	  ArrayList<book>books = new ArrayList<>();
    	  
    	  books.add(new book("harry potter1","jk rowling",1000));
    	  books.add(new book("harry potter2","jk rowling2",2000));
    	  books.add(new book("harry potter3","jk rowling3",3000));
    	  books.add(new book("harry potter4","jk rowling4",4000));
    	  System.out.println("index 1: "+books.get(1));
    	 
    	  for(int i=0;i<books.size();i++) {
    		  if(books.get(i).title=="harry potter1") {
    			  System.out.println("found");
    			  break;
    		  }else {
    			 System.out.println("not found");
    		  }
    	  }
    	  for(int i=0;i<books.size();i++) {
    		  if(books.get(i).title=="harry potter1") {
    			   books.remove(1);
    			  break;
    		  }else {
    			 System.out.println("not found");
    		  }
    	  }
    	  
    	  for (book i : books) {
    		  System.out.println(books);
    	  }
    	
    	  System.out.println(books.size());
	}
}
