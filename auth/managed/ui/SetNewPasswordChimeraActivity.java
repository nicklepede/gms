package com.google.android.gms.auth.managed.ui;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.a;
import defpackage.abqh;
import defpackage.abyd;
import defpackage.abzu;
import defpackage.abzx;
import defpackage.dtjk;
import defpackage.fecj;
import defpackage.fiwo;
import defpackage.fkzn;
import defpackage.fwbt;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class SetNewPasswordChimeraActivity extends abyd {
    public fiwo i;
    private String j;
    private boolean k = false;
    private long l = -1;

    private final void k(int i) {
        if (this.k) {
            return;
        }
        this.k = true;
        fecj l = l();
        if (!l.b.L()) {
            l.U();
        }
        fwbt fwbtVar = (fwbt) l.b;
        fwbt fwbtVar2 = fwbt.a;
        fwbtVar.f = i - 1;
        fwbtVar.b |= 8;
        if (this.l >= 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.l;
            if (!l.b.L()) {
                l.U();
            }
            fwbt fwbtVar3 = (fwbt) l.b;
            fwbtVar3.b |= 4;
            fwbtVar3.e = currentTimeMillis;
        }
        abzu.a(this).o(6, (fwbt) l.Q());
    }

    private final fecj l() {
        fecj v = fwbt.a.v();
        String str = this.j;
        int i = 1;
        if (str != null) {
            if (!v.b.L()) {
                v.U();
            }
            fwbt fwbtVar = (fwbt) v.b;
            fwbtVar.b |= 1;
            fwbtVar.c = str;
        }
        if (getIntent().hasExtra("com.google.android.gms.extra.PASSWORD_COMPLEXITY")) {
            int intExtra = getIntent().getIntExtra("com.google.android.gms.extra.PASSWORD_COMPLEXITY", 0);
            if (intExtra == 0) {
                i = 2;
            } else if (intExtra == 65536) {
                i = 3;
            } else if (intExtra == 196608) {
                i = 4;
            } else if (intExtra == 327680) {
                i = 5;
            }
            if (!v.b.L()) {
                v.U();
            }
            fwbt fwbtVar2 = (fwbt) v.b;
            fwbtVar2.d = i - 1;
            fwbtVar2.b |= 2;
        }
        return v;
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) getSystemService("device_policy");
        if (abzx.f().e(this) && devicePolicyManager.isActivePasswordSufficient()) {
            setResult(-1);
            k(2);
        } else {
            setResult(0);
            k(4);
        }
        finish();
    }

    @Override // defpackage.abyd, defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fkzn.e()) {
            ((dtjk) this.i.a()).a();
        }
        abzx f = abzx.f();
        ComponentName callingActivity = getCallingActivity();
        this.j = callingActivity == null ? null : callingActivity.getPackageName();
        abzu.a(this).o(5, (fwbt) l().Q());
        int a = f.a();
        if (a != 1) {
            Log.w("Auth", String.format(Locale.US, a.j(a, "[AuthManaged, SetNewPasswordChimeraActivity] Device incompatible. Reason: "), new Object[0]));
            setResult(a);
            k(abzu.g(a));
            finish();
            return;
        }
        if (f.e(this)) {
            abqh.b().e(this, getIntent().getIntExtra("com.google.android.gms.extra.PASSWORD_COMPLEXITY", 0));
            Intent intent = new Intent("android.app.action.SET_NEW_PASSWORD");
            this.l = System.currentTimeMillis();
            startActivityForResult(intent, 108);
            return;
        }
        Log.w("Auth", String.format(Locale.US, "[AuthManaged, SetNewPasswordChimeraActivity] Device admin not active.", new Object[0]));
        setResult(5);
        k(8);
        finish();
    }

    @Override // defpackage.abyd, defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        abqh.b().d(this);
        k(4);
        super.onDestroy();
    }
}
