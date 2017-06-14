package com.greetgo.task.service;

import com.greetgo.task.model.Words;

/**
 * »нтерфейс определ€юющий необходимые методы дл€ сервисов
 * @author »ван
 * @version 1.0
 */
public interface WordsService {
	/**
	 * определение метода возвращающего объекты Words
	 * @param id параметр по которому осуществл€етс€ поиск
	 */
	Words getWordsById(int id);
}
