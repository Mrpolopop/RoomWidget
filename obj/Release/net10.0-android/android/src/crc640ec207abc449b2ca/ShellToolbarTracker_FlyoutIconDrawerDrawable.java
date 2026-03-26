package crc640ec207abc449b2ca;


public class ShellToolbarTracker_FlyoutIconDrawerDrawable
	extends androidx.appcompat.graphics.drawable.DrawerArrowDrawable
	implements
		mono.android.IGCUserPeer
{

	public ShellToolbarTracker_FlyoutIconDrawerDrawable (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ShellToolbarTracker_FlyoutIconDrawerDrawable.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.Compatibility.ShellToolbarTracker+FlyoutIconDrawerDrawable, Microsoft.Maui.Controls", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public void draw (android.graphics.Canvas p0)
	{
		n_draw (p0);
	}

	private native void n_draw (android.graphics.Canvas p0);

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
