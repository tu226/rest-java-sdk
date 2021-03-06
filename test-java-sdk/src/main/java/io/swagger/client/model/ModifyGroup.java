/**
 * Easemob REST APIs
 * Easemob Server REST API Swagger is designated to provide better documentation and thorough interfaces for testing. For more details about server implementation, request rate limitation, etc, please visit [Easemob Server Integration](http://docs.easemob.com/im/100serverintegration/10intro).    **Note:**  `org_ID` is the unique ID of the organization created when you first registered [Easemob console](https://console.easemob.com/).                          `app_name` is the unique app ID created when you new application in [Easemob console](https://console.easemob.com/).            `Authorization token` is required for most API requests as part of requesting header in the format `Bearer ${token}`. You can obtain the token via [/{org_name}/{app_name}/token](https://docs.hyphenate.io/docs/server-overview#section-request-authentication-token).                                             
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ModifyGroup
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-22T17:09:55.999+08:00")
public class ModifyGroup   {
  @SerializedName("groupname")
  private String groupname = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("maxusers")
  private Integer maxusers = null;

  public ModifyGroup groupname(String groupname) {
    this.groupname = groupname;
    return this;
  }

   /**
   * Get groupname
   * @return groupname
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGroupname() {
    return groupname;
  }

  public void setGroupname(String groupname) {
    this.groupname = groupname;
  }

  public ModifyGroup description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ModifyGroup maxusers(Integer maxusers) {
    this.maxusers = maxusers;
    return this;
  }

   /**
   * Get maxusers
   * @return maxusers
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMaxusers() {
    return maxusers;
  }

  public void setMaxusers(Integer maxusers) {
    this.maxusers = maxusers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyGroup modifyGroup = (ModifyGroup) o;
    return Objects.equals(this.groupname, modifyGroup.groupname) &&
        Objects.equals(this.description, modifyGroup.description) &&
        Objects.equals(this.maxusers, modifyGroup.maxusers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupname, description, maxusers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyGroup {\n");
    
    sb.append("    groupname: ").append(toIndentedString(groupname)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    maxusers: ").append(toIndentedString(maxusers)).append("\n");
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

