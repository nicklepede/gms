package com.google.android.gms.auth.setup.d2d;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import defpackage.aano;
import defpackage.adct;
import defpackage.arxo;
import defpackage.edgl;
import java.io.Serializable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SmartDeviceChimeraActivity extends adct {
    public static final arxo l = new arxo("SmartDevice", "D2D", "SmartDeviceActivity");
    public static final aano m = new aano("callerIdentity");
    public static final aano n = new aano("d2d_options");
    private boolean o = false;
    private boolean r = false;

    @Override // defpackage.edjy
    public final void gs() {
        onBackPressed();
    }

    @Override // defpackage.edjy
    public final void jw() {
        k();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.r = true;
        arxo arxoVar = l;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        arxoVar.j("onActivityResult(requestCode=%d, resultCode=%d)", valueOf, valueOf2);
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
                arxoVar.h("%s setup was canceled", str);
                gD(0, intent);
                return;
            } else if (i2 == 1) {
                arxoVar.h("%s setup was skipped", str);
                l(intent);
                return;
            } else {
                switch (i2) {
                    case 102:
                    case 103:
                    case 104:
                        break;
                    default:
                        arxoVar.m("Unrecognised result code: %d, from %s. Ignoring.", valueOf2, str);
                        break;
                }
                return;
            }
        }
        arxoVar.h("%s setup was completed with result code: %d", str, valueOf2);
        this.j.set(false);
        gD(i2, intent);
        ((adct) this).k.a();
    }

    @Override // defpackage.adct, defpackage.adlg, defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        if (bundle == null) {
            this.o = true;
            boolean z = D2dOptions.b(getIntent().getExtras()).c;
            if (z) {
                intent = new Intent();
                intent.putExtra("smartdevice.theme", (String) s().a(h));
                aano aanoVar = n;
                intent.putExtra(aanoVar.a, (byte[]) s().a(aanoVar));
                intent.setClassName("com.google.android.gms", "com.google.android.gms.smartdevice.quickstart.ui.TargetQuickStartActivity");
                edgl.a(getIntent(), intent);
            } else {
                intent = new Intent();
                intent.putExtra("smartdevice.use_immersive_mode", (Serializable) s().b(i, false));
                intent.putExtra("smartdevice.theme", (String) s().a(h));
                aano aanoVar2 = m;
                intent.putExtra(aanoVar2.a, (String) s().a(aanoVar2));
                aano aanoVar3 = n;
                intent.putExtra(aanoVar3.a, (byte[]) s().a(aanoVar3));
                intent.setClassName("com.google.android.gms", "com.google.android.gms.smartdevice.d2d.ui.TargetActivity");
                edgl.a(getIntent(), intent);
            }
            startActivityForResult(intent, true != z ? 123 : 234);
        }
    }

    @Override // defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        if (this.o || this.r) {
            return;
        }
        l.f("The child activity crashed. Skipping D2d.", new Object[0]);
        k();
    }

    @Override // defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("launchedTargetActivity", true);
    }
}
