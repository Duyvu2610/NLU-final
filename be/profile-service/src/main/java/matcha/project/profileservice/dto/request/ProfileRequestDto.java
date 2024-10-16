package matcha.project.profileservice.dto.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Data
public class ProfileRequestDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String username;

    private String firstName;

    private String lastName;

    private String email;

    private LocalDate dob;

    private String password;
}
