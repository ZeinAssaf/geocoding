package geocode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class IPdata {
	public String getIpData(String ip) {
		URL url;
		String response = "";
		String link = "https://ipinfo.io/" + ip + "/json";
		try {
			url = new URL(link);
			HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String tmp;
			while ((tmp=br.readLine()) != null) {
				response = response + tmp;
			}
			br.close();
			return response;

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return response;
	}

}
