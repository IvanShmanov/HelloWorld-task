package com.greetgo.task.service;

import com.greetgo.task.model.Words;

/**
 * ��������� ������������� ����������� ������ ��� ��������
 * @author ����
 * @version 1.0
 */
public interface WordsService {
	/**
	 * ����������� ������ ������������� ������� Words
	 * @param id �������� �� �������� �������������� �����
	 */
	Words getWordsById(int id);
}
