package crc64338477404e88479c;


public class GenericMenuClickListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.MenuItem.OnMenuItemClickListener
{

	public GenericMenuClickListener ()
	{
		super ();
		if (getClass () == GenericMenuClickListener.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.GenericMenuClickListener, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onMenuItemClick (android.view.MenuItem p0)
	{
		return n_onMenuItemClick (p0);
	}

	private native boolean n_onMenuItemClick (android.view.MenuItem p0);

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
