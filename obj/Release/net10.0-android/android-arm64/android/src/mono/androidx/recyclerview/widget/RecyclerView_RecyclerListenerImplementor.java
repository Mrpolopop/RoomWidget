package mono.androidx.recyclerview.widget;


public class RecyclerView_RecyclerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.recyclerview.widget.RecyclerView.RecyclerListener
{

	public RecyclerView_RecyclerListenerImplementor ()
	{
		super ();
		if (getClass () == RecyclerView_RecyclerListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.RecyclerView.Widget.RecyclerView+IRecyclerListenerImplementor, Xamarin.AndroidX.RecyclerView", "", this, new java.lang.Object[] {  });
		}
	}

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
