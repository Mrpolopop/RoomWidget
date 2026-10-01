package crc64b5e713d400f589b7;


public class MauiDrawable
	extends android.graphics.drawable.PaintDrawable
	implements
		mono.android.IGCUserPeer,
		com.microsoft.maui.PlatformShadowDrawable
{

	public MauiDrawable ()
	{
		super ();
		if (getClass () == MauiDrawable.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Graphics.MauiDrawable, Microsoft.Maui", "", this, new java.lang.Object[] {  });
		}
	}

	public MauiDrawable (android.content.Context p0)
	{
		super ();
		if (getClass () == MauiDrawable.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Graphics.MauiDrawable, Microsoft.Maui", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public void onBoundsChange (android.graphics.Rect p0)
	{
		n_onBoundsChange (p0);
	}

	private native void n_onBoundsChange (android.graphics.Rect p0);

	public void onDraw (android.graphics.drawable.shapes.Shape p0, android.graphics.Canvas p1, android.graphics.Paint p2)
	{
		n_onDraw (p0, p1, p2);
	}

	private native void n_onDraw (android.graphics.drawable.shapes.Shape p0, android.graphics.Canvas p1, android.graphics.Paint p2);

	public boolean canDrawShadow ()
	{
		return n_canDrawShadow ();
	}

	private native boolean n_canDrawShadow ();

	public void drawShadow (android.graphics.Canvas p0, android.graphics.Paint p1, android.graphics.Path p2)
	{
		n_drawShadow (p0, p1, p2);
	}

	private native void n_drawShadow (android.graphics.Canvas p0, android.graphics.Paint p1, android.graphics.Path p2);

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
