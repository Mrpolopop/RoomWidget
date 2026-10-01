package crc64fcf28c0e24b4cc31;


public class ToolbarHandler_ProcessBackClick
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnClickListener
{

	public ToolbarHandler_ProcessBackClick ()
	{
		super ();
		if (getClass () == ToolbarHandler_ProcessBackClick.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Handlers.ToolbarHandler+ProcessBackClick, Microsoft.Maui", "", this, new java.lang.Object[] {  });
		}
	}

	public void onClick (android.view.View p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (android.view.View p0);

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
