package crc640ec207abc449b2ca;


public class ShellFlyoutTemplatedContentRenderer
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener
{

	public ShellFlyoutTemplatedContentRenderer ()
	{
		super ();
		if (getClass () == ShellFlyoutTemplatedContentRenderer.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.Compatibility.ShellFlyoutTemplatedContentRenderer, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public void onOffsetChanged (com.google.android.material.appbar.AppBarLayout p0, int p1)
	{
		n_onOffsetChanged (p0, p1);
	}

	private native void n_onOffsetChanged (com.google.android.material.appbar.AppBarLayout p0, int p1);

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
