package crc645d80431ce5f73f11;


public abstract class NongreedySnapHelper
	extends androidx.recyclerview.widget.LinearSnapHelper
	implements
		mono.android.IGCUserPeer
{

	public NongreedySnapHelper ()
	{
		super ();
		if (getClass () == NongreedySnapHelper.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Items.NongreedySnapHelper, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public void attachToRecyclerView (androidx.recyclerview.widget.RecyclerView p0)
	{
		n_attachToRecyclerView (p0);
	}

	private native void n_attachToRecyclerView (androidx.recyclerview.widget.RecyclerView p0);

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
