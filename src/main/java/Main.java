import annotation.MyAnno;
import annotation.Person;

public class Main {

    public static void main(String[] args) {
//        Provide provide = new SendMailFactory();
//        Sender sender = provide.produce();
//        sender.send();
        Class<Person> person = Person.class;
        if(person.isAnnotationPresent(MyAnno.class)){
            MyAnno anno = person.getAnnotation(MyAnno.class);
            String userName = anno.username();
            System.out.println(userName);
        }else {
            System.out.println("没有MyAnno注解");
        }
    }
}
