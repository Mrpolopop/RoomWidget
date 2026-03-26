package crc645d80431ce5f73f11;


public class CenterSnapHelper
	extends crc645d80431ce5f73f11.NongreedySnapHelper
	implements
		mono.android.IGCUserPeer
{

	public CenterSnapHelper ()
	{
		super ();
		if (getClass () == CenterSnapHelper.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Items.CenterSnapHelper, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

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
