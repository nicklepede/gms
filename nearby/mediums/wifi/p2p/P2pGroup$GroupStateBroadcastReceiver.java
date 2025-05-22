package com.google.android.gms.nearby.mediums.wifi.p2p;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pInfo;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.auub;
import defpackage.clno;
import defpackage.cmgk;
import defpackage.cmgl;
import defpackage.ekti;
import defpackage.eqhc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class P2pGroup$GroupStateBroadcastReceiver extends TracingBroadcastReceiver {
    public final eqhc a;
    public final /* synthetic */ cmgl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2pGroup$GroupStateBroadcastReceiver(cmgl cmglVar, eqhc eqhcVar) {
        super("nearby");
        this.b = cmglVar;
        this.a = eqhcVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        WifiP2pGroup wifiP2pGroup = (WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo");
        WifiP2pInfo wifiP2pInfo = (WifiP2pInfo) intent.getParcelableExtra("wifiP2pInfo");
        if (wifiP2pGroup != null) {
            cmgl cmglVar = this.b;
            if (wifiP2pGroup.getInterface() != null && wifiP2pInfo != null && wifiP2pInfo.groupFormed && wifiP2pInfo.groupOwnerAddress != null) {
                if (auub.f()) {
                    eqhc eqhcVar = this.a;
                    if (!wifiP2pGroup.isGroupOwner()) {
                        clno.a.d().h("Ignoring this connection change event for %s because it not a group owner.", cmglVar.g.name());
                        return;
                    }
                    if (wifiP2pGroup.getNetworkName() == null || wifiP2pGroup.getPassphrase() == null) {
                        clno.a.d().j("Ignoring the connection change event for %s because the information is empty. Network Name : %s, Passphrase : %s", cmglVar.g.name(), wifiP2pGroup.getNetworkName(), wifiP2pGroup.getPassphrase());
                        return;
                    }
                    String networkName = wifiP2pGroup.getNetworkName();
                    String str = cmglVar.e;
                    if (!ekti.e(networkName, str)) {
                        clno.a.b().j("Failed to create a group for %s with SSID %s because a group with SSID %s is already created.", cmglVar.g.name(), str, wifiP2pGroup.getNetworkName());
                        eqhcVar.r(new Exception("Failed to create group due to receive wrong information"));
                        return;
                    } else if (!ekti.e(wifiP2pGroup.getPassphrase(), cmglVar.f)) {
                        clno.a.b().i("Failed to create a group for %s with SSID %s because a group with different password is already created.", cmglVar.g.name(), str);
                        eqhcVar.r(new Exception("Failed to create group due to receive wrong information"));
                        return;
                    }
                }
                eqhc eqhcVar2 = this.a;
                if (!eqhcVar2.isDone()) {
                    clno.a.b().j("Successfully created a P2P Group for %s. SSID=%s, IP address=%s", cmglVar.g.name(), wifiP2pGroup.getNetworkName(), wifiP2pInfo.groupOwnerAddress.getHostAddress());
                    cmglVar.l(wifiP2pGroup, wifiP2pInfo, eqhcVar2);
                    return;
                }
                clno.a.b().j("Update frequency of the P2P Group for %s to %d, local AP frequency is %d", cmglVar.g.name(), Integer.valueOf(auub.f() ? wifiP2pGroup.getFrequency() : -1), Integer.valueOf(cmglVar.c.a()));
                new cmgk(this, wifiP2pGroup, wifiP2pInfo).start();
                return;
            }
        }
        clno.a.d().h("Ignoring this connection change event for %s. Missing fields.", this.b.g.name());
    }
}
