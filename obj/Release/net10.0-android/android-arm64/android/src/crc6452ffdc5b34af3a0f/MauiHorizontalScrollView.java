package crc6452ffdc5b34af3a0f;


public class MauiHorizontalScrollView
	extends android.widget.HorizontalScrollView
	implements
		mono.android.IGCUserPeer
{

	public MauiHorizontalScrollView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == MauiHorizontalScrollView.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.MauiHorizontalScrollView, Microsoft.Maui", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3 });
		}
	}

	public MauiHorizontalScrollView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == MauiHorizontalScrollView.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.MauiHorizontalScrollView, Microsoft.Maui", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}

	public MauiHorizontalScrollView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MauiHorizontalScrollView.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.MauiHorizontalScrollView, Microsoft.Maui", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}

	public MauiHorizontalScrollView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MauiHorizontalScrollView.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.MauiHorizontalScrollView, Microsoft.Maui", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public void draw (android.graphics.Canvas p0)
	{
		n_draw (p0);
	}

	private native void n_draw (android.graphics.Canvas p0);

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

	public boolean isHorizontalScrollBarEnabled ()
	{
		return n_isHorizontalScrollBarEnabled ();
	}

	private native boolean n_isHorizontalScrollBarEnabled ();

	public void setHorizontalScrollBarEnabled (boolean p0)
	{
		n_setHorizontalScrollBarEnabled (p0);
	}

	private native void n_setHorizontalScrollBarEnabled (boolean p0);

	public void onScrollChanged (int p0, int p1, int p2, int p3)
	{
		n_onScrollChanged (p0, p1, p2, p3);
	}

	private native void n_onScrollChanged (int p0, int p1, int p2, int p3);

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
