package crc645d80431ce5f73f11;


public class SelectableItemsViewAdapter_2
	extends crc645d80431ce5f73f11.StructuredItemsViewAdapter_2
	implements
		mono.android.IGCUserPeer
{

	public SelectableItemsViewAdapter_2 ()
	{
		super ();
		if (getClass () == SelectableItemsViewAdapter_2.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Items.SelectableItemsViewAdapter`2, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public void onBindViewHolder (androidx.recyclerview.widget.RecyclerView.ViewHolder p0, int p1)
	{
		n_onBindViewHolder (p0, p1);
	}

	private native void n_onBindViewHolder (androidx.recyclerview.widget.RecyclerView.ViewHolder p0, int p1);

	public void onViewRecycled (androidx.recyclerview.widget.RecyclerView.ViewHolder p0)
	{
		n_onViewRecycled (p0);
	}

	private native void n_onViewRecycled (androidx.recyclerview.widget.RecyclerView.ViewHolder p0);

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
