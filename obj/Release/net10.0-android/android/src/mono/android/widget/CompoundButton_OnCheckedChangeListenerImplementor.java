package mono.android.widget;


public class CompoundButton_OnCheckedChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.CompoundButton.OnCheckedChangeListener
{

	public CompoundButton_OnCheckedChangeListenerImplementor ()
	{
		super ();
		if (getClass () == CompoundButton_OnCheckedChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.CompoundButton+IOnCheckedChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
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
