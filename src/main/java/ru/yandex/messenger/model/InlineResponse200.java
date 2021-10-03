package ru.yandex.messenger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-03T12:56:10.625Z[GMT]")


public class InlineResponse200   {
  @JsonProperty("messages")
  @Valid
  private List<Message> messages = new ArrayList<Message>();

  @JsonProperty("next")
  private Cursor next = null;

  public InlineResponse200 messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public InlineResponse200 addMessagesItem(Message messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * Get messages
   * @return messages
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<Message> getMessages() {
    return messages;
  }

  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }

  public InlineResponse200 next(Cursor next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
   **/
  @Schema(description = "")
  
    @Valid
    public Cursor getNext() {
    return next;
  }

  public void setNext(Cursor next) {
    this.next = next;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.messages, inlineResponse200.messages) &&
        Objects.equals(this.next, inlineResponse200.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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
