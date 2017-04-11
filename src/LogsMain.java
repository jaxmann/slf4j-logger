
// Import log4j classes.
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogsMain {

	// Define a static logger variable so that it references the
	// Logger instance named "MyApp".
	private static Logger logger = Logger.getLogger(LogsMain.class);

	public static void main(String[] args) {

		// Set up a simple configuration that logs on the console.
		PropertyConfigurator.configure("log4j-configuration.txt");

		logger.info("Entering application.");
		Bar bar = new Bar();
		bar.doIt();
		logger.info("Exiting application.");
		logger.info("Exiting application.");
		logger.info("Exiting application.");
		logger.info("Exiting application.");
		logger.info("Exiting application.");
		logger.info("Exiting application.");


	}
}