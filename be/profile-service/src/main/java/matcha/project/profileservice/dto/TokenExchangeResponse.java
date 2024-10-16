package matcha.project.profileservice.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TokenExchangeResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String accessToken;

    private String expiresIn;

    private String refreshExpiresIn;

    private String tokenType;

    private String idToken;

    private String scope;
}
