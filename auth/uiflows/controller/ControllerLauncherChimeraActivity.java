package com.google.android.gms.auth.uiflows.controller;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.auth.uiflows.controller.ControllerLauncherChimeraActivity;
import defpackage.afln;
import defpackage.aupz;
import defpackage.fmyw;
import defpackage.ryr;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ControllerLauncherChimeraActivity extends ryr {
    public static Intent a(Context context, Controller controller) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("controller", controller);
        return new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.controller.ControllerLauncherActivity").putExtra("wrapper_bundle", bundle);
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
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
        } else if (fmyw.g()) {
            new aupz(1, 9).execute(new Runnable() { // from class: aflo
                @Override // java.lang.Runnable
                public final void run() {
                    ControllerLauncherChimeraActivity controllerLauncherChimeraActivity = ControllerLauncherChimeraActivity.this;
                    Controller controller2 = controller;
                    afll a = controller2.a(null);
                    if (controllerLauncherChimeraActivity.isFinishing()) {
                        return;
                    }
                    afln.z(controllerLauncherChimeraActivity, controller2, a);
                }
            });
        } else {
            afln.z(this, controller, controller.a(null));
        }
    }
}
