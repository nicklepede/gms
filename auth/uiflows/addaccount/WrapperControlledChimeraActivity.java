package com.google.android.gms.auth.uiflows.addaccount;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.config.FeatureRequestExtras;
import defpackage.a;
import defpackage.aano;
import defpackage.aanp;
import defpackage.adko;
import defpackage.adlg;
import defpackage.anxj;
import defpackage.arka;
import defpackage.arke;
import defpackage.edgl;
import defpackage.ejya;
import defpackage.ejyu;
import defpackage.ejzh;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fkdo;
import defpackage.vcw;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class WrapperControlledChimeraActivity extends adko {
    static final aano h = new aano("intent");
    private boolean i = false;

    public static Intent b(Context context, boolean z, arke arkeVar, Intent intent) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.WrapperControlledActivity");
        aanp x = adko.x(arkeVar, z);
        x.d(h, intent);
        return className.putExtras(x.a);
    }

    private final void j(Intent intent, boolean z) {
        if (fkdo.a.a().h()) {
            ejzh ejzhVar = ejzh.a;
            fecj v = ejzhVar.v();
            if ((((ejya) w().b).b & 32768) != 0) {
                ejzh ejzhVar2 = ((ejya) w().b).p;
                if (ejzhVar2 != null) {
                    ejzhVar = ejzhVar2;
                }
                v = (fecj) ejzhVar.iB(5, null);
                v.X(ejzhVar);
            }
            ComponentName callingActivity = getCallingActivity();
            String flattenToShortString = callingActivity != null ? callingActivity.flattenToShortString() : "";
            String intent2 = intent.toString();
            fecj v2 = ejyu.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            fecp fecpVar = v2.b;
            ejyu ejyuVar = (ejyu) fecpVar;
            intent2.getClass();
            ejyuVar.b |= 1;
            ejyuVar.c = intent2;
            if (!fecpVar.L()) {
                v2.U();
            }
            fecp fecpVar2 = v2.b;
            ejyu ejyuVar2 = (ejyu) fecpVar2;
            ejyuVar2.b |= 2;
            ejyuVar2.d = z;
            if (!fecpVar2.L()) {
                v2.U();
            }
            ejyu ejyuVar3 = (ejyu) v2.b;
            flattenToShortString.getClass();
            ejyuVar3.b |= 4;
            ejyuVar3.e = flattenToShortString;
            ejyu ejyuVar4 = (ejyu) v2.Q();
            if (!v.b.L()) {
                v.U();
            }
            ejzh ejzhVar3 = (ejzh) v.b;
            ejyuVar4.getClass();
            ejzhVar3.l = ejyuVar4;
            ejzhVar3.b |= 512;
            fecj w = w();
            ejzh ejzhVar4 = (ejzh) v.Q();
            if (!w.b.L()) {
                w.U();
            }
            ejya ejyaVar = (ejya) w.b;
            ejzhVar4.getClass();
            ejyaVar.p = ejzhVar4;
            ejyaVar.b |= 32768;
        }
    }

    @Override // defpackage.adkg
    protected final String gG() {
        return "WrapperControlledActivity";
    }

    @Override // defpackage.adkg
    protected final void gH() {
        if (vcw.a.a(this)) {
            vcw.c(this, (Intent) s().a(h));
        } else {
            super.gH();
        }
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        gD(i2, intent);
    }

    @Override // defpackage.adko, defpackage.adlg, defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
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
        edgl.a(getIntent(), intent);
        aano aanoVar = arka.a;
        if (intent != null && intent.getBooleanExtra("is_unicorn_account", false)) {
            aanp aanpVar = new aanp();
            aano aanoVar2 = adlg.u;
            aanpVar.d(aanoVar2, (Integer) s().b(aanoVar2, 0));
            aano aanoVar3 = adlg.t;
            aanpVar.d(aanoVar3, (String) s().a(aanoVar3));
            Bundle bundle2 = aanpVar.a;
            if (anxj.a() >= 107) {
                FeatureRequestExtras.RequestBuilder requestBuilder = new FeatureRequestExtras.RequestBuilder();
                requestBuilder.setSessionId((String) s().a(aanoVar3));
                requestBuilder.addToBundle(bundle2);
            }
            intent.putExtras(bundle2);
        }
        if (vcw.a.a(this)) {
            vcw.b(this);
        }
        if (getPackageManager().resolveActivity(intent, 0) == null) {
            Log.e("Auth", String.format(Locale.US, "[AddAccount, WrapperControlledChimeraActivity] Could not resolve intent: ".concat(String.valueOf(String.valueOf(intent))), new Object[0]));
            j(intent, false);
            gD(0, null);
            return;
        }
        if (fkdo.a.a().c()) {
            try {
                startActivityForResult(intent, 0);
            } catch (ActivityNotFoundException e) {
                Log.e("Auth", String.format(Locale.US, a.P(intent, e, "[AddAccount, WrapperControlledChimeraActivity] Could not start intent: ", "\n"), new Object[0]));
                j(intent, true);
                gD(0, null);
                return;
            }
        } else {
            startActivityForResult(intent, 0);
        }
        this.i = true;
    }

    @Override // defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("activity_started", this.i);
    }
}
