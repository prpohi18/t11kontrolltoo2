package baas;
import javax.transaction.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;
@Transactional
public interface kombinatoorikaDAO extends CrudRepository<kombinatoorika, Integer>{
	@Query(value="SELECT * FROM kombinatoorika k WHERE k.numn=?1 AND k.numm=?2", nativeQuery = true)
	kombinatoorika findExistingOne(int numn, int numm);    
}
