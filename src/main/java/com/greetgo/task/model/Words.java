package com.greetgo.task.model;
/**
 * Класс описывает слова 
 * @author Иван
 * @version 1.0
 */
public class Words {

	private int id;	
	private String word;
	
	/**
	 * переменная id - уникальный ключ
	 * переменная word - слово
	 */
	
	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWord() {
		return word;
	};

	public void setWord(String word) {
		this.word = word;
	}
}
