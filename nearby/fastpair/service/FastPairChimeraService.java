package com.google.android.gms.nearby.fastpair.service;

import android.content.IntentFilter;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.nearby.fastpair.service.FastPairChimeraService;
import defpackage.arwm;
import defpackage.asnh;
import defpackage.asoj;
import defpackage.asok;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.cfcs;
import defpackage.cify;
import defpackage.cigw;
import defpackage.cipx;
import defpackage.eitj;
import defpackage.ejdg;
import defpackage.ejhf;
import defpackage.fqkx;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class FastPairChimeraService extends bxgd {
    public final cipx a;

    public FastPairChimeraService() {
        super(265, "com.google.android.gms.nearby.fastpair.START", new ejdg("android.permission.BLUETOOTH"), 3, 10);
        if (cipx.b == null) {
            synchronized (cipx.a) {
                if (cipx.b == null) {
                    cipx.b = new cipx(new ConcurrentHashMap());
                }
            }
        }
        this.a = cipx.b;
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        arwm.t(str, "package name is null");
        try {
            eitj b = asnh.b(this, str, "SHA-256");
            if (!b.isEmpty()) {
                bxgjVar.c(new cify(l(), str, (byte[]) b.get(0), this.a));
            } else {
                ((ejhf) cigw.a.g().ah(7357)).x("FastPairChimeraService: Empty signature hashes");
                bxgjVar.a(13, null);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            ((ejhf) cigw.a.g().ah(7358)).x("FastPairChimeraService: Package not found");
            bxgjVar.a(13, null);
        }
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        asok.a(printWriter, strArr, new asoj() { // from class: cipt
            @Override // defpackage.asoj
            public final void a(PrintWriter printWriter2, String[] strArr2) {
                printWriter2.println();
                printWriter2.println("FastPairChimeraService");
                printWriter2.println("Flags:");
                printWriter2.printf("  enableApiForWearOs=%s\n", Boolean.valueOf(fqld.z()));
                printWriter2.printf("  enableWearablePeripheralApi=%s\n", Boolean.valueOf(fqld.aq()));
                printWriter2.printf("  enableSassApi=%s\n", Boolean.valueOf(fqld.Y()));
                printWriter2.printf("  enableValidatorConnectionApi=%s\n", Boolean.valueOf(fqld.al()));
                printWriter2.println();
                printWriter2.println("PeripheralCallbackManager");
                cipx cipxVar = FastPairChimeraService.this.a;
                printWriter2.printf("  registered callback count %s\n", Integer.valueOf(cipxVar.e.size()));
                List list = cipxVar.f;
                printWriter2.printf("  last connected peripherals count %d\n", Integer.valueOf(list != null ? list.size() : 0));
                List list2 = cipxVar.f;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        printWriter2.printf("    %s\n", cisf.i((citr) it.next()));
                    }
                }
                List list3 = cipxVar.g;
                printWriter2.printf("  last active peripherals count %d\n", Integer.valueOf(list3 != null ? list3.size() : 0));
                List list4 = cipxVar.g;
                if (list4 != null) {
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        printWriter2.printf("    %s\n", cisf.i((citr) it2.next()));
                    }
                }
            }
        }, "FastPairChimeraService", fqkx.ax());
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.nearby.fastpair.service.ACTION_PERIPHERALS_CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.google.android.gms.nearby.fastpair.service.ACTION_PERIPHERALS_ACTIVE_STATE_CHANGED");
        intentFilter.addAction("com.google.android.gms.nearby.fastpair.service.ACTION_PERIPHERALS_API_ENABLED");
        intentFilter.addAction("com.google.android.gms.nearby.fastpair.service.ACTION_PERIPHERALS_API_DISABLED");
        cfcs.b(this, this.a.d, intentFilter);
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        cfcs.f(this, this.a.d);
        super.onDestroy();
    }
}
