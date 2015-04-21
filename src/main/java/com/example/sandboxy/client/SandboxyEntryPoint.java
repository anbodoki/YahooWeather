package com.example.sandboxy.client;

import com.example.sandboxy.server.Weather;
import com.example.sandboxy.shared.InfoAsync;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;
import com.sencha.gxt.core.client.GXT;
import com.sencha.gxt.widget.core.client.box.MessageBox;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class SandboxyEntryPoint implements  EntryPoint {

  //interface MyUiBinder extends UiBinder<ContentPanel, SandboxyEntryPoint> {}

 // private static final WeatherInterface w = GWT.create(WeatherInterface.class);


  @Override
  public void onModuleLoad() {
    String version = GXT.getVersion().getRelease();


    TextButton btn = new TextButton("Show");
    btn.setWidth(50);
    final TextBox input = new TextBox();
    Label welcome = new Label("Please enter the zipcode to get Weather info");

    final VerticalPanel vpanel = new VerticalPanel();
    vpanel.setSpacing(5);

    RootPanel.get().add(vpanel);

    vpanel.setHeight("100%");
    vpanel.setWidth("100%");
    vpanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
    vpanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);

    vpanel.add(welcome);
    vpanel.add(input);
    vpanel.add(btn);
    btn.addSelectHandler(new SelectHandler() {
      @Override
      public void onSelect(SelectEvent event) {
        InfoAsync info = GWT.create(com.example.sandboxy.shared.Info.class);
        //final DBManagerAsync man = GWT.create(DBManager.class);
        try {
            String zip = input.getText();
            info.start(zip, new AsyncCallback<Weather>() {
            @Override
            public void onFailure(Throwable throwable) {
              GWT.log("ERROR");
            }

            @Override
            public void onSuccess(Weather w) {
              MessageBox msg = new MessageBox("Information");
              msg.setMessage("got");
              msg.show();
              input.setText("");
              /*
              man.insertRow(s, new AsyncCallback<Void>() {
                @Override
                public void onFailure(Throwable throwable) {

                }

                @Override
                public void onSuccess(Void aVoid) {

                }
              });
              */
            }
          });
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /*
  @Override
  public Widget asWidget() {

    if(panel ==null) {
      ColumnConfig<Weather, String> countryCol= new ColumnConfig<Weather, String>(w.country(), 200, "Country");
      ColumnConfig<Weather, String> regionCol = new ColumnConfig<Weather, String>(w.region(), 100, "Region");
      ColumnConfig<Weather, String> cityCol = new ColumnConfig<Weather, String>(w.city(), 75, "City");
      ColumnConfig<Weather, String> conditionCol = new ColumnConfig<Weather, String>(w.condition(), 100, "Condition");
      ColumnConfig<Weather, String> tempCol = new ColumnConfig<Weather, String>(w.temp(), 100, "Temperature");
      ColumnConfig<Weather, String> chillCol = new ColumnConfig<Weather, String>(w.chill(), 75, "Chill");
      ColumnConfig<Weather, String> humidityCol = new ColumnConfig<Weather, String>(w.humidity(), 75, "Humidity");

      List<ColumnConfig<Weather, ?>> columns = new ArrayList<ColumnConfig<Weather, ?>>();
      columns.add(countryCol);
      columns.add(regionCol);
      columns.add(cityCol);
      columns.add(conditionCol);
      columns.add(tempCol);
      columns.add(chillCol);
      columns.add(humidityCol);

      ColumnModel<Weather> cm = new ColumnModel<Weather>(columns);

      ListStore<Weather> store = new ListStore<Weather>(w.key());
    }
    return panel;
  }
  */
}
