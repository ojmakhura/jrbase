package com.systemsjr.jrlib.richclient.table;

import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;

import ca.odell.glazedlists.EventList;

import com.systemsjr.jrlib.richclient.BaseItemTable;

public final class JRTableUtils {
	public static void refreshTable(BaseItemTable table, Object[] data){
		
		EventList<Object> list = table.getFinalEventList();
		list.clear();
		if(!ArrayUtils.isEmpty(data)){
			list.add(Arrays.asList(data));
		}
	}
}
