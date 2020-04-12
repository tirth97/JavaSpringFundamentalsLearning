import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {

    ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

    //Hardcoded SpeakerServiceImpl
    //SpeakerService service = new SpeakerServiceImpl();

    //Example of Setter Injection
    //Using Spring to not get the Hardcoded SpeakerServiceImpl
    SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

    System.out.println(service.findAll().get(0).getFirstName());

    System.out.println(service.findAll().get(0).getSeedNum());
  }
}
