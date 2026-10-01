package crc64338477404e88479c;


public class PointerGestureHandler
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnHoverListener
{

	public PointerGestureHandler ()
	{
		super ();
		if (getClass () == PointerGestureHandler.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.PointerGestureHandler, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onHover (android.view.View p0, android.view.MotionEvent p1)
	{
		return n_onHover (p0, p1);
	}

	private native boolean n_onHover (android.view.View p0, android.view.MotionEvent p1);

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
