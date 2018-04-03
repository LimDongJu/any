package com.amazon.ask.conti;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.amazon.ask.conti.handlers.CancelandStopIntentHandler;
import com.amazon.ask.conti.handlers.HelloWorldIntentHandler;
import com.amazon.ask.conti.handlers.HelpIntentHandler;
import com.amazon.ask.conti.handlers.SessionEndedRequestHandler;
import com.amazon.ask.conti.handlers.LaunchRequestHandler;

public class HelloWorldStreamHandler extends SkillStreamHandler {

	private static Skill getSkill() {
		return Skills.standard()
				.addRequestHandlers(new CancelandStopIntentHandler(), new HelloWorldIntentHandler(), new HelpIntentHandler(), new LaunchRequestHandler(), new SessionEndedRequestHandler())
				.build();
	}
	
	public HelloWorldStreamHandler() {
		super(getSkill());
		//branch
		// TODO Auto-generated constructor stub
	}

}
