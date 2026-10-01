package crc640ec207abc449b2ca;


public class ShellSearchViewAdapter
	extends android.widget.BaseAdapter
	implements
		mono.android.IGCUserPeer,
		android.widget.Filterable
{

	public ShellSearchViewAdapter ()
	{
		super ();
		if (getClass () == ShellSearchViewAdapter.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.Compatibility.ShellSearchViewAdapter, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public int getCount ()
	{
		return n_getCount ();
	}

	private native int n_getCount ();

	public java.lang.Object getItem (int p0)
	{
		return n_getItem (p0);
	}

	private native java.lang.Object n_getItem (int p0);

	public long getItemId (int p0)
	{
		return n_getItemId (p0);
	}

	private native long n_getItemId (int p0);

	public android.view.View getView (int p0, android.view.View p1, android.view.ViewGroup p2)
	{
		return n_getView (p0, p1, p2);
	}

	private native android.view.View n_getView (int p0, android.view.View p1, android.view.ViewGroup p2);

	public android.widget.Filter getFilter ()
	{
		return n_getFilter ();
	}

	private native android.widget.Filter n_getFilter ();

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
