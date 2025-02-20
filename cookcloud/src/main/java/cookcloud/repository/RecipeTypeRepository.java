package cookcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeTypeRepository extends JpaRepository<T, ID> {

}
