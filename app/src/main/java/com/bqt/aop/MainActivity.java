package com.bqt.aop;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.bqt.aop.aspectj.TestAnnoTrace;
import com.bqt.aop.test.BqtKeyLog;
import com.bqt.aop.test.BqtLog;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends ListActivity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] array = {"",
				"",
				"",
				"",
				"",
				"",};
		setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, new ArrayList<>(Arrays.asList(array))));
	}
	
	@BqtLog
	@BqtKeyLog("包青天")
	@TestAnnoTrace("包青天")
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		switch (position) {
			case 0:
				
				break;
			case 1:
				
				break;
			case 2:
				
				break;
		}
	}
}