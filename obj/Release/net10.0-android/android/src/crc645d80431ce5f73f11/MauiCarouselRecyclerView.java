package crc645d80431ce5f73f11;


public class MauiCarouselRecyclerView
	extends crc645d80431ce5f73f11.MauiRecyclerView_3
	implements
		mono.android.IGCUserPeer
{

	public MauiCarouselRecyclerView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MauiCarouselRecyclerView.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Items.MauiCarouselRecyclerView, Microsoft.Maui.Controls", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public MauiCarouselRecyclerView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MauiCarouselRecyclerView.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Items.MauiCarouselRecyclerView, Microsoft.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}

	public MauiCarouselRecyclerView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == MauiCarouselRecyclerView.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Items.MauiCarouselRecyclerView, Microsoft.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
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

	public void onAttachedToWindow ()
	{
		n_onAttachedToWindow ();
	}

	private native void n_onAttachedToWindow ();

	public void onDetachedFromWindow ()
	{
		n_onDetachedFromWindow ();
	}

	private native void n_onDetachedFromWindow ();

	public void onMeasure (int p0, int p1)
	{
		n_onMeasure (p0, p1);
	}

	private native void n_onMeasure (int p0, int p1);

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
