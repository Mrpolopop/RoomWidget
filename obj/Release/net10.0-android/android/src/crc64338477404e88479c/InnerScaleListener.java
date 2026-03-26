package crc64338477404e88479c;


public class InnerScaleListener
	extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
	implements
		mono.android.IGCUserPeer
{

	public InnerScaleListener ()
	{
		super ();
		if (getClass () == InnerScaleListener.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.InnerScaleListener, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onScale (android.view.ScaleGestureDetector p0)
	{
		return n_onScale (p0);
	}

	private native boolean n_onScale (android.view.ScaleGestureDetector p0);

	public boolean onScaleBegin (android.view.ScaleGestureDetector p0)
	{
		return n_onScaleBegin (p0);
	}

	private native boolean n_onScaleBegin (android.view.ScaleGestureDetector p0);

	public void onScaleEnd (android.view.ScaleGestureDetector p0)
	{
		n_onScaleEnd (p0);
	}

	private native void n_onScaleEnd (android.view.ScaleGestureDetector p0);

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
