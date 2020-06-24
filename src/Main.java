import model.Student;
public class Main {
    public static void main(String args[]) {
        Student s=new Student("olivia",18,"女",36232319);
        System.out.println("姓名："+s.name+" 年龄："+s.age+" 性别："+s.sex+" 证件号："+s.studentNumber);
    }
}
