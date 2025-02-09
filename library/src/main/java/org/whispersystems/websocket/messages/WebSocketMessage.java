/**
 * Copyright (C) 2014 Open WhisperSystems
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.whispersystems.websocket.messages;

public interface WebSocketMessage {

  public enum Type {
    UNKNOWN_MESSAGE,
    REQUEST_MESSAGE,
    RESPONSE_MESSAGE
  }

  /**
   * 消息类型
   * @return
   */
  public Type                     getType();

  /**
   * request message
   * @return
   */
  public WebSocketRequestMessage  getRequestMessage();

  /**
   * response message
   * @return
   */
  public WebSocketResponseMessage getResponseMessage();

  /**
   * 把消息序列化成字节数组
   * @return
   */
  public byte[]                   toByteArray();

}
