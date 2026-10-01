package mono.androidx.core.widget;


public class NestedScrollView_OnScrollChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.core.widget.NestedScrollView.OnScrollChangeListener
{

	public NestedScrollView_OnScrollChangeListenerImplementor ()
	{
		super ();
		if (getClass () == NestedScrollView_OnScrollChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.Core.Widget.NestedScrollView+IOnScrollChangeListenerImplementor, Xamarin.AndroidX.Core", "", this, new java.lang.Object[] {  });
		}
	}

	public void onScrollChange (androidx.core.widget.NestedScrollView p0, int p1, int p2, int p3, int p4)
	{
		n_onScrollChange (p0, p1, p2, p3, p4);
	}

	private native void n_onScrollChange (androidx.core.widget.NestedScrollView p0, int p1, int p2, int p3, int p4);

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
