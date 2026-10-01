package crc645d80431ce5f73f11;


public class SingleSnapHelper
	extends androidx.recyclerview.widget.PagerSnapHelper
	implements
		mono.android.IGCUserPeer
{

	public SingleSnapHelper ()
	{
		super ();
		if (getClass () == SingleSnapHelper.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Items.SingleSnapHelper, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public android.view.View findSnapView (androidx.recyclerview.widget.RecyclerView.LayoutManager p0)
	{
		return n_findSnapView (p0);
	}

	private native android.view.View n_findSnapView (androidx.recyclerview.widget.RecyclerView.LayoutManager p0);

	public int findTargetSnapPosition (androidx.recyclerview.widget.RecyclerView.LayoutManager p0, int p1, int p2)
	{
		return n_findTargetSnapPosition (p0, p1, p2);
	}

	private native int n_findTargetSnapPosition (androidx.recyclerview.widget.RecyclerView.LayoutManager p0, int p1, int p2);

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
