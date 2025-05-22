package com.google.android.gms.auth.managed.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.R;
import com.google.android.gms.auth.managed.ui.ClouddpcInstallConsentChimeraActivity;
import defpackage.adqi;
import defpackage.adqk;
import defpackage.adxt;
import defpackage.dvtw;
import defpackage.edzp;
import defpackage.flml;
import defpackage.fnqv;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ClouddpcInstallConsentChimeraActivity extends adxt {
    public static final /* synthetic */ int k = 0;
    public flml h;
    public adqk i;
    public boolean j;

    public final void a() {
        if (!this.j) {
            adqk adqkVar = this.i;
            if (adqkVar == null) {
                fxxm.j("callbacks");
                adqkVar = null;
            }
            adqkVar.a(10);
        }
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // defpackage.adxt, defpackage.atmc, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fnqv.e()) {
            flml flmlVar = this.h;
            if (flmlVar == null) {
                fxxm.j("onboardingInitializer");
                flmlVar = null;
            }
            ((dvtw) flmlVar.a()).a();
        }
        Bundle bundleExtra = getIntent().getBundleExtra("EXTRA_CALLBACK_BUNDLE");
        if (bundleExtra == null) {
            throw new IllegalStateException("Required value was null.");
        }
        IBinder binder = bundleExtra.getBinder("EXTRA_CALLBACK_BINDER");
        if (binder == null) {
            throw new IllegalStateException("Required value was null.");
        }
        IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.auth.managed.aidl.IClouddpcInstallConsentCallbacks");
        this.i = queryLocalInterface instanceof adqk ? (adqk) queryLocalInterface : new adqi(binder);
        edzp edzpVar = new edzp(this, R.style.ClouddpcInstallConsentDialog);
        edzpVar.z(R.drawable.clouddpc_icon);
        edzpVar.M(R.string.dialog_title);
        edzpVar.B(R.string.dialog_message);
        edzpVar.K(R.string.common_install, new DialogInterface.OnClickListener() { // from class: adun
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ClouddpcInstallConsentChimeraActivity clouddpcInstallConsentChimeraActivity = ClouddpcInstallConsentChimeraActivity.this;
                adqk adqkVar = clouddpcInstallConsentChimeraActivity.i;
                if (adqkVar == null) {
                    fxxm.j("callbacks");
                    adqkVar = null;
                }
                adqkVar.b();
                clouddpcInstallConsentChimeraActivity.j = true;
            }
        });
        edzpVar.G(R.string.common_cancel, new DialogInterface.OnClickListener() { // from class: aduo
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ClouddpcInstallConsentChimeraActivity clouddpcInstallConsentChimeraActivity = ClouddpcInstallConsentChimeraActivity.this;
                adqk adqkVar = clouddpcInstallConsentChimeraActivity.i;
                if (adqkVar == null) {
                    fxxm.j("callbacks");
                    adqkVar = null;
                }
                adqkVar.a(9);
                clouddpcInstallConsentChimeraActivity.j = true;
            }
        });
        edzpVar.I(new DialogInterface.OnDismissListener() { // from class: adup
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ClouddpcInstallConsentChimeraActivity.this.a();
            }
        });
        edzpVar.x(false);
        edzpVar.a();
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStop() {
        super.onStop();
        if (isChangingConfigurations()) {
            return;
        }
        a();
    }

    @Override // defpackage.atmc
    protected final void gJ(String str, boolean z) {
    }
}
