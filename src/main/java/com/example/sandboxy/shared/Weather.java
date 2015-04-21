package com.example.sandboxy.shared;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * Created by anano.bodokia on 4/21/2015.
 */

@RemoteServiceRelativePath("weather")
public interface Weather extends RemoteService{
	@Override
	public String toString();
}
