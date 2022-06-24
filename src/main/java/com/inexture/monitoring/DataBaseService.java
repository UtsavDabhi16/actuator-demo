package com.inexture.monitoring;


import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;


@Component
public class DataBaseService implements HealthIndicator {

    private final String DATABASE_SERVICE="Datbase Service";

   private boolean isDatbaseHealthGood(){
       //logic
       return true;
   }
    @Override
    public Health health() {
        if(isDatbaseHealthGood()){
            return Health.up().withDetail(DATABASE_SERVICE,"Serice is running").build();
        }
        return Health.down().withDetail(DATABASE_SERVICE,"Serice is not running").build();
        }
}
