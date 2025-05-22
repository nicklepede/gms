package com.google.android.gms.instantapps.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bqmv;
import defpackage.bqsi;
import defpackage.bqsj;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dowc;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class InstantAppsChimeraService extends bzot {
    public InstantAppsChimeraService() {
        super(121, "com.google.android.gms.instantapps.START", Collections.EMPTY_SET, 3, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if (bqmv.a(this).r.a()) {
            bzozVar.c(new bqsi(this, getServiceRequest, l()));
        } else {
            bzozVar.a(16, null);
        }
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        printWriter.println();
        bqmv a = bqmv.a(this);
        if (!a.r.a()) {
            printWriter.println("Disabled by KillSwitch");
            return;
        }
        printWriter.printf("Instant Apps enabled: %s\n", Boolean.valueOf(dowc.a()));
        bqsj bqsjVar = a.c;
        printWriter.printf("Accounts: %s\n", Arrays.toString(bqsjVar.e()));
        printWriter.printf("Opt-in account: %s\n", bqsjVar.a());
        printWriter.printf("Opt-in state: %s\n", Integer.valueOf(a.d.a()));
        a.g.i(printWriter);
    }
}
