package ru.yandex.messenger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Cursor
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-03T12:56:10.625Z[GMT]")


public class Cursor   {
  @JsonProperty("iterator")
  private String iterator = null;

  public Cursor iterator(String iterator) {
    this.iterator = iterator;
    return this;
  }

  /**
   * Get iterator
   * @return iterator
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getIterator() {
    return iterator;
  }

  public void setIterator(String iterator) {
    this.iterator = iterator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cursor cursor = (Cursor) o;
    return Objects.equals(this.iterator, cursor.iterator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iterator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cursor {\n");
    
    sb.append("    iterator: ").append(toIndentedString(iterator)).append("\n");
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
