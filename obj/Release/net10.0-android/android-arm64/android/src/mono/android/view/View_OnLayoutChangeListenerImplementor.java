package mono.android.view;


public class View_OnLayoutChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnLayoutChangeListener
{

	public View_OnLayoutChangeListenerImplementor ()
	{
		super ();
		if (getClass () == View_OnLayoutChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.View+IOnLayoutChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onLayoutChange (android.view.View p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8)
	{
		n_onLayoutChange (p0, p1, p2, p3, p4, p5, p6, p7, p8);
	}

	private native void n_onLayoutChange (android.view.View p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8);

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
