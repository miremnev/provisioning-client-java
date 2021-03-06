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
import com.genesys.internal.provisioning.model.Extension;
import com.genesys.internal.provisioning.model.Skill;
import com.genesys.internal.provisioning.model.UpdateUserDataWwe;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UpdateUserData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T11:12:39.733Z")
public class UpdateUserData {
  @SerializedName("changePasswordOnNextLogin")
  private Boolean changePasswordOnNextLogin = null;

  @SerializedName("emailAddress")
  private String emailAddress = null;

  @SerializedName("employeeID")
  private String employeeID = null;

  @SerializedName("externalID")
  private String externalID = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("userName")
  private String userName = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("loginCode")
  private String loginCode = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("placeNames")
  private List<String> placeNames = null;

  @SerializedName("wwe")
  private UpdateUserDataWwe wwe = null;

  @SerializedName("switchNames")
  private List<String> switchNames = null;

  @SerializedName("deletedSwitchNames")
  private List<String> deletedSwitchNames = null;

  @SerializedName("phones")
  private List<Extension> phones = null;

  @SerializedName("supportSoftPhone")
  private Boolean supportSoftPhone = null;

  /**
   * Specifies the sip phone typed if supportSoftPhone &#x3D; true.  Effect: Specifies  the sip phone type and corresponding annex to be written to the DN&#39;s \&quot;TServer\&quot; section 
   */
  @JsonAdapter(SipPhoneTypeEnum.Adapter.class)
  public enum SipPhoneTypeEnum {
    CTI("Disable CTI");

    private String value;

    SipPhoneTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SipPhoneTypeEnum fromValue(String text) {
      for (SipPhoneTypeEnum b : SipPhoneTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SipPhoneTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SipPhoneTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SipPhoneTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SipPhoneTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("sipPhoneType")
  private SipPhoneTypeEnum sipPhoneType = null;

  @SerializedName("skills")
  private List<Skill> skills = null;

  @SerializedName("deletedSkills")
  private List<String> deletedSkills = null;

  @SerializedName("agentGroups")
  private List<String> agentGroups = null;

  @SerializedName("deletedAgentGroups")
  private List<String> deletedAgentGroups = null;

  @SerializedName("accessGroups")
  private List<String> accessGroups = null;

  @SerializedName("deletedAccessGroups")
  private List<String> deletedAccessGroups = null;

  @SerializedName("voiceMail")
  private Integer voiceMail = null;

  @SerializedName("wrapUpTime")
  private String wrapUpTime = null;

  public UpdateUserData changePasswordOnNextLogin(Boolean changePasswordOnNextLogin) {
    this.changePasswordOnNextLogin = changePasswordOnNextLogin;
    return this;
  }

   /**
   * if &#39;true&#39;, user will be asked to change password on first login.  Effect: Controls the value of the corresponding CfgPerson attribute 
   * @return changePasswordOnNextLogin
  **/
  @ApiModelProperty(value = "if 'true', user will be asked to change password on first login.  Effect: Controls the value of the corresponding CfgPerson attribute ")
  public Boolean isChangePasswordOnNextLogin() {
    return changePasswordOnNextLogin;
  }

  public void setChangePasswordOnNextLogin(Boolean changePasswordOnNextLogin) {
    this.changePasswordOnNextLogin = changePasswordOnNextLogin;
  }

  public UpdateUserData emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * User&#39;s email.  Effect: Controls the value of the corresponding CfgPerson attribute 
   * @return emailAddress
  **/
  @ApiModelProperty(value = "User's email.  Effect: Controls the value of the corresponding CfgPerson attribute ")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public UpdateUserData employeeID(String employeeID) {
    this.employeeID = employeeID;
    return this;
  }

   /**
   * user&#39;s Employee ID.  Effect: Controls the value of the corresponding CfgPerson attribute 
   * @return employeeID
  **/
  @ApiModelProperty(value = "user's Employee ID.  Effect: Controls the value of the corresponding CfgPerson attribute ")
  public String getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(String employeeID) {
    this.employeeID = employeeID;
  }

  public UpdateUserData externalID(String externalID) {
    this.externalID = externalID;
    return this;
  }

   /**
   * External ID.  Effect: Controls the value of the corresponding CfgPerson attribute 
   * @return externalID
  **/
  @ApiModelProperty(value = "External ID.  Effect: Controls the value of the corresponding CfgPerson attribute ")
  public String getExternalID() {
    return externalID;
  }

  public void setExternalID(String externalID) {
    this.externalID = externalID;
  }

  public UpdateUserData enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * User is enabled or disabled.  Effect: Controls the value of the corresponding CfgPerson attribute 
   * @return enabled
  **/
  @ApiModelProperty(value = "User is enabled or disabled.  Effect: Controls the value of the corresponding CfgPerson attribute ")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public UpdateUserData userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * User unique login. Controls the value of the corresponding CfgPerson attribute 
   * @return userName
  **/
  @ApiModelProperty(required = true, value = "User unique login. Controls the value of the corresponding CfgPerson attribute ")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UpdateUserData firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * User&#39;s first name.  Effect: Controls the value of the corresponding CfgPerson attribute 
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "User's first name.  Effect: Controls the value of the corresponding CfgPerson attribute ")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UpdateUserData lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * User&#39;s last name.  Effect: Controls the value of the corresponding CfgPerson attribute 
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "User's last name.  Effect: Controls the value of the corresponding CfgPerson attribute ")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UpdateUserData loginCode(String loginCode) {
    this.loginCode = loginCode;
    return this;
  }

