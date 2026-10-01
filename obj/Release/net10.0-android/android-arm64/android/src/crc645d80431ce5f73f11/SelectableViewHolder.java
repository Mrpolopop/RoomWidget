package crc645d80431ce5f73f11;


public abstract class SelectableViewHolder
	extends androidx.recyclerview.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnClickListener
{

	public SelectableViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == SelectableViewHolder.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Items.SelectableViewHolder, Microsoft.Maui.Controls", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
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
