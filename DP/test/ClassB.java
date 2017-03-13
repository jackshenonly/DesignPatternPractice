/**
 * Created by jackshenonly on 2017/3/12.
 */
public class ClassB extends ClassA {

    public static void main(String[] args) {
        ClassB classB= new ClassB();
        /*1000==1000  false;100==100 true*/
        Integer a=1000,b=1000;
        Integer c=100,d=100;

        System.out.println(classB.getCount());
        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(c==d);

    }
}
