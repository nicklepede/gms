package com.google.android.gms.personalsafety.service;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.cxzc;
import defpackage.cxze;
import defpackage.cyeh;
import defpackage.cygn;
import defpackage.eluo;
import defpackage.eqcy;
import defpackage.eygu;
import defpackage.eylt;
import defpackage.eylu;
import defpackage.eymj;
import defpackage.fgrc;
import defpackage.fpro;
import j$.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PersonalSafetyLoggerService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private cxzc b;
    private cygn c;

    public PersonalSafetyLoggerService() {
    }

    private final int d() {
        try {
            boolean booleanValue = ((Boolean) ((eqcy) this.c.b()).v(5000L, TimeUnit.MILLISECONDS)).booleanValue();
            boolean c = cyeh.c(this);
            boolean d = cyeh.d(this);
            boolean b = cyeh.b(this);
            boolean e = cyeh.e(this);
            eylt eyltVar = (eylt) eylu.a.v();
            fgrc v = eymj.a.v();
            int i = true != booleanValue ? 3 : 2;
            if (!v.b.L()) {
                v.U();
            }
            eymj eymjVar = (eymj) v.b;
            eymjVar.c = i - 1;
            eymjVar.b |= 1;
            eymj eymjVar2 = (eymj) v.Q();
            if (!eyltVar.b.L()) {
                eyltVar.U();
            }
            eylu eyluVar = (eylu) eyltVar.b;
            eymjVar2.getClass();
            eyluVar.c = eymjVar2;
            eyluVar.b |= 1;
            if (!eyltVar.b.L()) {
                eyltVar.U();
            }
            eylu eyluVar2 = (eylu) eyltVar.b;
            eyluVar2.b |= 2;
            eyluVar2.d = c;
            if (!eyltVar.b.L()) {
                eyltVar.U();
            }
            eylu eyluVar3 = (eylu) eyltVar.b;
            eyluVar3.b |= 4;
            eyluVar3.e = d;
            if (!eyltVar.b.L()) {
                eyltVar.U();
            }
            eylu eyluVar4 = (eylu) eyltVar.b;
            eyluVar4.b |= 8;
            eyluVar4.f = b;
            if (!eyltVar.b.L()) {
                eyltVar.U();
            }
            eylu eyluVar5 = (eylu) eyltVar.b;
            eyluVar5.b |= 16;
            eyluVar5.g = e;
            eyltVar.a(1);
            eyltVar.a(5);
            if (fpro.Z()) {
                eyltVar.a(6);
            }
            cxzc cxzcVar = this.b;
            eylu eyluVar6 = (eylu) eyltVar.Q();
            fgrc v2 = eygu.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            eygu eyguVar = (eygu) v2.b;
            eyluVar6.getClass();
            eyguVar.K = eyluVar6;
            eyguVar.c = 2 | eyguVar.c;
            cxzcVar.m((eygu) v2.Q(), 36);
            ausn ausnVar = cxze.a;
            cyeh.c(this);
            cyeh.d(this);
            cyeh.b(this);
            cyeh.e(this);
            return 0;
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            ((eluo) ((eluo) ((eluo) cxze.a.j()).s(e2)).ai((char) 8692)).x("Error reading PDS opt-in status");
            return 2;
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        cxzc cxzcVar = this.b;
        if (cxzcVar == null) {
            cxzcVar = cxzc.a(this);
        }
        this.b = cxzcVar;
        this.c = cygn.a();
        if (Objects.equals(caufVar.a, "personal_safety_setting")) {
            return d();
        }
        return 2;
    }

    PersonalSafetyLoggerService(cxzc cxzcVar) {
        this.b = cxzcVar;
    }
}
