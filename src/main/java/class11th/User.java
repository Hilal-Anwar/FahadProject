package class11th;

public class User {
    String name;
    int age;
    String gender;
    long id;
    String email;
    String phone_No;

    public User(String name, int age, String gender, long id, String email, String phone_No) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.email = email;
        this.phone_No = phone_No;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_No() {
        return phone_No;
    }

    public void setPhone_No(String phone_No) {
        this.phone_No = phone_No;
    }
}
