package com.github.scompo.notifer.api.events.consumers;

import com.github.scompo.notifer.api.events.Event;
import com.github.scompo.utils.patterns.observer.Observable;

public abstract class AbstractEventConsumer implements EventConsumer{

	@Override
	public void updateObserver(Observable<Event> observable, Event param) {
		
		doActionOnEvent(observable, param);
	}

	public abstract void doActionOnEvent(Observable<Event> observable, Event param);
}
