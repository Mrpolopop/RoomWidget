package crc64338477404e88479c;


public class ColorChangeRevealDrawable
	extends android.graphics.drawable.AnimationDrawable
	implements
		mono.android.IGCUserPeer
{

	public ColorChangeRevealDrawable ()
	{
		super ();
		if (getClass () == ColorChangeRevealDrawable.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.ColorChangeRevealDrawable, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public void draw (android.graphics.Canvas p0)
	{
		n_draw (p0);
	}

	private native void n_draw (android.graphics.Canvas p0);

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
