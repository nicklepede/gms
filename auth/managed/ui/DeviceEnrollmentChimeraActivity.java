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
import defpackage.abuv;
import defpackage.abxv;
import defpackage.aslv;
import defpackage.aslw;
import defpackage.asng;
import defpackage.bqna;
import defpackage.dtjk;
import defpackage.fiwo;
import defpackage.fkzn;
import defpackage.flas;
import defpackage.jpd;
import defpackage.jrh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class DeviceEnrollmentChimeraActivity extends abxv {
    bqna h;
    public abuv i;
    public fiwo j;

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

    @Override // defpackage.abxv, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fkzn.e()) {
            ((dtjk) this.j.a()).a();
        }
        flas flasVar = flas.a;
        if (!flasVar.a().d()) {
            Log.w("EnterpriseAuth", "[AuthManaged, DeviceEnrollmentChimeraActivity] Flag is disabled.");
            a(3, null, null);
        } else if (flasVar.a().a().b.contains(asng.p(this))) {
            this.h = bqna.b(this);
            this.i = (abuv) new jrh(this).a(abuv.class);
        } else {
            Log.w("EnterpriseAuth", "[AuthManaged, DeviceEnrollmentChimeraActivity] The caller is not a DPC.");
            a(3, null, null);
        }
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStart() {
        super.onStart();
        if (isFinishing()) {
            return;
        }
        this.i.b.g(this, new jpd() { // from class: abur
            @Override // defpackage.jpd
            public final void a(Object obj) {
                abux abuxVar = (abux) obj;
                if (abuxVar == null) {
                    return;
                }
                final DeviceEnrollmentChimeraActivity deviceEnrollmentChimeraActivity = DeviceEnrollmentChimeraActivity.this;
                Exception exc = abuxVar.b;
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
                Bundle bundle = abuxVar.a;
                eiig.x(bundle);
                final String string = bundle.getString("authAccount");
                eiig.x(string);
                if (!flas.c()) {
                    deviceEnrollmentChimeraActivity.a(-1, string, null);
                    return;
                }
                abuv abuvVar = deviceEnrollmentChimeraActivity.i;
                eiig.q(flas.c(), "The feature flag is turned off, this should not be called.");
                abuvVar.c.g(deviceEnrollmentChimeraActivity, new jpd() { // from class: abus
                    @Override // defpackage.jpd
                    public final void a(Object obj2) {
                        abuw abuwVar = (abuw) obj2;
                        String str = abuwVar.a;
                        DeviceEnrollmentChimeraActivity deviceEnrollmentChimeraActivity2 = DeviceEnrollmentChimeraActivity.this;
                        if (str != null) {
                            deviceEnrollmentChimeraActivity2.a(-1, string, str);
                            return;
                        }
                        ftye ftyeVar = abuwVar.b;
                        if (ftyeVar != null) {
                            Log.e("EnterpriseAuth", "[AuthManaged, DeviceEnrollmentChimeraActivity] Failed to get user ID.", ftyeVar);
                        } else {
                            unx unxVar = abuwVar.c;
                            if (unxVar != null) {
                                Log.e("EnterpriseAuth", "[AuthManaged, DeviceEnrollmentChimeraActivity] Failed to get user ID.", unxVar);
                            }
                        }
                        deviceEnrollmentChimeraActivity2.a(1, null, null);
                    }
                });
            }
        });
        final abuv abuvVar = this.i;
        final Activity containerActivity = getContainerActivity();
        bqna bqnaVar = this.h;
        if (abuvVar.a.getAndSet(true)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (flas.a.a().f()) {
            bundle.putBoolean("suppress_device_to_device_setup", true);
            bundle.putBoolean("suppress_account_provisioning", true);
            bundle.putString("flow_params", flas.a.a().c());
        }
        Log.i("EnterpriseAuth", "[AuthManaged, DeviceEnrollmentChimeraActivity] Going to launch MinuteMaid");
        bqnaVar.s("com.google", bundle, containerActivity, new AccountManagerCallback() { // from class: abuu
            @Override // android.accounts.AccountManagerCallback
            public final void run(AccountManagerFuture accountManagerFuture) {
                abuv abuvVar2 = abuv.this;
                abuvVar2.b.hS(abux.a(accountManagerFuture));
                if (flas.c()) {
                    abuv.a(containerActivity, abuvVar2.c, accountManagerFuture);
                }
            }
        }, new aslv(new aslw(9)));
    }
}
