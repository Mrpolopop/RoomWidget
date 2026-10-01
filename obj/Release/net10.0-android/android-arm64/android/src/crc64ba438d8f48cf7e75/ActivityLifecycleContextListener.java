package crc64ba438d8f48cf7e75;


public class ActivityLifecycleContextListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.app.Application.ActivityLifecycleCallbacks
{

	public ActivityLifecycleContextListener ()
	{
		super ();
		if (getClass () == ActivityLifecycleContextListener.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.ApplicationModel.ActivityLifecycleContextListener, Microsoft.Maui.Essentials", "", this, new java.lang.Object[] {  });
		}
	}

	public void onActivityCreated (android.app.Activity p0, android.os.Bundle p1)
	{
		n_onActivityCreated (p0, p1);
	}

	private native void n_onActivityCreated (android.app.Activity p0, android.os.Bundle p1);

	public void onActivityDestroyed (android.app.Activity p0)
	{
		n_onActivityDestroyed (p0);
	}

	private native void n_onActivityDestroyed (android.app.Activity p0);

	public void onActivityPaused (android.app.Activity p0)
	{
		n_onActivityPaused (p0);
	}

	private native void n_onActivityPaused (android.app.Activity p0);

	public void onActivityResumed (android.app.Activity p0)
	{
		n_onActivityResumed (p0);
	}

	private native void n_onActivityResumed (android.app.Activity p0);

	public void onActivitySaveInstanceState (android.app.Activity p0, android.os.Bundle p1)
	{
		n_onActivitySaveInstanceState (p0, p1);
	}

	private native void n_onActivitySaveInstanceState (android.app.Activity p0, android.os.Bundle p1);

	public void onActivityStarted (android.app.Activity p0)
	{
		n_onActivityStarted (p0);
	}

	private native void n_onActivityStarted (android.app.Activity p0);

	public void onActivityStopped (android.app.Activity p0)
	{
		n_onActivityStopped (p0);
	}

	private native void n_onActivityStopped (android.app.Activity p0);

	public void onActivityPostCreated (android.app.Activity p0, android.os.Bundle p1)
	{
		n_onActivityPostCreated (p0, p1);
	}

	private native void n_onActivityPostCreated (android.app.Activity p0, android.os.Bundle p1);

	public void onActivityPostDestroyed (android.app.Activity p0)
	{
		n_onActivityPostDestroyed (p0);
	}

	private native void n_onActivityPostDestroyed (android.app.Activity p0);

	public void onActivityPostPaused (android.app.Activity p0)
	{
		n_onActivityPostPaused (p0);
	}

	private native void n_onActivityPostPaused (android.app.Activity p0);

	public void onActivityPostResumed (android.app.Activity p0)
	{
		n_onActivityPostResumed (p0);
	}

	private native void n_onActivityPostResumed (android.app.Activity p0);

	public void onActivityPostSaveInstanceState (android.app.Activity p0, android.os.Bundle p1)
	{
		n_onActivityPostSaveInstanceState (p0, p1);
	}

	private native void n_onActivityPostSaveInstanceState (android.app.Activity p0, android.os.Bundle p1);

	public void onActivityPostStarted (android.app.Activity p0)
	{
		n_onActivityPostStarted (p0);
	}

	private native void n_onActivityPostStarted (android.app.Activity p0);

	public void onActivityPostStopped (android.app.Activity p0)
	{
		n_onActivityPostStopped (p0);
	}

	private native void n_onActivityPostStopped (android.app.Activity p0);

	public void onActivityPreCreated (android.app.Activity p0, android.os.Bundle p1)
	{
		n_onActivityPreCreated (p0, p1);
	}

	private native void n_onActivityPreCreated (android.app.Activity p0, android.os.Bundle p1);

	public void onActivityPreDestroyed (android.app.Activity p0)
	{
		n_onActivityPreDestroyed (p0);
	}

	private native void n_onActivityPreDestroyed (android.app.Activity p0);

	public void onActivityPrePaused (android.app.Activity p0)
	{
		n_onActivityPrePaused (p0);
	}

	private native void n_onActivityPrePaused (android.app.Activity p0);

	public void onActivityPreResumed (android.app.Activity p0)
	{
		n_onActivityPreResumed (p0);
	}

	private native void n_onActivityPreResumed (android.app.Activity p0);

	public void onActivityPreSaveInstanceState (android.app.Activity p0, android.os.Bundle p1)
	{
		n_onActivityPreSaveInstanceState (p0, p1);
	}

	private native void n_onActivityPreSaveInstanceState (android.app.Activity p0, android.os.Bundle p1);

	public void onActivityPreStarted (android.app.Activity p0)
	{
		n_onActivityPreStarted (p0);
	}

	private native void n_onActivityPreStarted (android.app.Activity p0);

	public void onActivityPreStopped (android.app.Activity p0)
	{
		n_onActivityPreStopped (p0);
	}

	private native void n_onActivityPreStopped (android.app.Activity p0);

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
