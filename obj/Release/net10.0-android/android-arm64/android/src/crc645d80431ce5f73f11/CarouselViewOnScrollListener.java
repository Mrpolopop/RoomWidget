package crc645d80431ce5f73f11;


public class CarouselViewOnScrollListener
	extends crc645d80431ce5f73f11.RecyclerViewScrollListener_2
	implements
		mono.android.IGCUserPeer
{

	public CarouselViewOnScrollListener ()
	{
		super ();
		if (getClass () == CarouselViewOnScrollListener.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Items.CarouselViewOnScrollListener, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public void onScrollStateChanged (androidx.recyclerview.widget.RecyclerView p0, int p1)
	{
		n_onScrollStateChanged (p0, p1);
	}

	private native void n_onScrollStateChanged (androidx.recyclerview.widget.RecyclerView p0, int p1);

	public void onScrolled (androidx.recyclerview.widget.RecyclerView p0, int p1, int p2)
	{
		n_onScrolled (p0, p1, p2);
	}

	private native void n_onScrolled (androidx.recyclerview.widget.RecyclerView p0, int p1, int p2);

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
