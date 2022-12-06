package sk.umb.luiza.controller;

import lombok.Data;

@Data
public class ApiErrorResponse implements ApiResponse {

    @Override
    public boolean getSuccess() {
        return false;
    }
}
