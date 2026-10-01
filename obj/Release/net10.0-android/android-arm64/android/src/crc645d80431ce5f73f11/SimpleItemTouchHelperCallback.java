package crc645d80431ce5f73f11;


public class SimpleItemTouchHelperCallback
	extends androidx.recyclerview.widget.ItemTouchHelper.Callback
	implements
		mono.android.IGCUserPeer
{

	public SimpleItemTouchHelperCallback ()
	{
		super ();
		if (getClass () == SimpleItemTouchHelperCallback.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Items.SimpleItemTouchHelperCallback, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean isLongPressDragEnabled ()
	{
		return n_isLongPressDragEnabled ();
	}

	private native boolean n_isLongPressDragEnabled ();

	public int getMovementFlags (androidx.recyclerview.widget.RecyclerView p0, androidx.recyclerview.widget.RecyclerView.ViewHolder p1)
	{
		return n_getMovementFlags (p0, p1);
	}

	private native int n_getMovementFlags (androidx.recyclerview.widget.RecyclerView p0, androidx.recyclerview.widget.RecyclerView.ViewHolder p1);

	public boolean onMove (androidx.recyclerview.widget.RecyclerView p0, androidx.recyclerview.widget.RecyclerView.ViewHolder p1, androidx.recyclerview.widget.RecyclerView.ViewHolder p2)
	{
		return n_onMove (p0, p1, p2);
	}

	private native boolean n_onMove (androidx.recyclerview.widget.RecyclerView p0, androidx.recyclerview.widget.RecyclerView.ViewHolder p1, androidx.recyclerview.widget.RecyclerView.ViewHolder p2);

	public void onSwiped (androidx.recyclerview.widget.RecyclerView.ViewHolder p0, int p1)
	{
		n_onSwiped (p0, p1);
	}

	private native void n_onSwiped (androidx.recyclerview.widget.RecyclerView.ViewHolder p0, int p1);

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
