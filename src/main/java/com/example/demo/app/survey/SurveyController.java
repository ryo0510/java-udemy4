package com.example.demo.app.survey;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.Survey;
import com.example.demo.service.SurveyServiceImpl;

@Controller
@RequestMapping("/survey")
public class SurveyController {
	
	@Autowired
	SurveyServiceImpl surveyService;
	
	@GetMapping
	public String index(Model model) {
		
		List<Survey> list = surveyService.getAll();
		double average = surveyService.getSatisfactionAvg();
		
		model.addAttribute("surveyList", list);
		model.addAttribute("average", average);
		model.addAttribute("title", "Servey Index");
		
		return "survey/index";
	}
	
	
}