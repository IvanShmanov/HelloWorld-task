package com.greetgo.task.mapping;

import com.greetgo.task.model.Words;
/**
 * ���������� � ����� ������
 * @author ����
 * @version 1.0
 */

public interface WordsMapper {
	/**
	 * ����� ���������� ������ � ������� ������������ ������ �� ���� ������
	 * ����� �������������� �� id
	 * ��������� � ���� WordsMapper.xml
	 */
	Words selectByPrimaryKey(int id);	
}
