package springmvc.barkdao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc1.model.Bark;
@Repository
public class Barkda
{
@Autowired	
	private HibernateTemplate hibernatetemplate;
@Transactional
public int fixbark(Bark bark)
{
	int id=(Integer)this.hibernatetemplate.save(bark);
return id;
}
}
