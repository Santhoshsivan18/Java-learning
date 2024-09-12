public class dog {
    String name;
    int age;
    String[] fetch = { "bone", "stick", "ball" };
    private int fcount = 0;

    public dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println("The dog barked");
    }

    public int ageofdog() {
        return this.age * 7;
    }
    // public int ageofdog(int dage) {
    // return dage * 7;
    // }

    public void fetch() {
        this.fcount = (this.fcount + 1) % 3;
        System.out.println("The dog " + name + " fetched " + this.fetch[this.fcount]);
    }
}
