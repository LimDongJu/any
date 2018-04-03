package com.amazon.ask.conti.handlers;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

public class LaunchRequestHandler implements RequestHandler{

	@Override
	public boolean canHandle(HandlerInput input) {
		// TODO Auto-generated method stub
		return input.matches(Predicates.requestType(LaunchRequest.class));
	}

	@Override
	public Optional<Response> handle(HandlerInput input) {
		// TODO Auto-generated method stub
		String speechText = "Welcome to Continental remote control, you can say i love you";
		return input.getResponseBuilder()
				.withSpeech(speechText)
				.withSimpleCard("Continental", speechText)
				.withReprompt(speechText).build();
	}
	
}
