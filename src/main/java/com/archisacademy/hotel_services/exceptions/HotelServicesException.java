package com.archisacademy.hotel_services.exceptions;

import org.springframework.http.HttpStatus;

public class HotelServicesException extends ArrayIndexOutOfBoundsException {
    //not sure what we use serialVersionUID for
    private static final long serialVersionUID = -5195206180035808362L;
    private HttpStatus errorCode;

    public HotelServicesException() {
        super("Unexpected Exception Encountered");
    }

    public HotelServicesException(final String message, final HttpStatus errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    //when do we need to call this method?
    public HttpStatus getErrorCode() {
        return errorCode;
    }
}
