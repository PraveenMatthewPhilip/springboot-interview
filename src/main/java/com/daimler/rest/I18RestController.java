package com.daimler.rest;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/rest/api")
public class I18RestController {
	@Autowired
    MessageSource messageSource;
	  @GetMapping(value = "/locale")
	  public String locale() {
		  return messageSource.getMessage("text.key", null, LocaleContextHolder.getLocale());
	   }
	  
	  @GetMapping(value = "/index")
	  public String localeHtml() {
		  return "index";
	   }
	  
}
