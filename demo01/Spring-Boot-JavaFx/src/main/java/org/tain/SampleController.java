package org.tain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import javafx.fxml.FXML;
import javafx.scene.web.WebView;

@Controller
public class SampleController {

	@FXML
	private WebView myWebView;
	
	@Value("${my.url}")
	private String myUrl;
	
	@FXML
	private void initialize() {
		myWebView.getEngine().load(myUrl);
	}
}
