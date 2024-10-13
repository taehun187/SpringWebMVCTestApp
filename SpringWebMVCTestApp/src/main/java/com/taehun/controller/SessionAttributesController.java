package com.taehun.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.taehun.model.Pet;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/pet")
@SessionAttributes("petList") // "petList"를 세션에 저장하여 관리
public class SessionAttributesController {
	
	private static final Logger logger =
			Logger.getLogger(SessionAttributesController.class.getName());
	
	@ModelAttribute("petList")
	public List<Pet> setUpPetList(HttpSession session) {
		@SuppressWarnings("unchecked")
		List<Pet> petList = (List<Pet>) session.getAttribute("petList");
		
		// 세션에 "petList"가 없으면 새로운 ArrayList 생성
		if (petList == null) {
			petList = new ArrayList<>();
			session.setAttribute("petList", petList); // 세션에 저장
			logger.info("Created new petList as it was null and saved in session.");
		} else {
			logger.info("Loaded existing petList from session.");
		}
		return petList; //세션에 있던 기존 petList 반환 또는 새로운 petList 반환
	}
	
	@GetMapping("/new")
	public String showNewPetForm(Model model) {
		model.addAttribute("pet", new Pet());
		return "methodarguments/newPetForm";
	}
	
	@PostMapping("/new")
	public String addNewPet(@Valid Pet pet, 
							@ModelAttribute("petList") List<Pet> petList,
							BindingResult result,
							SessionStatus status) {
		if (result.hasErrors()) {
			return "methodarguments/newPetForm";
		}
		
		OptionalInt maxPetId = petList.stream()	
				.mapToInt(p -> Integer.parseInt(p.getPetId()))
				.max();
		
		int newPetId = maxPetId.orElse(0) + 1;
		pet.setPetId(String.valueOf(newPetId));
		
		petList.add(pet);
		logger.info("Added new Pet to petList: " + pet);
		
		return "redirect:/pet/list";
	
	}
	
	@GetMapping("/list")
	public String showPetList(@ModelAttribute("petList") List<Pet> petList, Model model) {
		
		if (petList != null && !petList.isEmpty()) {
			logger.info("Loaded petList from session: " + petList);
			model.addAttribute("petList", petList);
		} else {
			logger.warn("No pets found in session.");
			model.addAttribute("message", "No pets found in session.");		
		}
		return "methodarguments/petList";
	}

}
