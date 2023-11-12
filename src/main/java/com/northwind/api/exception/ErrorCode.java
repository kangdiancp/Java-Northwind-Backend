package com.northwind.api.exception;

public enum ErrorCode {
  // Internal Errors: 1 to 0999
  GENERIC_ERROR(
      "CODE-0001", "The system is unable to complete the request. Contact system support."),
  HTTP_MEDIATYPE_NOT_SUPPORTED(
      "CODE-0002",
      "Requested media type is not supported. Please use application/json or application/xml as 'Content-Type' header value"),
  HTTP_MESSAGE_NOT_WRITABLE("CODE-0003", "Missing 'Accept' header. Please add 'Accept' header."),
  HTTP_MEDIA_TYPE_NOT_ACCEPTABLE(
      "CODE-0004",
      "Requested 'Accept' header value is not supported. Please use application/json or application/xml as 'Accept' value"),
  JSON_PARSE_ERROR("CODE-0005", "Make sure request payload should be a valid JSON object."),
  HTTP_MESSAGE_NOT_READABLE(
      "CODE-0006",
      "Make sure request payload should be a valid JSON or XML object according to 'Content-Type'."),
  HTTP_REQUEST_METHOD_NOT_SUPPORTED("CODE-0007", "Request method not supported."),
  CONSTRAINT_VIOLATION("CODE-0008", "Validation failed."),
  ILLEGAL_ARGUMENT_EXCEPTION("CODE-0009", "Invalid data passed."),
  RESOURCE_NOT_FOUND("CODE-0010", "Requested resource not found."),
  CATEGORY_NOT_FOUND("CODE-0011", "Requested category not found."),
  ITEM_NOT_FOUND("CODE-0012", "Requested item not found."),
  GENERIC_ALREADY_EXISTS("CODE-0013", "Already exists."),
  ACCESS_DENIED("CODE-0014", "Access Denied."),
  UNAUTHORIZED("CODE-0015", "Unauthorized");

  private final String errCode;
  private final String errMsgKey;

  ErrorCode(final String errCode, final String errMsgKey) {
    this.errCode = errCode;
    this.errMsgKey = errMsgKey;
  }

  /**
   * @return the errCode
   */
  public String getErrCode() {
    return errCode;
  }

  /**
   * @return the errMsgKey
   */
  public String getErrMsgKey() {
    return errMsgKey;
  }
}
