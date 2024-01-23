package commonutils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementation implements ITestListener {
	ExtentReports rp;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
//		To get the method name 
		String mtd = result.getMethod().getMethodName();
		Reporter.log(mtd+"Test script Execution is passed",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
//		To get Reason
		 String reason = result.getThrowable().toString();
		
		String mtd = result.getMethod().getMethodName();
		Reporter.log(mtd+"Test script Execution is failed"+reason,true);
		
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		String mtd = result.getMethod().getMethodName();
		Reporter.log(mtd+"Test script Execution is skipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
//		Reporter.log("Test script Execution started",true);
		ExtentSparkReporter report=new ExtentSparkReporter("./Extentreport/report.html") ;
		report.config().setDocumentTitle("Sarang");
		report.config().setReportName("Selenium");
		report.config().setTheme(Theme.STANDARD);
		
		 rp = new ExtentReports();
		rp.attachReporter(report);
		rp.setSystemInfo("ReporterName", "sARANG");
		rp.setSystemInfo("Browser", "Chrome");
		rp.setSystemInfo("OS", "Windows");
		Reporter.log("Test script Execution started",true);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
//		Reporter.log("Test script Execution is finished",true);
		
		rp.flush();
	}
}
