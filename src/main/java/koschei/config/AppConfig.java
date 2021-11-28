package koschei.config;

import koschei.models.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(@Qualifier("wood3") Wood3 wood1) {
        return new Island2(wood1);
    }

    /*@Bean
    public static Wood3 getWood(@Qualifier("rabbit4") Rabbit4 rabbit) {
        return new Wood3(rabbit);
    }

    @Bean
    public static Rabbit4 getRabbit(@Qualifier("duck5") Duck5 duck) {
        return new Rabbit4(duck);
    }
    @Bean
    public static Duck5 getDuck(@Qualifier("egg6")Egg6 egg) {
        return new Duck5(egg);
    }
    @Bean
    public static Egg6 getEgg(@Qualifier("needle7")Needle7 needle) {
        return new Egg6(needle);
    }
    @Bean
    public static Needle7 getNeedle(@Qualifier("deth8")Deth8 deth8) {
        return new Needle7(deth8);
    }*/
}
