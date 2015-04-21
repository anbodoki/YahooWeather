package com.example.sandboxy.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * Created by anano.bodokia on 4/21/2015.
 */
public class DBManagerImpl extends RemoteServiceServlet implements com.example.sandboxy.shared.DBManager{
	@Override
	public void insertRow(String s) {
		DBManager.insertRow(s);
	}
}
