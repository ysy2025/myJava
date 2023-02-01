package jchapter01;

public class jStudent {
    private String name;
    private Integer age;

    private static String school = "张三";

    public jStudent(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        jStudent.school = school;
    }

    @Override
    public String toString() {
        return "jStudent{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                "," + jStudent.school +
                '}';
    }

    public static void main(String[] args) {
        jStudent jStudent = new jStudent("zhangsan", 20);
        System.out.println(jStudent);
    }
}
