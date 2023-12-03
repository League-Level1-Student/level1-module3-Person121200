package _04_netflix;

public class MovieRunner {
	public static void main(String[] args) {
		Movie movie = new Movie("The Avengers: Infinity Wars", 4);
		Movie movie1 = new Movie("Batman", 5);
		Movie movie2 = new Movie("Twilight", 3);
		Movie movie3 = new Movie("Captain Marvel", 2);
		Movie movie4 = new Movie("How the Grinch Stole Christmas", 3);
		System.out.println(movie3.getTicketPrice());
		System.out.println();
		NetflixQueue netflix = new NetflixQueue();
		netflix.addMovie(movie);
		netflix.addMovie(movie1);
		netflix.addMovie(movie2);
		netflix.addMovie(movie3);
		netflix.addMovie(movie4);
		netflix.printMovies();
		System.out.println();
		System.out.println("The best movie is " + netflix.getBestMovie());
		System.out.println("The second best movie is " + netflix.getSecondBestMovie());
		
		
	}
}
