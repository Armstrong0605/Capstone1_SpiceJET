package Util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent_report {

	public static ExtentReports getReport() {
		
		String path="C:\\Users\\Jenner\\eclipse-workspace\\SpiceJET\\report\\Spice-Jet.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		reporter.config().setReportName("Best Buy Report");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		return extent;
	}
}