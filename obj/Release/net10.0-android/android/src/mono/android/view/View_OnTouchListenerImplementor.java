package mono.android.view;


public class View_OnTouchListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnTouchListener
{

	public View_OnTouchListenerImplementor ()
	{
		super ();
		if (getClass () == View_OnTouchListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.View+IOnTouchListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onTouch (android.view.View p0, android.view.MotionEvent p1)
	{
		return n_onTouch (p0, p1);
	}

	private native boolean n_onTouch (android.view.View p0, android.view.MotionEvent p1);

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
