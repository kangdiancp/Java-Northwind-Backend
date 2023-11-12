package com.northwind.api.exception;

public class CategoryNotFoundException extends RuntimeException{
  
  private static final long serialVersionUID = 1L;
  private final String errMsgKey;
  private final String errorCode;

  public CategoryNotFoundException(ErrorCode code) {
    super(code.getErrMsgKey());
    this.errMsgKey = code.getErrMsgKey();
    this.errorCode = code.getErrCode();
  }

  public CategoryNotFoundException(final String message) {
    super(message);
    this.errMsgKey = ErrorCode.CATEGORY_NOT_FOUND.getErrMsgKey();
    this.errorCode = ErrorCode.CATEGORY_NOT_FOUND.getErrCode();
  }

  public String getErrMsgKey() {
    return errMsgKey;
  }

  public String getErrorCode() {
    return errorCode;
  }
}
