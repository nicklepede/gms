package com.google.android.gms.auth.managed.ui;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.auth.managed.ui.DeviceEnrollmentChimeraActivity;
import defpackage.a;
import defpackage.aduv;
import defpackage.adxv;
import defpackage.aupp;
import defpackage.aupq;
import defpackage.aura;
import defpackage.bsup;
import defpackage.dvtw;
import defpackage.flml;
import defpackage.fnqv;
import defpackage.fnsa;
import defpackage.jvs;
import defpackage.jxw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class DeviceEnrollmentChimeraActivity extends adxv {
    bsup h;
    public aduv i;
    public flml j;

    public final void a(int i, String str, String str2) {
        Log.i("EnterpriseAuth", a.j(i, "[AuthManaged, DeviceEnrollmentChimeraActivity] Finish with resultCode: "));
        Intent intent = new Intent();
        if (i == -1) {
            intent.putExtra("user_authenticated_by_google", true);
            intent.putExtra("user_email", str);
            intent.putExtra("user_id", str2);
        }
        setResult(i, intent);
        finish();
    }

    @Override // defpackage.adxv, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fnqv.e()) {
            ((dvtw) this.j.a()).a();
        }
        fnsa fnsaVar = fnsa.a;
        if (!fnsaVar.lK().d()) {
            Log.w("EnterpriseAuth", "[AuthManaged, DeviceEnrollmentChimeraActivity] Flag is disabled.");
            a(3, null, null);
        } else if (fnsaVar.lK().a().b.contains(aura.p(this))) {
            this.h = bsup.b(this);
            this.i = (aduv) new jxw(this).a(aduv.class);
        } else {
            Log.w("EnterpriseAuth", "[AuthManaged, DeviceEnrollmentChimeraActivity] The caller is not a DPC.");
            a(3, null, null);
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStart() {
        super.onStart();
        if (isFinishing()) {
            return;
        }
        this.i.b.g(this, new jvs() { // from class: adur
            @Override // defpackage.jvs
            public final void a(Object obj) {
                adux aduxVar = (adux) obj;
                if (aduxVar == null) {
                    return;
                }
                final DeviceEnrollmentChimeraActivity deviceEnrollmentChimeraActivity = DeviceEnrollmentChimeraActivity.this;
                Exception exc = aduxVar.b;
                if (exc != null) {
                    if (exc instanceof OperationCanceledException) {
                        Log.i("EnterpriseAuth", "[AuthManaged, DeviceEnrollmentChimeraActivity] MinuteMaid cancelled, exception: ".concat(exc.toString()));
                        deviceEnrollmentChimeraActivity.a(0, null, null);
                        return;
                    } else {
                        Log.i("EnterpriseAuth", "[AuthManaged, DeviceEnrollmentChimeraActivity] MinuteMaid returned exception: ".concat(exc.toString()));
                        deviceEnrollmentChimeraActivity.a(1, null, null);
                        return;
                    }
                }
                Bundle bundle = aduxVar.a;
                ekvl.y(bundle);
                final String string = bundle.getString("authAccount");
                ekvl.y(string);
                if (!fnsa.c()) {
                    deviceEnrollmentChimeraActivity.a(-1, string, null);
                    return;
                }
                aduv aduvVar = deviceEnrollmentChimeraActivity.i;
                ekvl.r(fnsa.c(), "The feature flag is turned off, this should not be called.");
                aduvVar.c.g(deviceEnrollmentChimeraActivity, new jvs() { // from class: adus
                    @Override // defpackage.jvs
                    public final void a(Object obj2) {
                        aduw aduwVar = (aduw) obj2;
                        String str = aduwVar.a;
                        DeviceEnrollmentChimeraActivity deviceEnrollmentChimeraActivity2 = DeviceEnrollmentChimeraActivity.this;
                        if (str != null) {
                            deviceEnrollmentChimeraActivity2.a(-1, string, str);
                            return;
                        }
                        fwuc fwucVar = aduwVar.b;
                        if (fwucVar != null) {
                            Log.e("EnterpriseAuth", "[AuthManaged, DeviceEnrollmentChimeraActivity] Failed to get user ID.", fwucVar);
                        } else {
                            wjw wjwVar = aduwVar.c;
                            if (wjwVar != null) {
                                Log.e("EnterpriseAuth", "[AuthManaged, DeviceEnrollmentChimeraActivity] Failed to get user ID.", wjwVar);
                            }
                        }
                        deviceEnrollmentChimeraActivity2.a(1, null, null);
                    }
                });
            }
        });
        final aduv aduvVar = this.i;
        final Activity containerActivity = getContainerActivity();
        bsup bsupVar = this.h;
        if (aduvVar.a.getAndSet(true)) {
            return;
        }
        Bundle bundle = new Bundle();
        fnsa fnsaVar = fnsa.a;
        if (fnsaVar.lK().f()) {
            bundle.putBoolean("suppress_device_to_device_setup", true);
            bundle.putBoolean("suppress_account_provisioning", true);
            bundle.putString("flow_params", fnsaVar.lK().c());
        }
        Log.i("EnterpriseAuth", "[AuthManaged, DeviceEnrollmentChimeraActivity] Going to launch MinuteMaid");
        bsupVar.s("com.google", bundle, containerActivity, new AccountManagerCallback() { // from class: aduu
            @Override // android.accounts.AccountManagerCallback
            public final void run(AccountManagerFuture accountManagerFuture) {
                aduv aduvVar2 = aduv.this;
                aduvVar2.b.ih(adux.a(accountManagerFuture));
                if (fnsa.c()) {
                    aduv.a(containerActivity, aduvVar2.c, accountManagerFuture);
                }
            }
        }, new aupp(new aupq(9)));
    }
}
