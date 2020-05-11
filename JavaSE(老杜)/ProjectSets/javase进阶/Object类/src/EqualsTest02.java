import java.util.Objects;

public class EqualsTest02 {
    public static void main(String[] args) {
        Address ad1 = new Address("北京", "朝阳区","410000");
        Address ad2 = new Address("深圳", "解放区","037100");
        User u1 = new User("李四",ad1);
        User u2 = new User("张三",ad1);
        User u3 = new User("李四",ad1);
        System.out.println(u1.equals(u2));
        System.out.println(u1.equals(u3));
        System.out.println(u1.toString());
        System.out.println(u2.toString());
        System.out.println(u3.toString());
    }
}

//用户类
class User{
    private String name;
    private Address ad;
    //无参构造
    public User() {
    }
    //有参构造
    public User(String name, Address ad) {
        this.name = name;
        this.ad = ad;
    }

//    setter and getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAd() {
        return ad;
    }

    public void setAd(Address ad) {
        this.ad = ad;
    }

//    重写equals()方法
    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof User)) return false;
        if(this == obj) return true;
        User u = (User)obj;
        return this.getName().equals(u.getName()) && this.getAd().equals(u.getAd());
    }
}

//地址类
class Address{
    private String city;
    private String street;
    private String zipCode;

    //构造方法
    public Address() {
    }
    public Address(String city, String street, String zipCode) {
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    //setter and getter

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    //重写equals()方法

    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof  Address)) return false;
        if(this == obj) return true;
        Address ad = (Address)obj;
        return this.getCity() == ad.getCity() && this.getStreet() == ad.getStreet() && this.getZipCode() == ad.getZipCode();
    }

//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Address address = (Address) o;
//        return Objects.equals(city, address.city) &&
//                Objects.equals(street, address.street) &&
//                Objects.equals(zipCode, address.zipCode);
//    }

}