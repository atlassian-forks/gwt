/*
 * Copyright 2006 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.user.client.ui;

import java.util.EventListener;

/**
 * Event listener interface for mouse events.
 */
@Deprecated
public interface MouseListener extends EventListener {

  /**
   * Fired when the user depresses the mouse button over a widget.
   * 
   * @param sender the widget sending the event
   * @param x the x coordinate of the mouse
   * @param y the y coordinate of the mouse
   */
  void onMouseDown(Widget sender, int x, int y);

  /**
   * Fired when the mouse enters a widget's area.
   * 
   * @param sender the widget sending the event
   */
  void onMouseEnter(Widget sender);

  /**
   * Fired when the mouse leaves a widget's area.
   * 
   * @param sender the widget sending the event
   */
  void onMouseLeave(Widget sender);

  /**
   * Fired when the user moves the mouse over a widget.
   * 
   * @param sender the widget sending the event
   * @param x the x coordinate of the mouse
   * @param y the y coordinate of the mouse
   */
  void onMouseMove(Widget sender, int x, int y);

  /**
   * Fired when the user releases the mouse button over a widget.
   * 
   * @param sender the widget sending the event
   * @param x the x coordinate of the mouse
   * @param y the y coordinate of the mouse
   */
  void onMouseUp(Widget sender, int x, int y);
}
