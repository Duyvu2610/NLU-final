package matcha.project.profileservice.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserCreationParam  implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String username;

    private boolean enabled;

    private String email;

    private boolean emailVerified;

    private String firstName;

    private String lastName;

    private List<Credential> credentials;
}
