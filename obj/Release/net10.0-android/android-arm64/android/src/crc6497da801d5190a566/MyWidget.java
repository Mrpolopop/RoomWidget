package crc6497da801d5190a566;


public class MyWidget
	extends android.appwidget.AppWidgetProvider
	implements
		mono.android.IGCUserPeer
{

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
