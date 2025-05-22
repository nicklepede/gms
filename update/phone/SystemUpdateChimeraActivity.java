package com.google.android.gms.update.phone;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.gms.R;
import defpackage.a;
import defpackage.auad;
import defpackage.auub;
import defpackage.bp;
import defpackage.djqk;
import defpackage.djuz;
import defpackage.djyn;
import defpackage.djyo;
import defpackage.djyp;
import defpackage.djyx;
import defpackage.efrl;
import defpackage.eftg;
import defpackage.efvx;
import defpackage.efwn;
import defpackage.efwo;
import defpackage.ftmo;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SystemUpdateChimeraActivity extends ryt {
    private static final auad j = djuz.h("SystemUpdateChimeraActivity");
    private boolean k = false;

    private final boolean b() {
        return eftg.e(getIntent());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0089, code lost:
    
        if (defpackage.ftns.a.lK().b() != false) goto L37;
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
            ftnp r0 = defpackage.ftnp.a
            ftnq r0 = r0.lK()
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
            ftns r0 = defpackage.ftns.a
            ftnt r0 = r0.lK()
            boolean r0 = r0.b()
            if (r0 == 0) goto L98
        L8b:
            ftns r0 = defpackage.ftns.a
            ftnt r0 = r0.lK()
            boolean r0 = r0.a()
            if (r0 == 0) goto L98
            return r2
        L98:
            boolean r0 = defpackage.auub.b()
            if (r0 == 0) goto L9f
            return r3
        L9f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.update.phone.SystemUpdateChimeraActivity.a():int");
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final void finish() {
        if (this.k) {
            super.finish();
        } else {
            this.k = true;
            efvx.d(getContainerActivity());
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        auad auadVar = j;
        auadVar.j("onCreate", new Object[0]);
        getWindow().requestFeature(13);
        efvx.c(getContainerActivity());
        efvx.a(getContainerActivity());
        Intent intent = getIntent();
        int i = efwn.a;
        boolean c = efwn.c(intent.getStringExtra("theme"));
        if (a() == 5) {
            setTheme(efwo.d().c(true != c ? "glif_v3" : "glif_v3_light", eftg.e(getIntent()) && !ftmo.a.lK().a()));
            if (efrl.v(this) && efrl.z(this)) {
                getTheme().applyStyle(R.style.BcStyleThemeOverlay, true);
            } else {
                getTheme().applyStyle(R.style.HeavyThemeOverlay, true);
            }
            if (efrl.w(this)) {
                int a = efwn.a(this);
                if (a == 0) {
                    auadVar.m("Could not get dynamic color theme.", new Object[0]);
                } else {
                    setTheme(a);
                    z = true;
                    auadVar.h(a.aa(z, "Try to set dynamic color. Result="), new Object[0]);
                }
            } else {
                auadVar.m("SetupWizard does not support the dynamic color or supporting status unknown.", new Object[0]);
            }
            z = false;
            auadVar.h(a.aa(z, "Try to set dynamic color. Result="), new Object[0]);
        } else if (auub.b()) {
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
            djyx djypVar = a2 != 1 ? a2 != 5 ? new djyp() : new djyn() : new djyo();
            auadVar.j("Load layout with type=%d, isSetupWizard=%s, isLightTheme=%s.", Integer.valueOf(djypVar.I()), Boolean.valueOf(b()), Boolean.valueOf(c));
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.z(R.id.layout_container, djypVar, "layout_fragment");
            bpVar.d();
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onResume() {
        super.onResume();
        auad auadVar = j;
        auadVar.j("onResume", new Object[0]);
        if (djqk.b(this)) {
            return;
        }
        auadVar.h("Attempting to manage ota on non-owner profile. Finish immediately.", new Object[0]);
        Toast makeText = Toast.makeText(this, R.string.system_update_not_owner_text, 1);
        makeText.setGravity(17, makeText.getXOffset(), makeText.getYOffset());
        makeText.show();
        finish();
    }
}
