package ro.iulian.springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    @Bean
    public CDPlayer cdPlayer(){
        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.setCd(cosmograma());
        return cdPlayer;
    }

    @Bean
    public CompactDisc cosmograma(){
        return new Cosmograma();
    }
}
