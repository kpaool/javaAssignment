public class Constructors {
    String jwt;
    String username;
    String keypass;

    Constructors(){}

    Constructors(String jwt){
        this.jwt=jwt;
    }

    Constructors(String username,String keypass){
        this.username=username;
        this.keypass=keypass;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        if(!username.isEmpty()){
            this.username=username;
        }
    }

    public static void main(String[] args) {
        Constructors firConstructors=new Constructors();
        firConstructors.setUsername("Paul");
        firConstructors.setUsername("Timothy");
        System.out.println(firConstructors.getUsername());
    }
}
