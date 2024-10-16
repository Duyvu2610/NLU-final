package matcha.project.profileservice.dto.response;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Data
public class ProfileResponseDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String firstName;

    private String lastName;

    private LocalDate dob;
}
