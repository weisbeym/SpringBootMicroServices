package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Administrator
 * Handle the /start endpoint
 * @return 
 */
@Controller
public class PlantPlacesController {
	
	
	/**
	 * Handles the /start GET endpoint
	 * @return
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read() {
		
		return "start";
	}
	
	/**
	 * Handles the /start GET endpoint with a JSON header
	 * @return
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET, headers = {"content-type=text/json"})
	public String readJSON() {
		
		return "start";
	}
	
	/**
	 * Handles the /start GET endpoint with a param
	 * @return
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET, params = {"loyalty=blue"})
	public String readBlue() {
		
		return "start";
	}
	
	/**
	 * Handles the /start GET endpoint with a param
	 * @return
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET, params = {"loyalty=silver"})
	public String readSilver() {
		
		return "start";
	}
	
	/**
	 * Handles the /start POST endpoint
	 * @return
	 */
	@PostMapping("/start")
	public String create() {
		
		return "start";
	}
	
	/**
	 * Handle the / endpoint
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		
		return "start";
	}
}
