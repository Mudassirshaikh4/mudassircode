package springmvc.barkserve;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc1.model.Bark;

import springmvc.barkdao.Barkda;
@Service
public class Barkserve 
{
@Autowired
private Barkda barkda;	
public int makeBark(Bark bark)
{
	return this.barkda.fixbark(bark);
}
}
