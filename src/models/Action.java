package models;

public class Action {
    private static int id = 0;
    private String request;
    private String response;

    public Action(String request, String response) {
        this.request = request;
        this.response = response;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public static int getId() {
        return id;
    }

    public String getRequest() {
        return request;
    }

    public String getResponse() {
        return response;
    }
}
