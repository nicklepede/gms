package com.google.android.gms.games;

import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GamesServiceFatalStub extends Service {
    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        Log.e("GamesServiceFatalStub", "Trying to bind to unexpected stub ".concat(String.valueOf(String.valueOf(intent))));
        return null;
    }
}
