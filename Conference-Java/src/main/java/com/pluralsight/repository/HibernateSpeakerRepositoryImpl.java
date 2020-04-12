package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

  @Autowired
  private Calendar cal;

  @Override
  public List<Speaker> findAll() {
    List<Speaker> speakers = new ArrayList<>();

    Speaker speaker = new Speaker();

    speaker.setFirstName("Tirth");
    speaker.setLastName("Patel");

    System.out.println("cal in repo: " + cal.getTime());

    speakers.add(speaker);

    return speakers;
  }
}
