package com.google.android.gms.games;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.a;
import defpackage.bhjl;
import defpackage.bhjv;
import defpackage.bhjw;
import defpackage.bhpv;
import defpackage.bxhl;
import defpackage.eiuu;
import defpackage.ejck;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GamesAndroidServiceStub extends Service {
    private static final ArrayList a = new ArrayList();
    private static final eiuu b = eiuu.L("com.google.android.gms.games.service.START", "com.google.android.gms.games.service.START_ASYNC", "com.google.android.play.games.service.START_1P");

    static final void a(Intent intent) {
        bhpv.b("GamesService", "Binding to games service: ".concat(String.valueOf(String.valueOf(intent))));
        ArrayList arrayList = a;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((Intent) arrayList.get(i)).filterEquals(intent)) {
                    return;
                }
            }
            bhpv.b("GamesService", a.L(intent, "Adding intent: "));
            arrayList.add(intent);
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.games.internal.connect.service.START".equals(intent.getAction())) {
            a(intent);
            return new bxhl(this, 1, ejck.a, 3, new bhjv(this));
        }
        if ("com.google.android.gms.games.internal.recall.service.START".equals(intent.getAction())) {
            a(intent);
            return new bxhl(this, 1, ejck.a, 3, new bhjw(this));
        }
        if (!b.contains(intent.getAction())) {
            return null;
        }
        a(intent);
        return new bhjl(this);
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
        bhpv.b("GamesService", "Unbinding from games service: ".concat(String.valueOf(String.valueOf(intent))));
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
                    bhpv.b("GamesService", a.L(intent2, "Removing intent: "));
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
        bhpv.b("GamesService", "Unbound from all clients. Cleaning up.");
        return true;
    }
}
