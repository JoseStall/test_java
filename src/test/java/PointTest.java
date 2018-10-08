import org.junit.Test;

public class PointTest {
    @Test
    public void test () {
        Point p = new Point(1,2);
        System.out.println(p.toString());

        p.setX(2);
        p.setY(3);
        System.out.println(p.toString());
    }
}
