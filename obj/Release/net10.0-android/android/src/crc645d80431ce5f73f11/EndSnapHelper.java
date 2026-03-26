package crc645d80431ce5f73f11;


public class EndSnapHelper
	extends crc645d80431ce5f73f11.EdgeSnapHelper
	implements
		mono.android.IGCUserPeer
{

	public EndSnapHelper ()
	{
		super ();
		if (getClass () == EndSnapHelper.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Items.EndSnapHelper, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public int[] calculateDistanceToFinalSnap (androidx.recyclerview.widget.RecyclerView.LayoutManager p0, android.view.View p1)
	{
		return n_calculateDistanceToFinalSnap (p0, p1);
	}

	private native int[] n_calculateDistanceToFinalSnap (androidx.recyclerview.widget.RecyclerView.LayoutManager p0, android.view.View p1);

	public android.view.View findSnapView (androidx.recyclerview.widget.RecyclerView.LayoutManager p0)
	{
		return n_findSnapView (p0);
	}

	private native android.view.View n_findSnapView (androidx.recyclerview.widget.RecyclerView.LayoutManager p0);

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
