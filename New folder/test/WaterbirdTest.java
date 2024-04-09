import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertEquals;




/**
 * A JUnit test class for the pigeon class.
 */

public class WaterbirdTest {

  @Test
  public void testcons_waterbody_empty() {
    assertThrows(IllegalArgumentException.class, () -> {
      Shorebird b1 = new Shorebird(Bird_list.GREAT_AUK,"Sharp eyes",false,2, "", Food.INSECTS);
    });
  }


}
