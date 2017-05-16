package com.memorynotfound.client;

import com.memorynotfound.*;
import com.memorynotfound.beer.GetBeerRequest;
import com.memorynotfound.beer.GetBeerResponse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunClient {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoapClientConfig.class);
        System.out.println("hello:"+context.getBeanDefinitionCount());
        BeerClient client = context.getBean(BeerClient.class);

        GetBeerRequest request = new GetBeerRequest();
        request.setId(2);
        GetBeerResponse resp = client.getBeer(request);
        System.out.println("response: " + resp);
    }

}
