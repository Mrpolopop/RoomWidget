package mono.android.content;


public class DialogInterface_OnCancelListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.DialogInterface.OnCancelListener
{

	public DialogInterface_OnCancelListenerImplementor ()
	{
		super ();
		if (getClass () == DialogInterface_OnCancelListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Content.IDialogInterfaceOnCancelListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onCancel (android.content.DialogInterface p0)
	{
		n_onCancel (p0);
	}

	private native void n_onCancel (android.content.DialogInterface p0);

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
