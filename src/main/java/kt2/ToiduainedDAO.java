package kt2;

import java.util.*;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ToiduainedDAO extends CrudRepository<Toiduained, Integer> {

}