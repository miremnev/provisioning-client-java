/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model.  The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.00.722
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.provisioning.model;

import java.util.Objects;
import com.genesys.provisioning.model.GetUsersSuccessResponseStatusDataSkills;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * GetUsersSuccessResponseStatusData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-21T13:23:01.997Z")
public class GetUsersSuccessResponseStatusData {
  @SerializedName("users")
  private List<Object> users = new ArrayList<Object>();

  @SerializedName("user")
  private Object user = null;

  @SerializedName("totalCount")
  private Integer totalCount = null;

  @SerializedName("skills")
  private List<GetUsersSuccessResponseStatusDataSkills> skills = new ArrayList<GetUsersSuccessResponseStatusDataSkills>();

  public GetUsersSuccessResponseStatusData users(List<Object> users) {
    this.users = users;
    return this;
  }

  public GetUsersSuccessResponseStatusData addUsersItem(Object usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * List of user objects fetched if dbid parameter is absent.
   * @return users
  **/
  @ApiModelProperty(example = "null", value = "List of user objects fetched if dbid parameter is absent.")
  public List<Object> getUsers() {
    return users;
  }

  public void setUsers(List<Object> users) {
    this.users = users;
  }

  public GetUsersSuccessResponseStatusData user(Object user) {
    this.user = user;
    return this;
  }

   /**
   * User object fetched if dbid parameter is a person DBID or 'me'.
   * @return user
  **/
  @ApiModelProperty(example = "null", value = "User object fetched if dbid parameter is a person DBID or 'me'.")
  public Object getUser() {
    return user;
  }

  public void setUser(Object user) {
    this.user = user;
  }

  public GetUsersSuccessResponseStatusData totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total number of users. Available if dbid parameter is absent.
   * @return totalCount
  **/
  @ApiModelProperty(example = "null", value = "Total number of users. Available if dbid parameter is absent.")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public GetUsersSuccessResponseStatusData skills(List<GetUsersSuccessResponseStatusDataSkills> skills) {
    this.skills = skills;
    return this;
  }

  public GetUsersSuccessResponseStatusData addSkillsItem(GetUsersSuccessResponseStatusDataSkills skillsItem) {
    this.skills.add(skillsItem);
    return this;
  }

   /**
   * skills assigned to any user. Available if dbid parameter is equal to 'skills'.
   * @return skills
  **/
  @ApiModelProperty(example = "null", value = "skills assigned to any user. Available if dbid parameter is equal to 'skills'.")
  public List<GetUsersSuccessResponseStatusDataSkills> getSkills() {
    return skills;
  }

  public void setSkills(List<GetUsersSuccessResponseStatusDataSkills> skills) {
    this.skills = skills;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUsersSuccessResponseStatusData getUsersSuccessResponseStatusData = (GetUsersSuccessResponseStatusData) o;
    return Objects.equals(this.users, getUsersSuccessResponseStatusData.users) &&
        Objects.equals(this.user, getUsersSuccessResponseStatusData.user) &&
        Objects.equals(this.totalCount, getUsersSuccessResponseStatusData.totalCount) &&
        Objects.equals(this.skills, getUsersSuccessResponseStatusData.skills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, user, totalCount, skills);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUsersSuccessResponseStatusData {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
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

