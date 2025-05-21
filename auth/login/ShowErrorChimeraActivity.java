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
import defpackage.abau;
import defpackage.abpf;
import defpackage.abqb;
import defpackage.arut;
import defpackage.asot;
import defpackage.assx;
import defpackage.bxax;
import defpackage.ejhf;
import defpackage.fwac;
import defpackage.ngz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ShowErrorChimeraActivity extends abpf implements View.OnClickListener, ngz {
    public static final /* synthetic */ int i = 0;
    private SetupWizardNavBar A;
    int h = -1;
    private String r;
    private String s;
    private boolean t;
    private boolean u;
    private boolean v;
    private abau w;
    private TextView x;
    private Button y;
    private TextView z;

    private final void n() {
        Intent b;
        if (!this.l) {
            try {
                assx.b(this).f("com.google.android.apps.enterprise.dmagent", 32768);
                PackageManager packageManager = getPackageManager();
                if (packageManager.getApplicationEnabledSetting("com.google.android.apps.enterprise.dmagent") == 4) {
                    bxax.a(this, "com.google.android.apps.enterprise.dmagent", 0, 1);
                }
                b = Intent.makeMainActivity(new ComponentName("com.google.android.apps.enterprise.dmagent", "com.google.android.apps.enterprise.dmagent.DMAgentActivity"));
                if (packageManager.queryIntentActivities(b, 0).isEmpty()) {
                    Log.w("GLSActivity", String.format("Couldn't find activity %s attempting to enable %s", "com.google.android.apps.enterprise.dmagent.DMAgentActivity", "com.google.android.apps.enterprise.dmagent"));
                    b = arut.b("com.google.android.apps.enterprise.dmagent");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GLSActivity", "Couldn't find package com.google.android.apps.enterprise.dmagent");
                b = arut.b("com.google.android.apps.enterprise.dmagent");
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

    @Override // defpackage.ngz
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
        abau abauVar;
        this.r = bundle.getString("accountName");
        this.t = bundle.getBoolean("isCreatingAccount");
        this.u = bundle.getBoolean("isAddingAccount");
        this.v = bundle.getBoolean("allowSkip");
        this.s = bundle.getString("detail");
        String string = bundle.getString("status");
        asot asotVar = abqb.a;
        if (string == null) {
            abauVar = abau.SUCCESS;
        } else {
            abau a = abau.a(string);
            ((ejhf) abqb.a.j()).T("%s Status from wire: %s status: %s", "gms.StatusHelper", string, a);
            abauVar = a == null ? abau.UNKNOWN : a;
        }
        this.w = abauVar;
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
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
        abau abauVar = this.w;
        this.w = abau.SUCCESS;
        int ordinal = abauVar.ordinal();
        if (ordinal != 4) {
            if (ordinal != 8) {
                switch (ordinal) {
                    case fwac.E /* 31 */:
                    case 32:
                    case fwac.G /* 33 */:
                    case fwac.H /* 34 */:
                    case fwac.I /* 35 */:
                    case fwac.J /* 36 */:
                    case fwac.K /* 37 */:
                    case fwac.L /* 38 */:
                    case fwac.M /* 39 */:
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
    @Override // defpackage.abpf, defpackage.abpc, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
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

    @Override // defpackage.abpf, defpackage.abpc, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("accountName", this.r);
        bundle.putBoolean("isCreatingAccount", this.t);
        bundle.putBoolean("isAddingAccount", this.u);
        bundle.putBoolean("allowSkip", this.v);
        bundle.putString("detail", this.s);
        bundle.putString("status", this.w.ak);
    }

    @Override // defpackage.abpf, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void setTitle(CharSequence charSequence) {
        ((TextView) findViewById(R.id.title)).setText(charSequence);
    }

    @Override // defpackage.ngz
    public final void a() {
    }

    @Override // defpackage.ngz
    public final void b() {
    }
}
