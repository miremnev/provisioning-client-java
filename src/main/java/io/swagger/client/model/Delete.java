/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model.  The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.00.423
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Delete
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-13T15:44:55.011Z")
public class Delete {
  @SerializedName("keep_places")
  private Boolean keepPlaces = null;

  public Delete keepPlaces(Boolean keepPlaces) {
    this.keepPlaces = keepPlaces;
    return this;
  }

   /**
   * if 'true' or absent, user's places and their DNs will not be deleted  Effect: Controls if user's places and their DNs will be deleted 
   * @return keepPlaces
  **/
  @ApiModelProperty(example = "null", value = "if 'true' or absent, user's places and their DNs will not be deleted  Effect: Controls if user's places and their DNs will be deleted ")
  public Boolean getKeepPlaces() {
    return keepPlaces;
  }

  public void setKeepPlaces(Boolean keepPlaces) {
    this.keepPlaces = keepPlaces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Delete delete = (Delete) o;
    return Objects.equals(this.keepPlaces, delete.keepPlaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keepPlaces);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Delete {\n");
    
    sb.append("    keepPlaces: ").append(toIndentedString(keepPlaces)).append("\n");
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

