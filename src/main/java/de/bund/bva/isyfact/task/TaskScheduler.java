package de.bund.bva.isyfact.task;

import de.bund.bva.isyfact.task.model.Task;

import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Der TaskScheduler bietet die Möglichkeit, dass Aufgaben (Tasks) zu bestimmten Zeitpunkten ausgeführt werden können.
 *
 * @author Alexander Salvanos, msg systems ag
 *
 */
public interface TaskScheduler {
	/**
	 * Plant einen Task.
	 *
	 *
	 * @param task
	 * @return a ScheduledFuture<String>
	 */
	ScheduledFuture<String> schedule(Task task) throws NoSuchMethodException, Exception;

	/**
	 * Plant einen TaskData.
	 *
	 *
	 * @param task
	 * @return a ScheduledFuture<String>
	 */
	ScheduledFuture<?> scheduleAtFixedRate(Task task) throws NoSuchMethodException, Exception;

	/**
	 * Plant einen TaskData.
	 *
	 *
	 * @param task
	 * @return a ScheduledFuture<String>
	 */
	ScheduledFuture<?> scheduleWithFixedDelay(Task task) throws NoSuchMethodException, Exception;

	/**
	 *
	 * @param seconds
	 * @throws InterruptedException
	 */
	void awaitTerminationInSeconds(long seconds) throws InterruptedException;

	/**
	 *
	 */
    void shutDown();

	/**
	 *
	 */
	List<Runnable> shutDownNow();

	/**
	 *
	 */
	boolean isTerminated();
}
