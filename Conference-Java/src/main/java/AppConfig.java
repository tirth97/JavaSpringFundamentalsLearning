import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//Example of Stereotype
@ComponentScan({"com.pluralsight"})
public class AppConfig {

//  @Bean(name="speakerService")
//  //SingletonScope
////  @Scope(value= BeanDefinition.SCOPE_SINGLETON)
//  //Prototype
////  @Scope(value=BeanDefinition.SCOPE_PROTOTYPE)
//  public SpeakerService getSpeakerService() {
//    //Example of Setter Injection
////    SpeakerServiceImpl service = new SpeakerServiceImpl();
////    service.setRepository(getSpeakerRepository());
//
//    //Example of Constructor Injection
////    SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//
//    SpeakerServiceImpl service = new SpeakerServiceImpl();
//
//    return service;
//  }
//
//  //Example of Setter Injection and also used in Constructor Injection
//  @Bean(name="speakerRepository")
//  public SpeakerRepository getSpeakerRepository() {
//    return new HibernateSpeakerRepositoryImpl();
//  }
}
