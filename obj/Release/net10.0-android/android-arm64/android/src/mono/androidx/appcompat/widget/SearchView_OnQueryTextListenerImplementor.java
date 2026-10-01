package mono.androidx.appcompat.widget;


public class SearchView_OnQueryTextListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.appcompat.widget.SearchView.OnQueryTextListener
{

	public SearchView_OnQueryTextListenerImplementor ()
	{
		super ();
		if (getClass () == SearchView_OnQueryTextListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.AppCompat.Widget.SearchView+IOnQueryTextListenerImplementor, Xamarin.AndroidX.AppCompat", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onQueryTextChange (java.lang.String p0)
	{
		return n_onQueryTextChange (p0);
	}

	private native boolean n_onQueryTextChange (java.lang.String p0);

	public boolean onQueryTextSubmit (java.lang.String p0)
	{
		return n_onQueryTextSubmit (p0);
	}

	private native boolean n_onQueryTextSubmit (java.lang.String p0);

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
