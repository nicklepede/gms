package com.google.android.gms.auth.blockstore.restorecredential.service;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.auth.blockstore.restorecredential.service.RestoreCredentialApiChimeraService;
import com.google.android.gms.auth.blockstore.service.BlockstoreApiChimeraService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.abyn;
import defpackage.acbe;
import defpackage.accb;
import defpackage.accc;
import defpackage.acdl;
import defpackage.acdu;
import defpackage.acez;
import defpackage.achf;
import defpackage.acjh;
import defpackage.aura;
import defpackage.ausn;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.eluo;
import defpackage.fnnl;
import defpackage.fxqu;
import defpackage.fxre;
import defpackage.fxwd;
import defpackage.fxxm;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class RestoreCredentialApiChimeraService extends bzot {
    public static final /* synthetic */ int b = 0;
    private static final ausn c = accc.b("RestoreCredentialApiChimeraService");
    public final fxqu a;
    private final fxqu d;
    private final fxqu m;
    private final fxqu n;
    private final fxqu o;
    private final fxqu p;

    public RestoreCredentialApiChimeraService() {
        super(381, "com.google.android.gms.auth.blockstore.restorecredential.service.START_RESTORE_CRED", Collections.EMPTY_SET, 3, 10);
        this.a = new fxre(new fxwd() { // from class: acee
            @Override // defpackage.fxwd
            public final Object a() {
                RestoreCredentialApiChimeraService restoreCredentialApiChimeraService = RestoreCredentialApiChimeraService.this;
                restoreCredentialApiChimeraService.b();
                return new acfh(restoreCredentialApiChimeraService);
            }
        });
        this.d = new fxre(new fxwd() { // from class: acef
            @Override // defpackage.fxwd
            public final Object a() {
                RestoreCredentialApiChimeraService restoreCredentialApiChimeraService = RestoreCredentialApiChimeraService.this;
                restoreCredentialApiChimeraService.b();
                return new acfe(restoreCredentialApiChimeraService, restoreCredentialApiChimeraService.c(), new aupz(Integer.MAX_VALUE, 9), (acfh) restoreCredentialApiChimeraService.a.a());
            }
        });
        this.m = new fxre(new fxwd() { // from class: aceg
            @Override // defpackage.fxwd
            public final Object a() {
                RestoreCredentialApiChimeraService restoreCredentialApiChimeraService = RestoreCredentialApiChimeraService.this;
                return accc.a(restoreCredentialApiChimeraService, accc.c(restoreCredentialApiChimeraService));
            }
        });
        this.n = new fxre(new fxwd() { // from class: aceh
            @Override // defpackage.fxwd
            public final Object a() {
                int i = RestoreCredentialApiChimeraService.b;
                return ackp.n();
            }
        });
        this.o = new fxre(new fxwd() { // from class: acei
            @Override // defpackage.fxwd
            public final Object a() {
                return achf.a(RestoreCredentialApiChimeraService.this);
            }
        });
        this.p = new fxre(new fxwd() { // from class: acej
            @Override // defpackage.fxwd
            public final Object a() {
                int i = RestoreCredentialApiChimeraService.b;
                return new acbn();
            }
        });
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        fxxm.f(getServiceRequest, "request");
        if (!fnnl.d()) {
            ((eluo) c.h()).x("Restore Credential flag is disabled.");
            bzozVar.a(16, null);
            return;
        }
        String str = getServiceRequest.f;
        try {
            Signature[] b2 = BlockstoreApiChimeraService.b(this, str);
            fxxm.e(b2, "getPackageSignatures(...)");
            Signature[] b3 = BlockstoreApiChimeraService.b(this, "com.google.android.gms");
            fxxm.e(b3, "getPackageSignatures(...)");
            accb b4 = b();
            Object a = this.o.a();
            fxxm.e(a, "getValue(...)");
            abyn abynVar = new abyn(b4, (achf) a, (acez) this.d.a(), c(), (acbe) this.p.a(), "com.google.android.gms", b3, this);
            boolean R = aura.R(this, str);
            bzpe l = l();
            fxxm.c(str);
            PackageManager packageManager = getPackageManager();
            fxxm.e(packageManager, "getPackageManager(...)");
            bzozVar.c(new acdu(l, new acdl(abynVar, str, b2, packageManager, R, b())));
        } catch (PackageManager.NameNotFoundException e) {
            ((eluo) ((eluo) c.j()).s(e)).x("Calling package not found by package manager.");
            bzozVar.a(Status.d.i, null);
        }
    }

    public final accb b() {
        Object a = this.m.a();
        fxxm.e(a, "getValue(...)");
        return (accb) a;
    }

    public final acjh c() {
        Object a = this.n.a();
        fxxm.e(a, "getValue(...)");
        return (acjh) a;
    }
}
