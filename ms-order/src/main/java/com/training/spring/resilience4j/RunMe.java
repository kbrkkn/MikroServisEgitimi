package com.training.spring.resilience4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryRegistry;

@Component
public class RunMe implements CommandLineRunner {
	@Autowired
	private Caller caller;

	@Autowired
	private RetryRegistry rr;

	@Override
	public void run(String... args) throws Exception {

		for (int iLoc = 0; iLoc < 40; iLoc++) {
			try {
				System.out.println(this.caller.testMe("test-" + iLoc));
			} catch (Exception eLoc) {
				System.out.println(" test-error : " + iLoc + " exp : " + eLoc.getClass().getName());
			}
		}

		Retry retryLoc = this.rr.retry("orderretry");
		retryLoc.getEventPublisher().onRetry(t -> System.out.println("Retried : " + t.getNumberOfRetryAttempts()));
	}

}
