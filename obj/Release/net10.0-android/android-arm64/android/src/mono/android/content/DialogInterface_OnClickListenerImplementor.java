package mono.android.content;


public class DialogInterface_OnClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.DialogInterface.OnClickListener
{

	public DialogInterface_OnClickListenerImplementor ()
	{
		super ();
		if (getClass () == DialogInterface_OnClickListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Content.IDialogInterfaceOnClickListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onClick (android.content.DialogInterface p0, int p1)
	{
		n_onClick (p0, p1);
	}

	private native void n_onClick (android.content.DialogInterface p0, int p1);

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
