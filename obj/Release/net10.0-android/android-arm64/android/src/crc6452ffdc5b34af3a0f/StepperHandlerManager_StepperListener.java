package crc6452ffdc5b34af3a0f;


public class StepperHandlerManager_StepperListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnClickListener
{

	public StepperHandlerManager_StepperListener ()
	{
		super ();
		if (getClass () == StepperHandlerManager_StepperListener.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.StepperHandlerManager+StepperListener, Microsoft.Maui", "", this, new java.lang.Object[] {  });
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
