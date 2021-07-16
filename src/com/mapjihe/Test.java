package src.com.mapjihe;
//泛型必须得加
public class Test implements  Comparable<Test>{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeiht() {
        return heiht;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", heiht=" + heiht +
                ", age=" + age +
                '}';
    }

    public void setHeiht(int heiht) {
        this.heiht = heiht;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int heiht;
    private int age;

    @Override
    public int compareTo(Test o) {

        int x=o.getAge()-this.getAge();
        return x;
    }
}
