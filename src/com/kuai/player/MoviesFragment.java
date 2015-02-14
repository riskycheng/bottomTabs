package com.kuai.player;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

/***
 * @author riskycheng
 * @date 2013-1-4
 * @email riskycheng@gmail.com
 * @desc apps¡–±Ì
 */
public class MoviesFragment extends Fragment {

	private Activity mActivity;
	private ListView listviewMovies;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mActivity = getActivity();
		System.out.println("AppsFragment :: onCreate");
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		System.out.println("AppsFragment :: onCreateView...");
		
		View view = inflater.inflate(R.layout.movies_content_layout, container, false);
		listviewMovies = (ListView) view.findViewById(R.id.listview_movies);
		
		final String[] strs = new String[] {
			    "first", "second", "third", "fourth", "fifth"};
		listviewMovies.setAdapter(new ArrayAdapter<String>(mActivity,
                android.R.layout.simple_list_item_1, strs));
		
		
		return view;
	}
}
