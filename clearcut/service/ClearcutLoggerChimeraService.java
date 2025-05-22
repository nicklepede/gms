package com.google.android.gms.clearcut.service;

import android.os.Build;
import com.google.android.gms.chimera.modules.clearcut.AppContextProvider;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.arwz;
import defpackage.arxs;
import defpackage.ased;
import defpackage.asek;
import defpackage.asfz;
import defpackage.ashi;
import defpackage.ashm;
import defpackage.atwv;
import defpackage.aupz;
import defpackage.autg;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.ekwo;
import defpackage.elgx;
import defpackage.elhz;
import defpackage.eqgo;
import defpackage.fkss;
import defpackage.foym;
import defpackage.foys;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ClearcutLoggerChimeraService extends bzot {
    public static final eqgo a = new aupz(1, 10);
    public static final arwz b = new asek(AppContextProvider.a());
    public static final Set c = elhz.L("LB_C", "CL_C", "CL_DM");
    private arxs d;
    private ashi m;

    public ClearcutLoggerChimeraService() {
        super(new int[]{40}, new String[]{"com.google.android.gms.clearcut.service.START"}, Collections.EMPTY_SET, 3, a, (elgx) null);
    }

    public static boolean c(String str) {
        if (new atwv(str).b()) {
            return ekwo.e(',').n(foys.a.lK().a()).contains(str) || Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu") || Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys");
        }
        return false;
    }

    public static boolean d(List list, PlayLoggerContext playLoggerContext) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fkss fkssVar = (fkss) it.next();
            if (fkssVar.c == playLoggerContext.c || fkssVar.b.equals(playLoggerContext.f)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if (foym.e() && this.d == null) {
            this.d = arxs.a();
        }
        bzozVar.c(new ased(this, l(), this.m, bzozVar, getServiceRequest.f, this.d));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        this.m = ashm.c();
        if (foym.e()) {
            this.d = arxs.a();
        }
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        autg.f(this.m);
        asfz.b().close();
        super.onDestroy();
    }
}
