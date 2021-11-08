package org.sid.eboutique.controllers;

import org.sid.eboutique.metier.IAdminCategoriesMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/adminCat")
public class AdminCategoriesControllers {
	@Autowired
	private IAdminCategoriesMetier metier;
	@RequestMapping(value="/index")
	public String index(Model model) {
		return "categories";
	}

}
