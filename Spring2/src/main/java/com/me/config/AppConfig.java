package com.me.config;

import com.me.Alien;
import com.me.Computer;
import com.me.Desktop;
import com.me.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.me")
public class AppConfig {

   /* @Bean
    public Desktop desktop1(){  // here the method names are the bean names
        return new Desktop();
    }*/

    //for specific names
    /* @Bean(name = {"com1", "com2", "desktop1"}) //Array of names
    public Desktop desktop() {
        return new Desktop();
    }*/
/* for @component
    @Bean
    public Alien alien(@Autowired @Qualifier("laptop") Computer com){
        Alien ob=new Alien();
        ob.setAge(29);
        ob.setcom(com);
        return ob;

    }


    @Bean
    //@Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    //@Primary
    public Laptop laptop(){
        return new Laptop();
    }

*/


}

