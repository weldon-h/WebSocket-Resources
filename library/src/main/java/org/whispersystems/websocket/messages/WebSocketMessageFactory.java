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


import java.util.List;
import java.util.Optional;

@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
public interface WebSocketMessageFactory {

  /**
   * 解析message
   * @param serialized
   * @param offset
   * @param len
   * @return
   * @throws InvalidMessageException
   */
  public WebSocketMessage parseMessage(byte[] serialized, int offset, int len)
      throws InvalidMessageException;

  /**
   * 构建request消息
   * @param requestId
   * @param verb
   * @param path
   * @param headers
   * @param body
   * @return
   */
  public WebSocketMessage createRequest(Optional<Long> requestId,
                                        String verb, String path,
                                        List<String> headers,
                                        Optional<byte[]> body);

  /**
   * 构建respnse消息
   * @param requestId
   * @param status
   * @param message
   * @param headers
   * @param body
   * @return
   */
  public WebSocketMessage createResponse(long requestId, int status, String message,
                                         List<String> headers,
                                         Optional<byte[]> body);

}
