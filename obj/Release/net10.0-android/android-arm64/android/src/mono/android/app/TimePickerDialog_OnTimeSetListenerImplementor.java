package mono.android.app;


public class TimePickerDialog_OnTimeSetListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.app.TimePickerDialog.OnTimeSetListener
{

	public TimePickerDialog_OnTimeSetListenerImplementor ()
	{
		super ();
		if (getClass () == TimePickerDialog_OnTimeSetListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.App.TimePickerDialog+IOnTimeSetListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onTimeSet (android.widget.TimePicker p0, int p1, int p2)
	{
		n_onTimeSet (p0, p1, p2);
	}

	private native void n_onTimeSet (android.widget.TimePicker p0, int p1, int p2);

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
