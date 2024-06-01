class A {
    public void add() {
        System.out.println("Parent");
    }
}

class B extends A {
    //@Override
    public void add() {
        System.out.println("Child");
    }

}
/*In Java, you can assign an object of a subclass(B) to a reference variable of the superclass(A) type, but not the other way around. This is because a subclass(B->m2) object can always be treated as an instance of its superclass(A), but not vice versa. */
public class Wellformedstring {
    public static void main(String[] args) {
        A m = new A();
        B m1 = new B();
        //B m2 = new A(); incompatible type error
        A m3 = new B();
        m.add();
        m1.add();
        //m2.add(); incompatible type error
        m3.add();
    }
}