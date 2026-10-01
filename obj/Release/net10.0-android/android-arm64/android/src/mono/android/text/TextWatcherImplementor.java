package mono.android.text;


public class TextWatcherImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.text.TextWatcher,
		android.text.NoCopySpan
{

	public TextWatcherImplementor ()
	{
		super ();
		if (getClass () == TextWatcherImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Text.TextWatcherImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void afterTextChanged (android.text.Editable p0)
	{
		n_afterTextChanged (p0);
	}

	private native void n_afterTextChanged (android.text.Editable p0);

	public void beforeTextChanged (java.lang.CharSequence p0, int p1, int p2, int p3)
	{
		n_beforeTextChanged (p0, p1, p2, p3);
	}

	private native void n_beforeTextChanged (java.lang.CharSequence p0, int p1, int p2, int p3);

	public void onTextChanged (java.lang.CharSequence p0, int p1, int p2, int p3)
	{
		n_onTextChanged (p0, p1, p2, p3);
	}

	private native void n_onTextChanged (java.lang.CharSequence p0, int p1, int p2, int p3);

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
