package com.google.android.gms.update.phone;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.gms.R;
import defpackage.a;
import defpackage.arxo;
import defpackage.asqh;
import defpackage.bp;
import defpackage.dhfe;
import defpackage.dhjt;
import defpackage.dhnh;
import defpackage.dhni;
import defpackage.dhnj;
import defpackage.dhnr;
import defpackage.edeq;
import defpackage.edgl;
import defpackage.edjc;
import defpackage.edjs;
import defpackage.edjt;
import defpackage.fqsp;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SystemUpdateChimeraActivity extends qfp {
    private static final arxo j = dhjt.h("SystemUpdateChimeraActivity");
    private boolean k = false;

    private final boolean b() {
        return edgl.e(getIntent());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0089, code lost:
    
        if (defpackage.fqtw.a.a().b() != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a() {
        /*
            r5 = this;
            fqtt r0 = defpackage.fqtt.a
            fqtu r0 = r0.a()
            r0.a()
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "theme"
            java.lang.String r0 = r0.getStringExtra(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1f
            java.lang.String r0 = "setupwizard.theme"
            java.lang.String r0 = android.os.SystemProperties.get(r0)
        L1f:
            int r1 = r0.hashCode()
            r2 = 5
            r3 = 1
            r4 = 2
            switch(r1) {
                case -2128555920: goto L70;
                case -1241052239: goto L66;
                case -353548558: goto L5c;
                case 115650329: goto L52;
                case 115650330: goto L48;
                case 115650331: goto L3e;
                case 725108485: goto L34;
                case 1818609500: goto L2a;
                default: goto L29;
            }
        L29:
            goto L7a
        L2a:
            java.lang.String r1 = "glif_expressive_light"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            r0 = 7
            goto L7b
        L34:
            java.lang.String r1 = "glif_expressive"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            r0 = 6
            goto L7b
        L3e:
            java.lang.String r1 = "glif_v4"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            r0 = r2
            goto L7b
        L48:
            java.lang.String r1 = "glif_v3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            r0 = 3
            goto L7b
        L52:
            java.lang.String r1 = "glif_v2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            r0 = r3
            goto L7b
        L5c:
            java.lang.String r1 = "glif_v4_light"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            r0 = 4
            goto L7b
        L66:
            java.lang.String r1 = "glif_v3_light"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            r0 = r4
            goto L7b
        L70:
            java.lang.String r1 = "glif_v2_light"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            r0 = 0
            goto L7b
        L7a:
            r0 = -1
        L7b:
            switch(r0) {
                case 0: goto L8b;
                case 1: goto L8b;
                case 2: goto L8b;
                case 3: goto L8b;
                case 4: goto L8b;
                case 5: goto L8b;
                case 6: goto L7f;
                case 7: goto L7f;
                default: goto L7e;
            }
        L7e:
            goto L98
        L7f:
            fqtw r0 = defpackage.fqtw.a
            fqtx r0 = r0.a()
            boolean r0 = r0.b()
            if (r0 == 0) goto L98
        L8b:
            fqtw r0 = defpackage.fqtw.a
            fqtx r0 = r0.a()
            boolean r0 = r0.a()
            if (r0 == 0) goto L98
            return r2
        L98:
            boolean r0 = defpackage.asqh.b()
            if (r0 == 0) goto L9f
            return r3
        L9f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.update.phone.SystemUpdateChimeraActivity.a():int");
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final void finish() {
        if (this.k) {
            super.finish();
        } else {
            this.k = true;
            edjc.d(getContainerActivity());
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        arxo arxoVar = j;
        arxoVar.j("onCreate", new Object[0]);
        getWindow().requestFeature(13);
        edjc.c(getContainerActivity());
        edjc.a(getContainerActivity());
        Intent intent = getIntent();
        int i = edjs.a;
        boolean c = edjs.c(intent.getStringExtra("theme"));
        if (a() == 5) {
            setTheme(edjt.d().c(true != c ? "glif_v3" : "glif_v3_light", edgl.e(getIntent()) && !fqsp.a.a().a()));
            if (edeq.v(this) && edeq.z(this)) {
                getTheme().applyStyle(R.style.BcStyleThemeOverlay, true);
            } else {
                getTheme().applyStyle(R.style.HeavyThemeOverlay, true);
            }
            if (edeq.w(this)) {
                int a = edjs.a(this);
                if (a == 0) {
                    arxoVar.m("Could not get dynamic color theme.", new Object[0]);
                } else {
                    setTheme(a);
                    z = true;
                    arxoVar.h(a.Z(z, "Try to set dynamic color. Result="), new Object[0]);
                }
            } else {
                arxoVar.m("SetupWizard does not support the dynamic color or supporting status unknown.", new Object[0]);
            }
            z = false;
            arxoVar.h(a.Z(z, "Try to set dynamic color. Result="), new Object[0]);
        } else if (asqh.b()) {
            if (c) {
                setTheme(R.style.systemUpdateActivitySudTheme_Light);
                c = true;
            } else {
                setTheme(R.style.systemUpdateActivitySudTheme);
                c = false;
            }
        } else if (b()) {
            if (c) {
                setTheme(R.style.systemUpdateActivitySudTheme_SetupWizard_Light);
                c = true;
            } else {
                setTheme(R.style.systemUpdateActivitySudTheme_SetupWizard);
                c = false;
            }
        } else if (c) {
            setTheme(R.style.SudThemeMaterial_Light);
            c = true;
        } else {
            setTheme(R.style.SudThemeMaterial);
            c = false;
        }
        setContentView(R.layout.system_update_activity_container);
        if (bundle == null) {
            int a2 = a();
            dhnr dhnjVar = a2 != 1 ? a2 != 5 ? new dhnj() : new dhnh() : new dhni();
            arxoVar.j("Load layout with type=%d, isSetupWizard=%s, isLightTheme=%s.", Integer.valueOf(dhnjVar.I()), Boolean.valueOf(b()), Boolean.valueOf(c));
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.z(R.id.layout_container, dhnjVar, "layout_fragment");
            bpVar.d();
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onResume() {
        super.onResume();
        arxo arxoVar = j;
        arxoVar.j("onResume", new Object[0]);
        if (dhfe.b(this)) {
            return;
        }
        arxoVar.h("Attempting to manage ota on non-owner profile. Finish immediately.", new Object[0]);
        Toast makeText = Toast.makeText(this, R.string.system_update_not_owner_text, 1);
        makeText.setGravity(17, makeText.getXOffset(), makeText.getYOffset());
        makeText.show();
        finish();
    }
}
