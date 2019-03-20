package com.ch.util;

import com.ch.base.AddressJsonData;
import net.sf.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ip138Util {

    public static String DATATYPE = "jsonp";

    public static String get(String urlString, String token) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5 * 1000);
            conn.setReadTimeout(5 * 1000);
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setUseCaches(false);
            conn.setInstanceFollowRedirects(false);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("token", token);
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                StringBuilder builder = new StringBuilder();
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(conn.getInputStream(), "utf-8"));
                for (String s = br.readLine(); s != null; s = br
                        .readLine()) {
                    builder.append(s);
                }
                br.close();
                JSONObject jsonObject = JSONObject.fromObject(builder.toString());
                AddressJsonData addressJsonData = (AddressJsonData) JSONObject.toBean(jsonObject, AddressJsonData.class);
                return addressJsonData.getData().get(2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static String queryIP(String ip) {
        String url = "http://api.ip138.com/query/?ip=" + ip + "&datatype=" + DATATYPE;
        String token = "0fc7ddf356cb00cb3fd10468b763cb9b";
        return get(url, token);
    }

    public static String publicip() {
        URL url = null;
        URLConnection urlconn = null;
        BufferedReader br = null;
        try {
            url = new URL("http://2019.ip138.com/ic.asp");//爬取的网站是百度搜索ip时排名第一的那个
            urlconn = url.openConnection();
            br = new BufferedReader(new InputStreamReader(
                    urlconn.getInputStream()));
            String buf = null;
            String get = null;
            while ((buf = br.readLine()) != null) {
                get += buf;
            }
            int where, end;
            for (where = 0; where < get.length() && get.charAt(where) != '['; where++) ;
            for (end = where; end < get.length() && get.charAt(end) != ']'; end++) ;
            get = get.substring(where + 1, end);
            return get;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

