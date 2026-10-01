package mono.android.content;


public class DialogInterface_OnShowListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.DialogInterface.OnShowListener
{

	public DialogInterface_OnShowListenerImplementor ()
	{
		super ();
		if (getClass () == DialogInterface_OnShowListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Content.IDialogInterfaceOnShowListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onShow (android.content.DialogInterface p0)
	{
		n_onShow (p0);
	}

	private native void n_onShow (android.content.DialogInterface p0);

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
