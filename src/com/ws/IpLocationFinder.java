package com.ws;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IpLocationFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if(args.length == 1){
			String ip = args[0];
			GeoIPService service = new GeoIPService();
			GeoIPServiceSoap serviceSoap = service.getGeoIPServiceSoap();
			GeoIP output = serviceSoap.getGeoIP(ip);
			System.out.println("Country code " + output.getCountryCode());
			System.out.println("Country name " + output.getCountryName());
		}
		else{
			System.out.println("Incorrect input");
		}
	}

}
