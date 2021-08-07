import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RectangleMain {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader("src/main/resources/point.csv"));
        String line = file.readLine();
        List<Point> list = new ArrayList<>();

        try {
            while (line != null) {
                String[] points = line.split(",");
                list.add(new Point((Double.parseDouble(points[0])), (Double.parseDouble(points[1]))));
                line = file.readLine();
            }
            Rectangle rect1 = new Rectangle(list.get(0), list.get(1), list.get(2), list.get(3));
            Rectangle rect2 = new Rectangle(list.get(4), list.get(5), list.get(6), list.get(7));
            
            if (rect1.isValid() && rect2.isValid()) {
                System.out.println("Valid Rectangles");
                if (rect1.area() >= rect2.area()) {
                    System.out.println(rect1.area());
                } else {
                    System.out.println(rect2.area());
                }
            } else if (rect1.isValid() && !rect2.isValid()) {
                System.out.println("only rect1 is Valid Rectangle");
                System.out.println(rect1.area());
            } else if (rect2.isValid() && !rect1.isValid()) {
                System.out.println("only rect2 is Valid Rectangle");
                System.out.println(rect2.area());
            } else {
                System.out.println("invalid Rectangles");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}