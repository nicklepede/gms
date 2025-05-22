package com.google.android.gms.games;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.a;
import defpackage.bjoa;
import defpackage.bjok;
import defpackage.bjol;
import defpackage.bjuk;
import defpackage.bzqb;
import defpackage.elhz;
import defpackage.elpp;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GamesAndroidServiceStub extends Service {
    private static final ArrayList a = new ArrayList();
    private static final elhz b = elhz.L("com.google.android.gms.games.service.START", "com.google.android.gms.games.service.START_ASYNC", "com.google.android.play.games.service.START_1P");

    static final void a(Intent intent) {
        bjuk.b("GamesService", "Binding to games service: ".concat(String.valueOf(String.valueOf(intent))));
        ArrayList arrayList = a;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((Intent) arrayList.get(i)).filterEquals(intent)) {
                    return;
                }
            }
            bjuk.b("GamesService", a.N(intent, "Adding intent: "));
            arrayList.add(intent);
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.games.internal.connect.service.START".equals(intent.getAction())) {
            a(intent);
            return new bzqb(this, 1, elpp.a, 3, new bjok(this));
        }
        if ("com.google.android.gms.games.internal.recall.service.START".equals(intent.getAction())) {
            a(intent);
            return new bzqb(this, 1, elpp.a, 3, new bjol(this));
        }
        if (!b.contains(intent.getAction())) {
            return null;
        }
        a(intent);
        return new bjoa(this);
    }

    @Override // com.google.android.chimera.Service
    public final void onRebind(Intent intent) {
        if ("com.google.android.gms.games.service.START".equals(intent.getAction())) {
            a(intent);
        }
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        boolean isEmpty;
        bjuk.b("GamesService", "Unbinding from games service: ".concat(String.valueOf(String.valueOf(intent))));
        ArrayList arrayList = a;
        synchronized (arrayList) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Intent intent2 = (Intent) arrayList.get(i);
                if (intent2.filterEquals(intent)) {
                    bjuk.b("GamesService", a.N(intent2, "Removing intent: "));
                    arrayList.remove(i);
                    break;
                }
                i++;
            }
            isEmpty = arrayList.isEmpty();
        }
        if (!isEmpty) {
            return true;
        }
        bjuk.b("GamesService", "Unbound from all clients. Cleaning up.");
        return true;
    }
}
