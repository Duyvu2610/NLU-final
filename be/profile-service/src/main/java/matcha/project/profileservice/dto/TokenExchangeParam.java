package matcha.project.profileservice.dto;

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
public class TokenExchangeParam implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String grant_type;

    private String client_id;

    private String client_secret;

    private String scope;
}
