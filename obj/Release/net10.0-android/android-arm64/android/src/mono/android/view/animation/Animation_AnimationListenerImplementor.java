package mono.android.view.animation;


public class Animation_AnimationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.animation.Animation.AnimationListener
{

	public Animation_AnimationListenerImplementor ()
	{
		super ();
		if (getClass () == Animation_AnimationListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.Animations.Animation+IAnimationListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onAnimationEnd (android.view.animation.Animation p0)
	{
		n_onAnimationEnd (p0);
	}

	private native void n_onAnimationEnd (android.view.animation.Animation p0);

	public void onAnimationRepeat (android.view.animation.Animation p0)
	{
		n_onAnimationRepeat (p0);
	}

	private native void n_onAnimationRepeat (android.view.animation.Animation p0);

	public void onAnimationStart (android.view.animation.Animation p0)
	{
		n_onAnimationStart (p0);
	}

	private native void n_onAnimationStart (android.view.animation.Animation p0);

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
