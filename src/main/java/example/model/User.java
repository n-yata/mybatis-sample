package example.model;

import lombok.Data;

@Data
public class User {
   private String userId;
    private String firstName;
    private String lastName;
    private String password;
    private String roleName;
}