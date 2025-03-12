package com.app.lms.exception;

public enum ErrorCode {
    USER_ALREADY_EXISTS,
    INVALID_EMAIL,
    USER_NOT_FOUND,
    INVALID_PASSWORD,
    OTP_EXPIRED, INVALID_OTP, USER_ALREADY_VERIFIED, ACCOUNT_NOT_VERIFIED, BAD_CREDENTIALS,
    DATA_NOT_FOUND,
    REVIEW_TOO_SHORT, ACCOUNT_BANNED, INVALID_TOKEN, TOKEN_EXPIRED, USER_DATA_EMPTY, INAPPROPRIATE_REVIEW
}
