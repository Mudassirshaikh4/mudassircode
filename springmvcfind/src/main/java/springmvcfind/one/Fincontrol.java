package springmvcfind.one;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Fincontrol
{
@RequestMapping("/concept/{conceptno}/{conceptname}")
	public String conceptrecent(@PathVariable("conceptno")int conceptno,@PathVariable("conceptname")String conceptname)
	{
	System.out.println(conceptno);	
	System.out.println(conceptname);
	return"house";
		
	}
	@RequestMapping("/house")
	public String house()
	{
	System.out.println("i am going to house");
	String st=null;
	System.out.println(st.length());
	return "house";
	}
@RequestMapping("/search")
public RedirectView gopage(@RequestParam("querybox")String query)
{
String url= "https://www.google.com/search?q=" + query ;

RedirectView redirectview= new RedirectView();	
redirectview.setUrl(url);
return redirectview;
}
}
