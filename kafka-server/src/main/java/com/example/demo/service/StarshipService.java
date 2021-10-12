package com.example.demo.service;

import com.example.demo.dto.StarshipDto;

public interface StarshipService {
	
	StarshipDto save(StarshipDto dto);

	void send(StarshipDto dto);

	void consume(StarshipDto dto);

}
