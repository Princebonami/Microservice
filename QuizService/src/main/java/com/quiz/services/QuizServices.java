package com.quiz.services;

import java.util.List;

import com.quiz.entities.Quiz;


public interface QuizServices {
	
	
	public Quiz add(Quiz quiz);
	public List<Quiz> get();
	public Quiz get(Long id);
	

}
