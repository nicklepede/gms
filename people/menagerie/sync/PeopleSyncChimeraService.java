package com.google.android.gms.people.menagerie.sync;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.people.AppContextProvider;
import defpackage.cufa;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PeopleSyncChimeraService extends Service {
    private static final Object a = new Object();
    private static cufa b;

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        AppContextProvider.a();
        printWriter.write("See the provider log\n");
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return b.getSyncAdapterBinder();
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        synchronized (a) {
            if (b == null) {
                b = new cufa(getApplicationContext());
            }
        }
    }
}
