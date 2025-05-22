package com.google.android.gms.auth.managed.ui;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.a;
import defpackage.adqh;
import defpackage.adyd;
import defpackage.adzu;
import defpackage.adzx;
import defpackage.dvtw;
import defpackage.fgrc;
import defpackage.flml;
import defpackage.fnqv;
import defpackage.fyxv;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class SetNewPasswordChimeraActivity extends adyd {
    public flml i;
    private String j;
    private boolean k = false;
    private long l = -1;

    private final void k(int i) {
        if (this.k) {
            return;
        }
        this.k = true;
        fgrc l = l();
        if (!l.b.L()) {
            l.U();
        }
        fyxv fyxvVar = (fyxv) l.b;
        fyxv fyxvVar2 = fyxv.a;
        fyxvVar.f = i - 1;
        fyxvVar.b |= 8;
        if (this.l >= 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.l;
            if (!l.b.L()) {
                l.U();
            }
            fyxv fyxvVar3 = (fyxv) l.b;
            fyxvVar3.b |= 4;
            fyxvVar3.e = currentTimeMillis;
        }
        adzu.a(this).o(6, (fyxv) l.Q());
    }

    private final fgrc l() {
        fgrc v = fyxv.a.v();
        String str = this.j;
        int i = 1;
        if (str != null) {
            if (!v.b.L()) {
                v.U();
            }
            fyxv fyxvVar = (fyxv) v.b;
            fyxvVar.b |= 1;
            fyxvVar.c = str;
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
            fyxv fyxvVar2 = (fyxv) v.b;
            fyxvVar2.d = i - 1;
            fyxvVar2.b |= 2;
        }
        return v;
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) getSystemService("device_policy");
        if (adzx.f().e(this) && devicePolicyManager.isActivePasswordSufficient()) {
            setResult(-1);
            k(2);
        } else {
            setResult(0);
            k(4);
        }
        finish();
    }

    @Override // defpackage.adyd, defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fnqv.e()) {
            ((dvtw) this.i.a()).a();
        }
        adzx f = adzx.f();
        ComponentName callingActivity = getCallingActivity();
        this.j = callingActivity == null ? null : callingActivity.getPackageName();
        adzu.a(this).o(5, (fyxv) l().Q());
        int a = f.a();
        if (a != 1) {
            Log.w("Auth", String.format(Locale.US, a.j(a, "[AuthManaged, SetNewPasswordChimeraActivity] Device incompatible. Reason: "), new Object[0]));
            setResult(a);
            k(adzu.g(a));
            finish();
            return;
        }
        if (f.e(this)) {
            adqh.b().e(this, getIntent().getIntExtra("com.google.android.gms.extra.PASSWORD_COMPLEXITY", 0));
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

    @Override // defpackage.adyd, defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        adqh.b().d(this);
        k(4);
        super.onDestroy();
    }
}
