package ru.yandex.messenger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * InlineResponse201
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-03T12:56:10.625Z[GMT]")


public class InlineResponse201   {
  @JsonProperty("chat_id")
  private String chatId = null;

  public InlineResponse201 chatId(String chatId) {
    this.chatId = chatId;
    return this;
  }

  /**
   * id созданного чата
   * @return chatId
   **/
  @Schema(required = true, description = "id созданного чата")
      @NotNull

    public String getChatId() {
    return chatId;
  }

  public void setChatId(String chatId) {
    this.chatId = chatId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse201 inlineResponse201 = (InlineResponse201) o;
    return Objects.equals(this.chatId, inlineResponse201.chatId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chatId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201 {\n");
    
    sb.append("    chatId: ").append(toIndentedString(chatId)).append("\n");
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
