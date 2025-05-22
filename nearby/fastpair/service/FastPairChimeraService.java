package com.google.android.gms.nearby.fastpair.service;

import android.content.IntentFilter;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.nearby.fastpair.service.FastPairChimeraService;
import defpackage.atzb;
import defpackage.aurb;
import defpackage.ausd;
import defpackage.ause;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.chke;
import defpackage.ckod;
import defpackage.ckpb;
import defpackage.ckyc;
import defpackage.elgo;
import defpackage.elqn;
import defpackage.eluo;
import defpackage.ftes;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class FastPairChimeraService extends bzot {
    public final ckyc a;

    public FastPairChimeraService() {
        super(265, "com.google.android.gms.nearby.fastpair.START", new elqn("android.permission.BLUETOOTH"), 3, 10);
        if (ckyc.b == null) {
            synchronized (ckyc.a) {
                if (ckyc.b == null) {
                    ckyc.b = new ckyc(new ConcurrentHashMap());
                }
            }
        }
        this.a = ckyc.b;
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        atzb.t(str, "package name is null");
        try {
            elgo b = aurb.b(this, str, "SHA-256");
            if (!b.isEmpty()) {
                bzozVar.c(new ckod(l(), str, (byte[]) b.get(0), this.a));
            } else {
                ((eluo) ckpb.a.g().ai(7306)).x("FastPairChimeraService: Empty signature hashes");
                bzozVar.a(13, null);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            ((eluo) ckpb.a.g().ai(7307)).x("FastPairChimeraService: Package not found");
            bzozVar.a(13, null);
        }
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        ause.a(printWriter, strArr, new ausd() { // from class: ckxy
            @Override // defpackage.ausd
            public final void a(PrintWriter printWriter2, String[] strArr2) {
                printWriter2.println();
                printWriter2.println("FastPairChimeraService");
                printWriter2.println("Flags:");
                printWriter2.printf("  enableApiForWearOs=%s\n", Boolean.valueOf(ftey.A()));
                printWriter2.printf("  enableWearablePeripheralApi=%s\n", Boolean.valueOf(ftey.ar()));
                printWriter2.printf("  enableSassApi=%s\n", Boolean.valueOf(ftey.Z()));
                printWriter2.printf("  enableValidatorConnectionApi=%s\n", Boolean.valueOf(ftey.am()));
                printWriter2.println();
                printWriter2.println("PeripheralCallbackManager");
                ckyc ckycVar = FastPairChimeraService.this.a;
                printWriter2.printf("  registered callback count %s\n", Integer.valueOf(ckycVar.e.size()));
                List list = ckycVar.f;
                printWriter2.printf("  last connected peripherals count %d\n", Integer.valueOf(list != null ? list.size() : 0));
                List list2 = ckycVar.f;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        printWriter2.printf("    %s\n", clak.i((clbw) it.next()));
                    }
                }
                List list3 = ckycVar.g;
                printWriter2.printf("  last active peripherals count %d\n", Integer.valueOf(list3 != null ? list3.size() : 0));
                List list4 = ckycVar.g;
                if (list4 != null) {
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        printWriter2.printf("    %s\n", clak.i((clbw) it2.next()));
                    }
                }
            }
        }, "FastPairChimeraService", ftes.ax());
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.nearby.fastpair.service.ACTION_PERIPHERALS_CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.google.android.gms.nearby.fastpair.service.ACTION_PERIPHERALS_ACTIVE_STATE_CHANGED");
        intentFilter.addAction("com.google.android.gms.nearby.fastpair.service.ACTION_PERIPHERALS_API_ENABLED");
        intentFilter.addAction("com.google.android.gms.nearby.fastpair.service.ACTION_PERIPHERALS_API_DISABLED");
        chke.b(this, this.a.d, intentFilter);
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        chke.f(this, this.a.d);
        super.onDestroy();
    }
}
