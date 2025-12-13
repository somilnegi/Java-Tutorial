class UserDefinedException extends Exception{
    public UserDefinedException(String str){
        super(str);
    }
}

public class UserDefined{
    public static void main(String[] args) {
        try{
            throw new UserDefinedException("This is user defined exception");
        }
        catch(UserDefinedException ude){
            System.out.println("Caught");
            System.out.println(ude.getMessage());
        }
    }
}