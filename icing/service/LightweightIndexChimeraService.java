package com.google.android.gms.icing.service;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asxe;
import defpackage.auuf;
import defpackage.bnmo;
import defpackage.bnnm;
import defpackage.bnph;
import defpackage.bnpl;
import defpackage.bnsh;
import defpackage.bntc;
import defpackage.bnte;
import defpackage.bofh;
import defpackage.bofl;
import defpackage.bofq;
import defpackage.bogc;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.ekwo;
import defpackage.eqgo;
import defpackage.esuj;
import defpackage.fgtg;
import defpackage.frug;
import defpackage.vpe;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class LightweightIndexChimeraService extends bzot {
    private static bofl a;
    private static bofh b;
    private static bogc c;
    private bntc d;

    public LightweightIndexChimeraService() {
        super(19, "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE", Collections.EMPTY_SET, 3, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bofl boflVar = a;
        bofh bofhVar = b;
        bogc bogcVar = c;
        bntc bntcVar = this.d;
        if (boflVar == null || bofhVar == null || bogcVar == null || bntcVar == null) {
            bnmo.a("LightweightIndexService is unavailable on this device");
            bzozVar.a(16, new Bundle());
            return;
        }
        String str = getServiceRequest.f;
        int i = getServiceRequest.e;
        eqgo eqgoVar = this.f;
        bzpe l = l();
        ekwo ekwoVar = bofq.a;
        new bnte(this);
        bzozVar.c(new vpe(this, eqgoVar, l, str, i, bogcVar, bntcVar, bnsh.a(this), boflVar, bofhVar, asxe.d(this), new esuj(this), getServiceRequest.f, getServiceRequest.p));
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        char c2;
        String str;
        printWriter.println("LightweightIndexChimeraService");
        bogc bogcVar = c;
        if (bogcVar != null) {
            printWriter.println("  Pending usage reports:");
            File fileStreamPath = bogcVar.a.getFileStreamPath(bogcVar.b);
            try {
                FileInputStream fileInputStream = new FileInputStream(fileStreamPath);
                try {
                    char c3 = 7;
                    auuf auufVar = new auuf(fileInputStream, fileStreamPath.length(), bnph.class, (fgtg) bnph.a.iQ(7, null));
                    char c4 = 2;
                    boolean isLoggable = Log.isLoggable("Icing", 2);
                    while (auufVar.hasNext()) {
                        bnph bnphVar = (bnph) auufVar.next();
                        String str2 = bnphVar.c;
                        bnpl b2 = bnpl.b(bnphVar.i);
                        if (b2 == null) {
                            b2 = bnpl.GENERAL_USE;
                        }
                        Long valueOf = Long.valueOf(bnphVar.h);
                        Boolean valueOf2 = Boolean.valueOf((bnphVar.b & 128) != 0);
                        String str3 = bnphVar.e;
                        char c5 = c4;
                        String str4 = bnphVar.f;
                        if (isLoggable) {
                            c2 = c3;
                            str = bnphVar.g;
                        } else {
                            c2 = c3;
                            str = "<redacted>";
                        }
                        bnnm b3 = bnnm.b(bnphVar.m);
                        if (b3 == null) {
                            b3 = bnnm.UNKNOWN;
                        }
                        Object[] objArr = new Object[8];
                        objArr[0] = str2;
                        objArr[1] = b2;
                        objArr[c5] = valueOf;
                        objArr[3] = valueOf2;
                        objArr[4] = str3;
                        objArr[5] = str4;
                        objArr[6] = str;
                        objArr[c2] = b3;
                        printWriter.println("    " + String.format("From %s: type=%s, ts=%d, has_doc=%b Doc[package=%s corpus=%s, uri=%s, status=%s]", objArr));
                        c4 = c5;
                        c3 = c2;
                    }
                    fileInputStream.close();
                } finally {
                }
            } catch (IOException unused) {
                printWriter.println("    <empty>");
            }
            printWriter.println();
        }
        bofl boflVar = a;
        if (boflVar != null) {
            boflVar.b(printWriter);
        }
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        if (frug.j()) {
            synchronized (LightweightIndexChimeraService.class) {
                if (c == null) {
                    c = new bogc(this, "appdatasearch_usage");
                }
            }
            if (a == null) {
                a = new bofl();
            }
            if (b == null) {
                b = new bofh();
            }
            this.d = new bntc(this);
        }
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        bogc bogcVar = c;
        if (bogcVar != null) {
            bogcVar.d();
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final boolean onUnbind(Intent intent) {
        return false;
    }
}
