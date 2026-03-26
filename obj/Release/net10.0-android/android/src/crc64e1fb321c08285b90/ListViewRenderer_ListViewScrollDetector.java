package crc64e1fb321c08285b90;


public class ListViewRenderer_ListViewScrollDetector
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.AbsListView.OnScrollListener
{

	public ListViewRenderer_ListViewScrollDetector ()
	{
		super ();
		if (getClass () == ListViewRenderer_ListViewScrollDetector.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Compatibility.ListViewRenderer+ListViewScrollDetector, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public ListViewRenderer_ListViewScrollDetector (crc64e1fb321c08285b90.ListViewRenderer p0)
	{
		super ();
		if (getClass () == ListViewRenderer_ListViewScrollDetector.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Compatibility.ListViewRenderer+ListViewScrollDetector, Microsoft.Maui.Controls", "Microsoft.Maui.Controls.Handlers.Compatibility.ListViewRenderer, Microsoft.Maui.Controls", this, new java.lang.Object[] { p0 });
		}
	}

	public void onScroll (android.widget.AbsListView p0, int p1, int p2, int p3)
	{
		n_onScroll (p0, p1, p2, p3);
	}

	private native void n_onScroll (android.widget.AbsListView p0, int p1, int p2, int p3);

	public void onScrollStateChanged (android.widget.AbsListView p0, int p1)
	{
		n_onScrollStateChanged (p0, p1);
	}

	private native void n_onScrollStateChanged (android.widget.AbsListView p0, int p1);

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
