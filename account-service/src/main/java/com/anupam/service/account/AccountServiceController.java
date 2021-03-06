/**
 * 
 */
package com.anupam.service.account;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author Anupam Sharma
 *
 */
@RestController
public class AccountServiceController {
	private static final Logger logger = LoggerFactory.getLogger(AccountServiceController.class);
	
	@Value("${msg:Config Server is not working. Please check...}")
    private String msg;

	@GetMapping("/msg")
	public String getMsg() {
		logger.debug("Hello from Account Service ..................... {} " , this.msg);
		logger.info("Hello from Account Service ..................... {} " , this.msg);
		return this.msg;

	}

}
