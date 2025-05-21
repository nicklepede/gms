package com.google.android.gms.vision.clearcut;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import defpackage.aqxq;
import defpackage.aqxr;
import defpackage.dibc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class LoggingConnectionCallbacks implements aqxq, aqxr {
    private String name;
    private long start = System.currentTimeMillis();

    public LoggingConnectionCallbacks(String str) {
        this.name = str;
    }

    @Override // defpackage.aqzv
    public void onConnected(Bundle bundle) {
        System.currentTimeMillis();
    }

    @Override // defpackage.arcf
    public void onConnectionFailed(ConnectionResult connectionResult) {
        dibc.a("Client Connection '%s': connection failed after %dms: connection result %s", this.name, Long.valueOf(System.currentTimeMillis() - this.start), connectionResult);
    }

    @Override // defpackage.aqzv
    public void onConnectionSuspended(int i) {
        dibc.d("Client Connection '%s': connection suspended after %dms: reason %d", this.name, Long.valueOf(System.currentTimeMillis() - this.start), Integer.valueOf(i));
    }
}
