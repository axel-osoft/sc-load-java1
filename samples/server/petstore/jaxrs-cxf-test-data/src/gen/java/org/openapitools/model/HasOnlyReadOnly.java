package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class HasOnlyReadOnly  {
  
  @ApiModelProperty(value = "")
  private String bar;

  @ApiModelProperty(value = "")
  private String foo;
 /**
  * Get bar
  * @return bar
  */
  @JsonProperty("bar")
  public String getBar() {
    return bar;
  }

  /**
   * Sets the <code>bar</code> property.
   * <br><em>N.B. <code>bar</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setBar(String bar) {
    this.bar = bar;
  }

  /**
   * Sets the <code>bar</code> property.
   * <br><em>N.B. <code>bar</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public HasOnlyReadOnly bar(String bar) {
    this.bar = bar;
    return this;
  }

 /**
  * Get foo
  * @return foo
  */
  @JsonProperty("foo")
  public String getFoo() {
    return foo;
  }

  /**
   * Sets the <code>foo</code> property.
   * <br><em>N.B. <code>foo</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setFoo(String foo) {
    this.foo = foo;
  }

  /**
   * Sets the <code>foo</code> property.
   * <br><em>N.B. <code>foo</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public HasOnlyReadOnly foo(String foo) {
    this.foo = foo;
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
    HasOnlyReadOnly hasOnlyReadOnly = (HasOnlyReadOnly) o;
    return Objects.equals(bar, hasOnlyReadOnly.bar) &&
        Objects.equals(foo, hasOnlyReadOnly.foo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bar, foo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HasOnlyReadOnly {\n");
    
    sb.append("    bar: ").append(toIndentedString(bar)).append("\n");
    sb.append("    foo: ").append(toIndentedString(foo)).append("\n");
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

