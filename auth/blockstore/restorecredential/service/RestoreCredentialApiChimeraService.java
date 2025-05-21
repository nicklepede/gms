package com.google.android.gms.auth.blockstore.restorecredential.service;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.auth.blockstore.restorecredential.service.RestoreCredentialApiChimeraService;
import com.google.android.gms.auth.blockstore.service.BlockstoreApiChimeraService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aabe;
import defpackage.aacb;
import defpackage.aacc;
import defpackage.aadl;
import defpackage.aadu;
import defpackage.aaez;
import defpackage.aahf;
import defpackage.aajh;
import defpackage.asng;
import defpackage.asot;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.ejhf;
import defpackage.fkwh;
import defpackage.fuuw;
import defpackage.fuvg;
import defpackage.fvaf;
import defpackage.fvbo;
import defpackage.zyn;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class RestoreCredentialApiChimeraService extends bxgd {
    public static final /* synthetic */ int b = 0;
    private static final asot c = aacc.b("RestoreCredentialApiChimeraService");
    public final fuuw a;
    private final fuuw d;
    private final fuuw m;
    private final fuuw n;
    private final fuuw o;
    private final fuuw p;

    public RestoreCredentialApiChimeraService() {
        super(381, "com.google.android.gms.auth.blockstore.restorecredential.service.START_RESTORE_CRED", Collections.EMPTY_SET, 3, 10);
        this.a = new fuvg(new fvaf() { // from class: aaee
            @Override // defpackage.fvaf
            public final Object a() {
                RestoreCredentialApiChimeraService restoreCredentialApiChimeraService = RestoreCredentialApiChimeraService.this;
                restoreCredentialApiChimeraService.b();
                return new aafh(restoreCredentialApiChimeraService);
            }
        });
        this.d = new fuvg(new fvaf() { // from class: aaef
            @Override // defpackage.fvaf
            public final Object a() {
                RestoreCredentialApiChimeraService restoreCredentialApiChimeraService = RestoreCredentialApiChimeraService.this;
                restoreCredentialApiChimeraService.b();
                return new aafe(restoreCredentialApiChimeraService, restoreCredentialApiChimeraService.c(), new asmf(Integer.MAX_VALUE, 9), (aafh) restoreCredentialApiChimeraService.a.a());
            }
        });
        this.m = new fuvg(new fvaf() { // from class: aaeg
            @Override // defpackage.fvaf
            public final Object a() {
                RestoreCredentialApiChimeraService restoreCredentialApiChimeraService = RestoreCredentialApiChimeraService.this;
                return aacc.a(restoreCredentialApiChimeraService, aacc.c(restoreCredentialApiChimeraService));
            }
        });
        this.n = new fuvg(new fvaf() { // from class: aaeh
            @Override // defpackage.fvaf
            public final Object a() {
                int i = RestoreCredentialApiChimeraService.b;
                return aakp.n();
            }
        });
        this.o = new fuvg(new fvaf() { // from class: aaei
            @Override // defpackage.fvaf
            public final Object a() {
                return aahf.a(RestoreCredentialApiChimeraService.this);
            }
        });
        this.p = new fuvg(new fvaf() { // from class: aaej
            @Override // defpackage.fvaf
            public final Object a() {
                int i = RestoreCredentialApiChimeraService.b;
                return new aabn();
            }
        });
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        fvbo.f(getServiceRequest, "request");
        if (!fkwh.d()) {
            ((ejhf) c.h()).x("Restore Credential flag is disabled.");
            bxgjVar.a(16, null);
            return;
        }
        String str = getServiceRequest.f;
        try {
            Signature[] b2 = BlockstoreApiChimeraService.b(this, str);
            fvbo.e(b2, "getPackageSignatures(...)");
            Signature[] b3 = BlockstoreApiChimeraService.b(this, "com.google.android.gms");
            fvbo.e(b3, "getPackageSignatures(...)");
            aacb b4 = b();
            Object a = this.o.a();
            fvbo.e(a, "getValue(...)");
            zyn zynVar = new zyn(b4, (aahf) a, (aaez) this.d.a(), c(), (aabe) this.p.a(), "com.google.android.gms", b3, this);
            boolean R = asng.R(this, str);
            bxgo l = l();
            fvbo.c(str);
            PackageManager packageManager = getPackageManager();
            fvbo.e(packageManager, "getPackageManager(...)");
            bxgjVar.c(new aadu(l, new aadl(zynVar, str, b2, packageManager, R, b())));
        } catch (PackageManager.NameNotFoundException e) {
            ((ejhf) ((ejhf) c.j()).s(e)).x("Calling package not found by package manager.");
            bxgjVar.a(Status.d.i, null);
        }
    }

    public final aacb b() {
        Object a = this.m.a();
        fvbo.e(a, "getValue(...)");
        return (aacb) a;
    }

    public final aajh c() {
        Object a = this.n.a();
        fvbo.e(a, "getValue(...)");
        return (aajh) a;
    }
}
