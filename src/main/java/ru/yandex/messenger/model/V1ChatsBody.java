package ru.yandex.messenger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * V1ChatsBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-03T12:56:10.625Z[GMT]")


public class V1ChatsBody   {
  @JsonProperty("chat_name")
  private String chatName = null;

  public V1ChatsBody chatName(String chatName) {
    this.chatName = chatName;
    return this;
  }

  /**
   * название для создаваемого чата
   * @return chatName
   **/
  @Schema(example = "новый чат", description = "название для создаваемого чата")
  
  @Size(max=255)   public String getChatName() {
    return chatName;
  }

  public void setChatName(String chatName) {
    this.chatName = chatName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ChatsBody v1ChatsBody = (V1ChatsBody) o;
    return Objects.equals(this.chatName, v1ChatsBody.chatName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chatName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ChatsBody {\n");
    
    sb.append("    chatName: ").append(toIndentedString(chatName)).append("\n");
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
