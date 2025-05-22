package com.google.android.gms.vision.clearcut;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import defpackage.ataf;
import defpackage.atag;
import defpackage.dkmn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class LoggingConnectionCallbacks implements ataf, atag {
    private String name;
    private long start = System.currentTimeMillis();

    public LoggingConnectionCallbacks(String str) {
        this.name = str;
    }

    @Override // defpackage.atck
    public void onConnected(Bundle bundle) {
        System.currentTimeMillis();
    }

    @Override // defpackage.ateu
    public void onConnectionFailed(ConnectionResult connectionResult) {
        dkmn.a("Client Connection '%s': connection failed after %dms: connection result %s", this.name, Long.valueOf(System.currentTimeMillis() - this.start), connectionResult);
    }

    @Override // defpackage.atck
    public void onConnectionSuspended(int i) {
        dkmn.d("Client Connection '%s': connection suspended after %dms: reason %d", this.name, Long.valueOf(System.currentTimeMillis() - this.start), Integer.valueOf(i));
    }
}
