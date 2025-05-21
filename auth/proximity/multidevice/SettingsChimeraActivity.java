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
import defpackage.acex;
import defpackage.acey;
import defpackage.acqc;
import defpackage.acqe;
import defpackage.acqy;
import defpackage.acra;
import defpackage.acrb;
import defpackage.acto;
import defpackage.acvm;
import defpackage.asmf;
import defpackage.asot;
import defpackage.asqh;
import defpackage.assa;
import defpackage.assb;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import defpackage.entc;
import defpackage.esjn;
import defpackage.flcw;
import defpackage.fldd;
import defpackage.ig;
import defpackage.iln;
import defpackage.qet;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SettingsChimeraActivity extends qet {
    public static final asot j = acqc.a("BetterTogetherSettings");
    public enss k;
    public enss l;
    public acey m;
    public assb n;
    private FeatureEnabledReceiver o;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class FeatureEnabledReceiver extends TracingBroadcastReceiver {
        public FeatureEnabledReceiver() {
            super("auth_proximity");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            if ("com.google.android.gms.auth.proximity.ACTION_FEATURE_ENABLED_CHANGE".equals(intent.getAction())) {
                SettingsChimeraActivity settingsChimeraActivity = SettingsChimeraActivity.this;
                String d = settingsChimeraActivity.n.d();
                if (d != null) {
                    String stringExtra = intent.getStringExtra("EXTRA_FEATURE_NAME");
                    if ((esjn.BETTER_TOGETHER_HOST.name().equals(stringExtra) || esjn.WIFI_SYNC_HOST.name().equals(stringExtra) || esjn.PHONE_HUB_CAMERA_ROLL_HOST.name().equals(stringExtra) || esjn.PHONE_HUB_HOST.name().equals(stringExtra)) && d.equals(intent.getStringExtra("EXTRA_ACCOUNT_NAME"))) {
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
        enss submit = entc.a(new asmf(1, 9)).submit(new Callable() { // from class: acqq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Account account2 = account;
                boolean z = false;
                if (account2 != null && SettingsChimeraActivity.this.m.d(account2, esjn.BETTER_TOGETHER_HOST)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        enss submit2 = entc.a(new asmf(1, 9)).submit(new Callable() { // from class: acqr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Account account2 = account;
                if (account2 == null) {
                    return null;
                }
                return SettingsChimeraContentProvider.a(SettingsChimeraActivity.this, account2.name);
            }
        });
        boolean f = fldd.f();
        enss i = ensj.i(false);
        enss i2 = ensj.i(false);
        if (f) {
            i = entc.a(new asmf(1, 9)).submit(new Callable() { // from class: acqs
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Account account2 = account;
                    if (account2 == null) {
                        return false;
                    }
                    SettingsChimeraActivity settingsChimeraActivity = SettingsChimeraActivity.this;
                    return fldd.g() ? Boolean.valueOf(settingsChimeraActivity.m.e(account2, esjn.WIFI_SYNC_HOST)) : Boolean.valueOf(settingsChimeraActivity.m.d(account2, esjn.WIFI_SYNC_HOST));
                }
            });
            i2 = entc.a(new asmf(1, 9)).submit(new Callable() { // from class: acqt
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Account account2 = account;
                    boolean z = false;
                    if (account2 == null) {
                        return false;
                    }
                    SyncedCryptauthDevice b = acnd.b(SettingsChimeraActivity.this, account2.name);
                    if (b != null) {
                        if (b.l.contains(esjn.WIFI_SYNC_HOST.name())) {
                            z = true;
                        }
                    }
                    return Boolean.valueOf(z);
                }
            });
        }
        enss submit3 = flcw.i() ? entc.a(new asmf(1, 9)).submit(new Callable() { // from class: acqu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List b;
                if (account == null || (b = acnf.b(SettingsChimeraActivity.this, null)) == null) {
                    return false;
                }
                return Boolean.valueOf(eivv.v(b, new eiih() { // from class: acqo
                    @Override // defpackage.eiih
                    public final boolean a(Object obj) {
                        asot asotVar = SettingsChimeraActivity.j;
                        return ((SyncedCryptauthDevice) obj).l.contains(esjn.PHONE_HUB_CAMERA_ROLL_CLIENT.name());
                    }
                }));
            }
        }) : ensj.i(true);
        enss i3 = ensj.i(false);
        if (account != null) {
            i3 = enps.f(flcw.P() ? acvm.a(account.name).c() : acto.a(account.name).b(), new eiho() { // from class: acqv
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((adae) obj).b);
                }
            }, enre.a);
        }
        enss i4 = ensj.i(false);
        if (flcw.v() && account != null) {
            i4 = ensj.m(new Callable() { // from class: acqw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    asot asotVar = SettingsChimeraActivity.j;
                    return (Boolean) acvm.a(account.name).f().get();
                }
            }, new asmf(1, 9));
        }
        enss i5 = ensj.i(false);
        if (flcw.x() && account != null) {
            i5 = enps.f(acvm.a(account.name).e(), new eiho() { // from class: acqx
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((adbr) obj).b);
                }
            }, enre.a);
        }
        enss f2 = ensj.f(submit, submit2, i, i2, submit3, i3, i4, i5);
        this.k = f2;
        ensj.t(f2, new acra(this, f, account), new asmf(1, 9));
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.m = acex.a(this);
        FeatureEnabledReceiver featureEnabledReceiver = new FeatureEnabledReceiver();
        this.o = featureEnabledReceiver;
        iln.b(this, featureEnabledReceiver, new IntentFilter("com.google.android.gms.auth.proximity.ACTION_FEATURE_ENABLED_CHANGE"), 2);
        setContentView(R.layout.better_together_settings_activity);
        ig hy = hy();
        hy.o(true);
        assa assaVar = new assa(hy);
        assaVar.b = new acqy(this);
        assaVar.b(R.string.auth_settings_activity_title);
        this.n = assaVar.a();
        enss submit = entc.a(new asmf(1, 9)).submit(new Callable() { // from class: acqp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SettingsChimeraActivity settingsChimeraActivity = SettingsChimeraActivity.this;
                Account[] accountArr = new Account[0];
                try {
                    eijr a = eijy.a(new vbf());
                    dvni.f(settingsChimeraActivity);
                    accountArr = vbh.a(settingsChimeraActivity, new vay(settingsChimeraActivity), a);
                } catch (RemoteException | aqum | aqun e) {
                    ((ejhf) ((ejhf) SettingsChimeraActivity.j.j()).s(e)).x("Can't get Google accounts.");
                }
                Account account = null;
                if (accountArr.length > 0) {
                    for (Account account2 : accountArr) {
                        if (account == null && settingsChimeraActivity.m.d(account2, esjn.BETTER_TOGETHER_HOST)) {
                            account = account2;
                        }
                    }
                }
                return account;
            }
        });
        this.l = submit;
        ensj.t(submit, new acrb(this), new asmf(1, 9));
        if (k()) {
            new acqe().H();
        }
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        enss enssVar = this.k;
        if (enssVar != null) {
            enssVar.cancel(true);
            this.k = null;
        }
        FeatureEnabledReceiver featureEnabledReceiver = this.o;
        if (featureEnabledReceiver != null) {
            unregisterReceiver(featureEnabledReceiver);
            this.o = null;
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Intent intent;
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (fldd.a.a().w() && (((intent = getIntent()) == null || !intent.getBooleanExtra("FROM_BETTER_TOGETHER_NOTIFICATION", false)) && !k())) {
            onBackPressed();
            finish();
            return true;
        }
        Intent intent2 = new Intent();
        if (asqh.e()) {
            intent2.setAction("com.android.settings.ADVANCED_CONNECTED_DEVICE_SETTINGS");
        } else if (asqh.c()) {
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

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        this.n.g(this.n.d());
        if (this.n.d() == null) {
            ((ejhf) j.j()).x("The account spinner was not able to select a new account after refresh.");
            a(null);
        }
    }
}
