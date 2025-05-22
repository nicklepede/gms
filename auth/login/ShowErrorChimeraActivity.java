package com.google.android.gms.auth.login;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.setupwizard.navigationbar.SetupWizardNavBar;
import com.google.android.gms.R;
import defpackage.adau;
import defpackage.adpf;
import defpackage.adqb;
import defpackage.atxi;
import defpackage.ausn;
import defpackage.auwr;
import defpackage.bzjn;
import defpackage.eluo;
import defpackage.fywe;
import defpackage.pac;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ShowErrorChimeraActivity extends adpf implements View.OnClickListener, pac {
    public static final /* synthetic */ int i = 0;
    private SetupWizardNavBar A;
    int h = -1;
    private String r;
    private String s;
    private boolean t;
    private boolean u;
    private boolean v;
    private adau w;
    private TextView x;
    private Button y;
    private TextView z;

    private final void n() {
        Intent b;
        if (!this.l) {
            try {
                auwr.b(this).f("com.google.android.apps.enterprise.dmagent", 32768);
                PackageManager packageManager = getPackageManager();
                if (packageManager.getApplicationEnabledSetting("com.google.android.apps.enterprise.dmagent") == 4) {
                    bzjn.a(this, "com.google.android.apps.enterprise.dmagent", 0, 1);
                }
                b = Intent.makeMainActivity(new ComponentName("com.google.android.apps.enterprise.dmagent", "com.google.android.apps.enterprise.dmagent.DMAgentActivity"));
                if (packageManager.queryIntentActivities(b, 0).isEmpty()) {
                    Log.w("GLSActivity", String.format("Couldn't find activity %s attempting to enable %s", "com.google.android.apps.enterprise.dmagent.DMAgentActivity", "com.google.android.apps.enterprise.dmagent"));
                    b = atxi.b("com.google.android.apps.enterprise.dmagent");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GLSActivity", "Couldn't find package com.google.android.apps.enterprise.dmagent");
                b = atxi.b("com.google.android.apps.enterprise.dmagent");
            }
            try {
                startActivity(b);
            } catch (ActivityNotFoundException unused2) {
                Log.e("GLSActivity", "Market not found for dmagent");
            }
        }
        setResult(1);
        finish();
    }

    @Override // defpackage.pac
    public final void c(SetupWizardNavBar setupWizardNavBar) {
        this.A = setupWizardNavBar;
        boolean z = this.m;
        setupWizardNavBar.a(z, z);
    }

    public final void l(CharSequence charSequence) {
        if (charSequence != null) {
            TextView textView = (TextView) findViewById(R.id.submission_title);
            if (charSequence.equals(getString(R.string.auth_submission_title))) {
                textView.setVisibility(8);
            } else {
                textView.setText(charSequence);
                textView.setVisibility(0);
            }
        }
    }

    public final void m(Bundle bundle) {
        adau adauVar;
        this.r = bundle.getString("accountName");
        this.t = bundle.getBoolean("isCreatingAccount");
        this.u = bundle.getBoolean("isAddingAccount");
        this.v = bundle.getBoolean("allowSkip");
        this.s = bundle.getString("detail");
        String string = bundle.getString("status");
        ausn ausnVar = adqb.a;
        if (string == null) {
            adauVar = adau.SUCCESS;
        } else {
            adau a = adau.a(string);
            ((eluo) adqb.a.j()).T("%s Status from wire: %s status: %s", "gms.StatusHelper", string, a);
            adauVar = a == null ? adau.UNKNOWN : a;
        }
        this.w = adauVar;
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 != 121) {
            super.onActivityResult(i2, i3, intent);
        } else {
            setResult(-1);
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        adau adauVar = this.w;
        this.w = adau.SUCCESS;
        int ordinal = adauVar.ordinal();
        if (ordinal != 4) {
            if (ordinal != 8) {
                switch (ordinal) {
                    case fywe.E /* 31 */:
                    case 32:
                    case fywe.G /* 33 */:
                    case fywe.H /* 34 */:
                    case fywe.I /* 35 */:
                    case fywe.J /* 36 */:
                    case fywe.K /* 37 */:
                    case fywe.L /* 38 */:
                    case fywe.M /* 39 */:
                        n();
                        break;
                }
                return;
            } else if (this.u && view == this.z) {
                setResult(1);
                finish();
                return;
            }
            if (view == this.z) {
                setResult(0);
            } else {
                setResult(this.h);
            }
            finish();
            return;
        }
        setResult(0);
        finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
    
        if (r0 != 1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019a  */
    @Override // defpackage.adpf, defpackage.adpc, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.login.ShowErrorChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.adpf, defpackage.adpc, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("accountName", this.r);
        bundle.putBoolean("isCreatingAccount", this.t);
        bundle.putBoolean("isAddingAccount", this.u);
        bundle.putBoolean("allowSkip", this.v);
        bundle.putString("detail", this.s);
        bundle.putString("status", this.w.ak);
    }

    @Override // defpackage.adpf, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void setTitle(CharSequence charSequence) {
        ((TextView) findViewById(R.id.title)).setText(charSequence);
    }

    @Override // defpackage.pac
    public final void a() {
    }

    @Override // defpackage.pac
    public final void b() {
    }
}
