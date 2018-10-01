package scheduler;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class LocalLabManager {
	public static void main(String[] args) {
		  
		   
	    Document doc;
	    try {

	        doc = Jsoup.connect("https://www.yellowpages.com/search?search_terms=labs+&geo_location_terms=Laguna+Hills%2C+CA").get();
	       Elements links = doc.select("div.info");
	       
	       
	       for(Element e : links) 
	       {
	    	   System.out.println(e.text());
	       }

	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	  }

	 {
		
		
	}

	}

