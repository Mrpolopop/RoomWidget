package crc6452ffdc5b34af3a0f;


public class BorderDrawable
	extends android.graphics.drawable.PaintDrawable
	implements
		mono.android.IGCUserPeer
{

	public BorderDrawable ()
	{
		super ();
		if (getClass () == BorderDrawable.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.BorderDrawable, Microsoft.Maui", "", this, new java.lang.Object[] {  });
		}
	}

	public BorderDrawable (android.content.Context p0)
	{
		super ();
		if (getClass () == BorderDrawable.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.BorderDrawable, Microsoft.Maui", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
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
