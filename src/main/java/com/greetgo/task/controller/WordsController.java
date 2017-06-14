package com.greetgo.task.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.greetgo.task.mapping.WordsMapper;
import com.greetgo.task.model.Words;

/**
 * Обращение к странице приложения 
 * @author Иван
 * @version 1.0
 */
@Controller
public class WordsController {
	
	@Autowired
	private WordsMapper wordsMapper;
	
	private final int id = 1;
	
	/**
	 * Передача данных из базы данных на страницу приложения
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
    		
		return "home";
	}
	
	@RequestMapping(value = "/recive", method = RequestMethod.GET)
	  public @ResponseBody String reciveWords() {

		Words words = wordsMapper.selectByPrimaryKey(this.id);
		String resul = words.getWord().toString();
	    return resul;
	  }
	
}
