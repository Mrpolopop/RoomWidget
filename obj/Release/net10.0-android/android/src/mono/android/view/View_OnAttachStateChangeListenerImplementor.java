package mono.android.view;


public class View_OnAttachStateChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnAttachStateChangeListener
{

	public View_OnAttachStateChangeListenerImplementor ()
	{
		super ();
		if (getClass () == View_OnAttachStateChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.View+IOnAttachStateChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onViewAttachedToWindow (android.view.View p0)
	{
		n_onViewAttachedToWindow (p0);
	}

	private native void n_onViewAttachedToWindow (android.view.View p0);

	public void onViewDetachedFromWindow (android.view.View p0)
	{
		n_onViewDetachedFromWindow (p0);
	}

	private native void n_onViewDetachedFromWindow (android.view.View p0);

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
