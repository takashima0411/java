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
import io.kubernetes.client.models.V1beta1AllowedHostPath;
import io.kubernetes.client.models.V1beta1FSGroupStrategyOptions;
import io.kubernetes.client.models.V1beta1HostPortRange;
import io.kubernetes.client.models.V1beta1RunAsUserStrategyOptions;
import io.kubernetes.client.models.V1beta1SELinuxStrategyOptions;
import io.kubernetes.client.models.V1beta1SupplementalGroupsStrategyOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Pod Security Policy Spec defines the policy enforced.
 */
@ApiModel(description = "Pod Security Policy Spec defines the policy enforced.")

public class V1beta1PodSecurityPolicySpec {
  @SerializedName("allowPrivilegeEscalation")
  private Boolean allowPrivilegeEscalation = null;

  @SerializedName("allowedCapabilities")
  private List<String> allowedCapabilities = null;

  @SerializedName("allowedHostPaths")
  private List<V1beta1AllowedHostPath> allowedHostPaths = null;

  @SerializedName("defaultAddCapabilities")
  private List<String> defaultAddCapabilities = null;

  @SerializedName("defaultAllowPrivilegeEscalation")
  private Boolean defaultAllowPrivilegeEscalation = null;

  @SerializedName("fsGroup")
  private V1beta1FSGroupStrategyOptions fsGroup = null;

  @SerializedName("hostIPC")
  private Boolean hostIPC = null;

  @SerializedName("hostNetwork")
  private Boolean hostNetwork = null;

  @SerializedName("hostPID")
  private Boolean hostPID = null;

  @SerializedName("hostPorts")
  private List<V1beta1HostPortRange> hostPorts = null;

  @SerializedName("privileged")
  private Boolean privileged = null;

  @SerializedName("readOnlyRootFilesystem")
  private Boolean readOnlyRootFilesystem = null;

  @SerializedName("requiredDropCapabilities")
  private List<String> requiredDropCapabilities = null;

  @SerializedName("runAsUser")
  private V1beta1RunAsUserStrategyOptions runAsUser = null;

  @SerializedName("seLinux")
  private V1beta1SELinuxStrategyOptions seLinux = null;

  @SerializedName("supplementalGroups")
  private V1beta1SupplementalGroupsStrategyOptions supplementalGroups = null;

  @SerializedName("volumes")
  private List<String> volumes = null;

