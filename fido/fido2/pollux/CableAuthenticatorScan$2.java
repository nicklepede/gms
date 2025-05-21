package com.google.android.gms.fido.fido2.pollux;

import defpackage.a;
import defpackage.bbzo;
import defpackage.bbzp;
import defpackage.bhiy;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class CableAuthenticatorScan$2 extends bhiy {
    public final /* synthetic */ bbzp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CableAuthenticatorScan$2(bbzp bbzpVar) {
        super("fido", "CableAuthenticatorScan");
        this.a = bbzpVar;
    }

    @Override // defpackage.bhiy
    public final void b(int i) {
        AtomicReference atomicReference;
        bbzo bbzoVar = bbzo.SCANNING;
        bbzo bbzoVar2 = bbzo.SCAN_COMPLETED;
        do {
            bbzp bbzpVar = this.a;
            atomicReference = bbzpVar.g;
            if (atomicReference.compareAndSet(bbzoVar, bbzoVar2)) {
                bbzpVar.k.a(a.j(i, "Scan failed with errorCode= "));
                return;
            }
        } while (atomicReference.get() == bbzoVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cb, code lost:
    
        defpackage.bbzp.a.h("Found EID for Windows advertisement: 0x%s", defpackage.aspj.d(r2));
        r12 = r12.c.a(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[Catch: bbkr -> 0x00fb, TryCatch #1 {bbkr -> 0x00fb, blocks: (B:2:0x0000, B:4:0x0008, B:7:0x0010, B:12:0x002b, B:13:0x00e0, B:16:0x0042, B:18:0x004d, B:21:0x0054, B:24:0x005b, B:25:0x0060, B:27:0x0066, B:30:0x0072, B:37:0x007a, B:39:0x0098, B:40:0x00ae, B:42:0x00b6, B:45:0x00ba, B:48:0x00c1, B:50:0x00cb, B:51:0x00eb, B:52:0x00f2, B:54:0x0018, B:57:0x001e, B:58:0x00f3, B:59:0x00fa), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[Catch: bbkr -> 0x00fb, TryCatch #1 {bbkr -> 0x00fb, blocks: (B:2:0x0000, B:4:0x0008, B:7:0x0010, B:12:0x002b, B:13:0x00e0, B:16:0x0042, B:18:0x004d, B:21:0x0054, B:24:0x005b, B:25:0x0060, B:27:0x0066, B:30:0x0072, B:37:0x007a, B:39:0x0098, B:40:0x00ae, B:42:0x00b6, B:45:0x00ba, B:48:0x00c1, B:50:0x00cb, B:51:0x00eb, B:52:0x00f2, B:54:0x0018, B:57:0x001e, B:58:0x00f3, B:59:0x00fa), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098 A[Catch: bbkr -> 0x00fb, TryCatch #1 {bbkr -> 0x00fb, blocks: (B:2:0x0000, B:4:0x0008, B:7:0x0010, B:12:0x002b, B:13:0x00e0, B:16:0x0042, B:18:0x004d, B:21:0x0054, B:24:0x005b, B:25:0x0060, B:27:0x0066, B:30:0x0072, B:37:0x007a, B:39:0x0098, B:40:0x00ae, B:42:0x00b6, B:45:0x00ba, B:48:0x00c1, B:50:0x00cb, B:51:0x00eb, B:52:0x00f2, B:54:0x0018, B:57:0x001e, B:58:0x00f3, B:59:0x00fa), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae A[Catch: bbkr -> 0x00fb, TryCatch #1 {bbkr -> 0x00fb, blocks: (B:2:0x0000, B:4:0x0008, B:7:0x0010, B:12:0x002b, B:13:0x00e0, B:16:0x0042, B:18:0x004d, B:21:0x0054, B:24:0x005b, B:25:0x0060, B:27:0x0066, B:30:0x0072, B:37:0x007a, B:39:0x0098, B:40:0x00ae, B:42:0x00b6, B:45:0x00ba, B:48:0x00c1, B:50:0x00cb, B:51:0x00eb, B:52:0x00f2, B:54:0x0018, B:57:0x001e, B:58:0x00f3, B:59:0x00fa), top: B:1:0x0000, inners: #0 }] */
    @Override // defpackage.bhiy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r12, android.bluetooth.le.ScanResult r13) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.pollux.CableAuthenticatorScan$2.c(int, android.bluetooth.le.ScanResult):void");
    }
}
