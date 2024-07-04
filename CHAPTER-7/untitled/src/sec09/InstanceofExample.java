package sec09;

public class InstanceofExample {
    public static void personInfo(Person person) {
        System.out.println("name : " + person.name);
        person.walk();

        if(person instanceof Student student)
    }
}
