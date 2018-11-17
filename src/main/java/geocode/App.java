package geocode;

import java.util.Scanner;

import org.json.JSONObject;

public class App 
{
    public static void main( String[] args )
    {
    	IPdata iPdata= new IPdata();
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("enter an ip address");
    	String ip=scanner.nextLine();
        String location=iPdata.getIpData(ip);
        JSONObject obj=new JSONObject(location);
        System.out.println(location);
        String city=obj.getString("city");
        String country=obj.getString("country");
        String postal=obj.getString("postal");
        System.out.println("the city is"+" "+city);
        System.out.println("the countery is"+" "+country);
        System.out.println("the postal code is"+" "+postal);
        
    }
    
}
