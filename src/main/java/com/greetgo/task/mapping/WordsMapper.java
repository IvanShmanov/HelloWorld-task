package com.greetgo.task.mapping;

import com.greetgo.task.model.Words;
/**
 * Связывание с базой данных
 * @author Иван
 * @version 1.0
 */

public interface WordsMapper {
	/**
	 * метод возвращает объект в который записываются данные из базы данных
	 * поиск осуществляется по id
	 * обращение в базу WordsMapper.xml
	 */
	Words selectByPrimaryKey(int id);	
}
