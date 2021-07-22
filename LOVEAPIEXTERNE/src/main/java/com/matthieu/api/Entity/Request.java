package com.matthieu.api.Entity;

public class Request {

    private String url;
    private String headerName;
    private String headerContent;

    public Request(String url) {
        this.url = url;
    }

    public Request(String headerName, String headerContent) {
        this.headerName = headerName;
        this.headerContent = headerContent;
    }

    public String getUrl(){
        return this.url;
    }

    public String getHeaderName() {
        return headerName;
    }

    public String getHeaderContent() {
        return headerContent;
    }
}
