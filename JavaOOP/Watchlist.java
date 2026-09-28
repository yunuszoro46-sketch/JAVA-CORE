package midexam25101109;


public class Watchlist {
	String owenerName;
	String[]movies=new String[5];
	int movieCount=0;
    Watchlist(String ownerName,int movieCount) {
    	  this.owenerName=ownerName;
    	  this.movieCount=movieCount;
    	  movieCount=0;
    	  
    }
    public void addMovie(String c) {
        if (movieCount >= movies.length) {
            System.out.println("Watchlist is full");
        } else {
            movies[movieCount] = c;
            movieCount++;
            System.out.println("movie added successfully.");
        }
    }

    
    public void displayMovies() {
    	 for(int i=0;i<movieCount;i++) {
    		 System.out.println(" movies" +movies);
    	 }
    }
}
