/**
 * 
 */
package com.vaibhav.regex;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author Vaibhav Srivastava
 *
 */
public class splitClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String responseStr = "OK\r\n765607,\"0000033257\",\"MC\",\"A\",30.00,\"OK957Z\",\"\",\"\"\r\nApiSignature=%24\r\nApiFormat=0\r\nFunctionRequestCode=1B\r\nErrorIndicator=N\r\nPrimaryErrorCode=0\r\nSecondaryErrorCode=0\r\nMerchantId=0\r\nTranId=765607\r\nInvoice=0000033257\r\nCardNumber=XXXXXXXXXXXX1111\r\nVendor=VaibhavHospitalitySystem\r\nCardType=MC\r\nCardEntryMode=M\r\nCardPresent=Y\r\nExpirationDate=0\r\nClerk=14032\r\nDate=091215\r\nTime=183625\r\nSaleFlag=S\r\nPrimaryAmount=30.00\r\nSecondaryAmount=0.00\r\nResponse=A\r\nAuthorization=OK957Z\r\nTrackInformation=MXXXXXXXXXXXX1111%3D0000%3F\r\nCustomerName=VAIBHAV+SRIVASTAVA\r\nCustomerReference=16082400015232\r\nTaxIndicator=Y\r\nTaxAmount=19.44\r\nDestinationZipCode=85225\r\nProductDescriptor1=Hotel+Stay\r\nProductDescriptor2=Hotel+Stay\r\nProductDescriptor3=Hotel+Stay\r\nProductDescriptor4=Hotel+Stay\r\nHotelEstimatedDays=1\r\nPreauthorizedAmount=30.00\r\nPreauthorizedTolerance=36.00\r\nTerminalId=1\r\nApiOptions=ALLDATA%2CRETURNCURRENCYCODE\r\nOverrideBusDate=122715\r\nReceiptTextColumns=030\r\nReceiptText=09%2F12%2F2015+18%3A36%3A25%0D%0A%0D%0ATID%3A+1%0D%0ACREDIT+CARD%0D%0ASALE%0D%0AMASTERCARD%0D%0AKEYED%0D%0AXXXXXXXXXXXX1111%0D%0AREC+%23%3A+0000033257%0D%0ACLERK%3A+14032%0D%0AAPPROVED%3A+%5BOK957Z%5D%0D%0A%0D%0ATOTAL%3A+USD+30.00%0D%0A%0D%0AI+AGREE+TO+PAY+ABOVE+TOTAL+%0D%0AAMOUNT+ACCORDING+TO+CARD+%0D%0AISSUER+AGREEMENT+%28MERCHANT+%0D%0AAGREEMENT+IF+CREDIT+VOUCHER%29%0D%0A%0D%0AVAIBHAV+SRIVASTAVA%0D%0A%0D%0ASIGNATURE+CAPTURED+%0D%0AELECTRONICALLY%0D%0A%0D%0A\r\nUniqueId=11116nreqehh2n7e\r\nTokenSerialNumber=0\r\nEMVRequireSignature=N";
		Map<String, String> mapStr = new HashMap<String, String>();
		String pattern = "(.*)(\\=+)(.*)";
		// Create a Pattern object
	    Pattern r = Pattern.compile(pattern);
	    // Now create matcher object.
	      Matcher m = r.matcher(responseStr);
	    
		while (m.find( )) {
			mapStr.put(m.group(1), m.group(3));
	         //System.out.println(m.group(0) );
		}
		System.out.println(mapStr );
	}

}
