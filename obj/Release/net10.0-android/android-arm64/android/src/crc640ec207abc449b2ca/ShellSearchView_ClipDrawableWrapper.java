package crc640ec207abc449b2ca;


public class ShellSearchView_ClipDrawableWrapper
	extends androidx.appcompat.graphics.drawable.DrawableWrapperCompat
	implements
		mono.android.IGCUserPeer
{

	public ShellSearchView_ClipDrawableWrapper (android.graphics.drawable.Drawable p0)
	{
		super (p0);
		if (getClass () == ShellSearchView_ClipDrawableWrapper.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.Compatibility.ShellSearchView+ClipDrawableWrapper, Microsoft.Maui.Controls", "Android.Graphics.Drawables.Drawable, Mono.Android", this, new java.lang.Object[] { p0 });
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
