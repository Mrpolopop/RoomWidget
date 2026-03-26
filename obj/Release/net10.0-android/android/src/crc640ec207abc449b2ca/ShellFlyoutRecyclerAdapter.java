package crc640ec207abc449b2ca;


public class ShellFlyoutRecyclerAdapter
	extends androidx.recyclerview.widget.RecyclerView.Adapter
	implements
		mono.android.IGCUserPeer
{

	public ShellFlyoutRecyclerAdapter ()
	{
		super ();
		if (getClass () == ShellFlyoutRecyclerAdapter.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.Compatibility.ShellFlyoutRecyclerAdapter, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public int getItemCount ()
	{
		return n_getItemCount ();
	}

	private native int n_getItemCount ();

	public int getItemViewType (int p0)
	{
		return n_getItemViewType (p0);
	}

	private native int n_getItemViewType (int p0);

	public void onViewRecycled (androidx.recyclerview.widget.RecyclerView.ViewHolder p0)
	{
		n_onViewRecycled (p0);
	}

	private native void n_onViewRecycled (androidx.recyclerview.widget.RecyclerView.ViewHolder p0);

	public void onBindViewHolder (androidx.recyclerview.widget.RecyclerView.ViewHolder p0, int p1)
	{
		n_onBindViewHolder (p0, p1);
	}

	private native void n_onBindViewHolder (androidx.recyclerview.widget.RecyclerView.ViewHolder p0, int p1);

	public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder (android.view.ViewGroup p0, int p1)
	{
		return n_onCreateViewHolder (p0, p1);
	}

	private native androidx.recyclerview.widget.RecyclerView.ViewHolder n_onCreateViewHolder (android.view.ViewGroup p0, int p1);

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
