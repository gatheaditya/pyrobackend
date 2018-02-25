package controller;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class battleController {
	
	@Autowired
	private battleRepository cr;
	
	
	
	
	@GetMapping(path="/")	
	public@ResponseBody String greeting()
	{
		return "Welcome to game REST  ";
	}
	

	@GetMapping(path="/all")
	@CrossOrigin(origins = "https://gatheaditya.github.io", maxAge = 3600)
	public @ResponseBody Iterable<battleModel> fetchall()
	{
		return cr.findAll();
		}
	
	
}
