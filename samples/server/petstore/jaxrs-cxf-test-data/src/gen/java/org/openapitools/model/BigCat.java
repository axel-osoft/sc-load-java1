package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Cat;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BigCat extends Cat {
  
public enum KindEnum {

    @JsonProperty("lions") LIONS(String.valueOf("lions")),
    @JsonProperty("tigers") TIGERS(String.valueOf("tigers")),
    @JsonProperty("leopards") LEOPARDS(String.valueOf("leopards")),
    @JsonProperty("jaguars") JAGUARS(String.valueOf("jaguars"));

    private String value;

    KindEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static KindEnum fromValue(String value) {
        for (KindEnum b : KindEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")
  private KindEnum kind;
 /**
  * Get kind
  * @return kind
  */
  @JsonProperty("kind")
  public String getKind() {
    return kind == null ? null : kind.value();
  }

  /**
   * Sets the <code>kind</code> property.
   */
 public void setKind(KindEnum kind) {
    this.kind = kind;
  }

  /**
   * Sets the <code>kind</code> property.
   */
  public BigCat kind(KindEnum kind) {
    this.kind = kind;
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
    BigCat bigCat = (BigCat) o;
    return super.equals(o) && Objects.equals(kind, bigCat.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), kind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BigCat {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

