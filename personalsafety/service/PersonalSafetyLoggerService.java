package com.google.android.gms.personalsafety.service;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asot;
import defpackage.byln;
import defpackage.cvpm;
import defpackage.cvpo;
import defpackage.cvuk;
import defpackage.cvwq;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.evqy;
import defpackage.evvx;
import defpackage.evvy;
import defpackage.evwn;
import defpackage.fecj;
import defpackage.fmzp;
import j$.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PersonalSafetyLoggerService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private cvpm b;
    private cvwq c;

    public PersonalSafetyLoggerService() {
    }

    private final int d() {
        try {
            boolean booleanValue = ((Boolean) ((enpf) this.c.b()).v(5000L, TimeUnit.MILLISECONDS)).booleanValue();
            boolean c = cvuk.c(this);
            boolean d = cvuk.d(this);
            boolean b = cvuk.b(this);
            boolean e = cvuk.e(this);
            evvx evvxVar = (evvx) evvy.a.v();
            fecj v = evwn.a.v();
            int i = true != booleanValue ? 3 : 2;
            if (!v.b.L()) {
                v.U();
            }
            evwn evwnVar = (evwn) v.b;
            evwnVar.c = i - 1;
            evwnVar.b |= 1;
            evwn evwnVar2 = (evwn) v.Q();
            if (!evvxVar.b.L()) {
                evvxVar.U();
            }
            evvy evvyVar = (evvy) evvxVar.b;
            evwnVar2.getClass();
            evvyVar.c = evwnVar2;
            evvyVar.b |= 1;
            if (!evvxVar.b.L()) {
                evvxVar.U();
            }
            evvy evvyVar2 = (evvy) evvxVar.b;
            evvyVar2.b |= 2;
            evvyVar2.d = c;
            if (!evvxVar.b.L()) {
                evvxVar.U();
            }
            evvy evvyVar3 = (evvy) evvxVar.b;
            evvyVar3.b |= 4;
            evvyVar3.e = d;
            if (!evvxVar.b.L()) {
                evvxVar.U();
            }
            evvy evvyVar4 = (evvy) evvxVar.b;
            evvyVar4.b |= 8;
            evvyVar4.f = b;
            if (!evvxVar.b.L()) {
                evvxVar.U();
            }
            evvy evvyVar5 = (evvy) evvxVar.b;
            evvyVar5.b |= 16;
            evvyVar5.g = e;
            evvxVar.a(1);
            evvxVar.a(5);
            if (fmzp.W()) {
                evvxVar.a(6);
            }
            cvpm cvpmVar = this.b;
            evvy evvyVar6 = (evvy) evvxVar.Q();
            fecj v2 = evqy.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            evqy evqyVar = (evqy) v2.b;
            evvyVar6.getClass();
            evqyVar.K = evvyVar6;
            evqyVar.c = 2 | evqyVar.c;
            cvpmVar.m((evqy) v2.Q(), 36);
            asot asotVar = cvpo.a;
            cvuk.c(this);
            cvuk.d(this);
            cvuk.b(this);
            cvuk.e(this);
            return 0;
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            ((ejhf) ((ejhf) ((ejhf) cvpo.a.j()).s(e2)).ah((char) 8694)).x("Error reading PDS opt-in status");
            return 2;
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        cvpm cvpmVar = this.b;
        if (cvpmVar == null) {
            cvpmVar = cvpm.a(this);
        }
        this.b = cvpmVar;
        this.c = cvwq.a();
        if (Objects.equals(bylnVar.a, "personal_safety_setting")) {
            return d();
        }
        return 2;
    }

    PersonalSafetyLoggerService(cvpm cvpmVar) {
        this.b = cvpmVar;
    }
}
