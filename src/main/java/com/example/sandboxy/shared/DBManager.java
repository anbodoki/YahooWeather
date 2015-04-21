package com.example.sandboxy.shared;

import com.google.gwt.user.client.rpc.RemoteService;

/**
 * Created by anano.bodokia on 4/21/2015.
 */
public interface DBManager extends RemoteService{

	public void insertRow(String s);
}
