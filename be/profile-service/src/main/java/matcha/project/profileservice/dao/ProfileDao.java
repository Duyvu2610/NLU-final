package matcha.project.profileservice.dao;

import matcha.project.profileservice.entity.ProfileEntity;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileDao extends Neo4jRepository<ProfileEntity, String>
{
}
