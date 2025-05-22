package com.google.android.gms.auth.proximity;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.a;
import defpackage.aehq;
import defpackage.aehr;
import defpackage.aepv;
import defpackage.auad;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ProximityAuthChimeraService extends bzot {
    public static final auad a = new auad("ProximityAuth", "ProximityAuthService");

    public ProximityAuthChimeraService() {
        super(108, "com.google.android.gms.auth.proximity.START", elpp.a, 0, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new aepv(getApplicationContext()));
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        HashMap hashMap;
        printWriter.append("==== ProximityAuthService Dump ====\n");
        aehr c = aehr.c();
        String str = c.d;
        if (str == null) {
            printWriter.append("\nMy device ID not yet set\n\n");
        } else {
            printWriter.append((CharSequence) a.a(str, "\nMy device ID suffix: ", "\n\n"));
        }
        printWriter.append("\nRegistered Devices: \n\n");
        synchronized (c.c) {
            hashMap = new HashMap();
            for (aehq aehqVar : c.b.values()) {
                if (aehqVar != null) {
                    hashMap.put(aehqVar.a, aehqVar.toString());
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            printWriter.append((CharSequence) String.valueOf(entry.getKey())).append(": ").append((CharSequence) entry.getValue()).append("\n");
        }
        super.dump(fileDescriptor, printWriter, strArr);
    }
}
