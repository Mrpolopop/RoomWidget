package mono.android.view;


public class View_OnScrollChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnScrollChangeListener
{

	public View_OnScrollChangeListenerImplementor ()
	{
		super ();
		if (getClass () == View_OnScrollChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.View+IOnScrollChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onScrollChange (android.view.View p0, int p1, int p2, int p3, int p4)
	{
		n_onScrollChange (p0, p1, p2, p3, p4);
	}

	private native void n_onScrollChange (android.view.View p0, int p1, int p2, int p3, int p4);

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
