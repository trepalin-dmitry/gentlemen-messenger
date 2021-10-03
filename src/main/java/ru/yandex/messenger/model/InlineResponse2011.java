package ru.yandex.messenger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * InlineResponse2011
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-03T12:56:10.625Z[GMT]")


public class InlineResponse2011   {
  @JsonProperty("user_id")
  private String userId = null;

  public InlineResponse2011 userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * id пользователя user_name в чате chat_id, уникальный в рамках этого чата
   * @return userId
   **/
  @Schema(required = true, description = "id пользователя user_name в чате chat_id, уникальный в рамках этого чата")
      @NotNull

    public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2011 inlineResponse2011 = (InlineResponse2011) o;
    return Objects.equals(this.userId, inlineResponse2011.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2011 {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
