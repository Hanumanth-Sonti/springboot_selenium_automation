package springboot.selenium.automation.sampletestclasses;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Television {

    @Value(("${Television:sony}"))
    public String tvName;

    public Television(){
        System.out.println("Inside the constructor: "+this.tvName);
    }

    @PostConstruct
    public void init(){
        System.out.println("TV Name: "+this.tvName);
        System.out.println("TV is turned on");
    }

    public void playingScene(){
        for(int i=1;i<=6;i++){
            System.out.println("Play Scene: "+i);
        }
    }

    @PreDestroy
    public void turnOff(){
        System.out.println("TV is turned off");
    }

}
