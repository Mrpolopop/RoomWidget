package mono.android.widget;


public class TextView_OnEditorActionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.TextView.OnEditorActionListener
{

	public TextView_OnEditorActionListenerImplementor ()
	{
		super ();
		if (getClass () == TextView_OnEditorActionListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.TextView+IOnEditorActionListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onEditorAction (android.widget.TextView p0, int p1, android.view.KeyEvent p2)
	{
		return n_onEditorAction (p0, p1, p2);
	}

	private native boolean n_onEditorAction (android.widget.TextView p0, int p1, android.view.KeyEvent p2);

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
