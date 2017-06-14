package com.greetgo.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.greetgo.task.mapping.WordsMapper;
import com.greetgo.task.model.Words;
/**
 * ������ ��������� ����������� ������
 * @author ����
 * @version 1.0
 */
@Service
public class WordsServiceImpl implements WordsService {
	
	@Autowired
	private WordsMapper wordsMapper;
	
	/**
	 * ����� ���������� ����� ���� �� ���� ������ 
	 * ����� ���� �������������� �� id
	 */	
	public Words getWordsById(int id) {           
		return  this.wordsMapper.selectByPrimaryKey(id);
	}
        
        
        
}

