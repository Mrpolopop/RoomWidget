package crc640ec207abc449b2ca;


public class ShellToolbarTracker
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnClickListener
{

	public ShellToolbarTracker ()
	{
		super ();
		if (getClass () == ShellToolbarTracker.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.Compatibility.ShellToolbarTracker, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public void onClick (android.view.View p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (android.view.View p0);

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
