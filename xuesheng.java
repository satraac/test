package xiangmu;
/*
Alt+insert 可以用来写方法，方便很多
 */
public class xuesheng {
    //年龄
    private String age;
    //名字
    private String name;
    //学号
    private String sid;
    //住址
    private String address;

    public xuesheng() {
    }

    public xuesheng(String age, String name, String sid, String address) {
        this.age = age;
        this.name = name;
        this.sid = sid;
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
