package org.openapitools.model;

import org.openapitools.model.Animal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Cat extends Animal {
  
  @ApiModelProperty(value = "")
  private Boolean declawed;
 /**
  * Get declawed
  * @return declawed
  */
  @JsonProperty("declawed")
  public Boolean getDeclawed() {
    return declawed;
  }

  /**
   * Sets the <code>declawed</code> property.
   */
 public void setDeclawed(Boolean declawed) {
    this.declawed = declawed;
  }

  /**
   * Sets the <code>declawed</code> property.
   */
  public Cat declawed(Boolean declawed) {
    this.declawed = declawed;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cat cat = (Cat) o;
    return super.equals(o) && Objects.equals(declawed, cat.declawed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), declawed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cat {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    declawed: ").append(toIndentedString(declawed)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

