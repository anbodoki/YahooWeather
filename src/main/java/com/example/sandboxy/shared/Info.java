package com.example.sandboxy.shared;

import com.example.sandboxy.server.Weather;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * Created by anano.bodokia on 4/16/2015.
 */
@RemoteServiceRelativePath("info")
public interface Info extends RemoteService{
	public Weather start(String zip);
}
