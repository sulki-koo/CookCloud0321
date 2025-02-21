package cookcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cookcloud.entity.Follows;
import cookcloud.entity.FollowsId;

@Repository
public interface FollowRepository extends JpaRepository<Follows, FollowsId> {
	
}
