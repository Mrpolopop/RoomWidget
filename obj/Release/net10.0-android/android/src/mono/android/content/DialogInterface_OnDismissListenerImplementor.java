package mono.android.content;


public class DialogInterface_OnDismissListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.DialogInterface.OnDismissListener
{

	public DialogInterface_OnDismissListenerImplementor ()
	{
		super ();
		if (getClass () == DialogInterface_OnDismissListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Content.IDialogInterfaceOnDismissListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDismiss (android.content.DialogInterface p0)
	{
		n_onDismiss (p0);
	}

	private native void n_onDismiss (android.content.DialogInterface p0);

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
