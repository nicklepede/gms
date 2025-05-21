package com.google.android.gms.clearcut.service;

import android.os.Build;
import com.google.android.gms.chimera.modules.clearcut.AppContextProvider;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.apui;
import defpackage.apvb;
import defpackage.aqbm;
import defpackage.aqbt;
import defpackage.aqdi;
import defpackage.aqer;
import defpackage.aqev;
import defpackage.arug;
import defpackage.asmf;
import defpackage.aspm;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eijj;
import defpackage.eits;
import defpackage.eiuu;
import defpackage.ensv;
import defpackage.ficv;
import defpackage.fmha;
import defpackage.fmhg;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ClearcutLoggerChimeraService extends bxgd {
    public static final ensv a = new asmf(1, 10);
    public static final apui b = new aqbt(AppContextProvider.a());
    public static final Set c = eiuu.L("LB_C", "CL_C", "CL_DM");
    private apvb d;
    private aqer m;

    public ClearcutLoggerChimeraService() {
        super(new int[]{40}, new String[]{"com.google.android.gms.clearcut.service.START"}, Collections.EMPTY_SET, 3, a, (eits) null);
    }

    public static boolean c(String str) {
        if (new arug(str).b()) {
            return eijj.e(',').n(fmhg.a.a().a()).contains(str) || Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu") || Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys");
        }
        return false;
    }

    public static boolean d(List list, PlayLoggerContext playLoggerContext) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ficv ficvVar = (ficv) it.next();
            if (ficvVar.c == playLoggerContext.c || ficvVar.b.equals(playLoggerContext.f)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if (fmha.e() && this.d == null) {
            this.d = apvb.a();
        }
        bxgjVar.c(new aqbm(this, l(), this.m, bxgjVar, getServiceRequest.f, this.d));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        this.m = aqev.c();
        if (fmha.e()) {
            this.d = apvb.a();
        }
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        aspm.f(this.m);
        aqdi.b().close();
        super.onDestroy();
    }
}
