package com.google.android.gms.auth.uiflows.controller;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.auth.uiflows.controller.ControllerLauncherChimeraActivity;
import defpackage.adlg;
import defpackage.asmf;
import defpackage.fkih;
import defpackage.qfn;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ControllerLauncherChimeraActivity extends qfn {
    public static Intent a(Context context, Controller controller) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("controller", controller);
        return new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.controller.ControllerLauncherActivity").putExtra("wrapper_bundle", bundle);
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("wrapper_bundle");
        if (bundleExtra == null) {
            Log.wtf("Auth", String.format(Locale.US, "[Addaccount, ControllerLauncherActivity] WrapperBundle is null.", new Object[0]));
            finish();
            return;
        }
        final Controller controller = (Controller) bundleExtra.getParcelable("controller");
        if (controller == null) {
            Log.wtf("Auth", String.format(Locale.US, "[Addaccount, ControllerLauncherActivity] Controller is null.", new Object[0]));
            finish();
        } else if (fkih.g()) {
            new asmf(1, 9).execute(new Runnable() { // from class: adlh
                @Override // java.lang.Runnable
                public final void run() {
                    ControllerLauncherChimeraActivity controllerLauncherChimeraActivity = ControllerLauncherChimeraActivity.this;
                    Controller controller2 = controller;
                    adle a = controller2.a(null);
                    if (controllerLauncherChimeraActivity.isFinishing()) {
                        return;
                    }
                    adlg.z(controllerLauncherChimeraActivity, controller2, a);
                }
            });
        } else {
            adlg.z(this, controller, controller.a(null));
        }
    }
}
