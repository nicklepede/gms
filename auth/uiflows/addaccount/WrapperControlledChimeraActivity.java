package com.google.android.gms.auth.uiflows.addaccount;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.config.FeatureRequestExtras;
import defpackage.a;
import defpackage.acno;
import defpackage.acnp;
import defpackage.afkv;
import defpackage.afln;
import defpackage.apzb;
import defpackage.atmp;
import defpackage.atmt;
import defpackage.eftg;
import defpackage.emll;
import defpackage.emmf;
import defpackage.emms;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fmua;
import defpackage.wyw;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class WrapperControlledChimeraActivity extends afkv {
    static final acno h = new acno("intent");
    private boolean i = false;

    public static Intent b(Context context, boolean z, atmt atmtVar, Intent intent) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.WrapperControlledActivity");
        acnp x = afkv.x(atmtVar, z);
        x.d(h, intent);
        return className.putExtras(x.a);
    }

    private final void j(Intent intent, boolean z) {
        if (fmua.a.lK().i()) {
            emms emmsVar = emms.a;
            fgrc v = emmsVar.v();
            if ((((emll) w().b).b & 8192) != 0) {
                emms emmsVar2 = ((emll) w().b).p;
                if (emmsVar2 != null) {
                    emmsVar = emmsVar2;
                }
                v = (fgrc) emmsVar.iQ(5, null);
                v.X(emmsVar);
            }
            ComponentName callingActivity = getCallingActivity();
            String flattenToShortString = callingActivity != null ? callingActivity.flattenToShortString() : "";
            String intent2 = intent.toString();
            fgrc v2 = emmf.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            fgri fgriVar = v2.b;
            emmf emmfVar = (emmf) fgriVar;
            intent2.getClass();
            emmfVar.b |= 1;
            emmfVar.c = intent2;
            if (!fgriVar.L()) {
                v2.U();
            }
            fgri fgriVar2 = v2.b;
            emmf emmfVar2 = (emmf) fgriVar2;
            emmfVar2.b |= 2;
            emmfVar2.d = z;
            if (!fgriVar2.L()) {
                v2.U();
            }
            emmf emmfVar3 = (emmf) v2.b;
            flattenToShortString.getClass();
            emmfVar3.b |= 4;
            emmfVar3.e = flattenToShortString;
            emmf emmfVar4 = (emmf) v2.Q();
            if (!v.b.L()) {
                v.U();
            }
            emms emmsVar3 = (emms) v.b;
            emmfVar4.getClass();
            emmsVar3.l = emmfVar4;
            emmsVar3.b |= 512;
            fgrc w = w();
            emms emmsVar4 = (emms) v.Q();
            if (!w.b.L()) {
                w.U();
            }
            emll emllVar = (emll) w.b;
            emmsVar4.getClass();
            emllVar.p = emmsVar4;
            emllVar.b |= 8192;
        }
    }

    @Override // defpackage.afkn
    protected final String gW() {
        return "WrapperControlledActivity";
    }

    @Override // defpackage.afkn
    protected final void gX() {
        if (wyw.a.a(this)) {
            wyw.c(this, (Intent) s().a(h));
        } else {
            super.gX();
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        gT(i2, intent);
    }

    @Override // defpackage.afkv, defpackage.afln, defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            boolean z = bundle.getBoolean("activity_started", false);
            this.i = z;
            if (z) {
                return;
            }
        }
        Intent intent = (Intent) s().a(h);
        eftg.a(getIntent(), intent);
        acno acnoVar = atmp.a;
        if (intent != null && intent.getBooleanExtra("is_unicorn_account", false)) {
            acnp acnpVar = new acnp();
            acno acnoVar2 = afln.u;
            acnpVar.d(acnoVar2, (Integer) s().b(acnoVar2, 0));
            acno acnoVar3 = afln.t;
            acnpVar.d(acnoVar3, (String) s().a(acnoVar3));
            Bundle bundle2 = acnpVar.a;
            if (apzb.a() >= 107) {
                FeatureRequestExtras.RequestBuilder requestBuilder = new FeatureRequestExtras.RequestBuilder();
                requestBuilder.setSessionId((String) s().a(acnoVar3));
                requestBuilder.addToBundle(bundle2);
            }
            intent.putExtras(bundle2);
        }
        if (wyw.a.a(this)) {
            wyw.b(this);
        }
        if (getPackageManager().resolveActivity(intent, 0) == null) {
            Log.e("Auth", String.format(Locale.US, "[AddAccount, WrapperControlledChimeraActivity] Could not resolve intent: ".concat(String.valueOf(String.valueOf(intent))), new Object[0]));
            j(intent, false);
            gT(0, null);
            return;
        }
        if (fmua.a.lK().c()) {
            try {
                startActivityForResult(intent, 0);
            } catch (ActivityNotFoundException e) {
                Log.e("Auth", String.format(Locale.US, a.R(intent, e, "[AddAccount, WrapperControlledChimeraActivity] Could not start intent: ", "\n"), new Object[0]));
                j(intent, true);
                gT(0, null);
                return;
            }
        } else {
            startActivityForResult(intent, 0);
        }
        this.i = true;
    }

    @Override // defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("activity_started", this.i);
    }
}
