package mono.android.view;


public class View_OnFocusChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnFocusChangeListener
{

	public View_OnFocusChangeListenerImplementor ()
	{
		super ();
		if (getClass () == View_OnFocusChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.View+IOnFocusChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onFocusChange (android.view.View p0, boolean p1)
	{
		n_onFocusChange (p0, p1);
	}

	private native void n_onFocusChange (android.view.View p0, boolean p1);

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
