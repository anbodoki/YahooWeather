package com.example.sandboxy.server;

import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * Created by anano.bodokia on 4/16/2015.
 */
@RemoteServiceRelativePath("info")
public class InfoImpl extends RemoteServiceServlet implements com.example.sandboxy.shared.Info {
	@Override
	public Weather start(String zip) {
		try {
			return Info.start(zip);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
