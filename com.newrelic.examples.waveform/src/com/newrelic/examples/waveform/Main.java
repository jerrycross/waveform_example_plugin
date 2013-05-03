package com.newrelic.examples.waveform;

import com.newrelic.platform.metrics.publish.Runner;
import com.newrelic.platform.metrics.publish.configuration.ConfigurationException;


public class Main {	
    public static void main(String[] args) {
    	Runner runner = new Runner();
    	
    	/* DEBUG */
    	runner.getConfiguration().internalProcessDebugArgs(args);
    	runner.add(new WaveformFactory());
    	
		try {
	    	//Never returns
	    	runner.setupAndRun();
		} catch (ConfigurationException e) {
			e.printStackTrace();
    		System.err.println("Error configuring");
    		System.exit(-1);
		}
    	
    }
    
}
