package com.google.android.gms.icing.service;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aqup;
import defpackage.asql;
import defpackage.blfw;
import defpackage.blgu;
import defpackage.blip;
import defpackage.blit;
import defpackage.bllp;
import defpackage.blmk;
import defpackage.blmm;
import defpackage.blyp;
import defpackage.blyt;
import defpackage.blyy;
import defpackage.blzk;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.eijj;
import defpackage.ensv;
import defpackage.eqgk;
import defpackage.feen;
import defpackage.fpaz;
import defpackage.tte;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class LightweightIndexChimeraService extends bxgd {
    private static blyt a;
    private static blyp b;
    private static blzk c;
    private blmk d;

    public LightweightIndexChimeraService() {
        super(19, "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE", Collections.EMPTY_SET, 3, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        blyt blytVar = a;
        blyp blypVar = b;
        blzk blzkVar = c;
        blmk blmkVar = this.d;
        if (blytVar == null || blypVar == null || blzkVar == null || blmkVar == null) {
            blfw.a("LightweightIndexService is unavailable on this device");
            bxgjVar.a(16, new Bundle());
            return;
        }
        String str = getServiceRequest.f;
        int i = getServiceRequest.e;
        ensv ensvVar = this.f;
        bxgo l = l();
        eijj eijjVar = blyy.a;
        new blmm(this);
        bxgjVar.c(new tte(this, ensvVar, l, str, i, blzkVar, blmkVar, bllp.a(this), blytVar, blypVar, aqup.d(this), new eqgk(this), getServiceRequest.f, getServiceRequest.p));
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        char c2;
        String str;
        printWriter.println("LightweightIndexChimeraService");
        blzk blzkVar = c;
        if (blzkVar != null) {
            printWriter.println("  Pending usage reports:");
            File fileStreamPath = blzkVar.a.getFileStreamPath(blzkVar.b);
            try {
                FileInputStream fileInputStream = new FileInputStream(fileStreamPath);
                try {
                    char c3 = 7;
                    asql asqlVar = new asql(fileInputStream, fileStreamPath.length(), blip.class, (feen) blip.a.iB(7, null));
                    char c4 = 2;
                    boolean isLoggable = Log.isLoggable("Icing", 2);
                    while (asqlVar.hasNext()) {
                        blip blipVar = (blip) asqlVar.next();
                        String str2 = blipVar.c;
                        blit b2 = blit.b(blipVar.i);
                        if (b2 == null) {
                            b2 = blit.GENERAL_USE;
                        }
                        Long valueOf = Long.valueOf(blipVar.h);
                        Boolean valueOf2 = Boolean.valueOf((blipVar.b & 128) != 0);
                        String str3 = blipVar.e;
                        char c5 = c4;
                        String str4 = blipVar.f;
                        if (isLoggable) {
                            c2 = c3;
                            str = blipVar.g;
                        } else {
                            c2 = c3;
                            str = "<redacted>";
                        }
                        blgu b3 = blgu.b(blipVar.m);
                        if (b3 == null) {
                            b3 = blgu.UNKNOWN;
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
        blyt blytVar = a;
        if (blytVar != null) {
            blytVar.b(printWriter);
        }
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        if (fpaz.j()) {
            synchronized (LightweightIndexChimeraService.class) {
                if (c == null) {
                    c = new blzk(this, "appdatasearch_usage");
                }
            }
            if (a == null) {
                a = new blyt();
            }
            if (b == null) {
                b = new blyp();
            }
            this.d = new blmk(this);
        }
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        blzk blzkVar = c;
        if (blzkVar != null) {
            blzkVar.d();
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final boolean onUnbind(Intent intent) {
        return false;
    }
}
