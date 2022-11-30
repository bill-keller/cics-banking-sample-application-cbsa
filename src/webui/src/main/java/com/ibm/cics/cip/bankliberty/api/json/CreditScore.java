package com.ibm.cics.cip.bankliberty.api.json;

import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;
import java.util.Random;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * This class describes the methods of the CreditScore, used to generate a credit score for new customers
 * 
 */

/**
 * Copyright contributors to the CICS Banking Sample Application (CBSA) project
 *
 */


public class CreditScore {
    static final String COPYRIGHT =
      "Copyright contributors to the CICS Banking Sample Application (CBSA) project.";
	private static Logger logger = Logger.getLogger("com.ibm.cics.cip.bankliberty.api.json");
	public static CustomerJSON populateCreditScoreAndReviewDate(CustomerJSON customer)
	{
		// return true if it worked, false if it failed
		sortOutLogging();
		logger.entering("CreditScore","populateCreditScoreAndReviewDate(CustomerJSON customer)");


		logger.fine("CreditScore using credit agency to set credit score and review date");
		try {
			customer = CreditScoreCICS540.populateCreditScoreAndReviewDate(customer);
		}
		catch(java.lang.NoClassDefFoundError e)
		{
			int creditScoreTotal = 0;
			for(int i = 1;i < 5;i++)
			{
				creditScoreTotal = creditScoreTotal + new Random(Calendar.getInstance().getTimeInMillis()).nextInt(999) + 1;
			}
			customer.setCreditScore(new Integer(creditScoreTotal/5).toString());
			Calendar calendar = Calendar.getInstance();
			long nowMs = calendar.getTimeInMillis();
			int next21Days = new Random(calendar.getTimeInMillis()).nextInt(20);
			next21Days = next21Days++;
			nowMs = nowMs + (1000L * 60L * 60L * 24L * next21Days);
			customer.setReviewDate(new Date(nowMs));
		}

		logger.exiting("CreditScore","populateCreditScoreAndReviewDate(CustomerJSON customer)",customer);
		return customer;
	}
	private static void sortOutLogging()
	{
		try {
			LogManager.getLogManager().readConfiguration();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
