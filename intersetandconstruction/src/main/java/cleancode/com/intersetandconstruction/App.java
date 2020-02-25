package cleancode.com.intersetandconstruction;

/**
 * Hello world!
 *
 */
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	private static Scanner in;
	public static void main( String[] args )
    {
    	in = new Scanner(System.in);
    	LOGGER.debug("for house construction press 1");
    	LOGGER.debug("for Interset Calculation construction press 2");
    	int n = in.nextInt();
    	if(n  == 1) {
    		LOGGER.debug("Here we will give you different option to build your own house with cost in Indian rupee for construction of square feet according to your wish ");
        	HashMap< String, Integer> housestandards = new HashMap<>();
        	housestandards.put("Standard Material", 1200);
        	housestandards.put("Above Standard Material", 1500);
        	housestandards.put("High Standard Material", 1800);
        	housestandards.put("High Standard Material and fully automated home", 1500);
        	for (Entry<String, Integer> entry : housestandards.entrySet())  {
                LOGGER.debug("Type of house = " + entry.getKey() + ", cost per square feet  = " + entry.getValue()); 
        	}
        	LOGGER.debug("write the type of your wish construction same as given  above");
        	in.nextLine();
        	String standard = in.nextLine();
        	LOGGER.debug("Enter the area of your home in square feet");
        	float  squarefeet = in.nextFloat();
        	float cost = housestandards.get(standard) * squarefeet;
        	LOGGER.debug(cost);
    	}
    	if(n == 2) {
    		LOGGER.debug("give principalamount");
    		double principalamount = in.nextFloat();
    		LOGGER.debug("give rateofinterset");
        	double  rateofinterestpyear = in.nextFloat();
        	LOGGER.debug("give years");
        	double years = in.nextFloat();
            LOGGER.debug("To calculate Simple Interest press 1");
            LOGGER.debug("To calculate Compound Interest press 2");
            int n1 = in.nextInt();
            if(n1 == 1) {        	
            	Simpleinterest SI = new Simpleinterest(principalamount,years,rateofinterestpyear);
            	LOGGER.debug(SI.findsimpleinterest());
            }
           else if(n1 == 2) {
            	Compoundinterest CI = new Compoundinterest(principalamount,years,rateofinterestpyear);
            	LOGGER.debug(CI.findcompoundinterest());
            }
            else {
            	LOGGER.debug("No such option is available");
            }
    	} 	
    	
        in.close();
    }
}
