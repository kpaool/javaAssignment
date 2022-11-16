import java.util.Date;

public class User {
    String firstName="";
    String lasttName="";
    int age;
    UserType type;


    User(){
        
        age=0;
    }

    static void test(){
        Date dob= new Date();
        System.out.println(dob.getTime());
    }

    public static void main(String[] args) {
        test();
    }

    public enum UserType{
        WEBUSER,ADMINUSER,APPUSER
    }

    public class WebUser extends User{
        WebUser(){
            this.type= UserType.WEBUSER;
        }
    }
}

