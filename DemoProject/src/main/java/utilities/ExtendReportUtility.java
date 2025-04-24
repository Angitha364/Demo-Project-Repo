package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportUtility {
	public static final ExtentReports extentReports = new ExtentReports();

	public synchronized static ExtentReports createExtentReports() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
		reporter.config().setReportName("Demo  Project");//it will show title on html folder  at the top
		extentReports.attachReporter(reporter);//attach the report
		extentReports.setSystemInfo("Organization", "Obsqura");
		extentReports.setSystemInfo("Name", "Angitha");//it will show name on html folder  at the  end
		extentReports.setSystemInfo("Name", "Aleena");
		return extentReports;//it is returning must a report
	}
}
