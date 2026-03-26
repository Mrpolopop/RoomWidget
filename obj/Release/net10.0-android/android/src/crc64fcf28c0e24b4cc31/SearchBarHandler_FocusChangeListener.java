package crc64fcf28c0e24b4cc31;


public class SearchBarHandler_FocusChangeListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnFocusChangeListener
{

	public SearchBarHandler_FocusChangeListener ()
	{
		super ();
		if (getClass () == SearchBarHandler_FocusChangeListener.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Handlers.SearchBarHandler+FocusChangeListener, Microsoft.Maui", "", this, new java.lang.Object[] {  });
		}
	}

	public void onFocusChange (android.view.View p0, boolean p1)
	{
		n_onFocusChange (p0, p1);
	}

	private native void n_onFocusChange (android.view.View p0, boolean p1);

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
