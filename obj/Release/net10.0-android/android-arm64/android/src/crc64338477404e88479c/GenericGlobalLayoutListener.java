package crc64338477404e88479c;


public class GenericGlobalLayoutListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ViewTreeObserver.OnGlobalLayoutListener
{

	public GenericGlobalLayoutListener ()
	{
		super ();
		if (getClass () == GenericGlobalLayoutListener.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.GenericGlobalLayoutListener, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public void onGlobalLayout ()
	{
		n_onGlobalLayout ();
	}

	private native void n_onGlobalLayout ();

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
