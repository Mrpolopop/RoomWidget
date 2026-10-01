package androidx.appcompat.app;


public class AlertDialog_IDialogInterfaceOnMultiChoiceClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.DialogInterface.OnMultiChoiceClickListener
{

	public AlertDialog_IDialogInterfaceOnMultiChoiceClickListenerImplementor ()
	{
		super ();
		if (getClass () == AlertDialog_IDialogInterfaceOnMultiChoiceClickListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.AppCompat.App.AlertDialog+IDialogInterfaceOnMultiChoiceClickListenerImplementor, Xamarin.AndroidX.AppCompat", "", this, new java.lang.Object[] {  });
		}
	}

	public void onClick (android.content.DialogInterface p0, int p1, boolean p2)
	{
		n_onClick (p0, p1, p2);
	}

	private native void n_onClick (android.content.DialogInterface p0, int p1, boolean p2);

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
