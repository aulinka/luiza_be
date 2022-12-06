package sk.umb.luiza.controller;

public interface ApiResponse {
    default boolean getSuccess() {
        return true;
    }
}
