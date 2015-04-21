package com.example.sandboxy.shared;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface DBManagerAsync {
	void insertRow(String s, AsyncCallback<Void> async);
}
