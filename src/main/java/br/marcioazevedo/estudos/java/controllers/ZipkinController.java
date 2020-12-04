package br.marcioazevedo.estudos.java.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.api.Span;
import org.springframework.cloud.sleuth.api.Tracer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
class ZipkinController{
     
    @Autowired
    RestTemplate restTemplate;
    
    @Autowired
    private Tracer tracer;
 
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
 
//    private static final Logger LOG = LoggerFactory.getLogger(ZipkinController.class);
     
    @GetMapping(value="/test")
    public String test() 
    {
//    	Span span = tracer.currentSpan();    	
//    	span.event("service test -->");
    	
        //LOG.info("");
    	throw new RuntimeException("Erro geral");
        
//        return "Done!";
    }
}
