package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.PostConstruct;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

  private SpeakerRepository repository;

  public SpeakerServiceImpl() {
    System.out.println("Speaker service impl no args");
  }

  //Example of Autowiring Constructor Injection
  @Autowired
  public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
    System.out.println("Speaker service impl repository");
    repository = speakerRepository;
  }

  @PostConstruct
  private void initialize() {
    System.out.println("In initalize (called after the constructor)");
  }

  @Override
  public List<Speaker> findAll() {
    return repository.findAll();
  }

  //Autowiring example for Setter Injection
//  @Autowired
  //Example of Setter Injection
  public void setRepository(SpeakerRepository repository) {
    System.out.println("In SpeakerServiceImpl setter");
    this.repository = repository;
  }
}