   /**
   * The user&#39;s login code.  Effect: A corresponding CfgAgentLogin will be created on all switches in the \&quot;switchNames\&quot; collection. It will then be assigned to the CfgPerson that&#39;s being modified. 
   * @return loginCode
  **/
  @ApiModelProperty(value = "The user's login code.  Effect: A corresponding CfgAgentLogin will be created on all switches in the \"switchNames\" collection. It will then be assigned to the CfgPerson that's being modified. ")
  public String getLoginCode() {
    return loginCode;
  }

  public void setLoginCode(String loginCode) {
    this.loginCode = loginCode;
  }

  public UpdateUserData password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password as plain text.  Effect: Controls the value of the corresponding CfgPerson attribute 
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Password as plain text.  Effect: Controls the value of the corresponding CfgPerson attribute ")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UpdateUserData placeNames(List<String> placeNames) {
    this.placeNames = placeNames;
    return this;
  }

  public UpdateUserData addPlaceNamesItem(String placeNamesItem) {
    if (this.placeNames == null) {
      this.placeNames = new ArrayList<String>();
    }
    this.placeNames.add(placeNamesItem);
    return this;
  }

   /**
   * A list of places available to the user (for multimedia only users).  Effect: The list is written to the current CfgPerson&#39;s \&quot;htcc\&quot; annex. e.g. CfgPerson/userProperties/htcc/place &#x3D; p1, p2, p3 
   * @return placeNames
  **/
  @ApiModelProperty(value = "A list of places available to the user (for multimedia only users).  Effect: The list is written to the current CfgPerson's \"htcc\" annex. e.g. CfgPerson/userProperties/htcc/place = p1, p2, p3 ")
  public List<String> getPlaceNames() {
    return placeNames;
  }

  public void setPlaceNames(List<String> placeNames) {
    this.placeNames = placeNames;
  }

  public UpdateUserData wwe(UpdateUserDataWwe wwe) {
    this.wwe = wwe;
    return this;
  }

   /**
   * Get wwe
   * @return wwe
  **/
  @ApiModelProperty(value = "")
  public UpdateUserDataWwe getWwe() {
    return wwe;
  }

  public void setWwe(UpdateUserDataWwe wwe) {
    this.wwe = wwe;
  }

  public UpdateUserData switchNames(List<String> switchNames) {
    this.switchNames = switchNames;
    return this;
  }

  public UpdateUserData addSwitchNamesItem(String switchNamesItem) {
    if (this.switchNames == null) {
      this.switchNames = new ArrayList<String>();
    }
    this.switchNames.add(switchNamesItem);
    return this;
  }

   /**
   * The switch names that the user will work on.  Effect: A list of switches where the user&#39;s telephony objects will be created (i.e. dns, agent logins) 
   * @return switchNames
  **/
  @ApiModelProperty(value = "The switch names that the user will work on.  Effect: A list of switches where the user's telephony objects will be created (i.e. dns, agent logins) ")
  public List<String> getSwitchNames() {
    return switchNames;
  }

  public void setSwitchNames(List<String> switchNames) {
    this.switchNames = switchNames;
  }

  public UpdateUserData deletedSwitchNames(List<String> deletedSwitchNames) {
    this.deletedSwitchNames = deletedSwitchNames;
    return this;
  }

  public UpdateUserData addDeletedSwitchNamesItem(String deletedSwitchNamesItem) {
    if (this.deletedSwitchNames == null) {
      this.deletedSwitchNames = new ArrayList<String>();
    }
    this.deletedSwitchNames.add(deletedSwitchNamesItem);
    return this;
  }

