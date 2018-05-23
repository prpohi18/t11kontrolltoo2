package kt;

import javax.transaction.*;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface GeeniBaasDAO extends CrudRepository<GeeniBaas, Integer> {

}