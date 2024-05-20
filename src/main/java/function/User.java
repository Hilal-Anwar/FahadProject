package function;

public class User {
    private String name;
    private int age;
    private String gender;
    private String phone_No;
    private String email;

    public User(String name, int age, String gender, String phone_No, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone_No = phone_No;
        this.email = email;
    }

    void printUserInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(phone_No);
        System.out.println(email);
    }
    public static void main(String[] args) {
        User u1=new User("Alvia",15,"female","9748153154",
                "dfkhjgkj@gmail.com");
        u1.printUserInfo();
        User u2=new User("Hilal",25,"male","8748153154",
                "okhjhj@gmail.com");
        u2.printUserInfo();
    }
}
