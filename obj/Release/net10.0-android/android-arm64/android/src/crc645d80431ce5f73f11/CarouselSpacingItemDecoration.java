package crc645d80431ce5f73f11;


public class CarouselSpacingItemDecoration
	extends androidx.recyclerview.widget.RecyclerView.ItemDecoration
	implements
		mono.android.IGCUserPeer
{

	public CarouselSpacingItemDecoration ()
	{
		super ();
		if (getClass () == CarouselSpacingItemDecoration.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Items.CarouselSpacingItemDecoration, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public void getItemOffsets (android.graphics.Rect p0, android.view.View p1, androidx.recyclerview.widget.RecyclerView p2, androidx.recyclerview.widget.RecyclerView.State p3)
	{
		n_getItemOffsets (p0, p1, p2, p3);
	}

	private native void n_getItemOffsets (android.graphics.Rect p0, android.view.View p1, androidx.recyclerview.widget.RecyclerView p2, androidx.recyclerview.widget.RecyclerView.State p3);

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
