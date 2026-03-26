package crc6452ffdc5b34af3a0f;


public class MauiPageControl_TEditClickListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnClickListener
{

	public MauiPageControl_TEditClickListener ()
	{
		super ();
		if (getClass () == MauiPageControl_TEditClickListener.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.MauiPageControl+TEditClickListener, Microsoft.Maui", "", this, new java.lang.Object[] {  });
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
