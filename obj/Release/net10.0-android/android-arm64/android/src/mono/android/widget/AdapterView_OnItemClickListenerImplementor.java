package mono.android.widget;


public class AdapterView_OnItemClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.AdapterView.OnItemClickListener
{

	public AdapterView_OnItemClickListenerImplementor ()
	{
		super ();
		if (getClass () == AdapterView_OnItemClickListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.AdapterView+IOnItemClickListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onItemClick (android.widget.AdapterView p0, android.view.View p1, int p2, long p3)
	{
		n_onItemClick (p0, p1, p2, p3);
	}

	private native void n_onItemClick (android.widget.AdapterView p0, android.view.View p1, int p2, long p3);

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
