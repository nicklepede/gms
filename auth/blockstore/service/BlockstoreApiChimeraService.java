package com.google.android.gms.auth.blockstore.service;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.abyn;
import defpackage.abzb;
import defpackage.abzl;
import defpackage.acbe;
import defpackage.acbn;
import defpackage.accb;
import defpackage.accc;
import defpackage.acez;
import defpackage.acfe;
import defpackage.acfh;
import defpackage.achf;
import defpackage.acjh;
import defpackage.ackp;
import defpackage.acks;
import defpackage.atzb;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.eluo;
import defpackage.fnnl;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class BlockstoreApiChimeraService extends bzot {
    private static final ausn a = accc.b("BlockstoreApiChimeraService");
    private acez b;
    private acfh c;
    private accb d;
    private acjh m;
    private acbe n;
    private achf o;

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

    private final synchronized acbe c() {
        if (this.n == null) {
            this.n = new acbn();
        }
        return this.n;
    }

    private final synchronized accb d() {
        if (this.d == null) {
            this.d = accc.a(this, accc.c(this));
        }
        return this.d;
    }

    private final synchronized acez e() {
        acez acezVar;
        if (this.c == null) {
            d();
            this.c = new acfh(this);
        }
        if (this.b == null) {
            d();
            acjh g = g();
            aupz aupzVar = new aupz(Integer.MAX_VALUE, 9);
            acfh acfhVar = this.c;
            atzb.s(acfhVar);
            this.b = new acfe(this, g, aupzVar, acfhVar);
        }
        acezVar = this.b;
        atzb.s(acezVar);
        return acezVar;
    }

    private final synchronized achf f() {
        if (this.o == null) {
            this.o = achf.a(this);
        }
        return this.o;
    }

    private final synchronized acjh g() {
        if (this.m == null) {
            this.m = ackp.n();
        }
        return this.m;
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        ekvi ekviVar = ektg.a;
        try {
            Signature[] b = b(this, str);
            if (fnnl.d()) {
                try {
                    ekviVar = acks.d("com.google.android.gms", b(this, "com.google.android.gms"), a);
                } catch (PackageManager.NameNotFoundException e) {
                    ((eluo) ((eluo) a.h()).s(e)).x("Calling package not found by PackageManager. Failed to find gms package.");
                }
            }
            bzozVar.c(new abzl(l(), new abyn(d(), f(), e(), g(), c(), str, b, this), new abzb(e(), g(), c(), str, b, this, ekviVar)));
        } catch (PackageManager.NameNotFoundException unused) {
            bzozVar.a(Status.d.i, null);
        }
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        this.c = null;
        this.b = null;
        super.onDestroy();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
    }
}
