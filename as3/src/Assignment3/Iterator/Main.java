package Assignment3.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Сборка коллекции фильмов на основе списка
        ListMovieCollection listCollection = new ListMovieCollection();
        listCollection.addMovie("Inception");
        listCollection.addMovie("The Matrix");
        listCollection.addMovie("Interstellar");

        // Итерация через коллекцию на основе списка
        Iterator<String> listIterator = listCollection.createIterator();
        System.out.println("Movies in List:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Сборка коллекции фильмов на основе массива
        ArrayMovieCollection arrayCollection = new ArrayMovieCollection(3);
        arrayCollection.addMovie("Titanic");
        arrayCollection.addMovie("Avatar");
        arrayCollection.addMovie("Gladiator");

        // Итерация через коллекцию на основе массива
        Iterator<String> arrayIterator = arrayCollection.createIterator();
        System.out.println("\nMovies in Array:");
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
    }
}