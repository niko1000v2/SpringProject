package com.itcrowd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	
	
	 
	 @GetMapping("/index")
	 public String firstPage() {
		 return "index";
	 }
	 
	 @GetMapping("/parameter")
	 public String parameter(Model model) {
		 model.addAttribute("danzeZKontrolera", "Tekst jest parametrem (atrybutem), nie ma go w widoku");
		 return "sendParameters";
	 }
	 
	 @GetMapping("/obiekt")
	   public Object hello3(Model model) {
	       Osoba osoba1 = new Osoba(1, "Jan", "Kowalski", "600-123-456", "przykladowy@mail.com");
	       Osoba osoba2 = new Osoba(2, "Anna", "Nowak", "600-987-654", "anna@mail.com");
	       model.addAttribute("osoba1", osoba1);
	       model.addAttribute("osoba2", osoba2);
	       return "obiektOsoba";
	   }
	 
	   @GetMapping("/formularz")
		   public Object sendData(Model model) {
		       Osoba osoba3 = new Osoba(2, "Adam", "Wiśniewski", "123-456-789", "adam@mail.com");
		      model.addAttribute("osoba3", osoba3);
		       return "inputForm";
		   }


	 
}


