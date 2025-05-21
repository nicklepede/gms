package com.google.android.gms.potokens.service;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.cwpi;
import defpackage.cwqn;
import defpackage.cwqo;
import defpackage.cwqv;
import defpackage.cwrd;
import defpackage.cwry;
import defpackage.dnlj;
import defpackage.ehbu;
import defpackage.ehdf;
import defpackage.eijm;
import defpackage.fecj;
import defpackage.frow;
import defpackage.frpd;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class IntegrityTokenRefreshTaskService extends GmsTaskBoundService {
    private cwqn a;
    private final Context b;
    private final cwry c;

    static {
        asot.b("IntegrityTokenRefreshTaskService", asej.PO_TOKENS);
    }

    public IntegrityTokenRefreshTaskService() {
        this(new cwqo());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        fecj v = ehdf.a.v();
        eijm d = cwpi.d(this.c);
        if (!frpd.c() || !frow.e()) {
            ehbu ehbuVar = ehbu.BACKGROUND_REFRESH_DISABLED;
            if (!v.b.L()) {
                v.U();
            }
            ehdf ehdfVar = (ehdf) v.b;
            ehdfVar.c = ehbuVar.f;
            ehdfVar.b |= 1;
            cwpi.v(v, d);
            return 2;
        }
        if (this.a == null) {
            try {
                Context context = this.b;
                if (context == null) {
                    context = this;
                }
                this.a = cwqn.a(context, 1);
            } catch (GeneralSecurityException unused) {
                ehbu ehbuVar2 = ehbu.BACKGROUND_REFRESH_RESCHEDULED_AFTER_TOKEN_MANAGER_INIT_FAILURE;
                if (!v.b.L()) {
                    v.U();
                }
                ehdf ehdfVar2 = (ehdf) v.b;
                ehdfVar2.c = ehbuVar2.f;
                ehdfVar2.b |= 1;
                cwpi.v(v, d);
                return 1;
            }
        }
        try {
            this.a.b(1, v);
            ehbu ehbuVar3 = ehbu.BACKGROUND_REFRESH_SUCCESS;
            if (!v.b.L()) {
                v.U();
            }
            ehdf ehdfVar3 = (ehdf) v.b;
            ehdfVar3.c = ehbuVar3.f;
            ehdfVar3.b |= 1;
            cwpi.v(v, d);
            return 0;
        } catch (cwqv | cwrd | IOException | GeneralSecurityException unused2) {
            ehbu ehbuVar4 = ehbu.BACKGROUND_REFRESH_RESCHEDULED_AFTER_FAILURE;
            if (!v.b.L()) {
                v.U();
            }
            ehdf ehdfVar4 = (ehdf) v.b;
            ehdfVar4.c = ehbuVar4.f;
            ehdfVar4.b |= 1;
            cwpi.v(v, d);
            return 1;
        }
    }

    public IntegrityTokenRefreshTaskService(cwqn cwqnVar) {
        this.a = cwqnVar;
        this.b = null;
        this.c = new cwry(new dnlj());
    }

    public IntegrityTokenRefreshTaskService(cwqn cwqnVar, cwry cwryVar) {
        this.a = cwqnVar;
        this.b = null;
        this.c = cwryVar;
    }

    public IntegrityTokenRefreshTaskService(cwqo cwqoVar) {
        this.b = null;
        this.c = new cwry(new dnlj());
    }

    public IntegrityTokenRefreshTaskService(cwqo cwqoVar, Context context) {
        this.b = context;
        this.c = new cwry(new dnlj());
    }

    public IntegrityTokenRefreshTaskService(cwqo cwqoVar, cwry cwryVar) {
        this.b = null;
        this.c = cwryVar;
    }
}
