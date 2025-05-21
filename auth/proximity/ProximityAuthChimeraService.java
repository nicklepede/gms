package com.google.android.gms.auth.proximity;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.a;
import defpackage.achq;
import defpackage.achr;
import defpackage.acpv;
import defpackage.arxo;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ProximityAuthChimeraService extends bxgd {
    public static final arxo a = new arxo("ProximityAuth", "ProximityAuthService");

    public ProximityAuthChimeraService() {
        super(108, "com.google.android.gms.auth.proximity.START", ejck.a, 0, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new acpv(getApplicationContext()));
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        HashMap hashMap;
        printWriter.append("==== ProximityAuthService Dump ====\n");
        achr c = achr.c();
        String str = c.d;
        if (str == null) {
            printWriter.append("\nMy device ID not yet set\n\n");
        } else {
            printWriter.append((CharSequence) a.a(str, "\nMy device ID suffix: ", "\n\n"));
        }
        printWriter.append("\nRegistered Devices: \n\n");
        synchronized (c.c) {
            hashMap = new HashMap();
            for (achq achqVar : c.b.values()) {
                if (achqVar != null) {
                    hashMap.put(achqVar.a, achqVar.toString());
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            printWriter.append((CharSequence) String.valueOf(entry.getKey())).append(": ").append((CharSequence) entry.getValue()).append("\n");
        }
        super.dump(fileDescriptor, printWriter, strArr);
    }
}
