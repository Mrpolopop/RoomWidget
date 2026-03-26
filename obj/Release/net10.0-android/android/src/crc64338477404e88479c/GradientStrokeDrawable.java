package crc64338477404e88479c;


public class GradientStrokeDrawable
	extends android.graphics.drawable.PaintDrawable
	implements
		mono.android.IGCUserPeer
{

	public GradientStrokeDrawable ()
	{
		super ();
		if (getClass () == GradientStrokeDrawable.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.GradientStrokeDrawable, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

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
