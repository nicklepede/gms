package com.google.android.gms.location.geocode;

import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.chimera.Service;
import defpackage.aspo;
import defpackage.bry;
import defpackage.btd;
import defpackage.bzul;
import defpackage.bzup;
import defpackage.bzuu;
import defpackage.bzuv;
import defpackage.bzuz;
import defpackage.bzvq;
import defpackage.enre;
import defpackage.ips;
import defpackage.iru;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GeocodeChimeraService extends Service {
    private bzup a;

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        int i2;
        int i3;
        int i4;
        bry bryVar;
        bzup bzupVar = this.a;
        if (bzupVar != null) {
            final aspo aspoVar = new aspo(printWriter, "  ");
            bzvq bzvqVar = (bzvq) ((bzuu) bzupVar).b.a;
            aspoVar.println("Reverse Geocode Cache:");
            aspoVar.b();
            aspoVar.print("cache size/max = ");
            btd btdVar = bzvqVar.f;
            aspoVar.print(btdVar.a());
            aspoVar.print("/");
            synchronized (btdVar.b) {
                i = btdVar.a;
            }
            aspoVar.println(i);
            aspoVar.print("cache hit/miss count = ");
            btd btdVar2 = bzvqVar.f;
            synchronized (btdVar2.b) {
                i2 = btdVar2.d;
            }
            aspoVar.print(i2);
            aspoVar.print("/");
            btd btdVar3 = bzvqVar.f;
            synchronized (btdVar3.b) {
                i3 = btdVar3.e;
            }
            aspoVar.println(i3);
            aspoVar.print("cache eviction count = ");
            btd btdVar4 = bzvqVar.f;
            synchronized (btdVar4.b) {
                i4 = btdVar4.c;
            }
            aspoVar.println(i4);
            aspoVar.a();
            aspoVar.println();
            aspoVar.println("Event Log:");
            aspoVar.b();
            bzuz bzuzVar = bzvqVar.c;
            Objects.requireNonNull(aspoVar);
            iru iruVar = new iru() { // from class: bzvg
                @Override // defpackage.iru
                public final void a(Object obj) {
                    aspo.this.println((String) obj);
                }
            };
            bzuzVar.o(new bzuv(new StringBuilder(), System.currentTimeMillis() - SystemClock.elapsedRealtime(), iruVar));
            aspoVar.a();
            aspoVar.println();
            aspoVar.println("Historical Aggregate Data:");
            aspoVar.b();
            bry bryVar2 = bzuzVar.a;
            synchronized (bryVar2) {
                bryVar = new bry(bryVar2);
            }
            for (int i5 = 0; i5 < bryVar.d; i5++) {
                aspoVar.print(bryVar.f(i5));
                aspoVar.print(": ");
                aspoVar.println(bryVar.i(i5));
            }
            aspoVar.a();
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (this.a == null) {
            int i = bzul.a;
            int i2 = ips.a;
            bzuu bzuuVar = new bzuu(this);
            this.a = bzuuVar;
            bzuuVar.b.f(enre.a, new iru() { // from class: bzut
                @Override // defpackage.iru
                public final void a(Object obj) {
                    ((bzvq) obj).g = true;
                }
            });
        }
        return this.a.getBinder();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        bzup bzupVar = this.a;
        if (bzupVar != null) {
            ((bzuu) bzupVar).b.e(new iru() { // from class: bzus
                @Override // defpackage.iru
                public final void a(Object obj) {
                    bzvq bzvqVar = (bzvq) obj;
                    bzvqVar.g = false;
                    bzvqVar.e.clear();
                    bzvqVar.f.h();
                }
            });
        }
    }
}
