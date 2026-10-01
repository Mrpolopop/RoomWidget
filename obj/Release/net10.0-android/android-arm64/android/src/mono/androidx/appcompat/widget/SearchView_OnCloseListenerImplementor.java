package mono.androidx.appcompat.widget;


public class SearchView_OnCloseListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.appcompat.widget.SearchView.OnCloseListener
{

	public SearchView_OnCloseListenerImplementor ()
	{
		super ();
		if (getClass () == SearchView_OnCloseListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.AppCompat.Widget.SearchView+IOnCloseListenerImplementor, Xamarin.AndroidX.AppCompat", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onClose ()
	{
		return n_onClose ();
	}

	private native boolean n_onClose ();

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
