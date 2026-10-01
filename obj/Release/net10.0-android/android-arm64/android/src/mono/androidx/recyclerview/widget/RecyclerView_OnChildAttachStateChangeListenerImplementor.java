package mono.androidx.recyclerview.widget;


public class RecyclerView_OnChildAttachStateChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
{

	public RecyclerView_OnChildAttachStateChangeListenerImplementor ()
	{
		super ();
		if (getClass () == RecyclerView_OnChildAttachStateChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.RecyclerView.Widget.RecyclerView+IOnChildAttachStateChangeListenerImplementor, Xamarin.AndroidX.RecyclerView", "", this, new java.lang.Object[] {  });
		}
	}

	public void onChildViewAttachedToWindow (android.view.View p0)
	{
		n_onChildViewAttachedToWindow (p0);
	}

	private native void n_onChildViewAttachedToWindow (android.view.View p0);

	public void onChildViewDetachedFromWindow (android.view.View p0)
	{
		n_onChildViewDetachedFromWindow (p0);
	}

	private native void n_onChildViewDetachedFromWindow (android.view.View p0);

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
