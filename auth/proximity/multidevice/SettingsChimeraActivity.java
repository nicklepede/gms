package com.google.android.gms.auth.proximity.multidevice;

import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MenuItem;
import com.google.android.gms.R;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.auth.proximity.multidevice.SettingsChimeraActivity;
import com.google.android.gms.auth.proximity.multidevice.SettingsChimeraContentProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aeex;
import defpackage.aeey;
import defpackage.aeqc;
import defpackage.aeqe;
import defpackage.aeqy;
import defpackage.aera;
import defpackage.aerb;
import defpackage.aeto;
import defpackage.aevm;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.auub;
import defpackage.auvu;
import defpackage.auvv;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqgv;
import defpackage.euzc;
import defpackage.fnuf;
import defpackage.fnum;
import defpackage.ig;
import defpackage.ind;
import defpackage.rxx;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SettingsChimeraActivity extends rxx {
    public static final ausn j = aeqc.a("BetterTogetherSettings");
    public eqgl k;
    public eqgl l;
    public aeey m;
    public auvv n;
    private FeatureEnabledReceiver o;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class FeatureEnabledReceiver extends TracingBroadcastReceiver {
        public FeatureEnabledReceiver() {
            super("auth_proximity");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            if ("com.google.android.gms.auth.proximity.ACTION_FEATURE_ENABLED_CHANGE".equals(intent.getAction())) {
                SettingsChimeraActivity settingsChimeraActivity = SettingsChimeraActivity.this;
                String d = settingsChimeraActivity.n.d();
                if (d != null) {
                    String stringExtra = intent.getStringExtra("EXTRA_FEATURE_NAME");
                    if ((euzc.BETTER_TOGETHER_HOST.name().equals(stringExtra) || euzc.WIFI_SYNC_HOST.name().equals(stringExtra) || euzc.PHONE_HUB_CAMERA_ROLL_HOST.name().equals(stringExtra) || euzc.PHONE_HUB_HOST.name().equals(stringExtra)) && d.equals(intent.getStringExtra("EXTRA_ACCOUNT_NAME"))) {
                        settingsChimeraActivity.a(new Account(d, "com.google"));
                    }
                }
            }
        }
    }

    private final boolean k() {
        Intent intent = getIntent();
        return intent != null && intent.getBooleanExtra("FROM_PHONE_HUB_NOTIFICATION", false);
    }

    public final void a(final Account account) {
        eqgl submit = eqgv.a(new aupz(1, 9)).submit(new Callable() { // from class: aeqq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Account account2 = account;
                boolean z = false;
                if (account2 != null && SettingsChimeraActivity.this.m.d(account2, euzc.BETTER_TOGETHER_HOST)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        eqgl submit2 = eqgv.a(new aupz(1, 9)).submit(new Callable() { // from class: aeqr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Account account2 = account;
                if (account2 == null) {
                    return null;
                }
                return SettingsChimeraContentProvider.a(SettingsChimeraActivity.this, account2.name);
            }
        });
        boolean f = fnum.f();
        eqgl i = eqgc.i(false);
        eqgl i2 = eqgc.i(false);
        if (f) {
            i = eqgv.a(new aupz(1, 9)).submit(new Callable() { // from class: aeqs
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Account account2 = account;
                    if (account2 == null) {
                        return false;
                    }
                    SettingsChimeraActivity settingsChimeraActivity = SettingsChimeraActivity.this;
                    return fnum.g() ? Boolean.valueOf(settingsChimeraActivity.m.e(account2, euzc.WIFI_SYNC_HOST)) : Boolean.valueOf(settingsChimeraActivity.m.d(account2, euzc.WIFI_SYNC_HOST));
                }
            });
            i2 = eqgv.a(new aupz(1, 9)).submit(new Callable() { // from class: aeqt
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Account account2 = account;
                    boolean z = false;
                    if (account2 == null) {
                        return false;
                    }
                    SyncedCryptauthDevice b = aend.b(SettingsChimeraActivity.this, account2.name);
                    if (b != null) {
                        if (b.l.contains(euzc.WIFI_SYNC_HOST.name())) {
                            z = true;
                        }
                    }
                    return Boolean.valueOf(z);
                }
            });
        }
        eqgl submit3 = fnuf.i() ? eqgv.a(new aupz(1, 9)).submit(new Callable() { // from class: aequ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List b;
                if (account == null || (b = aenf.b(SettingsChimeraActivity.this, null)) == null) {
                    return false;
                }
                return Boolean.valueOf(elja.v(b, new ekvm() { // from class: aeqo
                    @Override // defpackage.ekvm
                    public final boolean a(Object obj) {
                        ausn ausnVar = SettingsChimeraActivity.j;
                        return ((SyncedCryptauthDevice) obj).l.contains(euzc.PHONE_HUB_CAMERA_ROLL_CLIENT.name());
                    }
                }));
            }
        }) : eqgc.i(true);
        eqgl i3 = eqgc.i(false);
        if (account != null) {
            i3 = eqdl.f(fnuf.P() ? aevm.a(account.name).c() : aeto.a(account.name).b(), new ekut() { // from class: aeqv
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((afae) obj).b);
                }
            }, eqex.a);
        }
        eqgl i4 = eqgc.i(false);
        if (fnuf.v() && account != null) {
            i4 = eqgc.m(new Callable() { // from class: aeqw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ausn ausnVar = SettingsChimeraActivity.j;
                    return (Boolean) aevm.a(account.name).f().get();
                }
            }, new aupz(1, 9));
        }
        eqgl i5 = eqgc.i(false);
        if (fnuf.x() && account != null) {
            i5 = eqdl.f(aevm.a(account.name).e(), new ekut() { // from class: aeqx
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((afbr) obj).b);
                }
            }, eqex.a);
        }
        eqgl f2 = eqgc.f(submit, submit2, i, i2, submit3, i3, i4, i5);
        this.k = f2;
        eqgc.t(f2, new aera(this, f, account), new aupz(1, 9));
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.m = aeex.a(this);
        FeatureEnabledReceiver featureEnabledReceiver = new FeatureEnabledReceiver();
        this.o = featureEnabledReceiver;
        ind.b(this, featureEnabledReceiver, new IntentFilter("com.google.android.gms.auth.proximity.ACTION_FEATURE_ENABLED_CHANGE"), 2);
        setContentView(R.layout.better_together_settings_activity);
        ig hO = hO();
        hO.o(true);
        auvu auvuVar = new auvu(hO);
        auvuVar.b = new aeqy(this);
        auvuVar.b(R.string.auth_settings_activity_title);
        this.n = auvuVar.a();
        eqgl submit = eqgv.a(new aupz(1, 9)).submit(new Callable() { // from class: aeqp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SettingsChimeraActivity settingsChimeraActivity = SettingsChimeraActivity.this;
                Account[] accountArr = new Account[0];
                try {
                    ekww a = ekxd.a(new wxf());
                    dxyi.f(settingsChimeraActivity);
                    accountArr = wxh.a(settingsChimeraActivity, new wwy(settingsChimeraActivity), a);
                } catch (RemoteException | asxb | asxc e) {
                    ((eluo) ((eluo) SettingsChimeraActivity.j.j()).s(e)).x("Can't get Google accounts.");
                }
                Account account = null;
                if (accountArr.length > 0) {
                    for (Account account2 : accountArr) {
                        if (account == null && settingsChimeraActivity.m.d(account2, euzc.BETTER_TOGETHER_HOST)) {
                            account = account2;
                        }
                    }
                }
                return account;
            }
        });
        this.l = submit;
        eqgc.t(submit, new aerb(this), new aupz(1, 9));
        if (k()) {
            new aeqe().H();
        }
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        eqgl eqglVar = this.k;
        if (eqglVar != null) {
            eqglVar.cancel(true);
            this.k = null;
        }
        FeatureEnabledReceiver featureEnabledReceiver = this.o;
        if (featureEnabledReceiver != null) {
            unregisterReceiver(featureEnabledReceiver);
            this.o = null;
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Intent intent;
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (fnum.a.lK().w() && (((intent = getIntent()) == null || !intent.getBooleanExtra("FROM_BETTER_TOGETHER_NOTIFICATION", false)) && !k())) {
            onBackPressed();
            finish();
            return true;
        }
        Intent intent2 = new Intent();
        if (auub.e()) {
            intent2.setAction("com.android.settings.ADVANCED_CONNECTED_DEVICE_SETTINGS");
        } else if (auub.c()) {
            intent2.setAction("android.settings.BLUETOOTH_SETTINGS");
        } else {
            intent2.setClassName("com.google.android.gms", "com.google.android.gms.app.settings.GoogleSettingsActivity");
        }
        intent2.addFlags(553648128);
        try {
            startActivity(intent2);
        } catch (ActivityNotFoundException unused) {
            onBackPressed();
        }
        finish();
        return true;
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        this.n.g(this.n.d());
        if (this.n.d() == null) {
            ((eluo) j.j()).x("The account spinner was not able to select a new account after refresh.");
            a(null);
        }
    }
}
