package com.itcrowd;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowCollection {
	

	 @RequestMapping("/lista")
	   public List metoda2() {
		 
		 
		 List <String> kolekcja   = new ArrayList<>();
		   kolekcja.add("element nr 1");
		   kolekcja.add("element nr 2");
		   kolekcja.add("element nr 3");

		   return kolekcja;

}
}