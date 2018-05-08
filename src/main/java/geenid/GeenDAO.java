package geenid;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
@Transactional
public interface GeenDAO extends CrudRepository<Alleel, String>{}