package mono.android.view;


public class View_OnKeyListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnKeyListener
{

	public View_OnKeyListenerImplementor ()
	{
		super ();
		if (getClass () == View_OnKeyListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.View+IOnKeyListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onKey (android.view.View p0, int p1, android.view.KeyEvent p2)
	{
		return n_onKey (p0, p1, p2);
	}

	private native boolean n_onKey (android.view.View p0, int p1, android.view.KeyEvent p2);

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