   /**
   * The switch names that the user will NOT work on.  Effect: A list of switches where the user&#39;s telephony objects will NOT be created (i.e. dns, agent logins) 
   * @return deletedSwitchNames
  **/
  @ApiModelProperty(value = "The switch names that the user will NOT work on.  Effect: A list of switches where the user's telephony objects will NOT be created (i.e. dns, agent logins) ")
  public List<String> getDeletedSwitchNames() {
    return deletedSwitchNames;
  }

  public void setDeletedSwitchNames(List<String> deletedSwitchNames) {
    this.deletedSwitchNames = deletedSwitchNames;
  }

  public UpdateUserData phones(List<Extension> phones) {
    this.phones = phones;
    return this;
  }

  public UpdateUserData addPhonesItem(Extension phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<Extension>();
    }
    this.phones.add(phonesItem);
    return this;
  }

   /**
   * A list of phone number descriptors used to create the user&#39;s DNs.  Effect: For each phone number, a corresponding DN will be created on all of the switches specified by \&quot;switchNames\&quot; and assigned to the specified place. 
   * @return phones
  **/
  @ApiModelProperty(value = "A list of phone number descriptors used to create the user's DNs.  Effect: For each phone number, a corresponding DN will be created on all of the switches specified by \"switchNames\" and assigned to the specified place. ")
  public List<Extension> getPhones() {
    return phones;
  }

  public void setPhones(List<Extension> phones) {
    this.phones = phones;
  }

  public UpdateUserData supportSoftPhone(Boolean supportSoftPhone) {
    this.supportSoftPhone = supportSoftPhone;
    return this;
  }

   /**
   * Enable SIP Phone, true/false.  Effect: Writes corresponding information to the TServer annex of the created DNs (see sipPhoneType) 
   * @return supportSoftPhone
  **/
  @ApiModelProperty(value = "Enable SIP Phone, true/false.  Effect: Writes corresponding information to the TServer annex of the created DNs (see sipPhoneType) ")
  public Boolean isSupportSoftPhone() {
    return supportSoftPhone;
  }

  public void setSupportSoftPhone(Boolean supportSoftPhone) {
    this.supportSoftPhone = supportSoftPhone;
  }

  public UpdateUserData sipPhoneType(SipPhoneTypeEnum sipPhoneType) {
    this.sipPhoneType = sipPhoneType;
    return this;
  }

   /**
   * Specifies the sip phone typed if supportSoftPhone &#x3D; true.  Effect: Specifies  the sip phone type and corresponding annex to be written to the DN&#39;s \&quot;TServer\&quot; section 
   * @return sipPhoneType
  **/
  @ApiModelProperty(value = "Specifies the sip phone typed if supportSoftPhone = true.  Effect: Specifies  the sip phone type and corresponding annex to be written to the DN's \"TServer\" section ")
  public SipPhoneTypeEnum getSipPhoneType() {
    return sipPhoneType;
  }

  public void setSipPhoneType(SipPhoneTypeEnum sipPhoneType) {
    this.sipPhoneType = sipPhoneType;
  }

  public UpdateUserData skills(List<Skill> skills) {
    this.skills = skills;
    return this;
  }

  public UpdateUserData addSkillsItem(Skill skillsItem) {
    if (this.skills == null) {
      this.skills = new ArrayList<Skill>();
    }
    this.skills.add(skillsItem);
    return this;
  }

   /**
   * List of Skills to assign to the user.  Effect: The list contains a collection of skill descriptors. If the corresponding skill is found, it is assigned to the user with the specified level. If it is not found, the skill is created and then assigned. 
   * @return skills
  **/
  @ApiModelProperty(value = "List of Skills to assign to the user.  Effect: The list contains a collection of skill descriptors. If the corresponding skill is found, it is assigned to the user with the specified level. If it is not found, the skill is created and then assigned. ")
  public List<Skill> getSkills() {
    return skills;
  }

  public void setSkills(List<Skill> skills) {
    this.skills = skills;
  }

  public UpdateUserData deletedSkills(List<String> deletedSkills) {
    this.deletedSkills = deletedSkills;
    return this;
  }

  public UpdateUserData addDeletedSkillsItem(String deletedSkillsItem) {
    if (this.deletedSkills == null) {
      this.deletedSkills = new ArrayList<String>();
    }
    this.deletedSkills.add(deletedSkillsItem);
    return this;
  }

   /**
   * List of Skills to delete from the user.  Effect: The list contains a collection of skill names. If the corresponding skill is found, it is deleted from the user. 
   * @return deletedSkills
  **/
  @ApiModelProperty(value = "List of Skills to delete from the user.  Effect: The list contains a collection of skill names. If the corresponding skill is found, it is deleted from the user. ")
  public List<String> getDeletedSkills() {
    return deletedSkills;
  }

  public void setDeletedSkills(List<String> deletedSkills) {
    this.deletedSkills = deletedSkills;
  }

  public UpdateUserData agentGroups(List<String> agentGroups) {
    this.agentGroups = agentGroups;
    return this;
  }

  public UpdateUserData addAgentGroupsItem(String agentGroupsItem) {
    if (this.agentGroups == null) {
      this.agentGroups = new ArrayList<String>();
    }
    this.agentGroups.add(agentGroupsItem);
    return this;
  }

   /**
   * List of agent groups that the user should be assigned to.  Effect: The user will be assigned to each group that already exists. If a particular group is not already in the system it will be created. 
   * @return agentGroups
  **/
  @ApiModelProperty(value = "List of agent groups that the user should be assigned to.  Effect: The user will be assigned to each group that already exists. If a particular group is not already in the system it will be created. ")
  public List<String> getAgentGroups() {
    return agentGroups;
  }

  public void setAgentGroups(List<String> agentGroups) {
    this.agentGroups = agentGroups;
  }

  public UpdateUserData deletedAgentGroups(List<String> deletedAgentGroups) {
    this.deletedAgentGroups = deletedAgentGroups;
    return this;
  }

  public UpdateUserData addDeletedAgentGroupsItem(String deletedAgentGroupsItem) {
    if (this.deletedAgentGroups == null) {
      this.deletedAgentGroups = new ArrayList<String>();
    }
    this.deletedAgentGroups.add(deletedAgentGroupsItem);
    return this;
  }

   /**
   * List of agent groups that the user should be deleted from.  Effect: The user will be deleted from each group that already exists. 
   * @return deletedAgentGroups
  **/
  @ApiModelProperty(value = "List of agent groups that the user should be deleted from.  Effect: The user will be deleted from each group that already exists. ")
  public List<String> getDeletedAgentGroups() {
    return deletedAgentGroups;
  }

  public void setDeletedAgentGroups(List<String> deletedAgentGroups) {
    this.deletedAgentGroups = deletedAgentGroups;
  }

  public UpdateUserData accessGroups(List<String> accessGroups) {
    this.accessGroups = accessGroups;
    return this;
  }

  public UpdateUserData addAccessGroupsItem(String accessGroupsItem) {
    if (this.accessGroups == null) {
      this.accessGroups = new ArrayList<String>();
    }
    this.accessGroups.add(accessGroupsItem);
    return this;
  }

   /**
   * List of access groups that the user should belong to.  Effect: The user will be assigned to each group that can be located. If a group does not already exist, it will NOT be created. 
   * @return accessGroups
  **/
  @ApiModelProperty(value = "List of access groups that the user should belong to.  Effect: The user will be assigned to each group that can be located. If a group does not already exist, it will NOT be created. ")
  public List<String> getAccessGroups() {
    return accessGroups;
  }

  public void setAccessGroups(List<String> accessGroups) {
    this.accessGroups = accessGroups;
  }

  public UpdateUserData deletedAccessGroups(List<String> deletedAccessGroups) {
    this.deletedAccessGroups = deletedAccessGroups;
    return this;
  }

  public UpdateUserData addDeletedAccessGroupsItem(String deletedAccessGroupsItem) {
    if (this.deletedAccessGroups == null) {
      this.deletedAccessGroups = new ArrayList<String>();
    }
    this.deletedAccessGroups.add(deletedAccessGroupsItem);
    return this;
  }

   /**
   * List of access groups that the user should be deleted from.  Effect: The user will be deleted from each group that can be located. 
   * @return deletedAccessGroups
  **/
  @ApiModelProperty(value = "List of access groups that the user should be deleted from.  Effect: The user will be deleted from each group that can be located. ")
  public List<String> getDeletedAccessGroups() {
    return deletedAccessGroups;
  }

  public void setDeletedAccessGroups(List<String> deletedAccessGroups) {
    this.deletedAccessGroups = deletedAccessGroups;
  }

  public UpdateUserData voiceMail(Integer voiceMail) {
    this.voiceMail = voiceMail;
    return this;
  }

   /**
   * User&#39;s Voice Mail.  Effect: Written to the user&#39;s CfgAgentLogin.userProperties.TServer.gvm_mailbox 
   * @return voiceMail
  **/
  @ApiModelProperty(value = "User's Voice Mail.  Effect: Written to the user's CfgAgentLogin.userProperties.TServer.gvm_mailbox ")
  public Integer getVoiceMail() {
    return voiceMail;
  }

  public void setVoiceMail(Integer voiceMail) {
    this.voiceMail = voiceMail;
  }

  public UpdateUserData wrapUpTime(String wrapUpTime) {
    this.wrapUpTime = wrapUpTime;
    return this;
  }

   /**
   * User&#39;s Wrap Up Time.  Effect: Configured for each CfgAgentLogin 
   * @return wrapUpTime
  **/
  @ApiModelProperty(value = "User's Wrap Up Time.  Effect: Configured for each CfgAgentLogin ")
  public String getWrapUpTime() {
    return wrapUpTime;
  }

  public void setWrapUpTime(String wrapUpTime) {
    this.wrapUpTime = wrapUpTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserData updateUserData = (UpdateUserData) o;
    return Objects.equals(this.changePasswordOnNextLogin, updateUserData.changePasswordOnNextLogin) &&
        Objects.equals(this.emailAddress, updateUserData.emailAddress) &&
        Objects.equals(this.employeeID, updateUserData.employeeID) &&
        Objects.equals(this.externalID, updateUserData.externalID) &&
        Objects.equals(this.enabled, updateUserData.enabled) &&
        Objects.equals(this.userName, updateUserData.userName) &&
        Objects.equals(this.firstName, updateUserData.firstName) &&
        Objects.equals(this.lastName, updateUserData.lastName) &&
        Objects.equals(this.loginCode, updateUserData.loginCode) &&
        Objects.equals(this.password, updateUserData.password) &&
        Objects.equals(this.placeNames, updateUserData.placeNames) &&
        Objects.equals(this.wwe, updateUserData.wwe) &&
        Objects.equals(this.switchNames, updateUserData.switchNames) &&
        Objects.equals(this.deletedSwitchNames, updateUserData.deletedSwitchNames) &&
        Objects.equals(this.phones, updateUserData.phones) &&
        Objects.equals(this.supportSoftPhone, updateUserData.supportSoftPhone) &&
        Objects.equals(this.sipPhoneType, updateUserData.sipPhoneType) &&
        Objects.equals(this.skills, updateUserData.skills) &&
        Objects.equals(this.deletedSkills, updateUserData.deletedSkills) &&
        Objects.equals(this.agentGroups, updateUserData.agentGroups) &&
        Objects.equals(this.deletedAgentGroups, updateUserData.deletedAgentGroups) &&
        Objects.equals(this.accessGroups, updateUserData.accessGroups) &&
        Objects.equals(this.deletedAccessGroups, updateUserData.deletedAccessGroups) &&
        Objects.equals(this.voiceMail, updateUserData.voiceMail) &&
        Objects.equals(this.wrapUpTime, updateUserData.wrapUpTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changePasswordOnNextLogin, emailAddress, employeeID, externalID, enabled, userName, firstName, lastName, loginCode, password, placeNames, wwe, switchNames, deletedSwitchNames, phones, supportSoftPhone, sipPhoneType, skills, deletedSkills, agentGroups, deletedAgentGroups, accessGroups, deletedAccessGroups, voiceMail, wrapUpTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserData {\n");
    
    sb.append("    changePasswordOnNextLogin: ").append(toIndentedString(changePasswordOnNextLogin)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    externalID: ").append(toIndentedString(externalID)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    loginCode: ").append(toIndentedString(loginCode)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    placeNames: ").append(toIndentedString(placeNames)).append("\n");
    sb.append("    wwe: ").append(toIndentedString(wwe)).append("\n");
    sb.append("    switchNames: ").append(toIndentedString(switchNames)).append("\n");
    sb.append("    deletedSwitchNames: ").append(toIndentedString(deletedSwitchNames)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    supportSoftPhone: ").append(toIndentedString(supportSoftPhone)).append("\n");
    sb.append("    sipPhoneType: ").append(toIndentedString(sipPhoneType)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    deletedSkills: ").append(toIndentedString(deletedSkills)).append("\n");
    sb.append("    agentGroups: ").append(toIndentedString(agentGroups)).append("\n");
    sb.append("    deletedAgentGroups: ").append(toIndentedString(deletedAgentGroups)).append("\n");
    sb.append("    accessGroups: ").append(toIndentedString(accessGroups)).append("\n");
    sb.append("    deletedAccessGroups: ").append(toIndentedString(deletedAccessGroups)).append("\n");
    sb.append("    voiceMail: ").append(toIndentedString(voiceMail)).append("\n");
    sb.append("    wrapUpTime: ").append(toIndentedString(wrapUpTime)).append("\n");
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

