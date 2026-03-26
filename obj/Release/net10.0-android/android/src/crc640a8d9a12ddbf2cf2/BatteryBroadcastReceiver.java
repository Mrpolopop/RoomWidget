package crc640a8d9a12ddbf2cf2;


public class BatteryBroadcastReceiver
	extends android.content.BroadcastReceiver
	implements
		mono.android.IGCUserPeer
{

	public BatteryBroadcastReceiver ()
	{
		super ();
		if (getClass () == BatteryBroadcastReceiver.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Devices.BatteryBroadcastReceiver, Microsoft.Maui.Essentials", "", this, new java.lang.Object[] {  });
		}
	}

	public void onReceive (android.content.Context p0, android.content.Intent p1)
	{
		n_onReceive (p0, p1);
	}

	private native void n_onReceive (android.content.Context p0, android.content.Intent p1);

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
