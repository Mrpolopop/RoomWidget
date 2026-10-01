package crc64338477404e88479c;


public class DragAndDropGestureHandler
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnDragListener
{

	public DragAndDropGestureHandler ()
	{
		super ();
		if (getClass () == DragAndDropGestureHandler.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.DragAndDropGestureHandler, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onDrag (android.view.View p0, android.view.DragEvent p1)
	{
		return n_onDrag (p0, p1);
	}

	private native boolean n_onDrag (android.view.View p0, android.view.DragEvent p1);

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
