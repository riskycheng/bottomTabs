package com.kuai.player;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;


public class ActivityUtils {
	
	/**
	 * ȥ��������
	 * @param mActivity
	 */
	public static void requestNotTitleBar(final Activity mActivity){
		mActivity.requestWindowFeature(Window.FEATURE_NO_TITLE);
	}

	/**
	 * ȫ��
	 * @param mActivity
	 */
	public static void requestFullscreen(final Activity mActivity) {
		final Window window = mActivity.getWindow();
		window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		window.clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
		window.requestFeature(Window.FEATURE_NO_TITLE);
	}

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
