package matcha.project.profileservice.entity;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

import java.time.LocalDate;

@Data
@Node("profile")
public class ProfileEntity {

    @Id
    @GeneratedValue(generatorClass = UUIDStringGenerator.class)
    private String id;

    @Property("userId")
    private String userId;

    @Property("userName")
    private String userName;

    @Property("firstName")
    private String firstName;

    @Property("lastName")
    private String lastName;

    @Property("email")
    private String email;

    @Property("dob")
    private LocalDate dob;
}
