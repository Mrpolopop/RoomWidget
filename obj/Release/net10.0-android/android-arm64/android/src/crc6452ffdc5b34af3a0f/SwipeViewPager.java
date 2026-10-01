package crc6452ffdc5b34af3a0f;


public class SwipeViewPager
	extends androidx.viewpager.widget.ViewPager
	implements
		mono.android.IGCUserPeer
{

	public SwipeViewPager (android.content.Context p0)
	{
		super (p0);
		if (getClass () == SwipeViewPager.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.SwipeViewPager, Microsoft.Maui", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public SwipeViewPager (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == SwipeViewPager.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.SwipeViewPager, Microsoft.Maui", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}

	public boolean onInterceptTouchEvent (android.view.MotionEvent p0)
	{
		return n_onInterceptTouchEvent (p0);
	}

	private native boolean n_onInterceptTouchEvent (android.view.MotionEvent p0);

	public boolean onTouchEvent (android.view.MotionEvent p0)
	{
		return n_onTouchEvent (p0);
	}

	private native boolean n_onTouchEvent (android.view.MotionEvent p0);

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
