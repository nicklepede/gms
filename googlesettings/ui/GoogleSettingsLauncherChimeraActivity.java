package com.google.android.gms.googlesettings.ui;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.googlesettings.ui.GoogleSettingsLauncherChimeraActivity;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.asej;
import defpackage.asot;
import defpackage.bjvb;
import defpackage.bjwt;
import defpackage.bwpm;
import defpackage.bzax;
import defpackage.bzbe;
import defpackage.bzbo;
import defpackage.bzbp;
import defpackage.bzcj;
import defpackage.bzck;
import defpackage.ejhf;
import defpackage.fecj;
import defpackage.fuwt;
import defpackage.fvaq;
import defpackage.fvbo;
import defpackage.fvcb;
import defpackage.ilq;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GoogleSettingsLauncherChimeraActivity extends bjwt {
    private static final asot m = asot.b("GoogleSettingsLauncherChimeraActivity", asej.GOOGLESETTINGS);
    public bzck j;
    public bjvb k;
    private boolean n;

    public static final int k(Intent intent) {
        return intent.getIntExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_FACET_ID", 0);
    }

    public static final int l(Intent intent) {
        return intent.getIntExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_ITEM_ID", 0);
    }

    private final int n() {
        return getIntent().getIntExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_REQUEST_CODE", 0);
    }

    private final void o(int i, fvaq fvaqVar) {
        if (this.n) {
            bzck bzckVar = this.j;
            if (bzckVar == null) {
                fvbo.j("gmsCoreMetrics");
                bzckVar = null;
            }
            fecj v = bzbe.a.v();
            bzbp a = bzbo.a(bzax.a.v());
            a.d(a().a());
            if (fvaqVar != null) {
                fvaqVar.a(a);
            }
            bzax a2 = a.a();
            if (!v.b.L()) {
                v.U();
            }
            bzbe bzbeVar = (bzbe) v.b;
            a2.getClass();
            bzbeVar.e = a2;
            bzbeVar.b |= 4;
            bzcj.a(bzckVar, i, (bzbe) v.Q(), 4);
        }
    }

    public final bjvb a() {
        bjvb bjvbVar = this.k;
        if (bjvbVar != null) {
            return bjvbVar;
        }
        fvbo.j("sessionManager");
        return null;
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == n()) {
            setResult(i2, intent);
        }
        o(221956, null);
        finish();
    }

    @Override // defpackage.bjwt, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        final fvcb fvcbVar = new fvcb();
        Intent intent = getIntent();
        fvbo.e(intent, "getIntent(...)");
        fvbo.f(intent, "<this>");
        fvcbVar.a = (Intent) ilq.a(intent, "com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_INTENT", Intent.class);
        boolean z = true;
        if (fvcbVar.a == null && (stringExtra = getIntent().getStringExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_INTENT_URI")) != null) {
            fvcbVar.a = Intent.parseUri(stringExtra, 1);
        }
        if (fvcbVar.a == null) {
            finish();
            return;
        }
        Set set = bwpm.a;
        Intent intent2 = (Intent) fvcbVar.a;
        fvbo.f(intent2, "<this>");
        if (fuwt.am(bwpm.a, intent2.getComponent())) {
            Intent intent3 = (Intent) fvcbVar.a;
            fvbo.f(intent3, "<this>");
            if (fvbo.n(intent3.getComponent(), new ComponentName("com.google.android.gms", "com.google.android.gms.app.settings.GoogleSettingsActivity"))) {
                if (getPackageManager().queryIntentActivities((Intent) fvcbVar.a, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE).size() <= 0) {
                    ((ejhf) m.h()).x("Legacy activity not found - trying link");
                    Intent intent4 = (Intent) fvcbVar.a;
                    fvbo.f(intent4, "<this>");
                    Intent component = intent4.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.app.settings.GoogleSettingsLink"));
                    fvbo.e(component, "setComponent(...)");
                    fvcbVar.a = component;
                }
            }
            ((Intent) fvcbVar.a).putExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_SESSION_ID", a().a());
        }
        Intent intent5 = (Intent) fvcbVar.a;
        if (!bwpm.a(intent5) && l(intent5) == 0 && k(intent5) == 0) {
            z = false;
        }
        this.n = z;
        o(221955, new fvaq() { // from class: bjwo
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                bzbp bzbpVar = (bzbp) obj;
                fvbo.f(bzbpVar, "$this$maybeLogSemanticEvent");
                Set set2 = bwpm.a;
                fvcb fvcbVar2 = fvcb.this;
                bzau b = bwpm.b((Intent) fvcbVar2.a);
                if (b != null) {
                    bzbpVar.e(b);
                }
                aojj b2 = aojj.b(GoogleSettingsLauncherChimeraActivity.l((Intent) fvcbVar2.a));
                if (b2 == null) {
                    b2 = aojj.ITEM_UNSPECIFIED;
                }
                bzbpVar.c(b2);
                asew b3 = asew.b(GoogleSettingsLauncherChimeraActivity.k((Intent) fvcbVar2.a));
                if (b3 == null) {
                    b3 = asew.FACETID_UNKNOWN;
                }
                fvbo.f(b3, "value");
                fecj fecjVar = bzbpVar.a;
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                bzax bzaxVar = (bzax) fecjVar.b;
                bzax bzaxVar2 = bzax.a;
                bzaxVar.f = b3.a();
                bzaxVar.b |= 8;
                return fuvs.a;
            }
        });
        startActivityForResult((Intent) fvcbVar.a, n());
    }
}
