package com.github.scompo.notifer.api;

import com.github.scompo.utils.startable.Startable;

/**
 * Notifier configuration definition.
 */
public interface NotifierConfiguration extends Startable{

	/**
	 * Should implement the configuration of the notifiers. 
	 */
	void doConfiguration();

}
