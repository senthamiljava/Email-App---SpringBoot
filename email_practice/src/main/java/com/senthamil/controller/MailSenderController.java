package com.senthamil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.senthamil.emailsender.Email;

@Controller
public class MailSenderController {

	@Autowired
	private Email email;
	@RequestMapping("/send")
	public void send() throws Exception
	{
		email.send("senthamild@revature.com","test mail for spring email", "haiiiii");
	}
	
}
