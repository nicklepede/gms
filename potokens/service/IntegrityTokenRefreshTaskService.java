package com.google.android.gms.potokens.service;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.cyzf;
import defpackage.czak;
import defpackage.czal;
import defpackage.czas;
import defpackage.czba;
import defpackage.czbv;
import defpackage.dpvs;
import defpackage.ejoz;
import defpackage.ejqk;
import defpackage.ekwr;
import defpackage.fgrc;
import defpackage.fujb;
import defpackage.fuji;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class IntegrityTokenRefreshTaskService extends GmsTaskBoundService {
    private czak a;
    private final Context b;
    private final czbv c;

    static {
        ausn.b("IntegrityTokenRefreshTaskService", auid.PO_TOKENS);
    }

    public IntegrityTokenRefreshTaskService() {
        this(new czal());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        fgrc v = ejqk.a.v();
        ekwr d = cyzf.d(this.c);
        if (!fuji.c() || !fujb.e()) {
            ejoz ejozVar = ejoz.BACKGROUND_REFRESH_DISABLED;
            if (!v.b.L()) {
                v.U();
            }
            ejqk ejqkVar = (ejqk) v.b;
            ejqkVar.c = ejozVar.f;
            ejqkVar.b |= 1;
            cyzf.v(v, d);
            return 2;
        }
        if (this.a == null) {
            try {
                Context context = this.b;
                if (context == null) {
                    context = this;
                }
                this.a = czak.a(context, 1);
            } catch (GeneralSecurityException unused) {
                ejoz ejozVar2 = ejoz.BACKGROUND_REFRESH_RESCHEDULED_AFTER_TOKEN_MANAGER_INIT_FAILURE;
                if (!v.b.L()) {
                    v.U();
                }
                ejqk ejqkVar2 = (ejqk) v.b;
                ejqkVar2.c = ejozVar2.f;
                ejqkVar2.b |= 1;
                cyzf.v(v, d);
                return 1;
            }
        }
        try {
            this.a.b(1, v);
            ejoz ejozVar3 = ejoz.BACKGROUND_REFRESH_SUCCESS;
            if (!v.b.L()) {
                v.U();
            }
            ejqk ejqkVar3 = (ejqk) v.b;
            ejqkVar3.c = ejozVar3.f;
            ejqkVar3.b |= 1;
            cyzf.v(v, d);
            return 0;
        } catch (czas | czba | IOException | GeneralSecurityException unused2) {
            ejoz ejozVar4 = ejoz.BACKGROUND_REFRESH_RESCHEDULED_AFTER_FAILURE;
            if (!v.b.L()) {
                v.U();
            }
            ejqk ejqkVar4 = (ejqk) v.b;
            ejqkVar4.c = ejozVar4.f;
            ejqkVar4.b |= 1;
            cyzf.v(v, d);
            return 1;
        }
    }

    public IntegrityTokenRefreshTaskService(czak czakVar) {
        this.a = czakVar;
        this.b = null;
        this.c = new czbv(new dpvs());
    }

    public IntegrityTokenRefreshTaskService(czak czakVar, czbv czbvVar) {
        this.a = czakVar;
        this.b = null;
        this.c = czbvVar;
    }

    public IntegrityTokenRefreshTaskService(czal czalVar) {
        this.b = null;
        this.c = new czbv(new dpvs());
    }

    public IntegrityTokenRefreshTaskService(czal czalVar, Context context) {
        this.b = context;
        this.c = new czbv(new dpvs());
    }

    public IntegrityTokenRefreshTaskService(czal czalVar, czbv czbvVar) {
        this.b = null;
        this.c = czbvVar;
    }
}
