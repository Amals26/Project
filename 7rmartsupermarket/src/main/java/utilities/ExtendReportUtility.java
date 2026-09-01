package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportUtility {
	

	    public static final ExtentReports extentReports=new  ExtentReports(); 
	    
	    public synchronized static  ExtentReports createExtentReports() {
	    	
        
	        ExtentSparkReporter reporter =new ExtentSparkReporter("./extent-reports/extent.html");
	                

	        reporter.config().setReportName("7rmartsupermarket");

	        extentReports.attachReporter(reporter);

	        extentReports.setSystemInfo("Organisation", "Obsqura");
	        extentReports.setSystemInfo("Name", "Amal");

	        return extentReports;
	    }
	}
