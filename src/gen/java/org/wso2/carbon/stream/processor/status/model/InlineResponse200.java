package org.wso2.carbon.stream.processor.status.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModelProperty;


/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "org.wso2.carbon.stream.processor.status.codegen.languages.JavaMSF4JServerCodegen", date = "2017-08-14T13:04:51.561Z")
public class InlineResponse200   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("is-active")
  private String isActive = null;

  @JsonProperty("is-sync")
  private Boolean isSync = null;

  @JsonProperty("snaptime")
  private String snaptime = null;

  public InlineResponse200 id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of the worker
   * @return id
  **/
  @ApiModelProperty(value = "Id of the worker")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse200 isActive(String isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Status of theworker
   * @return isActive
  **/
  @ApiModelProperty(value = "Status of theworker")
  public String getIsActive() {
    return isActive;
  }

  public void setIsActive(String isActive) {
    this.isActive = isActive;
  }

  public InlineResponse200 isSync(Boolean isSync) {
    this.isSync = isSync;
    return this;
  }

   /**
   * is Sync if passive
   * @return isSync
  **/
  @ApiModelProperty(value = "is Sync if passive")
  public Boolean getIsSync() {
    return isSync;
  }

  public void setIsSync(Boolean isSync) {
    this.isSync = isSync;
  }

  public InlineResponse200 snaptime(String snaptime) {
    this.snaptime = snaptime;
    return this;
  }

   /**
   * last snapshot details
   * @return snaptime
  **/
  @ApiModelProperty(value = "last snapshot details")
  public String getSnaptime() {
    return snaptime;
  }

  public void setSnaptime(String snaptime) {
    this.snaptime = snaptime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.id, inlineResponse200.id) &&
        Objects.equals(this.isActive, inlineResponse200.isActive) &&
        Objects.equals(this.isSync, inlineResponse200.isSync) &&
        Objects.equals(this.snaptime, inlineResponse200.snaptime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isActive, isSync, snaptime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isSync: ").append(toIndentedString(isSync)).append("\n");
    sb.append("    snaptime: ").append(toIndentedString(snaptime)).append("\n");
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

