package com.professor.houseserver.domain;

import java.util.HashSet;
import java.util.Set;

public class User {

	private Integer id;
	

	private String username;
	

	private String simpledesc ;

	private String avatarUrl;
	

	private Integer account=0;
	

	private Integer isFamous = 0;
	

	private Integer fans=0;
	
	private Set<Question> questions = new HashSet<>();
	
	private Set<Answer> answers = new HashSet<>();
	
	private Set<Message> messages = new HashSet<>();

	private Set<Story> stories = new HashSet<>();

	private Set<Comment> comments = new HashSet<>();
	

}
