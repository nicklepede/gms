package com.google.android.gms.location.geocode;

import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.chimera.Service;
import defpackage.auti;
import defpackage.bsj;
import defpackage.btq;
import defpackage.ccdc;
import defpackage.ccdg;
import defpackage.ccdl;
import defpackage.ccdm;
import defpackage.ccdq;
import defpackage.cceh;
import defpackage.eqex;
import defpackage.iri;
import defpackage.itk;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GeocodeChimeraService extends Service {
    private ccdg a;

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        int i2;
        int i3;
        int i4;
        bsj bsjVar;
        ccdg ccdgVar = this.a;
        if (ccdgVar != null) {
            final auti autiVar = new auti(printWriter, "  ");
            cceh ccehVar = (cceh) ((ccdl) ccdgVar).b.a;
            autiVar.println("Reverse Geocode Cache:");
            autiVar.b();
            autiVar.print("cache size/max = ");
            btq btqVar = ccehVar.f;
            autiVar.print(btqVar.a());
            autiVar.print("/");
            synchronized (btqVar.b) {
                i = btqVar.a;
            }
            autiVar.println(i);
            autiVar.print("cache hit/miss count = ");
            btq btqVar2 = ccehVar.f;
            synchronized (btqVar2.b) {
                i2 = btqVar2.d;
            }
            autiVar.print(i2);
            autiVar.print("/");
            btq btqVar3 = ccehVar.f;
            synchronized (btqVar3.b) {
                i3 = btqVar3.e;
            }
            autiVar.println(i3);
            autiVar.print("cache eviction count = ");
            btq btqVar4 = ccehVar.f;
            synchronized (btqVar4.b) {
                i4 = btqVar4.c;
            }
            autiVar.println(i4);
            autiVar.a();
            autiVar.println();
            autiVar.println("Event Log:");
            autiVar.b();
            ccdq ccdqVar = ccehVar.c;
            Objects.requireNonNull(autiVar);
            itk itkVar = new itk() { // from class: ccdx
                @Override // defpackage.itk
                public final void a(Object obj) {
                    auti.this.println((String) obj);
                }
            };
            ccdqVar.o(new ccdm(new StringBuilder(), System.currentTimeMillis() - SystemClock.elapsedRealtime(), itkVar));
            autiVar.a();
            autiVar.println();
            autiVar.println("Historical Aggregate Data:");
            autiVar.b();
            bsj bsjVar2 = ccdqVar.a;
            synchronized (bsjVar2) {
                bsjVar = new bsj(bsjVar2);
            }
            for (int i5 = 0; i5 < bsjVar.d; i5++) {
                autiVar.print(bsjVar.f(i5));
                autiVar.print(": ");
                autiVar.println(bsjVar.i(i5));
            }
            autiVar.a();
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (this.a == null) {
            int i = ccdc.a;
            int i2 = iri.a;
            ccdl ccdlVar = new ccdl(this);
            this.a = ccdlVar;
            ccdlVar.b.f(eqex.a, new itk() { // from class: ccdk
                @Override // defpackage.itk
                public final void a(Object obj) {
                    ((cceh) obj).g = true;
                }
            });
        }
        return this.a.getBinder();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        ccdg ccdgVar = this.a;
        if (ccdgVar != null) {
            ((ccdl) ccdgVar).b.e(new itk() { // from class: ccdj
                @Override // defpackage.itk
                public final void a(Object obj) {
                    cceh ccehVar = (cceh) obj;
                    ccehVar.g = false;
                    ccehVar.e.clear();
                    ccehVar.f.h();
                }
            });
        }
    }
}
