package org.openapitools.model;

import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NumberOnly  {
  
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal justNumber;
 /**
  * Get justNumber
  * @return justNumber
  */
  @JsonProperty("JustNumber")
  public BigDecimal getJustNumber() {
    return justNumber;
  }

  /**
   * Sets the <code>justNumber</code> property.
   */
 public void setJustNumber(BigDecimal justNumber) {
    this.justNumber = justNumber;
  }

  /**
   * Sets the <code>justNumber</code> property.
   */
  public NumberOnly justNumber(BigDecimal justNumber) {
    this.justNumber = justNumber;
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
    NumberOnly numberOnly = (NumberOnly) o;
    return Objects.equals(justNumber, numberOnly.justNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(justNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberOnly {\n");
    
    sb.append("    justNumber: ").append(toIndentedString(justNumber)).append("\n");
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

