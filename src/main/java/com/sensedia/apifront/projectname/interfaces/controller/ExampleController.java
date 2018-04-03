package com.sensedia.apifront.projectname.interfaces.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/example")
public class ExampleController {

	@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> getExample() {

        return new ResponseEntity<String>("Example", HttpStatus.OK);
        		
    }
	
}
