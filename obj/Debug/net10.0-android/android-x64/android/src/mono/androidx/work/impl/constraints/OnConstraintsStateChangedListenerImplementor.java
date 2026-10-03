package mono.androidx.work.impl.constraints;


public class OnConstraintsStateChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.work.impl.constraints.OnConstraintsStateChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onConstraintsStateChanged:(Landroidx/work/impl/model/WorkSpec;Landroidx/work/impl/constraints/ConstraintsState;)V:GetOnConstraintsStateChanged_Landroidx_work_impl_model_WorkSpec_Landroidx_work_impl_constraints_ConstraintsState_Handler:AndroidX.Work.Impl.Constraints.IOnConstraintsStateChangedListenerInvoker, Xamarin.AndroidX.Work.Runtime\n" +
			"";
		mono.android.Runtime.register ("AndroidX.Work.Impl.Constraints.IOnConstraintsStateChangedListenerImplementor, Xamarin.AndroidX.Work.Runtime", OnConstraintsStateChangedListenerImplementor.class, __md_methods);
	}

	public OnConstraintsStateChangedListenerImplementor ()
	{
		super ();
		if (getClass () == OnConstraintsStateChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.Work.Impl.Constraints.IOnConstraintsStateChangedListenerImplementor, Xamarin.AndroidX.Work.Runtime", "", this, new java.lang.Object[] {  });
		}
	}

	public void onConstraintsStateChanged (androidx.work.impl.model.WorkSpec p0, androidx.work.impl.constraints.ConstraintsState p1)
	{
		n_onConstraintsStateChanged (p0, p1);
	}

	private native void n_onConstraintsStateChanged (androidx.work.impl.model.WorkSpec p0, androidx.work.impl.constraints.ConstraintsState p1);

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
