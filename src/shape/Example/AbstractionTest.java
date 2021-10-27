package shape.Example;

public class AbstractionTest {
    public static void main(String ...args){
        Shape s1 = new Circle("Red",4.5);
        Shape s2 = new Rectangle("Yellow",2,8);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
