package com.greetgo.task.model;
/**
 * ����� ��������� ����� 
 * @author ����
 * @version 1.0
 */
public class Words {

	private int id;	
	private String word;
	
	/**
	 * ���������� id - ���������� ����
	 * ���������� word - �����
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
