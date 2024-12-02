package testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public  class Analyzer implements IRetryAnalyzer
{
	int initial=2;
	int finalize=5;
    @Override
	public boolean retry(ITestResult result) 
    {
		// TODO Auto-generated method stub
	  if (initial<finalize) 
	  {
		initial++;
		return true;
	  }
		return false;
	}


}
