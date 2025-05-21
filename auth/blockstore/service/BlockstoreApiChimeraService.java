package com.google.android.gms.auth.blockstore.service;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aabe;
import defpackage.aabn;
import defpackage.aacb;
import defpackage.aacc;
import defpackage.aaez;
import defpackage.aafe;
import defpackage.aafh;
import defpackage.aahf;
import defpackage.aajh;
import defpackage.aakp;
import defpackage.aaks;
import defpackage.arwm;
import defpackage.asmf;
import defpackage.asot;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.ejhf;
import defpackage.fkwh;
import defpackage.zyn;
import defpackage.zzb;
import defpackage.zzl;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class BlockstoreApiChimeraService extends bxgd {
    private static final asot a = aacc.b("BlockstoreApiChimeraService");
    private aaez b;
    private aafh c;
    private aacb d;
    private aajh m;
    private aabe n;
    private aahf o;

    public BlockstoreApiChimeraService() {
        super(258, "com.google.android.gms.auth.blockstore.service.START", Collections.EMPTY_SET, 3, 10);
        this.b = null;
        this.c = null;
        this.d = null;
        this.m = null;
        this.n = null;
        this.o = null;
    }

    public static Signature[] b(Context context, String str) {
        return context.getPackageManager().getPackageInfo(str, 64).signatures;
    }

    private final synchronized aabe c() {
        if (this.n == null) {
            this.n = new aabn();
        }
        return this.n;
    }

    private final synchronized aacb d() {
        if (this.d == null) {
            this.d = aacc.a(this, aacc.c(this));
        }
        return this.d;
    }

    private final synchronized aaez e() {
        aaez aaezVar;
        if (this.c == null) {
            d();
            this.c = new aafh(this);
        }
        if (this.b == null) {
            d();
            aajh g = g();
            asmf asmfVar = new asmf(Integer.MAX_VALUE, 9);
            aafh aafhVar = this.c;
            arwm.s(aafhVar);
            this.b = new aafe(this, g, asmfVar, aafhVar);
        }
        aaezVar = this.b;
        arwm.s(aaezVar);
        return aaezVar;
    }

    private final synchronized aahf f() {
        if (this.o == null) {
            this.o = aahf.a(this);
        }
        return this.o;
    }

    private final synchronized aajh g() {
        if (this.m == null) {
            this.m = aakp.n();
        }
        return this.m;
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        eiid eiidVar = eigb.a;
        try {
            Signature[] b = b(this, str);
            if (fkwh.d()) {
                try {
                    eiidVar = aaks.d("com.google.android.gms", b(this, "com.google.android.gms"), a);
                } catch (PackageManager.NameNotFoundException e) {
                    ((ejhf) ((ejhf) a.h()).s(e)).x("Calling package not found by PackageManager. Failed to find gms package.");
                }
            }
            bxgjVar.c(new zzl(l(), new zyn(d(), f(), e(), g(), c(), str, b, this), new zzb(e(), g(), c(), str, b, this, eiidVar)));
        } catch (PackageManager.NameNotFoundException unused) {
            bxgjVar.a(Status.d.i, null);
        }
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        this.c = null;
        this.b = null;
        super.onDestroy();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
    }
}
