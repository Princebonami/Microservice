package com.question.service;

import java.util.List;

import com.question.entities.Question;

public interface QuestionService {
	
	
	public Question add(Question question);
	public List<Question> get();
	public Question get(Long id);
	public List<Question> getByQuizId(Long quizId);

}
