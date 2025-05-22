package com.google.android.gms.auth.setup.d2d;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import defpackage.acno;
import defpackage.afct;
import defpackage.auad;
import defpackage.eftg;
import java.io.Serializable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SmartDeviceChimeraActivity extends afct {
    public static final auad l = new auad("SmartDevice", "D2D", "SmartDeviceActivity");
    public static final acno m = new acno("callerIdentity");
    public static final acno n = new acno("d2d_options");
    private boolean o = false;
    private boolean r = false;

    @Override // defpackage.efwt
    public final void gH() {
        onBackPressed();
    }

    @Override // defpackage.efwt
    public final void jM() {
        k();
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.r = true;
        auad auadVar = l;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        auadVar.j("onActivityResult(requestCode=%d, resultCode=%d)", valueOf, valueOf2);
        if (i != 123) {
            if (i != 234) {
                return;
            } else {
                i = 234;
            }
        }
        String str = i == 234 ? "QuickStart" : "Smartdevice";
        if (i2 != -1) {
            if (i2 == 0) {
                auadVar.h("%s setup was canceled", str);
                gT(0, intent);
                return;
            } else if (i2 == 1) {
                auadVar.h("%s setup was skipped", str);
                l(intent);
                return;
            } else {
                switch (i2) {
                    case 102:
                    case 103:
                    case 104:
                        break;
                    default:
                        auadVar.m("Unrecognised result code: %d, from %s. Ignoring.", valueOf2, str);
                        break;
                }
                return;
            }
        }
        auadVar.h("%s setup was completed with result code: %d", str, valueOf2);
        this.j.set(false);
        gT(i2, intent);
        ((afct) this).k.a();
    }

    @Override // defpackage.afct, defpackage.afln, defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        if (bundle == null) {
            this.o = true;
            boolean z = D2dOptions.b(getIntent().getExtras()).c;
            if (z) {
                intent = new Intent();
                intent.putExtra("smartdevice.theme", (String) s().a(h));
                acno acnoVar = n;
                intent.putExtra(acnoVar.a, (byte[]) s().a(acnoVar));
                intent.setClassName("com.google.android.gms", "com.google.android.gms.smartdevice.quickstart.ui.TargetQuickStartActivity");
                eftg.a(getIntent(), intent);
            } else {
                intent = new Intent();
                intent.putExtra("smartdevice.use_immersive_mode", (Serializable) s().b(i, false));
                intent.putExtra("smartdevice.theme", (String) s().a(h));
                acno acnoVar2 = m;
                intent.putExtra(acnoVar2.a, (String) s().a(acnoVar2));
                acno acnoVar3 = n;
                intent.putExtra(acnoVar3.a, (byte[]) s().a(acnoVar3));
                intent.setClassName("com.google.android.gms", "com.google.android.gms.smartdevice.d2d.ui.TargetActivity");
                eftg.a(getIntent(), intent);
            }
            startActivityForResult(intent, true != z ? 123 : 234);
        }
    }

    @Override // defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        if (this.o || this.r) {
            return;
        }
        l.f("The child activity crashed. Skipping D2d.", new Object[0]);
        k();
    }

    @Override // defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("launchedTargetActivity", true);
    }
}
