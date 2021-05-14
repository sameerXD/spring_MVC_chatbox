package com.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.Models.HelloMessage;
import com.Models.greeting;

@Controller

public class ChatController {
@MessageMapping("/say")
@SendTo("/topic/chat")
public greeting say(HelloMessage helloMessage) throws Exception{
	return new greeting(HtmlUtils.htmlEscape(helloMessage.getName()));
}
}
