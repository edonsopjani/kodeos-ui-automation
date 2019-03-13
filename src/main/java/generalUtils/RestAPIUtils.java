package generalUtils;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class RestAPIUtils {

    /**
     * Rest API - Default items creation
     *
     */


    /**
     * @param url - The URL where these items should be added
     * @param authorization - The authorization you use for the RestAPI headers
     *
     * The way you use this is by adding the url and authorization which will give you the result of what you wanted to see
     * The url specifies where to look for an item.
     *
     * This method is used for JsonArrays so whenever you have a JsonArray, it automatically uses this method
     */

    public static JSONArray getResponseArray(String url, final String authorization) throws ClientProtocolException, IOException {
        StringBuffer result = new StringBuffer();
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet getRequest = new HttpGet(url);

        addHeader(getRequest, authorization);

        CloseableHttpResponse response = client.execute(getRequest);
        int responseCode = response.getStatusLine().getStatusCode();
        System.out.println("Response Code: " + responseCode);
        try {
            if (responseCode == 200)

            {
                System.out.println("Get Response is Successfull");
                BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                String line = "";
                while ((line = reader.readLine()) != null) {
                    result.append(line);
                    System.out.println(result.toString());
                }
            }

            return (JSONArray) new JSONParser().parse(result.toString());

        } catch (Exception ex) {
            result.append("Get Response Failed");
            return new JSONArray();
        }

    }

    /**
     * @param url - The URL where these items should be added
     * @param authorization - The authorization you use for the RestAPI headers
     *
     * The way you use this is by adding the url and authorization which will give you the result of what you wanted to see
     * The url specifies where to look for an item.
     *
     * This method is used for JSONObject so whenever you have a JSONObject, it automatically uses this method
     */

    public static JSONObject getResponseObject(String url, final String authorization) throws ClientProtocolException, IOException {
        StringBuffer result = new StringBuffer();
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet getRequest = new HttpGet(url);

        addHeader(getRequest, authorization);

        CloseableHttpResponse response = client.execute(getRequest);
        int responseCode = response.getStatusLine().getStatusCode();
        System.out.println("Response Code: " + responseCode);
        try {
            if (responseCode == 200)

            {
                System.out.println("Get Response is Successfull");
                BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                String line = "";
                while ((line = reader.readLine()) != null) {
                    result.append(line);
                    System.out.println(result.toString());
                }
            }

            return (JSONObject) new JSONParser().parse(result.toString());

        } catch (Exception ex) {
            result.append("Get Response Failed");
            return new JSONObject();
        }

    }

    /**
     * @param url        - the url of the page where you want to add the information to
     * @param jsonObject - the argument that contains the JsonObject you want to post
     * @param authorization - the authorization string with which user you are going to log in for the rest api to work
     *
     * The way you use this is by adding the url, json object, and authorization which will create whatever you need to be created(posted)
     * The url specifies in what place this new object should be added, the object is WHAT you want to add
     *
     * This method is used for JSONObject so whenever you have a JSONObject, it automatically uses this method
     */

    public static JSONObject postCall(String url, JSONObject jsonObject, final String authorization) throws ClientProtocolException, IOException {
        StringBuffer result = new StringBuffer();
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost postRequest = new HttpPost(url);

        addHeader(postRequest, authorization);

        StringEntity entity = new StringEntity(jsonObject.toString());
        postRequest.setEntity(entity);
        CloseableHttpResponse response = client.execute(postRequest);
        int responseCode = response.getStatusLine().getStatusCode();
        System.out.println("Response Code: " + responseCode);
        try {
            if (responseCode == 201 || responseCode == 200) {
                System.out.println("Get Response is Successfull");
                BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                String line = "";
                while ((line = reader.readLine()) != null) {
                    result.append(line);
                    System.out.println(result.toString());
                }
            }
            return (JSONObject) new JSONParser().parse(result.toString());

        } catch (Exception ex) {
            result.append("Get Response Failed");
            return new JSONObject();
        }
    }

    /**
     * @param url           - the url of the page where you want to add the information to
     * @param array         - the argument that contains the JsonArray you want to post
     * @param authorization - the authorization string with which user you are going to log in for the rest api to work
 *
 * The way you use this is by adding the url, json array, and authorization which will create whatever you need to be created(posted)
 * The url specifies in what place this new object should be added, the object is WHAT you want to add
 *
     */

    public static JSONObject postCall(String url, org.json.simple.JSONObject array, final String authorization) throws ClientProtocolException, IOException {
        StringBuffer result = new StringBuffer();
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost postRequest = new HttpPost(url);

        addHeader(postRequest, authorization);

        StringEntity entity = new StringEntity(array.toString());
        postRequest.setEntity(entity);
        CloseableHttpResponse response = client.execute(postRequest);
        int responseCode = response.getStatusLine().getStatusCode();
        System.out.println("Response Code: " + responseCode);
        try {
            if (responseCode == 201) {
                System.out.println("Get Response is Successfull");
                BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                String line = "";
                while ((line = reader.readLine()) != null) {
                    result.append(line);
                    System.out.println(result.toString());
                }
            }
            return (JSONObject) new JSONParser().parse(result.toString());

        } catch (Exception ex) {
            result.append("Get Response Failed");
            return new JSONObject();
        }
    }

    /**
     *
     * @param url               - the url of the page where you want to add information to
     * @param fileName          - the file you want to upload through RestAPI
     * @param authorization     - the authorization string with which user you are going to log in for the rest api to work
     *
     * The way you use this is by adding the url, the file, and the authorization which will add the file you need to be added
     */

    public static JSONObject fileUploadPostCall(String url, String fileName, final String authorization) throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost postRequest = new HttpPost(url);
        postRequest.addHeader("Authorization", authorization);

        MultipartEntity entity = new MultipartEntity();
        entity.addPart("importCsvFile", new FileBody(new File(fileName)));
        postRequest.setEntity(entity);

        CloseableHttpResponse response = client.execute(postRequest);
        StringBuffer result = new StringBuffer();
        try {
            System.out.println("Get Response is Successfull");
            BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            String line = "";
            while ((line = reader.readLine()) != null) {
                result.append(line);
                System.out.println(result.toString());
            }
            return (JSONObject) new JSONParser().parse(result.toString());

        } catch (Exception ex) {
            result.append("Get Response Failed");
            return new JSONObject();
        }
    }

    /**
     *
     * @param url               - the url of the page where you want to add information to
     * @param jsonObject        - the object you want to edit(put) through RestAPI
     * @param authorization     - the authorization string with which user you are going to log in for the rest api to work
     *
     * The way you use this is by adding the url, the json object, and the authorization which will update(edit) that object
     * This method is used for whenever you have an object that you need to change some values for it, or just update it in whatever way you need
     */

    public static JSONObject putCall(String url, JSONObject jsonObject, final String authorization) throws ClientProtocolException, IOException {
        StringBuffer result = new StringBuffer();
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPut putRequest = new HttpPut(url);

        addHeader(putRequest, authorization);

        StringEntity entity = new StringEntity(jsonObject.toString());
        putRequest.setEntity(entity);
        CloseableHttpResponse response = client.execute(putRequest);
        int responseCode = response.getStatusLine().getStatusCode();
        System.out.println("Response Code: " + responseCode);
        try {
            if (responseCode == 200 || responseCode == 201) {
                System.out.println("Put Response is Successfull");
                BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                String line = "";
                while ((line = reader.readLine()) != null) {
                    result.append(line);
                    System.out.println(result.toString());
                }
            }
            return (JSONObject) new JSONParser().parse(result.toString());

        } catch (Exception ex) {
            result.append("Put Response Failed");
            return new JSONObject();
        }
    }

    /**
     *
     * @param header - this parameter takes the argument for whatever type of header you need (in this case Post)
     * @param auth   - the authorization string with which user you are going to log in for the rest api to work
     *
     * This is used to add headers to the HttpPost method (since the values are repeated so they are located here and can be changed here)
     */

    private static HttpPost addHeader(HttpPost header, final String auth) {
        header.addHeader("Authorization", auth);
        header.addHeader("Content-Type", "application/json");
        header.addHeader("Accept", "application/json");

        return header;
    }

    /**
     *
     * @param header - this parameter takes the argument for whatever type of header you need (in this case Get)
     * @param auth   - the authorization string with which user you are going to log in for the rest api to work
     *
     * This is used to add headers to the HttpGet method (since the values are repeated so they are located here and can be changed here)
     */

    private static HttpGet addHeader(HttpGet header, final String auth) {
        header.addHeader("Authorization", auth);
        header.addHeader("Content-Type", "application/json");
        header.addHeader("Accept", "application/json");

        return header;
    }

    /**
     *
     * @param header - this parameter takes the argument for whatever type of header you need (in this case Put)
     * @param auth   - the authorization string with which user you are going to log in for the rest api to work
     *
     * This is used to add headers to the HttpPut method (since the values are repeated so they are located here and can be changed here)
     */

    private static HttpPut addHeader(HttpPut header, final String auth) {
        header.addHeader("Authorization", auth);
        header.addHeader("Content-Type", "application/json");
        header.addHeader("Accept", "application/json");

        return header;
    }
}