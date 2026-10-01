package crc64fcf28c0e24b4cc31;


public class SwitchHandler_CheckedChangeListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.CompoundButton.OnCheckedChangeListener
{

	public SwitchHandler_CheckedChangeListener ()
	{
		super ();
		if (getClass () == SwitchHandler_CheckedChangeListener.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Handlers.SwitchHandler+CheckedChangeListener, Microsoft.Maui", "", this, new java.lang.Object[] {  });
		}
	}

	public void onCheckedChanged (android.widget.CompoundButton p0, boolean p1)
	{
		n_onCheckedChanged (p0, p1);
	}

	private native void n_onCheckedChanged (android.widget.CompoundButton p0, boolean p1);

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
