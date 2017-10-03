package edu.stanford.irt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import java.util.logging.Logger;
import org.slf4j.LoggerFactory;
//import org.aspectj.bridge.Message;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@EnableJpaRepositories
public class MessageRunner {
    final static Logger logger = (Logger) LoggerFactory.getLogger(MessageRunner.class);

public static class Application {

public static void main(String[] args) {
	  logger.info("Initializing Spring context.");
  
//	  ClassPathXmlApplicationContext ctx;
//	try {
//	  ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/application-context.xml");
//      logger.info("Spring context initialized.");
//      
//          ctx = new ClassPathXmlApplicationContext();    
//     } finally {
//               if (ctx != null)
//                   ((AbstractApplicationContext) ctx).close();
//            	   //((ClassPathXmlApplicationContext) context).close();
//            	   //((ConfigurableApplicationContext)ctx).close();
//       }
//
//      BeanFactory applicationContext;
//	Message message = (Message) applicationContext.getBean("message");
//      ((org.slf4j.Logger) logger).debug("message='" + message.getMessage() + "'");
      
    SpringApplication.run(Application.class, args);
  }
}
}