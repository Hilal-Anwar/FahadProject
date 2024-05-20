package class11th;

public class B {
    public static void main(String[] args) {

        User user1 = new User("Farhan", 16, "male", 2454114,
                "afrg@gamil.com", "6589745823");
        User user2 = new User("Talha", 17, "male", 2454114,
                "a545@gamil.com", "6589745823");
        User user3 = new User("Helal", 25, "male", 2454114,
                "afrg231@gamil.com", "658974578");
        User user4 = new User("Farhan", 15, "male", 2454114,
                "afrg@gamil.com", "6589745823");
        User user5 = new User("Farhan", 14, "male", 2454114,
                "afrg@gamil.com", "6589745823");
        User user6 = new User("Farhan", 13, "male", 2454114,
                "afrg@gamil.com", "6589745823");
        User users[] = {user1, user2, user3, user4, user5, user6};
        for (int i = 0; i < 6; i++) {
            User u=users[i];
            if (u.age>15)
                System.out.println(u.name);
        }
    }
}
