package mono.androidx.recyclerview.widget;


public class RecyclerView_OnItemTouchListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
{

	public RecyclerView_OnItemTouchListenerImplementor ()
	{
		super ();
		if (getClass () == RecyclerView_OnItemTouchListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.RecyclerView.Widget.RecyclerView+IOnItemTouchListenerImplementor, Xamarin.AndroidX.RecyclerView", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onInterceptTouchEvent (androidx.recyclerview.widget.RecyclerView p0, android.view.MotionEvent p1)
	{
		return n_onInterceptTouchEvent (p0, p1);
	}

	private native boolean n_onInterceptTouchEvent (androidx.recyclerview.widget.RecyclerView p0, android.view.MotionEvent p1);

	public void onRequestDisallowInterceptTouchEvent (boolean p0)
	{
		n_onRequestDisallowInterceptTouchEvent (p0);
	}

	private native void n_onRequestDisallowInterceptTouchEvent (boolean p0);

	public void onTouchEvent (androidx.recyclerview.widget.RecyclerView p0, android.view.MotionEvent p1)
	{
		n_onTouchEvent (p0, p1);
	}

	private native void n_onTouchEvent (androidx.recyclerview.widget.RecyclerView p0, android.view.MotionEvent p1);

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
