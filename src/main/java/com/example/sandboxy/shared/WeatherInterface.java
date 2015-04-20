package com.example.sandboxy.shared;

import com.example.sandboxy.server.Weather;
import com.google.gwt.editor.client.Editor;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;

/**
 * Created by anano.bodokia on 4/16/2015.
 */
public interface WeatherInterface extends PropertyAccess<Weather>{
	@Editor.Path("id")
	ModelKeyProvider<Weather> key();
	ValueProvider<Weather, String> country();
	ValueProvider<Weather, String> region();
	ValueProvider<Weather, String> city();
	ValueProvider<Weather, String> condition();
	ValueProvider<Weather, String> temp();
	ValueProvider<Weather, String> chill();
	ValueProvider<Weather, String> humidity();
}
