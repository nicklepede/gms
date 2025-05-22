package com.google.android.gms.googlesettings.ui;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.googlesettings.ui.GoogleSettingsLauncherChimeraActivity;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bmbr;
import defpackage.bmdj;
import defpackage.byxz;
import defpackage.cbjo;
import defpackage.cbjv;
import defpackage.cbkf;
import defpackage.cbkg;
import defpackage.cbla;
import defpackage.cblb;
import defpackage.eluo;
import defpackage.fgrc;
import defpackage.fxsr;
import defpackage.fxwo;
import defpackage.fxxm;
import defpackage.fxxz;
import defpackage.ing;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GoogleSettingsLauncherChimeraActivity extends bmdj {
    private static final ausn m = ausn.b("GoogleSettingsLauncherChimeraActivity", auid.GOOGLESETTINGS);
    public cblb j;
    public bmbr k;
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

    private final void o(int i, fxwo fxwoVar) {
        if (this.n) {
            cblb cblbVar = this.j;
            if (cblbVar == null) {
                fxxm.j("gmsCoreMetrics");
                cblbVar = null;
            }
            fgrc v = cbjv.a.v();
            cbkg a = cbkf.a(cbjo.a.v());
            a.d(a().a());
            if (fxwoVar != null) {
                fxwoVar.a(a);
            }
            cbjo a2 = a.a();
            if (!v.b.L()) {
                v.U();
            }
            cbjv cbjvVar = (cbjv) v.b;
            a2.getClass();
            cbjvVar.e = a2;
            cbjvVar.b |= 4;
            cbla.a(cblbVar, i, (cbjv) v.Q(), 4);
        }
    }

    public final bmbr a() {
        bmbr bmbrVar = this.k;
        if (bmbrVar != null) {
            return bmbrVar;
        }
        fxxm.j("sessionManager");
        return null;
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == n()) {
            setResult(i2, intent);
        }
        o(221956, null);
        finish();
    }

    @Override // defpackage.bmdj, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        final fxxz fxxzVar = new fxxz();
        Intent intent = getIntent();
        fxxm.e(intent, "getIntent(...)");
        fxxm.f(intent, "<this>");
        fxxzVar.a = (Intent) ing.a(intent, "com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_INTENT", Intent.class);
        boolean z = true;
        if (fxxzVar.a == null && (stringExtra = getIntent().getStringExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_INTENT_URI")) != null) {
            fxxzVar.a = Intent.parseUri(stringExtra, 1);
        }
        if (fxxzVar.a == null) {
            finish();
            return;
        }
        Set set = byxz.a;
        Intent intent2 = (Intent) fxxzVar.a;
        fxxm.f(intent2, "<this>");
        if (fxsr.am(byxz.a, intent2.getComponent())) {
            Intent intent3 = (Intent) fxxzVar.a;
            fxxm.f(intent3, "<this>");
            if (fxxm.n(intent3.getComponent(), new ComponentName("com.google.android.gms", "com.google.android.gms.app.settings.GoogleSettingsActivity"))) {
                if (getPackageManager().queryIntentActivities((Intent) fxxzVar.a, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE).size() <= 0) {
                    ((eluo) m.h()).x("Legacy activity not found - trying link");
                    Intent intent4 = (Intent) fxxzVar.a;
                    fxxm.f(intent4, "<this>");
                    Intent component = intent4.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.app.settings.GoogleSettingsLink"));
                    fxxm.e(component, "setComponent(...)");
                    fxxzVar.a = component;
                }
            }
            ((Intent) fxxzVar.a).putExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_SESSION_ID", a().a());
        }
        Intent intent5 = (Intent) fxxzVar.a;
        if (!byxz.a(intent5) && l(intent5) == 0 && k(intent5) == 0) {
            z = false;
        }
        this.n = z;
        o(221955, new fxwo() { // from class: bmde
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                cbkg cbkgVar = (cbkg) obj;
                fxxm.f(cbkgVar, "$this$maybeLogSemanticEvent");
                Set set2 = byxz.a;
                fxxz fxxzVar2 = fxxz.this;
                cbjl b = byxz.b((Intent) fxxzVar2.a);
                if (b != null) {
                    cbkgVar.e(b);
                }
                aqlc b2 = aqlc.b(GoogleSettingsLauncherChimeraActivity.l((Intent) fxxzVar2.a));
                if (b2 == null) {
                    b2 = aqlc.ITEM_UNSPECIFIED;
                }
                cbkgVar.c(b2);
                auiq b3 = auiq.b(GoogleSettingsLauncherChimeraActivity.k((Intent) fxxzVar2.a));
                if (b3 == null) {
                    b3 = auiq.FACETID_UNKNOWN;
                }
                fxxm.f(b3, "value");
                fgrc fgrcVar = cbkgVar.a;
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                cbjo cbjoVar = (cbjo) fgrcVar.b;
                cbjo cbjoVar2 = cbjo.a;
                cbjoVar.f = b3.a();
                cbjoVar.b |= 8;
                return fxrq.a;
            }
        });
        startActivityForResult((Intent) fxxzVar.a, n());
    }
}
