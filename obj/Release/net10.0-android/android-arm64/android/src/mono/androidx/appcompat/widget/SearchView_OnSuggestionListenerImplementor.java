package mono.androidx.appcompat.widget;


public class SearchView_OnSuggestionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.appcompat.widget.SearchView.OnSuggestionListener
{

	public SearchView_OnSuggestionListenerImplementor ()
	{
		super ();
		if (getClass () == SearchView_OnSuggestionListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.AppCompat.Widget.SearchView+IOnSuggestionListenerImplementor, Xamarin.AndroidX.AppCompat", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onSuggestionClick (int p0)
	{
		return n_onSuggestionClick (p0);
	}

	private native boolean n_onSuggestionClick (int p0);

	public boolean onSuggestionSelect (int p0)
	{
		return n_onSuggestionSelect (p0);
	}

	private native boolean n_onSuggestionSelect (int p0);

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
