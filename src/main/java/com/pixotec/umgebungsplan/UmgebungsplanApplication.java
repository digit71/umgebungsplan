package com.pixotec.umgebungsplan;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UmgebungsplanApplication {

	
    @RequestMapping("/")
    public String home() {
            return "Hallo Umgebungsplan !!";
    }
    
	public static void main(String[] args) {
		SpringApplication.run(UmgebungsplanApplication.class, args);
	}

}

