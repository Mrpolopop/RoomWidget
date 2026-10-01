package mono.android.animation;


public class ValueAnimator_AnimatorUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.animation.ValueAnimator.AnimatorUpdateListener
{

	public ValueAnimator_AnimatorUpdateListenerImplementor ()
	{
		super ();
		if (getClass () == ValueAnimator_AnimatorUpdateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Animation.ValueAnimator+IAnimatorUpdateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onAnimationUpdate (android.animation.ValueAnimator p0)
	{
		n_onAnimationUpdate (p0);
	}

	private native void n_onAnimationUpdate (android.animation.ValueAnimator p0);

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
