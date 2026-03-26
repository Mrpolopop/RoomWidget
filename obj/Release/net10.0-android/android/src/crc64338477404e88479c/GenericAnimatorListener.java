package crc64338477404e88479c;


public class GenericAnimatorListener
	extends android.animation.AnimatorListenerAdapter
	implements
		mono.android.IGCUserPeer
{

	public GenericAnimatorListener ()
	{
		super ();
		if (getClass () == GenericAnimatorListener.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.GenericAnimatorListener, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public void onAnimationCancel (android.animation.Animator p0)
	{
		n_onAnimationCancel (p0);
	}

	private native void n_onAnimationCancel (android.animation.Animator p0);

	public void onAnimationEnd (android.animation.Animator p0)
	{
		n_onAnimationEnd (p0);
	}

	private native void n_onAnimationEnd (android.animation.Animator p0);

	public void onAnimationRepeat (android.animation.Animator p0)
	{
		n_onAnimationRepeat (p0);
	}

	private native void n_onAnimationRepeat (android.animation.Animator p0);

	public void finalize ()
	{
		n_finalize ();
	}

	private native void n_finalize ();

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
