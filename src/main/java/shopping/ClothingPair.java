package shopping;
// ClothingPair<Shoe, LocalDate> xxx
// If any class constraint exists, a) there can be only one b) it must
// be listed FIRST
public class ClothingPair<E extends /*Object &*/ Colored & Sized/*, String*/>
    extends Pair<E> {
//  private String s = "Hello";
  public ClothingPair(E left, E right) {
    super(left, right);
  }

  public boolean matches() {
//    if (left instanceof Clothing...)
    return left.getColor().equals(right.getColor())
        && left.getSize() == right.getSize();
  }

  public static <E extends Colored & Sized> boolean match(E left, E right) {
    return left.getColor().equals(right.getColor())
        && left.getSize() == right.getSize();
  }
}
