/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.00.1086
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.provisioning.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Object describing one audit line
 */
@ApiModel(description = "Object describing one audit line")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T11:12:39.733Z")
public class ApiAuditSuccessResponseDataRows {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("createdat")
  private String createdat = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("level")
  private String level = "info";

  @SerializedName("msg")
  private String msg = null;

  @SerializedName("extradata")
  private Object extradata = null;

  public ApiAuditSuccessResponseDataRows id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Database ID of Audit log line
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Database ID of Audit log line")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public ApiAuditSuccessResponseDataRows createdat(String createdat) {
    this.createdat = createdat;
    return this;
  }

   /**
   * Audit log line create time
   * @return createdat
  **/
  @ApiModelProperty(required = true, value = "Audit log line create time")
  public String getCreatedat() {
    return createdat;
  }

  public void setCreatedat(String createdat) {
    this.createdat = createdat;
  }

  public ApiAuditSuccessResponseDataRows username(String username) {
    this.username = username;
    return this;
  }

   /**
   * User name for audit action in domain\\login format
   * @return username
  **/
  @ApiModelProperty(required = true, value = "User name for audit action in domain\\login format")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public ApiAuditSuccessResponseDataRows level(String level) {
    this.level = level;
    return this;
  }

   /**
   * Audit level (info, error)
   * @return level
  **/
  @ApiModelProperty(required = true, value = "Audit level (info, error)")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public ApiAuditSuccessResponseDataRows msg(String msg) {
    this.msg = msg;
    return this;
  }

   /**
   * Audit message
   * @return msg
  **/
  @ApiModelProperty(required = true, value = "Audit message")
  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public ApiAuditSuccessResponseDataRows extradata(Object extradata) {
    this.extradata = extradata;
    return this;
  }

   /**
   * Additional Audit data
   * @return extradata
  **/
  @ApiModelProperty(value = "Additional Audit data")
  public Object getExtradata() {
    return extradata;
  }

  public void setExtradata(Object extradata) {
    this.extradata = extradata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAuditSuccessResponseDataRows apiAuditSuccessResponseDataRows = (ApiAuditSuccessResponseDataRows) o;
    return Objects.equals(this.id, apiAuditSuccessResponseDataRows.id) &&
        Objects.equals(this.createdat, apiAuditSuccessResponseDataRows.createdat) &&
        Objects.equals(this.username, apiAuditSuccessResponseDataRows.username) &&
        Objects.equals(this.level, apiAuditSuccessResponseDataRows.level) &&
        Objects.equals(this.msg, apiAuditSuccessResponseDataRows.msg) &&
        Objects.equals(this.extradata, apiAuditSuccessResponseDataRows.extradata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdat, username, level, msg, extradata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAuditSuccessResponseDataRows {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdat: ").append(toIndentedString(createdat)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    extradata: ").append(toIndentedString(extradata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

