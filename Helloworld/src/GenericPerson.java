import java.io.IOException;
import java.util.ArrayList;

public class GenericPerson <T,K>{
    private T age;
    private K gender;
    private String names;

    public K getGender() {
        return gender;
    }

    public void setGender(K gender) {
        this.gender = gender;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public GenericPerson(T age,K gender,String names) {
        this.age = age;
        this.gender = gender;
        this.names = names;
    } ;

    public static void main(String[] var0) throws IOException {
        List l = new ArrayList()
        GenericPerson<Integer,String> people1 = new GenericPerson<Integer,String>(20,"male","alexis");
        GenericPerson<String,String> people2 = new GenericPerson<String,String>("Dog","Female","Alexa");
        System.out.println("The data of person 1 is "+people1.getNames()+" Age: "+people1.getAge()+" Gender: "+people1.getGender());
        System.out.println("The data of person 2 is "+people2.getNames()+" Age: "+people2.getAge()+" Gender: "+people2.getGender());
    }
}