  public V1beta1PodSecurityPolicySpec allowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    return this;
  }

   /**
   * AllowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to true.
   * @return allowPrivilegeEscalation
  **/
  @ApiModelProperty(value = "AllowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to true.")
  public Boolean isAllowPrivilegeEscalation() {
    return allowPrivilegeEscalation;
  }

  public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
  }

  public V1beta1PodSecurityPolicySpec allowedCapabilities(List<String> allowedCapabilities) {
    this.allowedCapabilities = allowedCapabilities;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addAllowedCapabilitiesItem(String allowedCapabilitiesItem) {
    if (this.allowedCapabilities == null) {
      this.allowedCapabilities = new ArrayList<String>();
    }
    this.allowedCapabilities.add(allowedCapabilitiesItem);
    return this;
  }

   /**
   * AllowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field may be added at the pod author&#39;s discretion. You must not list a capability in both AllowedCapabilities and RequiredDropCapabilities.
   * @return allowedCapabilities
  **/
  @ApiModelProperty(value = "AllowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field may be added at the pod author's discretion. You must not list a capability in both AllowedCapabilities and RequiredDropCapabilities.")
  public List<String> getAllowedCapabilities() {
    return allowedCapabilities;
  }

  public void setAllowedCapabilities(List<String> allowedCapabilities) {
    this.allowedCapabilities = allowedCapabilities;
  }

  public V1beta1PodSecurityPolicySpec allowedHostPaths(List<V1beta1AllowedHostPath> allowedHostPaths) {
    this.allowedHostPaths = allowedHostPaths;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addAllowedHostPathsItem(V1beta1AllowedHostPath allowedHostPathsItem) {
    if (this.allowedHostPaths == null) {
      this.allowedHostPaths = new ArrayList<V1beta1AllowedHostPath>();
    }
    this.allowedHostPaths.add(allowedHostPathsItem);
    return this;
  }

   /**
   * is a white list of allowed host paths. Empty indicates that all host paths may be used.
   * @return allowedHostPaths
  **/
  @ApiModelProperty(value = "is a white list of allowed host paths. Empty indicates that all host paths may be used.")
  public List<V1beta1AllowedHostPath> getAllowedHostPaths() {
    return allowedHostPaths;
  }

  public void setAllowedHostPaths(List<V1beta1AllowedHostPath> allowedHostPaths) {
    this.allowedHostPaths = allowedHostPaths;
  }

  public V1beta1PodSecurityPolicySpec defaultAddCapabilities(List<String> defaultAddCapabilities) {
    this.defaultAddCapabilities = defaultAddCapabilities;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addDefaultAddCapabilitiesItem(String defaultAddCapabilitiesItem) {
    if (this.defaultAddCapabilities == null) {
      this.defaultAddCapabilities = new ArrayList<String>();
    }
    this.defaultAddCapabilities.add(defaultAddCapabilitiesItem);
    return this;
  }

   /**
   * DefaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capabiility in both DefaultAddCapabilities and RequiredDropCapabilities.
   * @return defaultAddCapabilities
  **/
  @ApiModelProperty(value = "DefaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capabiility in both DefaultAddCapabilities and RequiredDropCapabilities.")
  public List<String> getDefaultAddCapabilities() {
    return defaultAddCapabilities;
  }

  public void setDefaultAddCapabilities(List<String> defaultAddCapabilities) {
    this.defaultAddCapabilities = defaultAddCapabilities;
  }

  public V1beta1PodSecurityPolicySpec defaultAllowPrivilegeEscalation(Boolean defaultAllowPrivilegeEscalation) {
    this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
    return this;
  }

   /**
   * DefaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process.
   * @return defaultAllowPrivilegeEscalation
  **/
  @ApiModelProperty(value = "DefaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process.")
  public Boolean isDefaultAllowPrivilegeEscalation() {
    return defaultAllowPrivilegeEscalation;
  }

  public void setDefaultAllowPrivilegeEscalation(Boolean defaultAllowPrivilegeEscalation) {
    this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
  }

  public V1beta1PodSecurityPolicySpec fsGroup(V1beta1FSGroupStrategyOptions fsGroup) {
    this.fsGroup = fsGroup;
    return this;
  }

   /**
   * FSGroup is the strategy that will dictate what fs group is used by the SecurityContext.
   * @return fsGroup
  **/
  @ApiModelProperty(required = true, value = "FSGroup is the strategy that will dictate what fs group is used by the SecurityContext.")
  public V1beta1FSGroupStrategyOptions getFsGroup() {
    return fsGroup;
  }

  public void setFsGroup(V1beta1FSGroupStrategyOptions fsGroup) {
    this.fsGroup = fsGroup;
  }

  public V1beta1PodSecurityPolicySpec hostIPC(Boolean hostIPC) {
    this.hostIPC = hostIPC;
    return this;
  }

   /**
   * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
   * @return hostIPC
  **/
  @ApiModelProperty(value = "hostIPC determines if the policy allows the use of HostIPC in the pod spec.")
  public Boolean isHostIPC() {
    return hostIPC;
  }

  public void setHostIPC(Boolean hostIPC) {
    this.hostIPC = hostIPC;
  }

  public V1beta1PodSecurityPolicySpec hostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
    return this;
  }

   /**
   * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
   * @return hostNetwork
  **/
  @ApiModelProperty(value = "hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.")
  public Boolean isHostNetwork() {
    return hostNetwork;
  }

  public void setHostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
  }

  public V1beta1PodSecurityPolicySpec hostPID(Boolean hostPID) {
    this.hostPID = hostPID;
    return this;
  }

   /**
   * hostPID determines if the policy allows the use of HostPID in the pod spec.
   * @return hostPID
  **/
  @ApiModelProperty(value = "hostPID determines if the policy allows the use of HostPID in the pod spec.")
  public Boolean isHostPID() {
    return hostPID;
  }

  public void setHostPID(Boolean hostPID) {
    this.hostPID = hostPID;
  }

  public V1beta1PodSecurityPolicySpec hostPorts(List<V1beta1HostPortRange> hostPorts) {
    this.hostPorts = hostPorts;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addHostPortsItem(V1beta1HostPortRange hostPortsItem) {
    if (this.hostPorts == null) {
      this.hostPorts = new ArrayList<V1beta1HostPortRange>();
    }
    this.hostPorts.add(hostPortsItem);
    return this;
  }

   /**
   * hostPorts determines which host port ranges are allowed to be exposed.
   * @return hostPorts
  **/
  @ApiModelProperty(value = "hostPorts determines which host port ranges are allowed to be exposed.")
  public List<V1beta1HostPortRange> getHostPorts() {
    return hostPorts;
  }

  public void setHostPorts(List<V1beta1HostPortRange> hostPorts) {
    this.hostPorts = hostPorts;
  }

  public V1beta1PodSecurityPolicySpec privileged(Boolean privileged) {
    this.privileged = privileged;
    return this;
  }

   /**
   * privileged determines if a pod can request to be run as privileged.
   * @return privileged
  **/
  @ApiModelProperty(value = "privileged determines if a pod can request to be run as privileged.")
  public Boolean isPrivileged() {
    return privileged;
  }

  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }

  public V1beta1PodSecurityPolicySpec readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    return this;
  }

   /**
   * ReadOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to.
   * @return readOnlyRootFilesystem
  **/
  @ApiModelProperty(value = "ReadOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to.")
  public Boolean isReadOnlyRootFilesystem() {
    return readOnlyRootFilesystem;
  }

  public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
  }

  public V1beta1PodSecurityPolicySpec requiredDropCapabilities(List<String> requiredDropCapabilities) {
    this.requiredDropCapabilities = requiredDropCapabilities;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addRequiredDropCapabilitiesItem(String requiredDropCapabilitiesItem) {
    if (this.requiredDropCapabilities == null) {
      this.requiredDropCapabilities = new ArrayList<String>();
    }
    this.requiredDropCapabilities.add(requiredDropCapabilitiesItem);
    return this;
  }

   /**
   * RequiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added.
   * @return requiredDropCapabilities
  **/
  @ApiModelProperty(value = "RequiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added.")
  public List<String> getRequiredDropCapabilities() {
    return requiredDropCapabilities;
  }

  public void setRequiredDropCapabilities(List<String> requiredDropCapabilities) {
    this.requiredDropCapabilities = requiredDropCapabilities;
  }

  public V1beta1PodSecurityPolicySpec runAsUser(V1beta1RunAsUserStrategyOptions runAsUser) {
    this.runAsUser = runAsUser;
    return this;
  }

   /**
   * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
   * @return runAsUser
  **/
  @ApiModelProperty(required = true, value = "runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.")
  public V1beta1RunAsUserStrategyOptions getRunAsUser() {
    return runAsUser;
  }

  public void setRunAsUser(V1beta1RunAsUserStrategyOptions runAsUser) {
    this.runAsUser = runAsUser;
  }

  public V1beta1PodSecurityPolicySpec seLinux(V1beta1SELinuxStrategyOptions seLinux) {
    this.seLinux = seLinux;
    return this;
  }

   /**
   * seLinux is the strategy that will dictate the allowable labels that may be set.
   * @return seLinux
  **/
  @ApiModelProperty(required = true, value = "seLinux is the strategy that will dictate the allowable labels that may be set.")
  public V1beta1SELinuxStrategyOptions getSeLinux() {
    return seLinux;
  }

  public void setSeLinux(V1beta1SELinuxStrategyOptions seLinux) {
    this.seLinux = seLinux;
  }

  public V1beta1PodSecurityPolicySpec supplementalGroups(V1beta1SupplementalGroupsStrategyOptions supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
    return this;
  }

   /**
   * SupplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
   * @return supplementalGroups
  **/
  @ApiModelProperty(required = true, value = "SupplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.")
  public V1beta1SupplementalGroupsStrategyOptions getSupplementalGroups() {
    return supplementalGroups;
  }

  public void setSupplementalGroups(V1beta1SupplementalGroupsStrategyOptions supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
  }

  public V1beta1PodSecurityPolicySpec volumes(List<String> volumes) {
    this.volumes = volumes;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addVolumesItem(String volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<String>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * volumes is a white list of allowed volume plugins.  Empty indicates that all plugins may be used.
   * @return volumes
  **/
  @ApiModelProperty(value = "volumes is a white list of allowed volume plugins.  Empty indicates that all plugins may be used.")
  public List<String> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<String> volumes) {
    this.volumes = volumes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1PodSecurityPolicySpec v1beta1PodSecurityPolicySpec = (V1beta1PodSecurityPolicySpec) o;
    return Objects.equals(this.allowPrivilegeEscalation, v1beta1PodSecurityPolicySpec.allowPrivilegeEscalation) &&
        Objects.equals(this.allowedCapabilities, v1beta1PodSecurityPolicySpec.allowedCapabilities) &&
        Objects.equals(this.allowedHostPaths, v1beta1PodSecurityPolicySpec.allowedHostPaths) &&
        Objects.equals(this.defaultAddCapabilities, v1beta1PodSecurityPolicySpec.defaultAddCapabilities) &&
        Objects.equals(this.defaultAllowPrivilegeEscalation, v1beta1PodSecurityPolicySpec.defaultAllowPrivilegeEscalation) &&
        Objects.equals(this.fsGroup, v1beta1PodSecurityPolicySpec.fsGroup) &&
        Objects.equals(this.hostIPC, v1beta1PodSecurityPolicySpec.hostIPC) &&
        Objects.equals(this.hostNetwork, v1beta1PodSecurityPolicySpec.hostNetwork) &&
        Objects.equals(this.hostPID, v1beta1PodSecurityPolicySpec.hostPID) &&
        Objects.equals(this.hostPorts, v1beta1PodSecurityPolicySpec.hostPorts) &&
        Objects.equals(this.privileged, v1beta1PodSecurityPolicySpec.privileged) &&
        Objects.equals(this.readOnlyRootFilesystem, v1beta1PodSecurityPolicySpec.readOnlyRootFilesystem) &&
        Objects.equals(this.requiredDropCapabilities, v1beta1PodSecurityPolicySpec.requiredDropCapabilities) &&
        Objects.equals(this.runAsUser, v1beta1PodSecurityPolicySpec.runAsUser) &&
        Objects.equals(this.seLinux, v1beta1PodSecurityPolicySpec.seLinux) &&
        Objects.equals(this.supplementalGroups, v1beta1PodSecurityPolicySpec.supplementalGroups) &&
        Objects.equals(this.volumes, v1beta1PodSecurityPolicySpec.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowPrivilegeEscalation, allowedCapabilities, allowedHostPaths, defaultAddCapabilities, defaultAllowPrivilegeEscalation, fsGroup, hostIPC, hostNetwork, hostPID, hostPorts, privileged, readOnlyRootFilesystem, requiredDropCapabilities, runAsUser, seLinux, supplementalGroups, volumes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1PodSecurityPolicySpec {\n");
    
    sb.append("    allowPrivilegeEscalation: ").append(toIndentedString(allowPrivilegeEscalation)).append("\n");
    sb.append("    allowedCapabilities: ").append(toIndentedString(allowedCapabilities)).append("\n");
    sb.append("    allowedHostPaths: ").append(toIndentedString(allowedHostPaths)).append("\n");
    sb.append("    defaultAddCapabilities: ").append(toIndentedString(defaultAddCapabilities)).append("\n");
    sb.append("    defaultAllowPrivilegeEscalation: ").append(toIndentedString(defaultAllowPrivilegeEscalation)).append("\n");
    sb.append("    fsGroup: ").append(toIndentedString(fsGroup)).append("\n");
    sb.append("    hostIPC: ").append(toIndentedString(hostIPC)).append("\n");
    sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
    sb.append("    hostPID: ").append(toIndentedString(hostPID)).append("\n");
    sb.append("    hostPorts: ").append(toIndentedString(hostPorts)).append("\n");
    sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
    sb.append("    readOnlyRootFilesystem: ").append(toIndentedString(readOnlyRootFilesystem)).append("\n");
    sb.append("    requiredDropCapabilities: ").append(toIndentedString(requiredDropCapabilities)).append("\n");
    sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
    sb.append("    seLinux: ").append(toIndentedString(seLinux)).append("\n");
    sb.append("    supplementalGroups: ").append(toIndentedString(supplementalGroups)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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

