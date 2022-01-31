package com.knowme.vo;

/**
 * @author Dhiraj Jadhavrao
 * */
public class GenericResponseVo {
    private String status;
    private String statusMessage;
    private Object response;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }
}
