package crc6497da801d5190a566;


public class MyWidget
	extends android.appwidget.AppWidgetProvider
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onUpdate:(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V:GetOnUpdate_Landroid_content_Context_Landroid_appwidget_AppWidgetManager_arrayIHandler\n" +
			"";
		mono.android.Runtime.register ("RoomWidget.Platforms.Android.MyWidget, RoomWidget", MyWidget.class, __md_methods);
	}

	public MyWidget ()
	{
		super ();
		if (getClass () == MyWidget.class) {
			mono.android.TypeManager.Activate ("RoomWidget.Platforms.Android.MyWidget, RoomWidget", "", this, new java.lang.Object[] {  });
		}
	}

	public void onUpdate (android.content.Context p0, android.appwidget.AppWidgetManager p1, int[] p2)
	{
		n_onUpdate (p0, p1, p2);
	}

	private native void n_onUpdate (android.content.Context p0, android.appwidget.AppWidgetManager p1, int[] p2);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
