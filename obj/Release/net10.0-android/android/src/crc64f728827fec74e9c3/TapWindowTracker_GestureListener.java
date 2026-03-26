package crc64f728827fec74e9c3;


public class TapWindowTracker_GestureListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.GestureDetector.OnGestureListener
{

	public TapWindowTracker_GestureListener ()
	{
		super ();
		if (getClass () == TapWindowTracker_GestureListener.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.TapWindowTracker+GestureListener, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public TapWindowTracker_GestureListener (android.view.View p0)
	{
		super ();
		if (getClass () == TapWindowTracker_GestureListener.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.TapWindowTracker+GestureListener, Microsoft.Maui.Controls", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public boolean onDown (android.view.MotionEvent p0)
	{
		return n_onDown (p0);
	}

	private native boolean n_onDown (android.view.MotionEvent p0);

	public boolean onFling (android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3)
	{
		return n_onFling (p0, p1, p2, p3);
	}

	private native boolean n_onFling (android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3);

	public void onLongPress (android.view.MotionEvent p0)
	{
		n_onLongPress (p0);
	}

	private native void n_onLongPress (android.view.MotionEvent p0);

	public boolean onScroll (android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3)
	{
		return n_onScroll (p0, p1, p2, p3);
	}

	private native boolean n_onScroll (android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3);

	public void onShowPress (android.view.MotionEvent p0)
	{
		n_onShowPress (p0);
	}

	private native void n_onShowPress (android.view.MotionEvent p0);

	public boolean onSingleTapUp (android.view.MotionEvent p0)
	{
		return n_onSingleTapUp (p0);
	}

	private native boolean n_onSingleTapUp (android.view.MotionEvent p0);

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
