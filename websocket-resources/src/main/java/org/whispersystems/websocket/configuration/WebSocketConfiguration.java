package org.whispersystems.websocket.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.whispersystems.websocket.logging.WebsocketRequestLoggerFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class WebSocketConfiguration {

  @Valid
  @NotNull
  @JsonProperty
  private WebsocketRequestLoggerFactory requestLog = new WebsocketRequestLoggerFactory();

  public WebsocketRequestLoggerFactory getRequestLog() {
    return requestLog;
  }
}
