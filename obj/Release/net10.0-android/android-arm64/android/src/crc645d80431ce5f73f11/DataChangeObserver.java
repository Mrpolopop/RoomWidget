package crc645d80431ce5f73f11;


public class DataChangeObserver
	extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
	implements
		mono.android.IGCUserPeer
{

	public DataChangeObserver ()
	{
		super ();
		if (getClass () == DataChangeObserver.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Items.DataChangeObserver, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public void onChanged ()
	{
		n_onChanged ();
	}

	private native void n_onChanged ();

	public void onItemRangeInserted (int p0, int p1)
	{
		n_onItemRangeInserted (p0, p1);
	}

	private native void n_onItemRangeInserted (int p0, int p1);

	public void onItemRangeChanged (int p0, int p1)
	{
		n_onItemRangeChanged (p0, p1);
	}

	private native void n_onItemRangeChanged (int p0, int p1);

	public void onItemRangeChanged (int p0, int p1, java.lang.Object p2)
	{
		n_onItemRangeChanged (p0, p1, p2);
	}

	private native void n_onItemRangeChanged (int p0, int p1, java.lang.Object p2);

	public void onItemRangeRemoved (int p0, int p1)
	{
		n_onItemRangeRemoved (p0, p1);
	}

	private native void n_onItemRangeRemoved (int p0, int p1);

	public void onItemRangeMoved (int p0, int p1, int p2)
	{
		n_onItemRangeMoved (p0, p1, p2);
	}

	private native void n_onItemRangeMoved (int p0, int p1, int p2);

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
