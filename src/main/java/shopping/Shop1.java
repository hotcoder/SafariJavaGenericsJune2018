package shopping;

import java.time.LocalDate;

public class Shop1 {
  public static void main(String[] args) {
    Pair<Glove> gloves = new Pair<>(new Glove("Red", 12), new Glove("Red", 12));
//    gloves.setRight(new Shoe("Red", 44));

    Pair<Shoe> shoes = new Pair<>(new Shoe("Red", 44), new Shoe("Brown", 44));
//    shoes.setRight(new Glove("Brown", 12));
    Shoe sh = shoes.getLeft();
   }
}
