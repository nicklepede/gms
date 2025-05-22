package com.google.android.gms.gcm.connection;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.bkfx;
import defpackage.bkhb;
import defpackage.bkhc;
import defpackage.ektg;
import defpackage.ekvi;
import j$.util.Objects;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ConnectivityManagerVariantImplSynchronous extends TracingBroadcastReceiver implements bkfx {
    public final Context a;
    final ConnectivityManager b;
    final bkhc c;

    public ConnectivityManagerVariantImplSynchronous(Context context, ConnectivityManager connectivityManager, bkhc bkhcVar) {
        super("ConnectivityManagerVariantImplM");
        this.a = context;
        this.b = connectivityManager;
        this.c = bkhcVar;
    }

    static int e(NetworkInfo networkInfo) {
        int type = networkInfo.getType();
        int i = 9;
        if (type != 9) {
            i = 17;
            if (type != 17) {
                switch (type) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return 0;
                    case 1:
                        return 1;
                    case 6:
                        return 6;
                    case 7:
                        return 7;
                    default:
                        return -1;
                }
            }
        }
        return i;
    }

    static boolean f(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.getType() == 0 && Objects.equals(networkInfo.getExtraInfo(), "ims");
    }

    @Override // defpackage.bkfx
    public final ekvi b() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = this.b;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return (activeNetwork == null || (networkInfo = connectivityManager.getNetworkInfo(activeNetwork)) == null || f(networkInfo)) ? ektg.a : ekvi.j(bkhb.a(activeNetwork, e(networkInfo), networkInfo.isConnected()));
    }

    @Override // defpackage.bkfx
    public final Collection c() {
        ArrayList arrayList = new ArrayList();
        ConnectivityManager connectivityManager = this.b;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
            if (networkInfo != null && !f(networkInfo)) {
                arrayList.add(bkhb.a(network, e(networkInfo), networkInfo.isConnected()));
            }
        }
        return arrayList;
    }

    @Override // defpackage.bkfx
    public final void d(PrintWriter printWriter) {
        printWriter.println("ConnectivityManagerVariantImplSynchronous: nothing to dump");
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        ekvi ekviVar;
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo == null || f(networkInfo)) {
            return;
        }
        int type = networkInfo.getType();
        ConnectivityManager connectivityManager = this.b;
        Network[] allNetworks = connectivityManager.getAllNetworks();
        int length = allNetworks.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                ekviVar = ektg.a;
                break;
            }
            Network network = allNetworks[i];
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(network);
            if (!f(networkInfo2) && networkInfo2 != null && networkInfo2.getType() == type) {
                ekviVar = ekvi.j(bkhb.a(network, e(networkInfo2), networkInfo2.isConnected()));
                break;
            }
            i++;
        }
        if (ekviVar.h()) {
            this.c.b((bkhb) ekviVar.c(), false);
            return;
        }
        this.c.b(new bkhb(ektg.a, networkInfo.getType(), -1, true, false), true);
    }
}
