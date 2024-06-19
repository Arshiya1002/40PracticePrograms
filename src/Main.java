import custom.exceptions.ApiException;
import custom.exceptions.UserNotFound;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            if(true) {
                UserNotFound userNotFoundEx = new UserNotFound("Throwing Error...");
                throw userNotFoundEx;
            }if(true){
                ApiException userNotFoundEx = new ApiException("Throwing Error");
                throw userNotFoundEx;
            }
        }catch (UserNotFound userNotFound){
            System.out.println("i am converting the exception "+  userNotFound);
        }catch (ApiException apiException){
            System.out.println("ApiException am converting the exception "+  apiException);
        }
    }
}
