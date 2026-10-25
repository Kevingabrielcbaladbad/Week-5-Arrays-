public class Main {
public static void main(String[] args) {

    String[] favorites = {
    "Badminton", 
    "Food", 
    "Jog", 
    "Movies", 
    "Music"
    };
    for (int i = 0; i < favorites.length; i++) {
    System.out.println((i + 1) + ". " + favorites[i]);
    }
    System.out.println("Total Number of Favorites: " + favorites.length);
  
  }
}
