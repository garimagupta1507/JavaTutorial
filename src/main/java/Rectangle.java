public class Rectangle {
    Point p1;
    Point p2;
    Point p3;
    Point p4;
    double s1;
    double s2;


    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        s1 = p1.distance(p2);
        s2 = p1.distance(p4);

    }

    public boolean isValid(){
        if((s1 == (p4.distance(p3))) && (s2 == (p2.distance(p3)))){
            return true;
        } else {
            return false;
        }
    }

    public boolean isSquare(){
        if((s1 == s2) && (isValid())){
            return true;
        } else {
            return false;
        }
    }

    public double area(){
        return (s1 * s2);
    }
}