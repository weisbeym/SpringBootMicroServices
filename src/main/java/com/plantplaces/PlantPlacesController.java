package com.plantplaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.plantplaces.dto.SpecimenDTO;
import com.plantplaces.service.ISpecimenService;

/**
 * @author Administrator
 * Handle the /start endpoint
 * @return 
 */
@Controller
public class PlantPlacesController {
	
	@Autowired
	private ISpecimenService specimenServiceStub;
	
	
	/**
	 * Handles the /start GET endpoint
	 * @return
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read(Model model) {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchById(43);
		model.addAttribute("specimenDTO", specimenDTO);
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
	public ModelAndView readSilver() {
		ModelAndView modelAndView = new ModelAndView();
		SpecimenDTO specimenDTO = specimenServiceStub.fetchById(43);
		specimenDTO.setSpecimenId(90);
		modelAndView.setViewName("start");
		modelAndView.addObject("specimenDTP", specimenDTO);
		return modelAndView;
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
