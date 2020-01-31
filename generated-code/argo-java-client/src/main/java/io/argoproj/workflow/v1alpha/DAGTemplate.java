/*
 * Argo
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2.5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.v1alpha;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.v1alpha.DAGTask;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DAGTemplate is a template subtype for directed acyclic graph templates
 */
@ApiModel(description = "DAGTemplate is a template subtype for directed acyclic graph templates")
@javax.annotation.Generated(value = "io.argoproj.workflow.codegen.ArgoprojJavaClientOpenapiCodeGenerator", date = "2020-01-30T23:33:15.337Z[GMT]")
public class DAGTemplate {
  public static final String SERIALIZED_NAME_FAIL_FAST = "failFast";
  @SerializedName(SERIALIZED_NAME_FAIL_FAST)
  private Boolean failFast;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public static final String SERIALIZED_NAME_TASKS = "tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private List<DAGTask> tasks = new ArrayList<DAGTask>();


  public DAGTemplate failFast(Boolean failFast) {
    
    this.failFast = failFast;
    return this;
  }

   /**
   * This flag is for DAG logic. The DAG logic has a built-in \&quot;fail fast\&quot; feature to stop scheduling new steps, as soon as it detects that one of the DAG nodes is failed. Then it waits until all DAG nodes are completed before failing the DAG itself. The FailFast flag default is true,  if set to false, it will allow a DAG to run all branches of the DAG to completion (either success or failure), regardless of the failed outcomes of branches in the DAG. More info and example about this feature at https://github.com/argoproj/argo/issues/1442
   * @return failFast
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This flag is for DAG logic. The DAG logic has a built-in \"fail fast\" feature to stop scheduling new steps, as soon as it detects that one of the DAG nodes is failed. Then it waits until all DAG nodes are completed before failing the DAG itself. The FailFast flag default is true,  if set to false, it will allow a DAG to run all branches of the DAG to completion (either success or failure), regardless of the failed outcomes of branches in the DAG. More info and example about this feature at https://github.com/argoproj/argo/issues/1442")

  public Boolean getFailFast() {
    return failFast;
  }


  public void setFailFast(Boolean failFast) {
    this.failFast = failFast;
  }


  public DAGTemplate target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * Target are one or more names of targets to execute in a DAG
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target are one or more names of targets to execute in a DAG")

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public DAGTemplate tasks(List<DAGTask> tasks) {
    
    this.tasks = tasks;
    return this;
  }

  public DAGTemplate addTasksItem(DAGTask tasksItem) {
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * Tasks are a list of DAG tasks
   * @return tasks
  **/
  @ApiModelProperty(required = true, value = "Tasks are a list of DAG tasks")

  public List<DAGTask> getTasks() {
    return tasks;
  }


  public void setTasks(List<DAGTask> tasks) {
    this.tasks = tasks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DAGTemplate ioArgoprojWorkflowV1alpha1DAGTemplate = (DAGTemplate) o;
    return Objects.equals(this.failFast, ioArgoprojWorkflowV1alpha1DAGTemplate.failFast) &&
        Objects.equals(this.target, ioArgoprojWorkflowV1alpha1DAGTemplate.target) &&
        Objects.equals(this.tasks, ioArgoprojWorkflowV1alpha1DAGTemplate.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failFast, target, tasks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DAGTemplate {\n");
    sb.append("    failFast: ").append(toIndentedString(failFast)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
