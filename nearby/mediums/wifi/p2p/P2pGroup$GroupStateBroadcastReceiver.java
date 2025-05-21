package com.google.android.gms.nearby.mediums.wifi.p2p;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pInfo;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.asqh;
import defpackage.cjfj;
import defpackage.cjyf;
import defpackage.cjyg;
import defpackage.eigd;
import defpackage.entj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class P2pGroup$GroupStateBroadcastReceiver extends TracingBroadcastReceiver {
    public final entj a;
    public final /* synthetic */ cjyg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2pGroup$GroupStateBroadcastReceiver(cjyg cjygVar, entj entjVar) {
        super("nearby");
        this.b = cjygVar;
        this.a = entjVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        WifiP2pGroup wifiP2pGroup = (WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo");
        WifiP2pInfo wifiP2pInfo = (WifiP2pInfo) intent.getParcelableExtra("wifiP2pInfo");
        if (wifiP2pGroup != null) {
            cjyg cjygVar = this.b;
            if (wifiP2pGroup.getInterface() != null && wifiP2pInfo != null && wifiP2pInfo.groupFormed && wifiP2pInfo.groupOwnerAddress != null) {
                if (asqh.f()) {
                    entj entjVar = this.a;
                    if (!wifiP2pGroup.isGroupOwner()) {
                        cjfj.a.d().h("Ignoring this connection change event for %s because it not a group owner.", cjygVar.g.name());
                        return;
                    }
                    if (wifiP2pGroup.getNetworkName() == null || wifiP2pGroup.getPassphrase() == null) {
                        cjfj.a.d().j("Ignoring the connection change event for %s because the information is empty. Network Name : %s, Passphrase : %s", cjygVar.g.name(), wifiP2pGroup.getNetworkName(), wifiP2pGroup.getPassphrase());
                        return;
                    }
                    String networkName = wifiP2pGroup.getNetworkName();
                    String str = cjygVar.e;
                    if (!eigd.e(networkName, str)) {
                        cjfj.a.b().j("Failed to create a group for %s with SSID %s because a group with SSID %s is already created.", cjygVar.g.name(), str, wifiP2pGroup.getNetworkName());
                        entjVar.r(new Exception("Failed to create group due to receive wrong information"));
                        return;
                    } else if (!eigd.e(wifiP2pGroup.getPassphrase(), cjygVar.f)) {
                        cjfj.a.b().i("Failed to create a group for %s with SSID %s because a group with different password is already created.", cjygVar.g.name(), str);
                        entjVar.r(new Exception("Failed to create group due to receive wrong information"));
                        return;
                    }
                }
                entj entjVar2 = this.a;
                if (!entjVar2.isDone()) {
                    cjfj.a.b().j("Successfully created a P2P Group for %s. SSID=%s, IP address=%s", cjygVar.g.name(), wifiP2pGroup.getNetworkName(), wifiP2pInfo.groupOwnerAddress.getHostAddress());
                    cjygVar.l(wifiP2pGroup, wifiP2pInfo, entjVar2);
                    return;
                }
                cjfj.a.b().j("Update frequency of the P2P Group for %s to %d, local AP frequency is %d", cjygVar.g.name(), Integer.valueOf(asqh.f() ? wifiP2pGroup.getFrequency() : -1), Integer.valueOf(cjygVar.c.a()));
                new cjyf(this, wifiP2pGroup, wifiP2pInfo).start();
                return;
            }
        }
        cjfj.a.d().h("Ignoring this connection change event for %s. Missing fields.", this.b.g.name());
    }
}
