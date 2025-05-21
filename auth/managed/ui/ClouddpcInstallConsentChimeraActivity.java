package com.google.android.gms.auth.managed.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.R;
import com.google.android.gms.auth.managed.ui.ClouddpcInstallConsentChimeraActivity;
import defpackage.abqi;
import defpackage.abqk;
import defpackage.abxt;
import defpackage.dtjk;
import defpackage.ebna;
import defpackage.fiwo;
import defpackage.fkzn;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ClouddpcInstallConsentChimeraActivity extends abxt {
    public static final /* synthetic */ int k = 0;
    public fiwo h;
    public abqk i;
    public boolean j;

    public final void a() {
        if (!this.j) {
            abqk abqkVar = this.i;
            if (abqkVar == null) {
                fvbo.j("callbacks");
                abqkVar = null;
            }
            abqkVar.a(10);
        }
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // defpackage.abxt, defpackage.arjn, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fkzn.e()) {
            fiwo fiwoVar = this.h;
            if (fiwoVar == null) {
                fvbo.j("onboardingInitializer");
                fiwoVar = null;
            }
            ((dtjk) fiwoVar.a()).a();
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
        this.i = queryLocalInterface instanceof abqk ? (abqk) queryLocalInterface : new abqi(binder);
        ebna ebnaVar = new ebna(this, R.style.ClouddpcInstallConsentDialog);
        ebnaVar.z(R.drawable.clouddpc_icon);
        ebnaVar.M(R.string.dialog_title);
        ebnaVar.B(R.string.dialog_message);
        ebnaVar.K(R.string.common_install, new DialogInterface.OnClickListener() { // from class: abun
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ClouddpcInstallConsentChimeraActivity clouddpcInstallConsentChimeraActivity = ClouddpcInstallConsentChimeraActivity.this;
                abqk abqkVar = clouddpcInstallConsentChimeraActivity.i;
                if (abqkVar == null) {
                    fvbo.j("callbacks");
                    abqkVar = null;
                }
                abqkVar.b();
                clouddpcInstallConsentChimeraActivity.j = true;
            }
        });
        ebnaVar.G(R.string.common_cancel, new DialogInterface.OnClickListener() { // from class: abuo
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ClouddpcInstallConsentChimeraActivity clouddpcInstallConsentChimeraActivity = ClouddpcInstallConsentChimeraActivity.this;
                abqk abqkVar = clouddpcInstallConsentChimeraActivity.i;
                if (abqkVar == null) {
                    fvbo.j("callbacks");
                    abqkVar = null;
                }
                abqkVar.a(9);
                clouddpcInstallConsentChimeraActivity.j = true;
            }
        });
        ebnaVar.I(new DialogInterface.OnDismissListener() { // from class: abup
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ClouddpcInstallConsentChimeraActivity.this.a();
            }
        });
        ebnaVar.x(false);
        ebnaVar.a();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        super.onStop();
        if (isChangingConfigurations()) {
            return;
        }
        a();
    }

    @Override // defpackage.arjn
    protected final void gu(String str, boolean z) {
    }
}
