interface TokenService {
     void sign(String json); 
}

public class TokenServiceImplementation {
    
    public static void sign( TokenService tokenService) {
        tokenService.sign("jwt");
    }
    public static void main(String args[]) {

    sign( (jwt -> System.out.println(jwt)));
    }
}
