public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        System.out.println("===== KID USER TEST =====");

        KidUser child1 = new KidUser();
        child1.setAge(10);
        child1.registerAccount();

        child1.setBookType("Kids");
        child1.requestBook();

        System.out.println();

        KidUser child2 = new KidUser();
        child2.setAge(18);
        child2.registerAccount();

        child2.setBookType("Fiction");
        child2.requestBook();

        System.out.println("\n===== ADULT USER TEST =====");

        AdultUser adult1 = new AdultUser();
        adult1.setAge(5);
        adult1.registerAccount();

        adult1.setBookType("Kids");
        adult1.requestBook();

        System.out.println();

        AdultUser adult2 = new AdultUser();
        adult2.setAge(23);
        adult2.registerAccount();

        adult2.setBookType("Fiction");
        adult2.requestBook();
    }
}