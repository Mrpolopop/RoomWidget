package mono.android.app;


public class DatePickerDialog_OnDateSetListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.app.DatePickerDialog.OnDateSetListener
{

	public DatePickerDialog_OnDateSetListenerImplementor ()
	{
		super ();
		if (getClass () == DatePickerDialog_OnDateSetListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.App.DatePickerDialog+IOnDateSetListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDateSet (android.widget.DatePicker p0, int p1, int p2, int p3)
	{
		n_onDateSet (p0, p1, p2, p3);
	}

	private native void n_onDateSet (android.widget.DatePicker p0, int p1, int p2, int p3);

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
