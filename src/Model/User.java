package Model;

import Enums.Category;
import java.util.List;



public class User  {
    private String name;
    private String age;
    private String email;
    private String password ;
    private String phone;
    private String address;
    private List<Category> category;

    public User(String name, String age, String email, String password, String phone, String address, List<Category> category) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }
}



