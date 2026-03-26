package crc64fcf28c0e24b4cc31;


public class SliderHandler_SeekBarChangeListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.SeekBar.OnSeekBarChangeListener
{

	public SliderHandler_SeekBarChangeListener ()
	{
		super ();
		if (getClass () == SliderHandler_SeekBarChangeListener.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Handlers.SliderHandler+SeekBarChangeListener, Microsoft.Maui", "", this, new java.lang.Object[] {  });
		}
	}

	public void onProgressChanged (android.widget.SeekBar p0, int p1, boolean p2)
	{
		n_onProgressChanged (p0, p1, p2);
	}

	private native void n_onProgressChanged (android.widget.SeekBar p0, int p1, boolean p2);

	public void onStartTrackingTouch (android.widget.SeekBar p0)
	{
		n_onStartTrackingTouch (p0);
	}

	private native void n_onStartTrackingTouch (android.widget.SeekBar p0);

	public void onStopTrackingTouch (android.widget.SeekBar p0)
	{
		n_onStopTrackingTouch (p0);
	}

	private native void n_onStopTrackingTouch (android.widget.SeekBar p0);

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
