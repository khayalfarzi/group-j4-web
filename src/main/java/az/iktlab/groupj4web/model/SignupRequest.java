package az.iktlab.groupj4web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequest {

    @Size(min = 3, max = 12, message = "")
    private String username;
    @Email
    private String email;
    private String password;
    private Set<String> roles;
}
