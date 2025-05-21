package com.google.android.gms.instantapps.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.boff;
import defpackage.boks;
import defpackage.bokt;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dmko;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class InstantAppsChimeraService extends bxgd {
    public InstantAppsChimeraService() {
        super(121, "com.google.android.gms.instantapps.START", Collections.EMPTY_SET, 3, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if (boff.a(this).r.a()) {
            bxgjVar.c(new boks(this, getServiceRequest, l()));
        } else {
            bxgjVar.a(16, null);
        }
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        printWriter.println();
        boff a = boff.a(this);
        if (!a.r.a()) {
            printWriter.println("Disabled by KillSwitch");
            return;
        }
        printWriter.printf("Instant Apps enabled: %s\n", Boolean.valueOf(dmko.a()));
        bokt boktVar = a.c;
        printWriter.printf("Accounts: %s\n", Arrays.toString(boktVar.e()));
        printWriter.printf("Opt-in account: %s\n", boktVar.a());
        printWriter.printf("Opt-in state: %s\n", Integer.valueOf(a.d.a()));
        a.g.i(printWriter);
    }
}
