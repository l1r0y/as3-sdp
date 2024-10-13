package Assignment3.Iterator;

public class ArrayMovieCollection {
    private String[] movies;
    private int size = 0;

    public ArrayMovieCollection(int capacity) {
        movies = new String[capacity];
    }

    public void addMovie(String movie) {
        if (size < movies.length) {
            movies[size++] = movie;
        }
    }

    public Iterator<String> createIterator() {
        return new ArrayMovieIterator(movies);
    }
}