package mono.androidx.work.impl.constraints;


public class ConstraintListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.work.impl.constraints.ConstraintListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onConstraintChanged:(Ljava/lang/Object;)V:GetOnConstraintChanged_Ljava_lang_Object_Handler:AndroidX.Work.Impl.Constraints.IConstraintListenerInvoker, Xamarin.AndroidX.Work.Runtime\n" +
			"";
		mono.android.Runtime.register ("AndroidX.Work.Impl.Constraints.IConstraintListenerImplementor, Xamarin.AndroidX.Work.Runtime", ConstraintListenerImplementor.class, __md_methods);
	}

	public ConstraintListenerImplementor ()
	{
		super ();
		if (getClass () == ConstraintListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.Work.Impl.Constraints.IConstraintListenerImplementor, Xamarin.AndroidX.Work.Runtime", "", this, new java.lang.Object[] {  });
		}
	}

	public void onConstraintChanged (java.lang.Object p0)
	{
		n_onConstraintChanged (p0);
	}

	private native void n_onConstraintChanged (java.lang.Object p0);

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
