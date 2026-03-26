package crc64e1fb321c08285b90;


public class ListViewRenderer_SwipeRefreshLayoutWithFixedNestedScrolling
	extends androidx.swiperefreshlayout.widget.SwipeRefreshLayout
	implements
		mono.android.IGCUserPeer
{

	public ListViewRenderer_SwipeRefreshLayoutWithFixedNestedScrolling (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ListViewRenderer_SwipeRefreshLayoutWithFixedNestedScrolling.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Compatibility.ListViewRenderer+SwipeRefreshLayoutWithFixedNestedScrolling, Microsoft.Maui.Controls", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public ListViewRenderer_SwipeRefreshLayoutWithFixedNestedScrolling (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == ListViewRenderer_SwipeRefreshLayoutWithFixedNestedScrolling.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Compatibility.ListViewRenderer+SwipeRefreshLayoutWithFixedNestedScrolling, Microsoft.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}

	public boolean onInterceptTouchEvent (android.view.MotionEvent p0)
	{
		return n_onInterceptTouchEvent (p0);
	}

	private native boolean n_onInterceptTouchEvent (android.view.MotionEvent p0);

	public void onNestedScrollAccepted (android.view.View p0, android.view.View p1, int p2)
	{
		n_onNestedScrollAccepted (p0, p1, p2);
	}

	private native void n_onNestedScrollAccepted (android.view.View p0, android.view.View p1, int p2);

	public void onStopNestedScroll (android.view.View p0)
	{
		n_onStopNestedScroll (p0);
	}

	private native void n_onStopNestedScroll (android.view.View p0);

	public void onNestedScroll (android.view.View p0, int p1, int p2, int p3, int p4)
	{
		n_onNestedScroll (p0, p1, p2, p3, p4);
	}

	private native void n_onNestedScroll (android.view.View p0, int p1, int p2, int p3, int p4);

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
