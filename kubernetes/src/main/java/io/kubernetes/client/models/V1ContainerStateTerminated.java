/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * ContainerStateTerminated is a terminated state of a container.
 */
@ApiModel(description = "ContainerStateTerminated is a terminated state of a container.")

public class V1ContainerStateTerminated {
  @SerializedName("containerID")
  private String containerID = null;

  @SerializedName("exitCode")
  private Integer exitCode = null;

  @SerializedName("finishedAt")
  private DateTime finishedAt = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("signal")
  private Integer signal = null;

  @SerializedName("startedAt")
  private DateTime startedAt = null;

  public V1ContainerStateTerminated containerID(String containerID) {
    this.containerID = containerID;
    return this;
  }

   /**
   * Container&#39;s ID in the format &#39;docker://&lt;container_id&gt;&#39;
   * @return containerID
  **/
  @ApiModelProperty(value = "Container's ID in the format 'docker://<container_id>'")
  public String getContainerID() {
    return containerID;
  }

  public void setContainerID(String containerID) {
    this.containerID = containerID;
  }

  public V1ContainerStateTerminated exitCode(Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }

   /**
   * Exit status from the last termination of the container
   * @return exitCode
  **/
  @ApiModelProperty(required = true, value = "Exit status from the last termination of the container")
  public Integer getExitCode() {
    return exitCode;
  }

  public void setExitCode(Integer exitCode) {
    this.exitCode = exitCode;
  }

  public V1ContainerStateTerminated finishedAt(DateTime finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

   /**
   * Time at which the container last terminated
   * @return finishedAt
  **/
  @ApiModelProperty(value = "Time at which the container last terminated")
  public DateTime getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(DateTime finishedAt) {
    this.finishedAt = finishedAt;
  }

  public V1ContainerStateTerminated message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Message regarding the last termination of the container
   * @return message
  **/
  @ApiModelProperty(value = "Message regarding the last termination of the container")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1ContainerStateTerminated reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * (brief) reason from the last termination of the container
   * @return reason
  **/
  @ApiModelProperty(value = "(brief) reason from the last termination of the container")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1ContainerStateTerminated signal(Integer signal) {
    this.signal = signal;
    return this;
  }

   /**
   * Signal from the last termination of the container
   * @return signal
  **/
  @ApiModelProperty(value = "Signal from the last termination of the container")
  public Integer getSignal() {
    return signal;
  }

  public void setSignal(Integer signal) {
    this.signal = signal;
  }

  public V1ContainerStateTerminated startedAt(DateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Time at which previous execution of the container started
   * @return startedAt
  **/
  @ApiModelProperty(value = "Time at which previous execution of the container started")
  public DateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(DateTime startedAt) {
    this.startedAt = startedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerStateTerminated v1ContainerStateTerminated = (V1ContainerStateTerminated) o;
    return Objects.equals(this.containerID, v1ContainerStateTerminated.containerID) &&
        Objects.equals(this.exitCode, v1ContainerStateTerminated.exitCode) &&
        Objects.equals(this.finishedAt, v1ContainerStateTerminated.finishedAt) &&
        Objects.equals(this.message, v1ContainerStateTerminated.message) &&
        Objects.equals(this.reason, v1ContainerStateTerminated.reason) &&
        Objects.equals(this.signal, v1ContainerStateTerminated.signal) &&
        Objects.equals(this.startedAt, v1ContainerStateTerminated.startedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerID, exitCode, finishedAt, message, reason, signal, startedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerStateTerminated {\n");
    
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    signal: ").append(toIndentedString(signal)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
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

