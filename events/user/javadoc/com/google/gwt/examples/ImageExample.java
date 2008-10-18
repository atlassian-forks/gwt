/*
 * Copyright 2007 Google Inc.
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
package com.google.gwt.examples;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LoadListener;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;

public class ImageExample implements EntryPoint {

  private Label lbl = new Label();
  private Button btn = new Button("Clip this image");
  private Button btn2 = new Button("Restore image");

  public void onModuleLoad() {
    // Create an image, not yet referencing a URL. We make it final so that we
    // can manipulate the image object within the ClickHandlers for the buttons.
    final Image image = new Image();

    // Hook up a load listener, so that we can be informed if the image fails
    // to load.
    image.addLoadListener(new LoadListener() {
      public void onError(Widget sender) {
        lbl.setText("An error occurred while loading.");
      }

      public void onLoad(Widget sender) {
      }
    });

    // Point the image at a real URL.
    image.setUrl("http://www.google.com/images/logo.gif");

    // When the user clicks this button, we want to clip the image.
    btn.addClickListener(new ClickListener() {
      public void onClick(Widget sender) {
        image.setVisibleRect(70, 0, 47, 110);
      }
    });
    btn.setWidth("120px");

    // When the user clicks this button, we want to restore the image to its
    // unclipped state.
    btn2.addClickListener(new ClickListener() {
      public void onClick(Widget sender) {
        image.setUrl("http://www.google.com/images/logo.gif");
      }
    });
    btn2.setWidth("120px");

    // Add the image, label, and clip/restore buttons to the root panel.
    VerticalPanel panel = new VerticalPanel();
    panel.add(lbl);
    panel.add(image);

    HorizontalPanel buttonPanel = new HorizontalPanel();
    buttonPanel.add(btn);
    buttonPanel.add(btn2);

    panel.add(buttonPanel);

    RootPanel.get().add(panel);
  }
}
