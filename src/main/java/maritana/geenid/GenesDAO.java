package maritana.geenid;

import javax.transaction.*;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface GenesDAO extends CrudRepository<GenesDB, Integer> {
    // public GenesDB findByGeneName(String name);
}
