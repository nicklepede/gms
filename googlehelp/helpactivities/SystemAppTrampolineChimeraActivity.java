package com.google.android.gms.googlehelp.helpactivities;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;
import defpackage.bcnd;
import defpackage.blag;
import defpackage.blfl;
import defpackage.blfn;
import defpackage.blfz;
import defpackage.blmy;
import defpackage.bsj;
import defpackage.eluo;
import defpackage.frdz;
import defpackage.ryt;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SystemAppTrampolineChimeraActivity extends ryt {
    private static final ausn j = ausn.b("gH_SystemAppTrampoline", auid.GOOGLE_HELP);
    private static final Set k = new HashSet();
    private static int l;
    private blfn m;
    private HelpConfig n;

    private final void a(int i, int i2) {
        blfz.A(68, i, this, this.n, this.m);
        blfl.z(this, this.n, 76, i2);
        blmy.l(this, Uri.parse(frdz.z()), this.n, this.m);
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String q = aura.q(this);
        PackageManager packageManager = getPackageManager();
        this.m = new blfn(this);
        HelpConfig d = HelpConfig.d(new GoogleHelp("systemAppTrampolineActivity"), this);
        this.n = d;
        d.b = q;
        blfz.A(66, 1, this, d, this.m);
        blfl.z(this, this.n, 74, 1);
        if (!packageManager.hasSystemFeature("com.google.android.feature.GOOGLE_EXPERIENCE")) {
            a(33, 79);
            return;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(q, 0);
            if (applicationInfo == null || (applicationInfo.flags & 1) == 0) {
                a(35, 81);
                return;
            }
            String ae = frdz.a.lK().ae();
            if (ae.hashCode() != l) {
                Set set = k;
                set.clear();
                Collections.addAll(set, blag.y(ae));
                l = ae.hashCode();
            }
            if (!k.contains(q)) {
                a(36, 82);
                return;
            }
            Intent intent = getIntent();
            GoogleHelp googleHelp = new GoogleHelp(intent.hasExtra("EXTRA_CONTEXT") ? intent.getStringExtra("EXTRA_CONTEXT") : "");
            googleHelp.D = this.n.e;
            ThemeSettings themeSettings = new ThemeSettings();
            int intExtra = intent.getIntExtra("EXTRA_THEME", -1);
            if (intExtra != -1) {
                themeSettings.a = intExtra;
            }
            int intExtra2 = intent.getIntExtra("EXTRA_PRIMARY_COLOR", -1);
            if (intExtra2 != -1) {
                themeSettings.b = intExtra2;
            }
            googleHelp.s = themeSettings;
            String[] stringArrayExtra = intent.getStringArrayExtra("EXTRA_PSD_KEYS");
            String[] stringArrayExtra2 = intent.getStringArrayExtra("EXTRA_PSD_VALUES");
            if (stringArrayExtra != null && stringArrayExtra2 != null) {
                int length = stringArrayExtra2.length;
                int length2 = stringArrayExtra.length;
                if (length2 == length) {
                    bsj bsjVar = new bsj(length2);
                    for (int i = 0; i < length2; i++) {
                        bsjVar.put(stringArrayExtra[i], stringArrayExtra2[i]);
                    }
                    googleHelp.e(bsjVar);
                }
            }
            String[] stringArrayExtra3 = intent.getStringArrayExtra("EXTRA_FEEDBACK_PSD_KEYS");
            String[] stringArrayExtra4 = intent.getStringArrayExtra("EXTRA_FEEDBACK_PSD_VALUES");
            if (stringArrayExtra3 != null && stringArrayExtra4 != null) {
                int length3 = stringArrayExtra4.length;
                int length4 = stringArrayExtra3.length;
                if (length4 == length3) {
                    bcnd bcndVar = new bcnd();
                    for (int i2 = 0; i2 < length4; i2++) {
                        bcndVar.c(stringArrayExtra3[i2], stringArrayExtra4[i2]);
                    }
                    googleHelp.d(bcndVar.a(), getCacheDir());
                }
            }
            Account account = (Account) intent.getParcelableExtra("EXTRA_ACCOUNT");
            if (account != null) {
                googleHelp.c = account;
            }
            googleHelp.e = aura.q(this);
            blfz.A(67, 1, this, this.n, this.m);
            blfl.z(this, this.n, 75, 1);
            startActivityForResult(googleHelp.a(), 0);
            finish();
        } catch (PackageManager.NameNotFoundException unused) {
            ((eluo) j.i()).B("Error trying to get the application info for %s", q);
            a(34, 80);
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        blfn blfnVar = this.m;
        if (blfnVar != null) {
            blfnVar.close();
        }
        super.onDestroy();
    }
}
